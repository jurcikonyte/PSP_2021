package com.labone;

import com.labone.rule.ValidationRule;

public class PhoneValidator {

    private ValidationRule validationRule;

    public PhoneValidator() {
    }

    public PhoneValidator(ValidationRule validationRule) {
        this.validationRule = validationRule;
    }

    public boolean isValid(String phone) {
        checkPhoneSymbols(phone);
        convertPhoneNumber(phone);
        return true;
    }

    private void checkPhoneSymbols(String phone) {
    }

    public void convertPhoneNumber(String phone) {
    }
}
