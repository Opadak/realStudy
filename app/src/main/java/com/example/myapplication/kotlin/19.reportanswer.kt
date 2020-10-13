package com.example.myapplication.kotlin

fun main(array: Array<String>){

    val calculator3 = Calculator3(3)
    calculator3.plus(5).minus(5)
    //이것이 가능한 이유? 자기 자신 클래스를 return해서
    // ----------/ ->calculator3(3)
    //--------------------------/->calculator3(8)
    //--------------------------------------------/ -> calculator3.minus(5) <<가능한 문법이기에 사용가능
    // Chaning (체이닝)
}

class Calculator3(val initialValue: Int) {

    fun plus(number:Int):Calculator3{
        val result = this.initialValue + number
        return Calculator3(result)
    }
    fun minus(number: Int) :Calculator3 {
        val result = this.initialValue - number
        return Calculator3(result)
    }
    fun Multiply(number: Int) :Calculator3{
        val result = this.initialValue * number
        return Calculator3(result)
    }
    fun divid(number: Int):Calculator3 {
        val result = this.initialValue / number
        return Calculator3(result)
    }
}