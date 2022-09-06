package com.hosto.intranet.controller;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hosto.intranet.service.IAreaService;

@Controller
public class IndexController {

    Date date = new Date();
	Calendar calendar = Calendar.getInstance();

    @Autowired
	private IAreaService areaService;


    @GetMapping("/")
	public String index(Model model) {

		model.addAttribute("titulo", "INTRANET");
		calendar.setTime(date);
		int dateYear = calendar.get(Calendar.YEAR);

		model.addAttribute("fecha", dateYear);
		return "index";
	}
    
}
