package com.qa.account.util.generators;

import org.springframework.beans.factory.annotation.Autowired;

public class CreateAccount {

    @Autowired
    private AbstractAccountGen generator;

    public CreateAccount(AbstractAccountGen generator){
        this.generator = generator;
    }

    public CreateAccount(){ }

    public String createAccountNumber(){
        return generator.getGeneratedNumber();
    }
    
    public AbstractAccountGen getGenerator() {
    	return this.generator;
    }

    public void setGenerator(AbstractAccountGen generator) {
        this.generator = generator;
    }
}
