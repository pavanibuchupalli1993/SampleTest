package com.example.sampletest;

import org.junit.Assert;
import org.junit.Test;

public class EmailValidatorUnitTest {
    //Correct Input
    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        Assert.assertTrue(EmailValidator.isValidEmail("name@email.com"));
    }

    // Email with subdomain
    @Test
    public void emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        Assert.assertTrue(EmailValidator.isValidEmail("name@email.co.uk"));
    }

    //with out domain

    @Test
    public void emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("name@email"));
    }

    //with extra characters
    @Test
    public void emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("name@email..com"));
    }

    //with out user name
    @Test
    public void emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail("@email.com"));
    }

    //fot empty
    @Test
    public void emailValidator_EmptyString_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail(""));
    }

    //checking null false case
    @Test
    public void emailValidator_NullEmail_ReturnsFalse() {
        Assert.assertFalse(EmailValidator.isValidEmail(null));
    }
}
