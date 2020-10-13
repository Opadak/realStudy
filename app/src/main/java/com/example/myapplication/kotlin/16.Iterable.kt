package com.example.myapplication.kotlin

//16.iterable
//[형용사] 반복될 수 있는, 반복할 수 있는
fun main (array: Array<String>) {
    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    //방복하는 방법 (1) - for
    for (item in a) { //범위를 정할 때 "in"을 사용해야 한다.
        if (item == 5) {
            println("item is five")
        } else {
            print("item is not five")
        }
        println()
    }
    //반복하는 방법 (2) - for 인덱스 사용 방법
    for ( (index, item) in a.withIndex()) {
        println("index : " + index + " value : " + item)
        //문자열 + int(정수) = 문자열
        //문자열 + 아무거나 = 문자열
    }

    //반복하는 방법 (3)
    a.forEach {
        //it에 값이 들어간다.
        //람다 문법(몰라도 됨) (foreach는 활용도가 높다)
        println(it)

    }
    println()
    //반복하는 방법 (4) -it을 바꾸고 싶다면
    a.forEach { item ->
        println(item)
    }
    //반복하는 방법 (5)
    a.forEachIndexed { index, item ->
        println("index : " + index + " value : " + item)
    //직관적이다. 람다

    }
    //반복하는 방법 (6) -인덱스만을 순회하는 for문
    println(a.size)
    println()
    for ( i in 0 until a.size) {
        //util은 마지막을 포함하지 않는다.
        //util = a.size - 1
        println(a.get(i))
    }
    println()
    //반복하는 방법 (7)
    for ( i in 0 until a.size step (2)) {
        println(a.get(i))
    }
    println()
    //반복하는 방법 (8)
    for ( i in a.size -1 downTo (0)){
        //8부터 0까지 반복
        println(a.get(i))
    }
    println()
    //반복하는 방법 (9)
    for(i in a.size -1 downTo (0) step (2)){
        println(a.get(i))
    }
    println()
    //반복하는 방법 (10)
    for (i in 0 .. 10 ){
        // .. 은 마지막을 포함한다.
        println(i)
    }
    //반복하는 방법 (11) - while
    var b: Int = 0
    var c: Int = 4
    println()
    while (b<c) {
        b++ //조건을 깨주는 것이 있어야 한다.
        println("b")
    }//조건이 참이면 계속 반복한다. (이는 무한적으로 작동 할 수 있다. *그래서 조건을 깰 수 있는 것이 필요하다.)
    println()
    //반복하는 방법 (12)
    var d: Int = 0
    var e: Int = 4
    do{
        println("hello")
        d++
    } while (d < e)
    //do안에 있는건 꼭 조건이 아니더라도 한번은 실행한다.

}