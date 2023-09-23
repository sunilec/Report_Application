package com.reportsApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.reportsApp.entities.CitizenPlan;
import com.reportsApp.request.SearchRequest;
import com.reportsApp.service.ReportService;

@Controller
public class ReportController {
	
	@Autowired
	private ReportService service;

	
	@PostMapping("/search")
	public String handleSearch(@ModelAttribute("search") SearchRequest search, Model model) {
		
		System.out.println(search);
		List<CitizenPlan> plans = service.search(search);
		model.addAttribute("plans", plans);
		
		init(model);
		
		return "index";
	}
	
	/**
	 * This method  is used to load index page
	 * 
	 * @param search
	 * @param model
	 * @return
	 */
	// This method is responsible for to send the data to the form and load the form
	//http://localhost:8080/
	@GetMapping("/")
	public String indexPage(Model model) {
		
		model.addAttribute("search", new SearchRequest());
		init(model);
		
		return "index";
	}

	
	private void init(Model model) {
		
	//	SearchRequest searchObj = new SearchRequest();
		
		model.addAttribute("names", service.getPlanName());
		model.addAttribute("status", service.getPlanStatus());
	}
	
	
}
