package com.irempamukcu.vehicleregistrationandselectionproject;

import org.junit.Test;
import static org.junit.Assert.*;


public class VehicleTest {
    VehicleValidator validator = new VehicleValidator();
    @Test
    public void plateTestCorrect(){
        assertTrue(validator.isPlateValid("34 dmr 232"));
    }
    @Test
    public void plateTestFalse(){
        assertFalse(validator.isPlateValid("34 Rdsffsdfsdfs 2232"));
    }
    @Test
    public void VehicleModelTestCorrect(){
        assertTrue(validator.isVehicleModelValid("Broadway"));
    }
    @Test
    public void VehicleModelTestFalse(){
        assertFalse(validator.isVehicleModelValid("Broadwaysdfsdfsdfsdfsdfsdfsdfsfsdf"));
    }
    @Test
    public void VehicleHealthTestCorrect(){
        assertTrue(validator.isvehicleHealthValid("iyi"));
    }
    @Test
    public void VehicleHealthTestCorrect2(){
        assertTrue(validator.isvehicleHealthValid("kötü"));
    }
    @Test
    public void VehicleHealthTestFalse(){
        assertFalse(validator.isvehicleHealthValid("çıtır hasarlı"));
    }
    @Test
    public void VehiclePowerTestCorrect(){
        assertTrue(validator.isVehiclePowerValid("444"));
    }
    @Test
    public void VehiclePowerTestFalse(){
        assertFalse(validator.isVehiclePowerValid("444444"));
    }
    @Test
    public void VehicleGearTypeTestCorrect(){
        assertTrue(validator.isGearTypeValid("otomatik"));
    }
    @Test
    public void VehicleGearTypeCorrect2(){
        assertTrue(validator.isGearTypeValid("manuel"));
    }
    @Test
    public void VehicleGearTypeFalse(){
        assertFalse(validator.isGearTypeValid("kademeli fites"));
    }
    @Test
    public void HowManyPersonCorrect(){assertTrue(validator.isHowManyPerson("4"));}
    @Test
    public void HowManyPersonFalse(){assertFalse(validator.isHowManyPerson("12"));}
    @Test
    public void DailyPriceCorrect(){
        assertTrue(validator.isDailyPrice("12345"));}
    @Test
    public void DailyPriceFalse(){
        assertTrue(validator.isDailyPrice("1234578910"));}
}
