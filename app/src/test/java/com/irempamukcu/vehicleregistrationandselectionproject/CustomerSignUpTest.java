package com.irempamukcu.vehicleregistrationandselectionproject;

import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerSignUpTest {

    CustomerValidator validator= new CustomerValidator();

    @Test
    public void cutomerNameTestCorrect(){
        assertTrue(validator.isCustomerName("John Doe"));
    }
    @Test
    public void customerNameFalse(){
        assertFalse(validator.isCustomerName("Fahrettin Cürreklibatur"));
    }
    @Test
    public void customerSurnameCorrect(){
        assertTrue(validator.isCustomerSurname("Yılmaz"));
    }
    @Test
    public void customerSurnameFalse(){
        assertFalse(validator.isCustomerSurname("Yataruyumazoğulları"));
    }
    @Test
    public void customerPhoneNumberCorrect(){
        assertTrue(validator.isCustomerPhoneNUmber("5060001122"));
    }
    @Test
    public void customerPhoneNUmberFalse(){
        assertFalse(validator.isCustomerPhoneNUmber("506000111222333"));
    }
}
