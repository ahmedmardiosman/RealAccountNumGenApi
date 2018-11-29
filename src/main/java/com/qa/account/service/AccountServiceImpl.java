package com.qa.account.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qa.account.persistence.domain.AccountNum;
import com.qa.account.persistence.repository.AccountRepository;
import com.qa.account.util.generators.CreateAccount;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository repo;

	@Autowired
	private CreateAccount accountCreator;

	public String createAccountNumber() {
		List<String> allAccountNumbers = getAccountNumArray();
		accountCreator.getGenerator().setAccountNumList(allAccountNumbers);
		
		String generatedNum = accountCreator.createAccountNumber();
		repo.save(new AccountNum(generatedNum));
		
		return generatedNum;
	}
	private List<String> getAccountNumArray() {
		List<AccountNum> objectList = repo.findAll();
		return objectList.stream().map(AccountNum::getAccountNum).collect(Collectors.toList());
	}

}
