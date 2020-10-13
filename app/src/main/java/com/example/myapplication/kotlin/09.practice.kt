package com.example.myapplication.kotlin

fun main(array: Array<String>) {

    val a: Int? = null
    val b: Int = 10
    val c: Int = 100


    if (a == null) {
        println("a is null")
    } else {
        println("a is not null")
    }


    if (b+c ==110) {
        println("b plus c is 110")
    } else {
        println("b plus c is not 110")
    }

    //엘비스 연산자
    //이 값이 null인 경우 아닌경우 어떤걸 해라
    val number: Int? = null
    val number2 = number ?: 10
    // number가 null인 경우에는 10을 넣어준다
    //코틀린 언어가 가지고 있는 특징이다. ( 코틀린은 null safe 이다 = null을 문법적으로 대응 할 수 있게 도와주는 언어이다.)
    //엘비스 연산자 -> ?:
    println(number2)

}