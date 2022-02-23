package com.phung.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = {"/","home"}, method = RequestMethod.GET)
	private String Home() {
		return "user/index";
	}
	
}
