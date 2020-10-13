package com.example.myapplication.kotlin

// 11. 제어 흐름 실습

fun main(array: Array<String>) {

    val value: Int? = null
    when (value) {
        null -> println("value is null")
        else -> println("value is not null")
    }

    val value2: Boolean? = null
    when (value2) {
        true -> {
            println("value2 is true")
        }
        false -> {
            println("value2 is false")
        }//true와 false 말고도 null이 있기 때문에 null이나 else를 포함 해야 함
        //코드를 작성할 때 모든 경우의 수를 대응 할 수 있는 걸로 작성해야 빅데이터 오류가 안나온다.
        null -> {
            println("value2 is null")
        }
    }
    val value3 = when (value2) {
        true -> 1
        false -> 3
        null -> 4
    }
    //when의 다양한 조건식 (1)
    val value4 : Int = 4
    when (value4) {
        is Int ->{
            println("value is int")
        }//value4가 숫자이면
        else -> {
            println("value is not int")
        }//그외이면
    }
    //when의 다양한 조건식 (2)
    val value5 : Int = 87
    when(value5) {
        in 60..70 -> {
            println("value is in 60 ~ 70")
        }
        in 70..80 ->{
            println("value is in 70 ~ 80")
        }
        in 80..100 ->{
            println("value is in 80 ~ 100")
        }
        // 숫자 .. 숫자 << 60보다 크고 70보다 작거나 같다.
    }
}