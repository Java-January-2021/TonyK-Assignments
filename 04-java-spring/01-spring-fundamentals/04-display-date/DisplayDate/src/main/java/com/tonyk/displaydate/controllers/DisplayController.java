package com.tonyk.displaydate.controllers;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/{dt}")
	public String DateTime(@PathVariable("dt") String dt, Model model) {
		if(!dt.equals("date") && !dt.equals("time"))
			return "redirect:/";
		SimpleDateFormat dm = (dt.equals("date"))
			? new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, YYYY")
			: new SimpleDateFormat("h:mm a");
		model.addAttribute("dtFormat", dm.format(new java.util.Date()));
		model.addAttribute("dt", dt);
		return "datetime.jsp";
	}
	
}