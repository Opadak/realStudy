package com.example.myapplication.kotlin


//변수의 접근 범위
// 1. 전역 변수 > 어디에서나 접근 할 수 있는 변수
// 2. 지역 변수 > 해당 지역에서만 접근 할 수 있는 변수

//변수는 가장 작은 범위에서 사용하도록 지정하는 것이 좋다.
//나중에 다른 범위에서 사용해야 하면 바꾸면 되니까!! << 더욱 오류 안나고 좋게 !!

var number100 : Int = 10 //전역 변수

fun main (array: Array<String>) {
    println(number100)

    val test = Test("홍길동")
    test.name
    //이런식은 접근이 가능하다.
    test.testFun()
    println(number100)

}




class Test(var name: String ) { // var name: String 지역 변수
                // birth 접근 불가능
    fun testFun() {
        var birth : String = "2000/01/19"
        name = "홍길동"
        //Test 클래스 안에 있는 함수는 name에 접근 할 수 있다. 하지만 main함수는 직접적으로 접근 불가능 하다.
        number100 = 100
                // birth 접근 가능
    }
    fun testFun2() {
        name
                // birth 접근 불가능
    }
}