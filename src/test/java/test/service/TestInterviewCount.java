package test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pxxy.personManagement.domain.Apply;
import com.pxxy.personManagement.domain.Interview;
import com.pxxy.personManagement.domain.InterviewExample;
import com.pxxy.personManagement.domain.InterviewExample.Criteria;
import com.pxxy.personManagement.mapper.InterviewMapper;
import com.pxxy.personManagement.service.AdminInterviewService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:config/spring-context.xml"})
public class TestInterviewCount {
	@Autowired
	private InterviewMapper interviewMapper;
	@Autowired
	private AdminInterviewService adminInterviewService;
	@Test
	public void testCount() {
		InterviewExample example=new InterviewExample();
		Criteria criteria = example.createCriteria();
		criteria.andApIdEqualTo(2);
		long l = interviewMapper.countByExample(example);
		System.out.println(l);
	}
	@Test
	public void testupdate() {
		adminInterviewService.updateInterviewStatus(26, 2);
	}
	@Test
	public void testEntryEmployee() throws Exception {
		Apply apply = interviewMapper.selectByPrimaryKey(27).getApId();
//		adminInterviewService.entryEmployee(apply);
	}
}
