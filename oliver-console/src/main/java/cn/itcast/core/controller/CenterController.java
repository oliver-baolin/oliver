package cn.itcast.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台管理中心
 * 
 * @author Zhang
 *
 */
@Controller
@RequestMapping("/center")
public class CenterController {

	/**
	 * 测试类
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/index.do")
	public String index(Model model) {
		return "index";
	}

	// 头部
	@RequestMapping(value = "/top.do")
	public String top(Model model) {
		return "top";
	}

	// 身体
	@RequestMapping(value = "/main.do")
	public String main(Model model) {
		return "main";
	}

	// 身体--左
	@RequestMapping(value = "/left.do")
	public String left(Model model) {
		return "left";
	}

	// 身体--右
	@RequestMapping(value = "/right.do")
	public String right(Model model) {
		return "right";
	}

	// 商品--身体
	@RequestMapping(value = "/frame/product_main.do")
	public String productMain(Model model) {
		return "frame/product_main";
	}

	// 商品--身体
	@RequestMapping(value = "/frame/product_left.do")
	public String productLeft(Model model) {
		return "frame/product_left";
	}

}
