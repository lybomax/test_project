package com.rm.openoffic.impl;

import cn.cbcc.elcs.core.util.FileGenUtil;
import fr.opensagres.xdocreport.core.XDocReportException;
import fr.opensagres.xdocreport.document.IXDocReport;
import fr.opensagres.xdocreport.document.registry.XDocReportRegistry;
import fr.opensagres.xdocreport.template.IContext;
import fr.opensagres.xdocreport.template.TemplateEngineKind;
import fr.opensagres.xdocreport.template.formatter.FieldsMetadata;
import java.io.*;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Map.Entry;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.poi.xwpf.converter.pdf.PdfConverter;
import org.apache.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

@Slf4j
public class DocxExportHelper {

	private static final String DOCX_SUFFIX = ".docx";
	private static final String DOCX_TEMPLDATE = "/templates/";

	/**
	 * 文档类型
	 * 
	 */
	public static enum DocType {
		PDF("application/pdf"), DOC("application/msword"), DOCX("application/msword");
		public String contentType;

		private DocType(String contentType) {
			this.contentType = contentType;
		}

	}

	public static DocType accept(String type) {
		try {
			return DocType.valueOf(type.toUpperCase());
		} catch (Exception e) {
			throw new RuntimeException("Unknown export format: " + type);
		}
	}

	private static IContext getReportContext(IXDocReport report, Object bean)
			throws XDocReportException, IllegalArgumentException, IllegalAccessException {
		IContext context = null;
		if (bean != null) {
			if (bean instanceof Map) {
				context = report.createContext((Map<String, Object>) bean);
			} else {
				context = report.createContext();
				Field[] fields = bean.getClass().getDeclaredFields();
				for (Field field : fields) {
					String name = field.getName();
					field.setAccessible(true);
					Object value = field.get(bean);
					context.put(name, value);
				}
			}
		}
		return context;
	}
	

	private static synchronized IXDocReport getIXDocReport(String templateName,Map<String, Class<?>> collClazzMap)
			throws IOException, XDocReportException, IllegalArgumentException, IllegalAccessException {
		XDocReportRegistry registry = XDocReportRegistry.getRegistry();
		IXDocReport report = registry.getReport(templateName);
		if (report == null) {
			InputStream in = null;
			try {
				in = DocxExportHelper.class.getResourceAsStream(DOCX_TEMPLDATE + templateName + DOCX_SUFFIX);
				if (in == null) {
					throw new RuntimeException("未找到指定模板!");
				}
				report = registry.loadReport(in, templateName, TemplateEngineKind.Velocity, true);
				if (collClazzMap!=null && !collClazzMap.isEmpty()) {
					FieldsMetadata metadata = report.createFieldsMetadata();
					for(Entry<String,Class<?>> entry:collClazzMap.entrySet()) {
						metadata.load(entry.getKey(), entry.getValue(),true);
					}
				}
			} finally {
				IOUtils.closeQuietly(in);
			}
		}
		return report;
	}

	/**
	 * 
	 * 功能描述: <br>
	 * 〈功能详细描述〉
	 *
	 * @param templateName 模板名称
	 * @param data         数据集
	 * @param businessno   业务编号
	 * @return
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	public static byte[] export(String templateName, Object data, String businessno,Map<String, Class<?>> collClazzMap) {
		ByteArrayOutputStream baos = null;
		try {
			IXDocReport report = getIXDocReport(templateName,collClazzMap);
			IContext context = getReportContext(report, data);
			baos = new ByteArrayOutputStream();
			report.process(context, baos);
			byte[] bytes = baos.toByteArray();
			File file = FileGenUtil.getWriteFile(businessno + ".docx", "docx");
			FileUtils.writeByteArrayToFile(file, bytes);
			return bytes;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new RuntimeException(e);
		} finally {
			IOUtils.closeQuietly(baos);
		}

	}

	public static File docx2pdf(byte[] bytes, String PDFname) {
		log.info("[start]convert docx to pdf ");
		OutputStream out = null;
		try {
			File file = FileGenUtil.getWriteFile(PDFname, "pdf");
			out = new FileOutputStream(file);
			XWPFDocument document = new XWPFDocument(new ByteArrayInputStream(bytes));
			PdfOptions options = PdfOptions.create();
			ExtITextFontRegistry fontProvider = new ExtITextFontRegistry();
			options.fontProvider(fontProvider);
			PdfConverter.getInstance().convert(document, out, options);
			log.info("[end]convert docx to pdf ");
			out.flush();
			return file;
		} catch (Exception e) {
			log.error("docx2pdf failed", e);
			throw new RuntimeException(e);
		} finally {
			IOUtils.closeQuietly(out);
		}
	}
	
}
