package com.qa.account.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.account.service.AccountService;

@RequestMapping("/accounts")
@RestController
public class AccountGenRest {

	@Autowired
	private AccountService service;
	
	@GetMapping("/createAccountNumber")
	public String createAccountNumber() {
		return service.createAccountNumber();
	}
}
