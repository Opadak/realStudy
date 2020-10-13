package com.example.myapplication.kotlin

//12. 배열
// 배열이 필요한 이유
// -그룹이 필요할 때


fun main(array: Array<String>) {

    //배열을 생성하는 방법 1 (선언과 생성 하는 것은 다르다.)
    var number: Int = 10
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)
    println(group1 is Array)

    //배열을 생성하는 방법2
    var number1 = 10
    var group2 = arrayOf(1, 2, 3.5, "Hello")
    //16중에 어떤 타입인지 안적어주면 배열안의 요소들은 아무 타입이나 와도 신텍스 에러가 안뜬다. 하지만 비추하는 방법.

    //-index란?
    // = 순서 (몇번째)
    // [ 1,2,3,4,5]
    // 0부터 시작
    //인덱스는 그래서 요소-1개임.

    //배열의 값을 꺼내는 방법(1)
    val test1 = group1.get(0)
    val test2 = group1.get(4)
    println(test1)
    println(test2)

    //배열의 값을 꺼내는 방법(2)
    val test3 = group1[0]
    println(test3)

    //배열의 값을 바꾸는 방법(1)
    group1.set(0,100)
    println(group1[0])

    //배열의 값을 바꾸는 방법(2)
    group1[0] = 200
    println(group1[0])

}