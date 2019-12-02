package com.rm.export.cfg;

import cn.cbcc.elcs.core.util.ResourcesUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Configuration;

/**
 * 交易码与服务映射
 * 
 * @author ningpeng
 *
 */
@Data
@Configuration
@Slf4j
public class ExpExcelConfig {
	private static final String DEF_CONFIG_FILE = "/templates/exp_excel/exp_excel_global.json";
	private static final String EXP_CONFIG_FILE = "/templates/exp_excel/exp_excel_cfg.json";
	// 默认配置
	private ExpExcelCfgDetail defConfig;
	// 导出Map配置
	private Map<String, ExpExcelElcsCfg> elcsCfgMap = new ConcurrentHashMap<String, ExpExcelElcsCfg>();

	@PostConstruct
	public void loadConfig() throws Exception {
		// 通过json文件配置方式
		log.info("--------------- LOAD ELCS EXP EXCEL CONFIG START ---------------");
		log.info("加载默认导出样式配置:{}",DEF_CONFIG_FILE);
		String defConfigStr = ResourcesUtils.readFile(DEF_CONFIG_FILE, Charset.forName("UTF-8"));
		JSONObject parseObject = JSON.parseObject(defConfigStr,Feature.OrderedField);
		defConfig = parseObject.getObject("def_config",ExpExcelCfgDetail.class);
		log.info("加载ELCS导出配置:{}",EXP_CONFIG_FILE);
		String jsonStr = ResourcesUtils.readFile(EXP_CONFIG_FILE, Charset.forName("UTF-8"));
		if (StringUtils.isNotBlank(jsonStr)) {
			JSONObject jsonObject = JSON.parseObject(jsonStr,Feature.OrderedField);
			for(Entry<String, Object> entry:jsonObject.entrySet()) {
				String key = entry.getKey();
				JSONObject cfgJson = (JSONObject) entry.getValue();
				ExpExcelElcsCfg cfg = new ExpExcelElcsCfg();
				for(Entry<String, Object> detEntry:cfgJson.entrySet()) {
					String detKey = detEntry.getKey();
					Object detValue = detEntry.getValue();
					if (detValue!=null) {
						if (StringUtils.equalsIgnoreCase(detKey, "config")) {
							cfg.setConfig(JSON.toJavaObject((JSONObject)detValue, ExpExcelCfgDetail.class));
						}else if (StringUtils.equalsIgnoreCase(detKey, "title")) {
							cfg.setTitle(detValue.toString());
						}else if (StringUtils.equalsIgnoreCase(detKey, "sheetName")) {
							cfg.setSheetName(detValue.toString());
						}else {//表单或表格对象
							JSONObject fieldJson = (JSONObject) detValue;
							cfg.getContentMap().put(detKey, JSON.toJavaObject(fieldJson, ExpExcelElcsCfgDet.class));
						}
					}
				}
				log.info("加载ELCS导出配置[{}={}]",key,cfg.getTitle());
				elcsCfgMap.put(key, cfg);
			}
		}
		log.info("---------------  LOAD ELCS  EXP EXCEL CONFIG END  ---------------");

	}

	public void reload() throws Exception {
		loadConfig();
	}

}
