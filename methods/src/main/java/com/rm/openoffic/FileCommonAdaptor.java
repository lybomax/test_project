package com.rm.openoffic;

import cn.cbcc.elcs.core.bean.ExportBean;
import cn.cbcc.elcs.core.exception.CoreException;
import java.io.File;
import java.util.Map;

/**
 * 模板数据适配器
 * 
 * @author jonay
 *
 * @param <T>
 *            返回类型
 */
public interface FileCommonAdaptor {

	/**
	 * 根据请求参数，返回模板数据
	 * 
	 * @param parameters
	 * @return
	 */
    public File process(ExportBean bean, Map<String, Class<?>> collClazzMap) throws CoreException;
}
