package com.impl.model;

import java.util.List;
import com.impl.rules.ValidationRule;
import static com.impl.constants.PhonePrefixes.LEGAL_RULES;

public class PhoneValidator {

    private List<ValidationRule> legalRules;

    public PhoneValidator() {
        this.legalRules = LEGAL_RULES;
    }

    public boolean isValid(String phone) {
        ValidationRule validationRule = getValidationRule(phone);
        if ( validationRule == null){
            return false;
        }
        String convertedPhone = convertPhone(phone, validationRule);
        return isPhoneValidLength(convertedPhone, validationRule.getLength())
                && phoneHasOnlyDigits(phone);
    }

    private ValidationRule getValidationRule (String phone){
        for ( ValidationRule rule : legalRules){
            if ( rule.isPrefixCorrect(phone)){
                return rule;
            }
        }
        return null;
    }

    private String convertPhone( String phone, ValidationRule rule){
        if (phone.indexOf("+") == 0) {
            return phone;
        }
        StringBuilder convertedPhone = new StringBuilder(rule.getCountryCode());
        char[] phoneArray = phone.toCharArray();
        int areaLength = rule.getAreaCode().length();
        for ( int i = areaLength; i < phone.length(); i++) {
                convertedPhone.append(phoneArray[i]);
        }
        return convertedPhone.toString();
    }

    private boolean phoneHasOnlyDigits(String phone) {
        if ( phone.indexOf("+") == 0) {
            phone = phone.substring(1);
        }
        for ( char c : phone.toCharArray()){
            if ( !Character.isDigit(c))
                return false;
        }
        return true;
    }

    private boolean isPhoneValidLength(String convertedNumber, int length) {
        if ( convertedNumber.contains("+")) {
            convertedNumber = convertedNumber.substring(1);
        }
        return convertedNumber.length() == length;
    }
}