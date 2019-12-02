package com.rm.export;
/**
 * 电证导出excel
 * @author ningpeng
 *
 */


import com.rm.export.cfg.ExpExcelCfgDetail;
import com.rm.export.cfg.ExpExcelConfig;
import java.io.File;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.springframework.stereotype.Component;

/**
 * excel导出
 * @author ningpeng
 *
 */
@Component
@Data
public class ElcsExpExcel {
	private static final String EXP_DIR = "excel";

	@Resource
	private ExpExcelConfig expExcelConfig;
	
	private static ElcsExpExcel elcsExpExcel;
	
	@PostConstruct
	public void init() {
		elcsExpExcel = this;
	}
	
	/**
	 * 导出文件
	 * 
	 * @param fileName
	 * @param expCfgId
	 * @return
	 * @throws Exception
	 */
	public static File genExcelFile(String fileName,String expCfgId, Map<String,Object> inMap) throws Exception {
		String extension = FilenameUtils.getExtension(fileName);
		if (StringUtils.isBlank(extension)) {
			fileName = FilenameUtils.getBaseName(fileName) + FilenameUtils.EXTENSION_SEPARATOR + XSSFWorkbookType.XLSX.getExtension();
		}
		File xlsxFile = FileGenUtil.getWriteFile(fileName, EXP_DIR);
		ExpExcelConfig expExcelConfig = elcsExpExcel.getExpExcelConfig();
		ExpExcelCfgDetail defConfig = expExcelConfig.getDefConfig();
		GenExcelUtil.genExcel(xlsxFile, defConfig,expExcelConfig.getElcsCfgMap().get(expCfgId),inMap);
		return xlsxFile;
	}
	
	/**
	 * ELCS导出配置
	 * @author ningpeng
	 *
	 */
	@Getter
	@AllArgsConstructor
	public enum ELCS_EXP_CFG{
		TEST_EXP("test_gen_excel"),
		BACK_BILL_EXP("backBill_excel");
		private String cfgId;

	}

}
