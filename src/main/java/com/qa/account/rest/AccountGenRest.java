package com.qa.account.rest;

import com.qa.account.util.constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.account.service.AccountService;

@RequestMapping(Constants.URL_BASE)
@RestController
public class AccountGenRest {

	@Autowired
	private AccountService service;

	@CrossOrigin(origins = "*")
	@GetMapping(Constants.URL_CREATE_ACCOUNT)
	public String createAccountNumber() {
		return service.createAccountNumber();
	}
}
