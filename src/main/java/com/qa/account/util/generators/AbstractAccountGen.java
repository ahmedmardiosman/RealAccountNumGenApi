package com.qa.account.util.generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.qa.account.util.constants.Constants;

public abstract class AbstractAccountGen {

    private List<String> accountNumList = new ArrayList<>();

    public abstract String getGeneratedNumber();

    protected String generateAccountNumber(int accountSize){
        String num = constructString(accountSize);
        while(accountNumList.contains(num)){
            num = constructString(accountSize);
        }
        accountNumList.add(num);
        return num;
    }

    private String constructString(int size){
        StringBuilder accNum= new StringBuilder();
        int i = new Random().nextInt(3);
        if(i==0){
            accNum.append(Constants.ACCOUNT_TYPE_A + ":");
        }else if(i==2){
            accNum.append(Constants.ACCOUNT_TYPE_B + ":");
        }else{
            accNum.append(Constants.ACCOUNT_TYPE_C + ":");
        }
        for (int j = 0; j < size; j++) {
            accNum.append(generateDigit());
        }
        return accNum.toString();
    }

    private String generateDigit(){
        return new Random().nextInt(10)+"";
    }
    
    public void setAccountNumList(List<String> accountNumList) {
    	this.accountNumList = accountNumList;
    }
}