package com.rm.openoffic.impl;

import cn.cbcc.elcs.core.bean.ExportBean;
import cn.cbcc.elcs.core.exception.CoreException;
import cn.cbcc.elcs.core.openoffic.FileCommonAdaptor;
import cn.cbcc.elcs.core.util.FileGenUtil;
import cn.cbcc.elcs.core.util.RspCode;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.*;
import com.ruimin.ifs.action.annotation.SnowService;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Map;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 模板数据适配器
 * 
 * @author zhoujun.hou
 *
 * @param <T>
 * 
 */
@Service("fileCommonAdaptor")
@Data
@Slf4j
@SnowService
public class FileCommonAdaptorImpl implements FileCommonAdaptor {

	@Override
    public File process(ExportBean bean,Map<String, Class<?>> collClazzMap) throws CoreException {
        // 将数据导入模板，返回新文件流
        byte[] bytes = DocxExportHelper.export(bean.getTempName(), bean.getData(),bean.getBusinessno(),collClazzMap);
        // 生成PDF临时文件
        File docx2pdf = DocxExportHelper.docx2pdf(bytes, bean.getPdfName());
        File file = addFooterAndWater(docx2pdf, bean.getWaterMarkName(),bean.getPageHeade(),bean.getFoot());
        return file;
    }

    /**
     * 把 VO 中所有属性为 null 的转为 ""
     *
     */
    public Object null2String(Object obj) throws CoreException {
        if (obj != null) {
            Class<? extends Object> classz = obj.getClass();
            // 获取所有该对象的属性值
            Field fields[] = classz.getDeclaredFields();
            // 遍历属性值，取得所有属性为 null 值的
            for (Field field : fields) {
                try {
                    Type t = field.getGenericType();
                    Type s = String.class;
                    //Type b = BigDecimal.class;
                    if (t == s) {
                        String value = BeanUtils.getProperty(obj, field.getName());
                        BeanUtils.setProperty(obj, field.getName(), StringUtils.defaultString(value, ""));
                        
//                        Method m = classz.getMethod("get" + change(field.getName()));
//                        Object name = m.invoke(obj);// 调用该字段的get方法
//                        if (name == null) {
//                            Method mtd = classz.getMethod("set" + change(field.getName()), new Class[] {String.class});// 取得所需类的方法对象
//                            mtd.invoke(obj, new Object[] {"  "});// 执行相应赋值方法
//                        }
                    }
//                    else if(t==b) {
//                        BigDecimal bg= (BigDecimal) PropertyUtils.getProperty(obj, field.getName());
//                        if(bg!=null) {
//                            BeanUtils.setProperty(obj, field.getName(), bg.toPlainString());
//                        }else {
//                            BeanUtils.setProperty(obj, field.getName(), "");
//                        }
//                    }
                    
                    
                    
                } catch (Exception e) {
                    log.error("对象属性转换异常", e);
                }
            }
        }
        return obj;
    }

    /**
     * 添加水印、页眉、页脚
     * 
     * @param fileName 源文件路径
     * @param savepath 目标文件路径
     * @param waterMarkName 文字水印
     * @param pageHeade 页眉
     * @param foot 页脚
     * @return
     */
    public File addFooterAndWater(File docx2pdf, String waterMarkName, String pageHeade, String foot) throws CoreException  {
        
        // 文档总页数
        try {
            File file = FileGenUtil.getWriteFile(docx2pdf.getName(), "pdf","after");
            PdfReader reader = new PdfReader(docx2pdf.getPath());
            PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(file));
            BaseFont font = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            for (int i = 1; i <= reader.getNumberOfPages(); i++) {
                // 获得pdfstamper在当前页的上层打印内容.也就是说 这些内容会覆盖在原先的pdf内容之上.
                PdfContentByte over = stamper.getOverContent(i);
                // 用pdfreader获得当前页字典对象.包含了该页的一些数据.比如该页的坐标轴信息.
                PdfDictionary p = reader.getPageN(i);
                // 拿到mediaBox 里面放着该页pdf的大小信息.
                PdfObject po = p.get(new PdfName("MediaBox"));
                //System.out.println(po.isArray());
                // po是一个数组对象.里面包含了该页pdf的坐标轴范围.
                PdfArray pa = (PdfArray) po;
                //System.out.println(pa.size());
                // 看看y轴的最大值.
                //System.out.println(pa.getAsNumber(pa.size() - 1));
                //页眉
                if(StringUtils.isNotBlank(pageHeade)) {
                    /*写入页眉开始**/
                    // 开始写入文本
                    over.beginText();
                    // 设置字体和大小
                    over.setFontAndSize(font, 10);
                    // 设置字体的输出位置
                    over.setTextMatrix(70, pa.getAsNumber(pa.size() - 1).intValue()-30);
                    // 要输出的text
                    over.showText(pageHeade);
                    over.endText();
                    /*写入页眉结束**/
                }
                //页脚
                if(StringUtils.isNotBlank(foot)) {
                    /*写入页脚开始**/
                    // 开始写入文本
                    over.beginText();
                    // 设置字体和大小
                    over.setFontAndSize(font, 10);
                    // 设置字体的输出位置
                    over.setTextMatrix(0,0);
                    // 要输出的text
                    over.showText(foot);
                    over.endText();
                    /*写入页脚结束**/
                }
                if(StringUtils.isNotBlank(waterMarkName)) {
                    // 开始设置水印
                    over.beginText();
                    // 设置水印透明度
                    PdfGState gs = new PdfGState();
                    // 设置填充字体不透明度为0.4f
                    gs.setFillOpacity(0.4f);
                    try {
                        // 设置水印字体参数及大小(字体参数，字体编码格式，是否将字体信息嵌入到pdf中（一般不需要嵌入），字体大小)
                        over.setFontAndSize(font, 60);
                        // 设置透明度
                        over.setGState(gs);
                        // 设置水印对齐方式 水印内容 X坐标 Y坐标 旋转角度
                        over.showTextAligned(Element.ALIGN_RIGHT, waterMarkName, 500, 430, 45);
                        // 设置水印颜色
                        over.setColorFill(BaseColor.GRAY);
                        //结束设置
                        over.endText();
                    }finally {
                    }
                }
                over.stroke();
            }
            stamper.close();
            reader.close();
            return file;
        } catch (Exception e) {
            log.error(e.getMessage(),e);
            throw new CoreException(RspCode.SYSFAIL.getRspCode(), "添加页眉页眉水印失败!");
        }
    }

   
    /**
     * @param src 源字符串
     * @return 字符串，将src的第一个字母转换为大写，src为空时返回null
     */
    private static String change(String src) throws CoreException {
        if (src != null) {
            StringBuffer sb = new StringBuffer(src);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            return sb.toString();
        } else {
            return null;
        }
    }


}
