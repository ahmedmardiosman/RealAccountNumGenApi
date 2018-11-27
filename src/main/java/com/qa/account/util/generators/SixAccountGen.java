package com.qa.account.util.generators;

import com.qa.account.util.constants.Constants;

public class SixAccountGen extends AbstractAccountGen {

    @Override
    public String getGeneratedNumber() { return generateAccountNumber(Constants.SIX_DIGIT_ACCOUNT); }

}