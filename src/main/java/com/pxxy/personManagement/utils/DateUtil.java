package com.pxxy.personManagement.utils;
/**
 * 日期类型格式转换器
 * @author 子江
 *
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public  static Date parse(String pattern,Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String format = sdf.format(date);
		Date parse;
		try {
			parse = sdf.parse(format);
			return parse;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public static Date paresString(String pattern,String date) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date date2;
		try {
			date2 = sdf.parse(date);
			return date2;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	public static String returnString(String pattern,Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String format = sdf.format(date);
		return format;
	}
}
