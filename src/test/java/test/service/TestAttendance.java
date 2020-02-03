package test.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pxxy.personManagement.domain.Attendance;
import com.pxxy.personManagement.service.AdminAttendanceService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:config/spring-context.xml"})
public class TestAttendance {
	@Autowired
	private AdminAttendanceService adminAttendanceService;
	@Test
	public void testAttenByEmp() {
		List<Attendance> attenForEmp = adminAttendanceService.getAttenForEmp(17);
		System.out.println(attenForEmp);
	}
}
