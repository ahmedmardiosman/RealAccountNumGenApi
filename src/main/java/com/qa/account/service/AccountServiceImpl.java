package com.qa.account.service;

import java.util.List;
import java.util.stream.Collectors;

import com.qa.account.util.generators.AbstractAccountGen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.qa.account.persistence.domain.AccountNum;
import com.qa.account.persistence.repository.AccountRepository;
import com.qa.account.util.generators.CreateAccount;
import com.qa.account.util.generators.SixAccountGen;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository repo;

	private AbstractAccountGen generator;

	public String createAccountNumber() {
		List<String> allAccountNumbers = getAccountNumArray();

		CreateAccount accountCreator = new CreateAccount(new SixAccountGen());
		accountCreator.getGenerator().setAccountNumList(allAccountNumbers);
		
		String generatedNum = accountCreator.createAccount();
		repo.save(new AccountNum(generatedNum));
		
		return generatedNum;
		
	}
	private List<String> getAccountNumArray() {
		List<AccountNum> objectList = repo.findAll();
		return objectList.stream().map(AccountNum::getAccountNum).collect(Collectors.toList());
	}

















}
