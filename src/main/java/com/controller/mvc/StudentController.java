package com.controller.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	//show our form
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		//add student object as model attribute to store form data
		model.addAttribute("student", new Student());
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student,BindingResult br) {
		System.out.println(br);
		if(br.hasErrors()) {
			return "student-form";
		}
		else {
			System.out.print(student.getFirstName());
			return "student-submit";
			
		}
	}
	
}
