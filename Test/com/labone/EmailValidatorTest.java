package com.labone;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    private static final EmailValidator emailValidator = new EmailValidator();

    @Test
    void emailCorrect() {
        String email = "test@mif.lt";
        assertTrue(emailValidator.isValid(email));
    }

    @Test
    void emailWithoutAtSymbol() {
        String email = "testmif.lt";
        assertFalse(emailValidator.isValid(email));
    }

    @Test
    void emailWithIllegalSymbols() {
        String email = "test@mif@lt";
        assertFalse(emailValidator.isValid(email));
    }

    @Test
    void emailHasBadDomainOrTLD() {
        String email = "t_est@mif.l_t";
        assertFalse(emailValidator.isValid(email));
    }

}