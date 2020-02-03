package com.pxxy.personManagement.utils;
/**
 * 	邮件发送工具类
 * @author 子江
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
@Component
@PropertySource(value = {"classpath:config/mail.properties"})
public class EmailSender {
	private static JavaMailSender mailSender;
	private static String sender;
	@Value("${mail.smtp.username}")
	public void setSender(String sender) {
		EmailSender.sender = sender;
	}

	@Autowired
	public EmailSender(JavaMailSender mailSender) {
		EmailSender.mailSender=mailSender;
	}

	/**
	 * 	发送邮件的方法，该方法不能发送附件
	 * @param sender 发件人
	 * @param recipient	收件人
	 * @param title	标题
	 * @param content 邮件内容
	 */
	public static void sendEmail(String recipient,String title,String content) throws Exception{
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom(sender);
		message.setTo(recipient);
		message.setSubject(title);
		message.setText(content);
		mailSender.send(message);
	}
}
