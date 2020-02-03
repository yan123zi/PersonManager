package test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pxxy.personManagement.utils.EmailSender;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:config/spring-context.xml"})
public class TestEmail {
	@Test
	public void send() {
//		EmailSender.sendEmail("673343330@qq.com", "fwe", "gergreg");
	}
}
