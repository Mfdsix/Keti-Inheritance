package com.zgenit.inheritance

fun main(){
    println("Let's see how flexible this is")
}

class PaymentOperation(val database : DatabaseOperation){
    fun addNewPayment(){
        //database.insert()
    }

    fun updatePaymentById(){
        //database.update()
    }

    fun deletePaymentById(){
        //database.delete()
    }
}

abstract class DatabaseOperation{
    abstract fun insert(tableName: String, datas : List<Any>)
    abstract fun update(tableName: String, id : String, datas : List<Any>)
    abstract fun delete(tableName: String, id: String)
}

class MySQLDatabase : DatabaseOperation(){
    override fun insert(tableName: String, datas: List<Any>) {
        //insert with mysql syntax
    }

    override fun update(tableName: String, id: String, datas: List<Any>) {
        //update with mysql syntax
    }

    override fun delete(tableName: String, id: String) {
        //delete with mysql syntax
    }

}

class MongoDabatase : DatabaseOperation(){
    override fun insert(tableName: String, datas: List<Any>) {
        //insert with mongo
    }

    override fun update(tableName: String, id: String, datas: List<Any>) {
        //update with mongo
    }

    override fun delete(tableName: String, id: String) {
        //delete with mongo
    }

}

