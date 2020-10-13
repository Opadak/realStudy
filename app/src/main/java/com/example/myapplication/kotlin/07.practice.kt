package com.example.myapplication.kotlin

fun main(array: Array<String>) {

    //산술 연산자
    var a = 10 + 1
    var b = 10 - 1
    var c = 1 * 9
    var d = 20 / 3
    var e = 20 % 3

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    println()
    //대입 연산자
    val f = 5
    // val 5 = f >신텍스 에러 뜸

    println()
    //복합 대입 연산자
    a += 10
    b -= 10
    c *= 3
    d /= 4
    d %= 2

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    println()
    //증감연산자
    a++
    b-- // b += << 똑같은건데 b-- 를 사용하는 이유는 직관적으로 사용 가능 하기 때문이다.
    println(a)
    println(b)

    println()
    //비교연산자
    var g = a > b
    var h = a == b
    val i = !h
    println(g)
    println(h)
    println(i)

    println()
    //논리연산자
    val j = h && i
    val k = h || i
    println(j)
    println(k)

}