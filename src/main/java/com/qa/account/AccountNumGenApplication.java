package com.qa.account;

import com.qa.account.util.generators.AbstractAccountGen;
import com.qa.account.util.generators.CreateAccount;
import com.qa.account.util.generators.EightAccountGen;
import com.qa.account.util.generators.SixAccountGen;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccountNumGenApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountNumGenApplication.class, args);
	}


	@Bean
	public CreateAccount createAccount(){
		return new CreateAccount();
	}

	@Bean
	public AbstractAccountGen accountGenerator(){
		return new EightAccountGen();
	}


}


