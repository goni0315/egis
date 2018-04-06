package com.egis.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/*")
public class HomeController {
	
	@RequestMapping(value="index")	
	public String idnex(Model model) {
				
		System.out.println("dd");
		return "index";
				
		
	}

}