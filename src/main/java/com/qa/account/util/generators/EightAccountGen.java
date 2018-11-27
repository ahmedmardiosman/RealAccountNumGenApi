package com.qa.account.util.generators;

import com.qa.account.util.constants.Constants;

public class EightAccountGen extends AbstractAccountGen {

    @Override
    public String getGeneratedNumber() { return generateAccountNumber(Constants.EIGHT_DIGIT_ACCOUNT); }

}
