package com.rm.common;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.time.DateUtils;

public class DataObjectUtils {
	private static final String DATE_NUMBER_PATTERN = "yyyy-MM-dd";
	private static final String DATE_NUMBER_PATTERN_YYYYMMDD = "yyyyMMdd";
	private static final String DATE_NUMBER_PATTERN_YYYYMMDD2 = "yyyy/MM/dd";
	private static final String DATETIME_NUMBER_PATTERN = "yyyy-MM-dd HH:mm:ss";
	private static final String DATETIME_NUMBER_PATTERN2 = "yyyy/MM/dd HH:mm:ss";
	private static final String DATETIME_NUMBER_PATTERN_YYYYMMDD = "yyyyMMddHHmmss";

	private static final String[] DATETIME_FMTS = new String[] { DATE_NUMBER_PATTERN_YYYYMMDD,DATE_NUMBER_PATTERN_YYYYMMDD2, DATE_NUMBER_PATTERN, DATETIME_NUMBER_PATTERN_YYYYMMDD,DATETIME_NUMBER_PATTERN2, DATETIME_NUMBER_PATTERN };
	
	public static <T> T map2bean(Map<String, Object> map, Class<T> clazz) throws Exception {
		T object = null;
		try {
			object = clazz.newInstance();
			mapToObject(object, map);
		} catch (Exception e) {
			throw new Exception();
		}
		return object;
	}

	public static void map2bean(Map<String, Object> map, Object object) throws Exception {
		try {
			mapToObject(object, map);
		} catch (Exception e) {
			throw new Exception();
		}
	}

	private static void mapToObject(Object object, Map<String, Object> map) throws Exception {
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String fieldName = iterator.next();
			Object o = getNestedProperty(object, fieldName);
			PropertyDescriptor desc = PropertyUtils.getPropertyDescriptor(o, fieldName);
			if (desc == null) {
				continue;
			}
			Class<?> cl = desc.getPropertyType();
			Object fieldValue = map.get(fieldName);
			if (fieldValue != null) {
				if ((java.util.Date.class).isAssignableFrom(cl)) {
					Long time = convert(fieldValue);
					if (time != null) {
						BeanUtils.setProperty(o, fieldName, new java.util.Date(time.longValue()));
					}
				} else if ((java.util.Calendar.class).isAssignableFrom(cl)) {
					Long time = convert(fieldValue);
					Calendar calendar = Calendar.getInstance();
					if (time != null) {
						calendar.setTimeInMillis(time.longValue());
						BeanUtils.setProperty(o, fieldName, calendar);
					}
				} else if ((java.math.BigDecimal.class).isAssignableFrom(cl)) {
					String v = fieldValue.toString();
					if (StringUtils.isNotBlank(v)) {
						BeanUtils.setProperty(o, fieldName, v);
					}
				} else if ((java.lang.Integer.class).isAssignableFrom(cl)) {
					String v = fieldValue.toString();
					if (StringUtils.isNotBlank(v) && NumberUtils.isDigits(v)) {
						BeanUtils.setProperty(o, fieldName, NumberUtils.toInt(v));
					}
				} else if ((java.lang.Long.class).isAssignableFrom(cl)) {
					String v = fieldValue.toString();
					if (StringUtils.isNotBlank(v) && NumberUtils.isDigits(v)) {
						BeanUtils.setProperty(o, fieldName, NumberUtils.toLong(v));
					}
				} else if ((java.lang.String.class).isAssignableFrom(cl)) {
					String v = fieldValue.toString();
					if (StringUtils.isNotBlank(v)) {
						BeanUtils.setProperty(o, fieldName, v);
					}
				} else {
					BeanUtils.setProperty(o, fieldName, fieldValue);
				}
			}
		}
	}

	private static Object getNestedProperty(Object o, String propertyDesc) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		Object value = o;
		String properties[] = StringUtils.split(propertyDesc, ".");
		for (int i = 0; i < properties.length; i++) {
			if (properties.length == 1) {
				break;
			}
			String property = properties[i];
			value = PropertyUtils.getProperty(value, property);
			if (i + 2 == properties.length) {
				break;
			}
		}

		return value;
	}

	public static Long convert(Object arg1) {
		String p = arg1.toString();
		if (StringUtils.isBlank(p)) {
			return null;
		}
		try {
			Date dt = DateUtils.parseDate(p, DATETIME_FMTS);
			return dt.getTime();
		} catch (Exception e) {
			return null;
		}
	}
}
