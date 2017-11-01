package cn.itcast.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.core.bean.TestTb;
import cn.itcast.core.dao.TestTbDao;

/**
 * 实现类
 * @author Zhang
 *
 */
@Service("testTbService")
@Transactional
public class TestTbServiceImpl implements TestTbService{

	@Autowired
	private TestTbDao testTbDao;
	
	public void testTb(TestTb t) {
		testTbDao.insertTestTb(t);
	}
	
	
}
