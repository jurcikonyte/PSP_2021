package com.impl.model;

import java.util.List;
import static com.impl.constants.Constants.SPECIAL_CHARACTERS;

public class PasswordChecker {

    private List<Character> specialCharacters;
    private int minPasswordLength;

    public PasswordChecker() {
        this.specialCharacters = SPECIAL_CHARACTERS;
    }

    public void minPasswordLength(int minPasswordLength) {
        this.minPasswordLength = minPasswordLength;
    }

    public PasswordChecker(List<Character> specialCharacters) {
        this.specialCharacters = specialCharacters;
    }

    public boolean isValid(String password) {
        if ( password == null) {
            return false;
        }
        return isPasswordLengthValid(password)
                && passwordHasUppercaseCharacter(password)
                && passwordHasSpecialCharacter(password);
    }

    private boolean isPasswordLengthValid(String password) {
        return password.length() >= minPasswordLength;
    }

    private boolean passwordHasUppercaseCharacter(String password) {
        for ( char c : password.toCharArray()){
            if ( Character.isUpperCase(c))
                return true;
        }
        return false;
    }

    private boolean passwordHasSpecialCharacter(String password) {
        for ( char c : password.toCharArray()){
            if ( specialCharacters.contains(c))
                return true;
        }
        return false;
    }
}