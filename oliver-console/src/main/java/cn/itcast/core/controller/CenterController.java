package cn.itcast.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台管理中心
 * @author Zhang
 *
 */
@Controller
@RequestMapping("/center")
public class CenterController {

	@RequestMapping(value="/index.do")
	public String test(Model model) {
		
		return "index";
	}
	
}
