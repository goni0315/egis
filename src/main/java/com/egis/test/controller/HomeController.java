package com.egis.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.egis.test.dao.BoardDao;



@Controller
@RequestMapping("/*")
public class HomeController {

	@Autowired
	BoardDao boardDao;
	
	@RequestMapping(value="index")
	public String index(Model model) {
				
		
		model.addAttribute("list", boardDao.getList());		
		
		//System.out.println("dd");
		return "index";
				
	}

}