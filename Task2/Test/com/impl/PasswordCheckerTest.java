package com.impl;

import com.impl.model.PasswordChecker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordCheckerTest {

    PasswordChecker passwordChecker;
    @BeforeEach
    void setUp() {
        passwordChecker = new PasswordChecker();
    }

    @Test
    void Test_Password_Without_Uppercase_Should_Not_Be_Valid(){
        assertFalse(passwordChecker.isValid("weakpassword/?"));
    }

    @Test
    void Test_Password_Is_Too_Short_Should_Not_Be_Valid(){
        assertFalse(passwordChecker.isValid("b/?"));
    }

    @Test
    void Test_Password_With_No_Special_Symbol_Should_Not_Be_Valid(){
        assertFalse(passwordChecker.isValid("WeakPassword"));
    }

    @Test
    void Test_Password_With_All_Conditions_Should_Be_Valid(){
        assertTrue(passwordChecker.isValid("GreatPassword/?"));
    }

    @AfterEach
    void tearDown(){
    }
}
