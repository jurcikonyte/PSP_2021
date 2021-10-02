package com.impl;

import com.impl.model.PhoneValidator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneValidatorTest {

    PhoneValidator phoneValidator;
    @BeforeEach
    void setUp() {
        phoneValidator = new PhoneValidator();
    }

    @Test
    void Test_Phone_With_Other_Symbols_Should_Not_Be_Valid(){
        assertFalse(phoneValidator.isValid("+3706b111111"));
    }

    @Test
    void Test_Phone_With_Bad_Structure_Should_Not_Be_Valid(){
        assertFalse(phoneValidator.isValid("+1111111111111111111111111"));
    }

    @Test
    void Test_Phone_With_Good_Structure_Should_Be_Valid(){
        assertTrue(phoneValidator.isValid("+37061111111"));
    }

    @Test
    void Test_Phone_With_Good_Structure_Should_Be_Valid2(){
        assertTrue(phoneValidator.isValid("861111111"));
    }

    @Test
    void Test_Phone_With_German_Structure_Should_Be_Valid(){
        assertTrue(phoneValidator.isValid("+4930901820"));
    }

    @AfterEach
    void tearDown(){
    }
}
