package com.pxxy.personManagement.utils;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.util.DigestUtils;



/**
 * MD5通用类
 * 
 * @author 子江
 * @version 1.0.0_1
 * 
 */
public class MD5 {
	/**
     * MD5方法
     * 
     * @param text 明文
     * @param key 密钥
     * @return 密文
     * @throws Exception
     */
    public static String md5(String password) throws Exception {
        //加密后的字符串
        String encodeStr=DigestUtils.md5DigestAsHex((password).getBytes());
        return encodeStr;
        }

    /**
     * MD5验证方法
     * 
     * @param text 明文
     * @param key 密钥
     * @param md5 密文
     * @return true/false
     * @throws Exception
     */
    public static boolean verify(String text, String md5) throws Exception {
        //根据传入的密钥进行验证
        String md5Text = md5(text);
        if(md5Text.equalsIgnoreCase(md5))
        {
            return true;
        }
            return false;
    }
    public static void main(String[] args) throws Exception {
    	String md5 = MD5.md5("123456");
    	System.out.println(md5);
    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    	Date format = simpleDateFormat.parse("1998-12-06");
    	System.out.println(format.getTime());
	}
}