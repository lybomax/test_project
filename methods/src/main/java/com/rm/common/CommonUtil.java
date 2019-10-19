package com.rm.common;

import com.fasterxml.uuid.Generators;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.*;
import lombok.extern.log4j.Log4j;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
/**
 * @class: Util
 * @title: //主题说明
 * @desc: //模块目的、功能描述
 * @author: Lyy
 * @date: 2019年10月11日 17:01
 * @since: 1.0.0
 */
@Log4j
public class CommonUtil {
	
	/**
	 *
	 */
	public static void main(String[] args) {
	
	}
	
	/**
	 * 把一个bean中的属性转化到map中
	 *
	 * @param bean bean对象
	 * @param properties 存放bean中属性的map对象
	 * @return
	 */
	static Map beanToMap(Object bean, Map<String, Object> properties) {
		if (bean == null || properties == null) {
			return null;
		}
		
		try {
			Map map = BeanUtils.describe(bean);
			map.remove("class");
			for (Object o : map.keySet()) {
				String key = (String) o;
				Object value = map.get(key);
				properties.put(key, value);
			}
			return map;
		} catch (Exception ex) {
			System.out.println("读取bean属性出错");
			ex.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 把一个map中的所有属性值设置到bean中
	 *
	 * @param properties 含有属性的map对象
	 * @param bean 需要被设置属性的对象
	 */
	public static Object mapToBean(Map<String, Object> properties, Object bean) {
		if (properties == null || bean == null) {
			return null;
		}
		try {
			for (String key : properties.keySet()) {
				Object value = properties.get(key);
				BeanUtils.setProperty(bean, key, value);
			}
			return bean;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 获取一个UUID
	 *
	 * @return
	 */
	static String getUUID() {
		UUID generate = Generators.timeBasedGenerator().generate();
		return StringUtils.replace(generate.toString(), "-", "");
	}
	
	/**
	 * 获取8位时间
	 * @return
	 */
	public static String get8Dt(Date... date) {
		if (date == null || date.length == 0) {
			return DateFormatUtils.format(Calendar.getInstance(), "yyyyMMdd", Locale.CHINA);
		}else{
			Date dt = date[0];
			if (dt == null) {
				return DateFormatUtils.format(Calendar.getInstance(), "yyyyMMdd", Locale.CHINA);
			} else {
				return DateFormatUtils.format(dt, "yyyyMMdd", Locale.CHINA);
			}
		}
	}
	
	/**
	 * 获取14位时间+日期
	 * @return
	 */
	public static String get14Date(Date...date) {
		if (date == null || date.length == 0) {
			return DateFormatUtils.format(Calendar.getInstance(), "yyyyMMddHHmmss",Locale.CHINA);
			
		}else{
			Date dt = date[0];
			return DateFormatUtils.format(dt, "yyyyMMddHHmmss",Locale.CHINA);
		}
	}
	
	/**
	 * 获取时间
	 * @return
	 */
	public static String get6Tm() {
		return DateFormatUtils.format(Calendar.getInstance(), "HHmmss",Locale.CHINA);
	}
	
	/**
	 * 对比同类型的对象，找到哪些属性的值不一样
	 *
	 * @param srcObj       参考对象
	 * @param destObj      目标对象
	 * @param ignoreFields 忽略的属性
	 * @return 返回目标对象有哪些属性值不一样
	 * @throws Exception
	 */
	public static <T> Map<String, Object> findDiff(T srcObj, T destObj, String... ignoreFields) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			PropertyDescriptor[] pds = Introspector.getBeanInfo(srcObj.getClass(), Object.class).getPropertyDescriptors();
			List<String> ignoreList = ignoreFields == null ? null : Arrays.asList(ignoreFields);
			for (PropertyDescriptor pd : pds) {// 这里就是所有的属性了
				String name = pd.getName();// 属性名
				if (ignoreList != null && ignoreList.contains(name)) {// 如果当前属性选择忽略比较，跳到下一次循环
					continue;
				}
				Method readMethod = pd.getReadMethod();// get方法
				Object oldVal = readMethod.invoke(srcObj);
				Object newVal = readMethod.invoke(destObj);
				boolean equals = false;
				if(oldVal instanceof BigDecimal) {
					if(null == newVal) {
						equals = ObjectUtils.equals(oldVal, newVal);
					}else {
						equals = ((BigDecimal) oldVal).compareTo((BigDecimal)newVal)==0;
					}
				}else if(oldVal instanceof String) {
					if(StringUtils.isBlank((String)oldVal)
							&&StringUtils.isBlank((String)newVal)) {
						equals =  true;
					}else {
						equals = ObjectUtils.equals(oldVal, newVal);
					}
				}else {
					equals = ObjectUtils.equals(oldVal, newVal);
				}
				if (!equals) {
					result.put(name, newVal==null?"":newVal);
				}
			}
		} catch (Exception e) {
			throw new Exception("比较失败", e);
		}
		return result;
	}
	
	/**
	 * 通用对象复制方法,转换错误时抛出异常
	 *
	 * @param dest
	 * @param orig
	 * @throws Exception
	 */
	public static void copyProperties(Object dest, Object orig) throws Exception {
		try {
			ConvertUtils.register(new DateConverter(null), java.util.Date.class);
			BeanUtils.copyProperties(dest, orig);
		} catch (Exception e) {
			log.error("bean属性copy异常", e);
			throw new Exception(e);
		}
	}
}
