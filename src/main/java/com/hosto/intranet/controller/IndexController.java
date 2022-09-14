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

		model.addAttribute("areas", areaService.listarAreas());
		model.addAttribute("fecha", dateYear);
		return "index";
	}

	@GetMapping("/empresas")
	public String empresas(Model model) {
		calendar.setTime(date);
		int dateYear = calendar.get(Calendar.YEAR);
		model.addAttribute("fecha", dateYear);

		return "empresas";
	}

	@GetMapping("/hosto")
	public String hosto() {

		return "hosto";
	}

	@GetMapping("/sigloxxi")
	public String sigloxxi() {

		return "sigloxxi";
	}

	@GetMapping("/mecanz")
	public String mecanz() {

		return "mecanz";
	}

	@GetMapping("/zerey")
	public String zerey() {

		return "zerey";
	}

	@GetMapping("/pcmm")
	public String pcmm() {

		return "pcmm";

	}

	@GetMapping("/tbn")
	public String tbn() {

		return "tbn";

	}

	@GetMapping("/amron")
	public String amron() {

		return "amron";
	}

	@GetMapping("/osonyer")
	public String osonyer() {

		return "osonyer";
	}

	@GetMapping("/len")
	public String len() {

		return "len";
	}

	@GetMapping("/lats")
	public String lats() {

		return "lats";
	}

	@GetMapping("/rakroj")
	public String rakroj() {

		return "rakroj";

	}

	@GetMapping("/ponderacion")
	public String ponderacion() {

		return "ponderacion";
	}

}
