package com.example.myapplication.kotlin


fun main (array: Array<String>) {

    val a = mutableListOf<Int>(1,2,3)
    a.add(4)
    println(a)
    a.add(0,100)
    println(a)
    a.set(0,200)
    println(a)
    //set과 add의 차이점
    a.removeAt(1)
    println(a)

    val b = mutableSetOf<Int>(1,2,3,4)
    println()
    b.add(2)
    println(b)
    //removeAT이 없음.
    b.remove(2)
    println(b)
    b.remove(100)
    println(b)
    //없는 값이면 내버려둔다. = 신텍스 에러는 발생하지 않는다.

    val c = mutableMapOf<String, Int>("one" to 1)
    println()
    c.put("two",2)
    println(c)
    c.replace("two",3)
    println(c)
    println(c.keys)
    println(c.values)
    c.clear()
    println(c)

}