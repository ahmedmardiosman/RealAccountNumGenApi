package com.qa.account.util.generators;

public class CreateAccount {

    private AbstractAccountGen generator;

    public CreateAccount(AbstractAccountGen generator){
        this.generator = generator;
    }

    public String createAccount(){
        return generator.getGeneratedNumber();
    }
    
    public AbstractAccountGen getGenerator() {
    	return this.generator;
    }

}
