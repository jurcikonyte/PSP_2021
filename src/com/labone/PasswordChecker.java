package com.labone;

import java.util.Collections;
import java.util.List;

public class PasswordChecker {

    private List<Character> specialSymbols = Collections.emptyList();

    public PasswordChecker() {
    }

    public PasswordChecker(List<Character> specialSymbols) {
        this.specialSymbols = specialSymbols;
    }

    public boolean isValid(String password) {
        checkPasswordLength(password);
        checkPasswordUppercase(password);
        checkPasswordSpecialSymbols(password);
        return true;
    }

    private void checkPasswordLength(String password) {
    }

    private void checkPasswordUppercase(String password) {
    }

    private void checkPasswordSpecialSymbols(String password) {
    }
}
