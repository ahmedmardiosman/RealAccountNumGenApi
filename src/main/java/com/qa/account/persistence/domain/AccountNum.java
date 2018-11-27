package com.qa.account.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountNum {
	@Id
	private String accountNum;
	
	public AccountNum() {
		
	}
	
	public AccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
}
