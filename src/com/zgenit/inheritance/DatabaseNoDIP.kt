package com.zgenit.inheritance

fun main(){
    println("when we use multiple db settings, its will difficult :)")
}

class PaymentService{
    val db : Database = Database()

    fun addNewPayment(){
        //db.insert()
    }

    fun updatePaymentById(){
        //db.update()
    }

    fun deletePaymentById(){
        //db.delete()
    }
}

class Database{
    fun insert(tableName : String, datas : List<Any>){
        //insert to db
    }

    fun update(tableName: String, id : String, datas : List<Any>){
        //update where id
    }

    fun delete(tableName: String, id : String){
        //delete where id
    }
}