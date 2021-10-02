package com.impl.constants;

import com.impl.rules.ValidationRule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhonePrefixes {
    public static List<ValidationRule> LEGAL_RULES = new ArrayList<>(Arrays.asList(
            new ValidationRule("+370", "8", 11),
            new ValidationRule("+49", "0", 10),
            new ValidationRule("+371", "6", 11),
            new ValidationRule("+33", "0", 11)
    ));

}
