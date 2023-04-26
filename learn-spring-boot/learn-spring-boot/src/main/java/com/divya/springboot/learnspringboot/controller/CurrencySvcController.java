package com.divya.springboot.learnspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divya.springboot.learnspringboot.entity.CurrencyserviceConfig;

@RestController
public class CurrencySvcController {

	@Autowired
	private CurrencyserviceConfig currencySvcCon;
	
	
	@GetMapping("/currency")
	public CurrencyserviceConfig getAll()
	{
		return currencySvcCon;
	}
}
