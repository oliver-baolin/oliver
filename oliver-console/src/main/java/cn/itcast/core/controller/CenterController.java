package cn.itcast.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.core.bean.TestTb;
import cn.itcast.core.service.TestTbService;

/**
 * 后台管理中心
 * @author Zhang
 *
 */
@Controller
@RequestMapping("/center")
public class CenterController {

	@Autowired
	private TestTbService testTbService;
	
	/**
	 * 测试类
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/index.do")
	public String test(Model model) {
		
		TestTb t = new TestTb();
		t.setName("oliver");
		t.setAge(12);
		testTbService.testTb(t);
		
		return "index";
	}
	
}
