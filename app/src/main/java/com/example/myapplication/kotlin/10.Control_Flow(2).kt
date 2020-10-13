package com.example.myapplication.kotlin

//10.제어 흐름

// When
//이때에는 이것 저때에는 이것을 실행 시켜라.
fun main(array: Array<String>) {
    val value: Int = 3

    when (value) {
        1 -> {
            println("value is 1")
        }
        2 -> {
            println("value is 2")
        }
        3 -> {
            println("value is 3")
        }
        else -> {
            println("I dont know value")
        }
    }
    //값을 리턴하는 기능
    val value2 = when(value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println(value2)
}