package com.example.myapplication.kotlin

//02. 자료형  (type)
// 정수형 -> Long > Int > Short > Byte (표현할 수 있는 범위가 넓은 순)
// 실수형 -> Double > Float (위와 동일)
// 문자 -> Char (한자의 문자를 표현할 때)
// 문자열 -> String  ( 여러가지 언어 한꺼번에 표현 가능)
// 논리형(참True/거짓False) -> Boolean

//변수 선언 하는 방법(1)
var number = 10
//number라는 상자(변수) 에 10이라 정의를 하여서 '정수형'만 들어갈 수 있음.

//변수 선언 하는 방법(2)
var number1 : Int = 20
var hello1 : String = "Hello"
var point1 : Double = 3.4
//타입을 적어주는 방법이 두번째 방법인데 자료형을 적어두는게 더 좋은 방법이다. (명시를 해주는게 더욱더 쉽게 프로그래밍을 할 수 있다.)


fun main(array: Array<String>){
    number = 20
  //  number = 20.5
        // 위는 정수형이 아니기에 the floating-point literal does not conform to the expected type int 라는 문구로 "신텍스 에러"가 뜬다.
}