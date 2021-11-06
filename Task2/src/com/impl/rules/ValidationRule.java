package com.impl.rules;

public class ValidationRule {

    private String countryCode;
    private String areaCode;
    private int length;
    private String phone;

    public ValidationRule(String countryCode, String areaCode, int length) {
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.length = length;
    }
    public boolean isPrefixCorrect(String phone) {
        boolean isCountryCodeCorrect = true;
        boolean isAreaCodeCorrect = true;
        char[] phoneArray = phone.toCharArray();
        char[] countryCodeArray = countryCode.toCharArray();
        char[] areaCodeArray = areaCode.toCharArray();
        for (int i = 0; i < Math.max(countryCodeArray.length, areaCodeArray.length) ; i++) {
            if ( isCountryCodeCorrect && i < countryCodeArray.length && phoneArray[i] != countryCodeArray[i]){
                isCountryCodeCorrect = false;
            }
            if ( isAreaCodeCorrect && i < areaCodeArray.length && phoneArray[i] != areaCodeArray[i]){
                isAreaCodeCorrect = false;
            }
        }
        return isAreaCodeCorrect || isCountryCodeCorrect;
    }

    public int getLength() {
        return length;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
