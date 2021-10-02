package com.labone;

import java.util.Collections;
import java.util.List;

public class EmailValidator {

    private List<Character> illegalCharacters = Collections.emptyList();

    public EmailValidator() {
    }

    public boolean isValid(String email) {
        checkEmailAtSymbol(email);
        checkEmailSpecialCharacters(email);
        checkEmailDomainAndTLD(email);
        return true;
    }

    private void checkEmailAtSymbol(String email) {
    }

    private void checkEmailSpecialCharacters(String email) {
    }

    private void checkEmailDomainAndTLD(String email) {
    }
}
