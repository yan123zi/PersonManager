package com.pxxy.personManagement.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResourcesUtil {

	public static List<String> gekeyList(String key) {
		// TODO Auto-generated method stub
		Map<String, List> map=new HashMap<>();
		List<String> pubList=new ArrayList<>();
		pubList.add("/getCode");
		pubList.add("/index");
		pubList.add("/assets/**");
		pubList.add("/admin/login");
		pubList.add("/admin/loginPage");
		pubList.add("/employee/login");
		map.put("publicURL", pubList);
		return map.get(key);
	}
	
}
