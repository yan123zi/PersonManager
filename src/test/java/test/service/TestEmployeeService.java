package test.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pxxy.personManagement.domain.Attendance;
import com.pxxy.personManagement.domain.AttendanceExample;
import com.pxxy.personManagement.mapper.AttendanceMapper;
import com.pxxy.personManagement.service.EmployeeService;
import com.pxxy.personManagement.utils.DateUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:config/spring-context.xml"})
public class TestEmployeeService {
	@Autowired
	private AttendanceMapper attendanceMapper;
	@Autowired
	private EmployeeService employeeService; 
	@Test
	public void testDate() throws ParseException {
		Date date = DateUtil.parse("yyyy-MM-dd", new Date());
		AttendanceExample example=new AttendanceExample();
		example.createCriteria().andAtDateEqualTo(date);
		List<Attendance> byExample = attendanceMapper.selectByExample(example);
		System.out.println(byExample.size());
	}
	@Test
	public void testPunch() {
		String punch = employeeService.empPunch(17, 1, null);
		System.out.println(punch);
	}
	@Test
	public void testTime() {
		Date date = DateUtil.parse("yyyy-MM-dd", new Date());
		AttendanceExample example=new AttendanceExample();
		example.createCriteria().andAtDateEqualTo(date);
		List<Attendance> byExample = attendanceMapper.selectByExample(example);
		Attendance attendance = byExample.get(0);
		Date atSw = attendance.getAtEw();
		Date d1 = DateUtil.parse("HH:mm:ss", atSw);
		String startWork="17:00:00";
		Date d2 = DateUtil.paresString("HH:mm:ss", startWork);
		int compareTo = d1.compareTo(d2);
		System.out.println(compareTo);
	}
}
