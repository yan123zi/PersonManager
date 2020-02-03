package com.pxxy.personManagement.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
/**
 * 	日期格式转换类
 * @author 子江
 *
 */
public class DateConverter implements Converter<String,Date>{

	@Override
	public Date convert(String source) {
		//实现 将日期串转成日期类型(格式是yyyy-MM-dd HH:mm:ss)
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			//转成直接返回
			return simpleDateFormat.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			
		}
		//如果参数绑定失败返回null
		return null;
	}
}

