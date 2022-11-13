package com.irempamukcu.vehicleregistrationandselectionproject

class CustomerValidator {
    fun isCustomerName(name:String):Boolean{
        return name.length<15
    }

    fun isCustomerSurname(surname:String):Boolean{
        return surname.length<15
    }

    fun isCustomerPhoneNUmber(phoneNumber:String):Boolean{
        return phoneNumber.length<11
    }
}