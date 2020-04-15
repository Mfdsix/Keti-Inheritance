package com.zgenit.inheritance

fun main(){

}

interface PaymentNoISP{
    var paymentName : String
    var amount : Int
    var adminCharge : Int
    var bankCode : Int
    var virtualBankId : String
    var accountId : String
}

class Gopay : PaymentNoISP{
    override var paymentName: String = "Gopay"
    override var accountId: String = "8755032326536"
    override var amount: Int = 120000
    override var adminCharge : Int = 0 // maybe gopay not required this
    override var bankCode: Int = 0 // gopay doesn;t have this
    override var virtualBankId: String  = "" //gopay doesnt have this
}

class BNi : PaymentNoISP{
    override var paymentName: String = "BNi Syariah"
    override var accountId: String = "" // bni doesnt have this
    override var amount: Int = 120000
    override var adminCharge : Int = 2500
    override var bankCode: Int = 0
    override var virtualBankId: String  = "326435243"
}