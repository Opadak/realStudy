package com.example.myapplication.kotlin

fun main(array: Array<String>){
    val array = arrayOf<Int>(1,2,3)

    //get = 인덱스를 넣어서 값을 꺼낼때
    //set = 인덱스에 원하는 값을 넣을때

    val number =  array.get(0)
    println(number)

  //   val number1 = array.get(100)

    //신텍스 에러가 일어나지 않았다 = 문법에는 문제가 없다.
    array.set(0,100)
    val number2 = array.get(0)
    println(number2)

    //array를 만드는 방법 3 - 특정적인 인자만 받을 수 있는 배열
    val a1 = intArrayOf(1,2,3)
    val a2 = charArrayOf('a','b') // '' -> char "" -> string
    val a3 = doubleArrayOf(1.2, 3.4)
    val a4 = booleanArrayOf(true, false)
    //명시적으로 타입을 적어서 할 수 있는 이 방법이 좋은 방법이라고 강사가 말함.

    //array를 만드는 방법 4 ->lambda 를 활용한 방법
     var a5 = Array(10, { 0 })
    var a6 = Array(5,{1;2;3;4;5})


}

//11줄 12줄 프로그램을 동작시켰을 때 나타나는 오류와 신텍스 오류는 다르다.
// Exception(예외) in thread "main" java.lang.ArrayIndexOutOfBoundsException: 100
//ArrayIndexOutOf*BoundsException: 100 {우리가 정해놓은 배열 범주에 속해 있지 않다.}
//	at com.example.myapplication.kotlin._13_practiceKt.main(13.practice.kt:11)
//13.practice.kt:11 <- 클릭 하게 되면 오류가 난 해당 번줄 라인으로 넘어가진다.

//*Array의 Bounds
//-처음 만들때 결정이 된다.

