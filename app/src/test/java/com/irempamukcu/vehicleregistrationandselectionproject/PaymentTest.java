package com.irempamukcu.vehicleregistrationandselectionproject;

import org.junit.Test;
import static org.junit.Assert.*;

public class PaymentTest {
    PaymentValidator validator=new PaymentValidator();

    @Test
    public void isCardNumberCorrect(){
        assertTrue(validator.isCardNumber("1234567891234567"));
    }
    @Test
    public void isCardNumberFalse(){
        assertFalse(validator.isCardNumber("12345"));
    }
    @Test
    public void isCardNumberFalse2(){assertFalse(validator.isCardNumber("1234567891234567212123"));}
    @Test
    public void isLastDateMonthCorrect(){
     assertTrue(validator.isLastDateMonth("12.10.2022"));
    }
    @Test
    public void isLastDateMonthFalse(){
        assertFalse(validator.isLastDateMonth(""));
    }
    @Test
    public void isLastDateYearCorrect(){
        assertTrue(validator.isLastDateYear("12.10.2022"));
    }
    @Test
    public void isLastDateYearFalse(){
        assertFalse(validator.isLastDateYear(""));
    }
    @Test
    public void isCVVCorrect(){
        assertTrue(validator.isCVV("123"));
    }
    @Test
    public void isCVVFalse(){
        assertFalse(validator.isCVV("34212"));
    }
    @Test
    public void isCVVFalse2(){
        assertFalse(validator.isCVV("3"));
    }
}
