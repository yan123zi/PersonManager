package test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pxxy.personManagement.domain.Apply;
import com.pxxy.personManagement.domain.ApplyExample;
import com.pxxy.personManagement.domain.ApplyExample.Criteria;
import com.pxxy.personManagement.mapper.ApplyMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:config/spring-context.xml"})
public class TestAdminRecruitmentService {
	@Autowired
	private ApplyMapper applyMapper;
	@Test
	public void testupdateApply() {
		Apply apply = applyMapper.selectByPrimaryKey(2);
		apply.setiSche(2);
		applyMapper.updateByPrimaryKey(apply);
	}
}
