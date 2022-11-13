package com.irempamukcu.vehicleregistrationandselectionproject

class VehicleValidator {

    fun isPlateValid(plate: String ): Boolean {
        return plate.length < 11;
    }
    fun isVehicleModelValid(vehicleModel: String):Boolean{
        return vehicleModel.length<30
    }
    fun isvehicleHealthValid(vehicleHealth: String):Boolean{
        return vehicleHealth.equals("iyi") || vehicleHealth.equals("kötü")
    }
    fun isVehiclePowerValid(vehiclePower:String):Boolean{
        return vehiclePower.length<4
    }
    fun isGearTypeValid(vehicleGear:String):Boolean{
        return vehicleGear.equals("otomatik") || vehicleGear.equals("manuel")

    }
    fun isHowManyPerson(howManyPerson:String):Boolean{
        return howManyPerson.length<2
    }
    fun isDailyPrice(dailyPrice : String):Boolean{
        return dailyPrice.length<8
    }
}