package com.impl.model;

import java.util.List;
import static com.impl.constants.Constants.LEGAL_EMAIL_CHARACTERS;
import static com.impl.constants.EmailDomains.LEGAL_DOMAINS;

public class EmailValidator {

    private List<Character> legalCharacters;
    private List<String> legalDomains;

    public EmailValidator() {
        this.legalCharacters = LEGAL_EMAIL_CHARACTERS;
        this.legalDomains = LEGAL_DOMAINS;
    }

    public boolean isValid(String email) {
        if ( email == null)
        {
            return false;
        }
        return emailHasAtSymbol(email)
                && emailHasOnlyLegalCharacters(email)
                && emailHasValidDomain(email);
    }

    private boolean emailHasAtSymbol(String email) {
        return email.indexOf("@") != 0
                && email.indexOf("@") != email.length() - 1
                && email.chars().filter(c -> c == '@').count() == 1;
    }

    private boolean emailHasOnlyLegalCharacters(String email) {
        for ( char c : email.toCharArray()){
            if ( !( Character.isLetter(c)
                    || Character.isDigit(c)
                    || legalCharacters.contains(c)
                    || c == '@'))
                return false;
        }
        return true;
    }


    private boolean emailHasValidDomain(String email) {
        String domain = email.substring(email.indexOf('@') + 1);
        return legalDomains.contains(domain);
    }
}