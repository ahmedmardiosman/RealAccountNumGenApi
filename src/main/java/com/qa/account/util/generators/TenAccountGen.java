package com.qa.account.util.generators;

import com.qa.account.util.constants.Constants;

public class TenAccountGen extends AbstractAccountGen {

    @Override
    public String getGeneratedNumber() { return generateAccountNumber(Constants.TEN_DIGIT_ACCOUNT); }

}
