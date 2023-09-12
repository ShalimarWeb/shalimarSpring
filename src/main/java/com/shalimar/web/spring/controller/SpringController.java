package com.shalimar.web.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shalimar.web.spring.Entity.PolicyCodes;
import com.shalimar.web.spring.Repository.PolicyCodesRepository;

@Controller
public class SpringController {
	
	@Autowired
	PolicyCodesRepository policyCodesRepository;
	
	@ResponseBody
	@GetMapping("/data")
	public List<PolicyCodes> getAllCust()
	{
		return policyCodesRepository.findAll();
	}

}
