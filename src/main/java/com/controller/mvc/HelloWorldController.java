package com.controller.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	//need a controller to show initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller to process a form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld-submit";
	}
	
	//using model(add data to model
	@RequestMapping("/processFormVersionTwo")
	public String upperCase(HttpServletRequest req,Model model) {
		//read request from html page
		String name=req.getParameter("name");
		//convert it to upper case
		String newName=name.toUpperCase();
		model.addAttribute("name",newName);
		return "helloworld-submit";
	}
	
	//Request param for retreiving datat from form
	@RequestMapping("/processFormVersionThree")
	public String Case(@RequestParam("name") String name,Model model) {
		//convert it to upper case
		String newName=name.toUpperCase();
		model.addAttribute("name",newName);
		return "helloworld-submit";
	}
	
	
}
