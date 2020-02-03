package com.pxxy.personManagement.utils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.zhenzi.sms.ZhenziSmsClient;
/**
 * 发送短信的工具类
 * @author 子江
 *
 */
@Component
@PropertySource(value = {"classpath:app.properties"})
public class SendSMS {
	/**
	 * 短信发送的appId
	 */
	private static String APP_ID;
	/**
	 * 短信发送的appSecret
	 */
	private static String APP_SECRET;
	@Value("${message.appId}")
	public void setAPP_ID(String aPP_ID) {
		APP_ID = aPP_ID;
	}
	@Value("${message.appSecret}")
	public void setAPP_SECRET(String aPP_SECRET) {
		APP_SECRET = aPP_SECRET;
	}
	/**
	 * @param message 短信信息内容
	 * @param toPhone 发送到的号码
	 * @throws Exception 异常
	 * @return 返回发送的状态信息
	 */
	@Test
	public static String SendSms(String message,String toPhone) throws Exception {
		ZhenziSmsClient client = new ZhenziSmsClient("https://sms_developer.zhenzikj.com", APP_ID, APP_SECRET);
		String result = client.send(toPhone, message);
		return result;
    }
}
