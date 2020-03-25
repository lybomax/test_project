package com.rm.common;

import com.fasterxml.uuid.Generators;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.log4j.Log4j;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
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
	 * 阿帕奇  通用对象复制方法,  后面给前面赋值
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
	
	/**
	 * spring通用对象复制方法,    前面给后面赋值
	 *
	 * @param dest
	 * @param orig
	 * @throws Exception
	 */
	static void copyProperties2(Object dest, Object orig) throws Exception {
		try {
			org.springframework.beans.BeanUtils.copyProperties(dest,orig);
		} catch (Exception e) {
			log.error("bean属性copy异常", e);
			throw new Exception(e);
		}
	}
	
	/**
	 * 数值格式化
	 *
	 * @param inVal
	 *            数值
	 * @param scale
	 *            保留小数位
	 * @param isFillZero
	 *            是否需要以0进行填充
	 * @param isPoint
	 *            是否需要千分位
	 * @return
	 */
	public static String formatBigdecimal(BigDecimal inVal, int scale, boolean isFillZero, boolean isPoint) {
		BigDecimal tmpBigdecimal = inVal.setScale(scale, BigDecimal.ROUND_HALF_UP);
		NumberFormat formater = null;
		if (scale == 0) {
			String fomart = "######";
			if (isPoint) {
				fomart = "###,###";
			}
			formater = new DecimalFormat(fomart);
		} else {
			StringBuffer buff = new StringBuffer();
			if (inVal.intValue() == 0) {
				buff.append("0.");
			} else {
				String fomart = "######.";
				if (isPoint) {
					fomart = "###,###.";
				}
				buff.append(fomart);
			}
			for (int i = 0; i < scale; i++) {
				if (isFillZero) {
					buff.append("0");
				} else {
					buff.append("#");
				}
			}
			formater = new DecimalFormat(buff.toString());
		}
		return formater.format(tmpBigdecimal);
	}
	
	/* 数字 正序 */
	private static final String[] RMB_ARR = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
	/* 整数四位数单位 倒序 */
	private static final String[] RMB_INT_MIN_UNIT_ARR = { "", "拾", "佰", "仟" };
	/* 小数单位 正序 */
	private static final String[] RMB_DEC_MAX_UNIT_ARR = { "角", "分" };
	/* 整数每四位的单位 倒序 */
	private static final String[] RMB_MAX_UNIT_ARR = { "圆", "万", "亿", "万", "亿" };
	/* 开头 */
	private static final String START_RMB = "";
	/* 只有整数的结尾 */
	private static final String END_RMB = "整";
	
	/**
	 * @描述 : 获取四位人民币的中文大写格式
	 */
	static String getFourRMB(String fourNum) {
		StringBuilder fourRMB = new StringBuilder();
		boolean zeroFlag = false;
		if ("0".equals(fourNum)) {
			return RMB_ARR[0];
		}
		for (int i = fourNum.length() - 1; i >= 0; i--) {
			Integer integer = Integer.valueOf(String.valueOf(fourNum.charAt(i)));
			if (integer > 0) {
				fourRMB.insert(0, RMB_ARR[integer] + RMB_INT_MIN_UNIT_ARR[fourNum.length() - i - 1]);
				zeroFlag = true;
			} else if (zeroFlag) {
				fourRMB.insert(0, RMB_ARR[0]);
				zeroFlag = false;
			}
		}
		return fourRMB.toString();
	}
	
	/**
	 * 人民币转金额
	 *
	 * @param
	 * @return
	 * @throws Exception
	 */
	public static String toCNY(String inAmt) throws Exception {
		String fmtAmt = format(inAmt);
		String[] integralDecimal = fmtAmt.split("\\.");
		String integral = StringUtils.trim(integralDecimal[0]);
		String decimal = null;
		if (integralDecimal.length>1) {
			decimal = StringUtils.trim(integralDecimal[1]);
		}
		/* 圆 万 亿 万 */
		String[] integrals = new String[(integral.length() + 3) / 4];
		int start, end;
		for (int i = 0, j = 0; i < integrals.length; i++) {
			start = (integral.length() - 4 * i - 4) < 0 ? 0 : (integral.length() - 4 * i - 4);
			end = integral.length() - 4 * i;
			integrals[j++] = integral.substring(start, end);
		}
		/* 整数部分 */
		String integralRMB = "";
		for (int i = 0; i < integrals.length; i++) {
			integralRMB = getFourRMB(integrals[i]) + RMB_MAX_UNIT_ARR[i] + integralRMB;
		}
		/* 小数部分 - 没有小数 */
		if (StringUtils.isBlank(decimal) || NumberUtils.toInt(decimal)==0) {
			return START_RMB + integralRMB + END_RMB;
		}
		/* 小数部分 - 有小数 - 四舍五入 */
		BigDecimal bigDecimal = new BigDecimal("0." + decimal);
		decimal = String.valueOf(bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()).split("\\.")[1];
		/* 小数部分 - 有小数 - 获取小数的大写中文格式 */
		String decimalRMB = getDecimalRMB(decimal);
		if (StringUtils.isNotBlank(decimalRMB) && StringUtils.equals(RMB_ARR[0] + RMB_MAX_UNIT_ARR[0],integralRMB)) {
			integralRMB = "";
		}
		return START_RMB + integralRMB + decimalRMB;
	}
	
	/**
	 * @描述 : 格式化字符串
	 */
	// 此处预编译，可以提高效率
	private static Pattern pattern = Pattern.compile("([0-9]+(\\.[0-9]+){0,1})");
	private static Pattern pattern2 = Pattern.compile("^[0]+");
	
	private static String format(String number) throws Exception {
		number = "0" + number;
		Matcher matcher = pattern.matcher(number);
		if (!matcher.matches()) {
			throw new RuntimeException("您输入的数字格式不正确");
		}
		matcher = pattern2.matcher(number);
		if (matcher.find()) {
			number = number.replaceAll("^[0]+", "");
			number = number.replaceAll("[0]+$", "");
		}
		if ("".equals(number)) {
			number = "0";
		}
		if (number.startsWith(".")) {
			number = "0" + number;
		}
		if (number.endsWith(".")) {
			number = number + "0";
		}
		return number;
	}
	
	/**
	 * @描述 : 获取小数的大写中文格式
	 */
	private static String getDecimalRMB(String decimal) {
		StringBuilder decimalRMB = new StringBuilder();
		for (int i = 0; i < decimal.length(); i++) {
			Integer integer = Integer.valueOf(String.valueOf(decimal.charAt(i)));
			if (integer > 0) {
				decimalRMB.append(RMB_ARR[integer] + RMB_DEC_MAX_UNIT_ARR[i]);
			}else {
				decimalRMB.append(RMB_ARR[integer]);
			}
		}
		return decimalRMB.toString();
	}
	
	public static Object null2String(Object obj) {
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
	
	public static String dateAdd(String date,Long day) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); // 日期格式
		Date dates = dateFormat.parse(date); // 指定日期
		Date newDate = timeAdd(dates, day); // 指定日期加上20天
		return dateFormat.format(newDate);
	}
	
	public static Date timeAdd(Date date,long day){
		long time = date.getTime(); // 得到指定日期的毫秒数
		day = day*24*60*60*1000; // 要加上的天数转换成毫秒数
		time+=day; // 相加得到新的毫秒数
		return new Date(time); // 将毫秒数转换成日期
	}
}
