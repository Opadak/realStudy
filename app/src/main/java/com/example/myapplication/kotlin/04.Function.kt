package com.example.myapplication.kotlin

// 04. 함수
//      -어떤 input을 넣어주면 어떤 output 나오는 것.
//      y = x +2
// -함수를 선언하는 방법
// fun 함수명(변수명: 타입, 변수명: 타입 ...) : 반환형 {
// 함수 내용
// return 반환값
// )

fun plus(first: Int, second: Int): Int {
    println(first)
    println(second)
    val result: Int = first + second
    return result
}

//-디폴트 값(기본값=아무것도 값을 입력하지 않을 때 기본적으로 들어가는 값)을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first - second
    return result
}

//-변환값이 없는 함수 만들기 (1)
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
} //아무것도 리턴하지 않겠다!

//-변환값이 없는 함수 만들기 (2)
fun printPlus2(first: Int, second: Int) {
    val result: Int = first + second
    println(result)
} //반환타입에 unit을 안 적어줘도 괜찮다.

//-간단하게 함수를 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second

//-가변인자를 갖는 함수 선언하는 방법
fun plusMany(vararg numbers: Int) {

    for (number in numbers){
        println(number)
    }
    //다른 함수들은 사용자가 설정한 갯수밖에 불가능 하지만 이건 가능
}

//주석 만들때 ctrl + 슬레쉬
fun main(array: Array<String>) {                   //main 이라는 함수의 인자는 array이고 이 인자의 타입은 Array<String>이다.
    //함수를 호출하는 방법
    val result = plus(5, 10)
    println(result)
    //인수를 명시적으로 전달하는 방법
    val result2 = plus(first = 20, second = 30)
    println(result2)

    //디폴트 값을 갖는 함수 호출하기
    println()
    val result3 = plusFive(10, 20)
    println(result3)
    val result4 = plusFive(10)
    println(result4)

    println()
    val result5 = plusShort(50, 50)
    println(result5)

    println()
    plusMany(1,2,3)
    plusMany(100)
}
//자동 정렬> 컨트롤+알트+L

//유닛이란? 생략이 가능하다.