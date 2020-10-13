package com.example.myapplication.kotlin


fun plusThree(first: Int, second: Int, third: Int): Int {
    val result = first + second + third
    return result

    //7과 8행을 삭제하고 return first + second + third 로 바로 리턴 해줄 수 있음.

}

fun minusThree(first: Int, second: Int, third: Int) = first - second - third
//간략

fun mutiplyThree(first: Int = 1, second: Int = 1, third: Int = 1): Int {
    return first * second * third
}

//내부합수

//함수 안에 들어있는 함수

fun showMyPlus(first: Int, second: Int): Int {
    println(first)
    println(second)
    //return first + second
    fun plus(first: Int,second: Int) : Int {
     return first + second
    }
    return plus(first,second)
    //first가 어디 first인지 궁굼하면 컨트롤+클릭 하면 해당 부분으로 이동 (유용한 정보)
}

fun main(array: Array<String>) {
    val result = plusThree(1, 2, 3)
    println(result)
    val result2 = minusThree(10, 1, 2)
    println(result2)
    val result3 = mutiplyThree(2, 2, 2)
    println(result3)
    val result4 = mutiplyThree()
    println(result4)
}


