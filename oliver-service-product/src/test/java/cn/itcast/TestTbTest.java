package cn.itcast;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.core.bean.TestTb;
import cn.itcast.core.dao.TestTbDao;
import cn.itcast.core.service.TestTbService;

/**
 * 测试 junit + spring
 * @author Zhang
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestTbTest {

	@Autowired
	private TestTbDao testDao;
	@Autowired
	private TestTbService testTbService;
	
	/**
	 * 测试spring+mybatis整合
	 */
	@Test
	public void testAdd() {
		
		TestTb t = new TestTb();
		t.setName("测试spring和mybatis整合");
	    t.setAge(12);
	    
	    testDao.insertTestTb(t);
	}
	
	/**
	 * 测试事物
	 */
	@Test
	public void testTransition() {
		
		TestTb t = new TestTb();
		t.setName("测试事物");
	    t.setAge(18);
	    
	    testTbService.testTb(t);
	    
	}
	
	
}
