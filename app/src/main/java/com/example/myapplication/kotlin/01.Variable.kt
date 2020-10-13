package com.example.myapplication.kotlin

//01.변수(Variable)
//상자에 어떠한 것을 담아둔다. 이것이 필요할때 상자를 가지고 와서 꺼낸다. 이때 *변수=상자*
//상자에 집어넣는 것은 상황에 따라 달라지는 결과값임.

//변수를 선언하는 방법
// var/val 변수명(상자) = 값(넣고싶은 것)
// Variable/Value
// - 내 마음대로 원하는 것을 넣을 수 있는 상자 -> Variable
// - 한번 넣으면 바꿀 수 없는 상자 -> Value

// Variable or Value ??
// -1.변하지 않는 값이라면 Value (정확하게 그렇다면)
// -2.변할지 아닐지 애매하다 Variable

var num = 10
var hello = "hello"
var point = 3.4

val fix = 20
// 이건 정의를 내렸으면 다시 고칠 수 없음
// 만약 이를 어기고 고친다음 실행을 하게 되면
// " Val cannot be resigned " 라고 뜸

fun main(args:Array<String>){

    println(num)
    println(hello)
    println(fix)

    num = 100
    hello = "goodbye"
    point = 10.4


    println(num)
    println(hello)
    println(fix)


}