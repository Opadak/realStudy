package com.example.myapplication.kotlin


//08.제어흐름
// - if, else
fun main(array: Array<String>) {
    val a: Int = 5
    val b: Int = 10

    //if/else 사용하는 방법
    if (a > b) {
        println("a가 b보다 크다.")
    } else {
        println("a가 b보다 작다.")
    }
    println()
    //if/else 사용하는 두번째 방법
    if (a > b) {
        println("a가 b보다 크다")
    }
    println()
    //if/else/else if 사용하는 방법
    if (a > b) {
        println("a가 b보다 크다.")
    } else if (a < b) {
        println("a가 b보다 작다.")
    } else { println("a와 b가 같다.")}
    //값을 리턴하는 if
    val max = if (a>b){
        a // 5
    } else {
        b // 10
    }
    // "val max = if (a>b) a else b" <- 라고 적어도 가능
    // 흐름만 제어할 수 있는게 아니라 어떠한 값을 리턴하는 용도로도 사용이 가능 하다.
    //코틀린에서 가능 한 것들은 중괄호 안에 내용이 간단하다면 중괄호를 생략할 수 있다. (자바와의 차이점)
    println(max)
    // if가 결과값을 리턴 할 수 있어서 b의 값을 max에 리턴 할 수 있음.

}