package com.impl;

import com.impl.model.EmailValidator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailValidatorTest {

    EmailValidator emailValidator;
    @BeforeEach
    void setUp() {
        emailValidator = new EmailValidator();
    }

    @Test
    void Test_Email_Without_At_Sign_Should_Not_Be_Valid(){
        assertFalse(emailValidator.isValid("test.gmail.com"));
    }

    @Test
    void Test_Email_With_Forbidden_Symbols_Should_Not_Be_Valid(){
        assertFalse(emailValidator.isValid("test>@gmail.com"));
    }

    @Test
    void Test_Email_With_Bad_Domain_Should_Not_Be_Valid(){
        assertFalse(emailValidator.isValid("test@baddomain.com"));
    }

    @Test
    void Test_Email_With_Bad_TLD_Should_Not_Be_Valid(){
        assertFalse(emailValidator.isValid("test@email.info"));
    }

    @Test
    void Test_Email_With_Good_Structure_Should_Be_Valid(){
        assertTrue(emailValidator.isValid("test@gmail.com"));
    }

    @AfterEach
    void tearDown(){
    }
}
