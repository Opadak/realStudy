package com.example.myapplication.kotlin

var a = 1+2+3+4+5
//연산의 결과값을 변수로도 사용 할 수 있다.
var b = "1"
var c = b.toInt() //b를 int 형으로 바꾸겠다는 것. 결국 c에는 1이 있다.
var d = b.toFloat() //위와 동일

var e = "John"
var f = "My name is $e Nice to meet you" // $변수이름 << 변수 선언에 변수를 넣을 수 있음.

// Null
// 코틀린은 null safty (아예 존재하지 않는다)
// 0과 null 은 다르다.

//var abc : Int = null //int형은 null을 받을 수 없다
var abc1 : Int? = null // int에 ?을 붙이면 null을 받을 수 있다.

var g = a + 3 //결과값만 정해질 수 있기만 하면 어떠한 값이 오른쪽에 와도 상관 없다.

fun main(array: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
    println(abc1)
    println(g)
}