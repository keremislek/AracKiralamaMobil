package com.irempamukcu.vehicleregistrationandselectionproject

class PaymentValidator {
    fun isCardNumber (cardNumber: String):Boolean{
        return cardNumber.length==16
    }
    fun isLastDateMonth (dateMonth:String):Boolean{
        return dateMonth.length==0
    }
    fun isLastDateYear(dateYear: String):Boolean{
        return dateYear.length==0
    }
    fun isCVV(cvv:String):Boolean{
        return cvv.length==3
    }
}