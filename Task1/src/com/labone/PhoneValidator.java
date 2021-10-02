package com.labone;

public class PhoneValidator {

    public PhoneValidator() {
    }

    public boolean isValid(String phone) {
        checkPhoneSymbols(phone);
        convertPhoneNumber(phone);
        return true;
    }

    private void checkPhoneSymbols(String phone) {
    }

    public String convertPhoneNumber(String phone) {
        return phone;
    }
}
