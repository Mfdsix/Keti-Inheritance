package com.zgenit.inheritance

fun main(){

}

interface PaymentDetail{
    var paymentName: String
    var amount: Int
}

interface DigitalPayment{
    var accountId : String
}

interface VAPayment{
    var adminCharge : Int
    var bankCode : String
    var virtualBankId : String
}

class Ovo : PaymentDetail, DigitalPayment{
    override var paymentName: String = "Ovo"
    override var amount: Int = 120000
    override var accountId: String = "874023265364263"
}

class BNiVA : PaymentDetail, VAPayment{
    override var paymentName: String = "BNi Virtual Account"
    override var amount: Int = 120000
    override var adminCharge: Int = 2500
    override var bankCode: String = "002"
    override var virtualBankId: String = "36273625654"
}

