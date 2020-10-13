package com.example.myapplication.kotlin

fun grade(first: Int):Unit {
     when (first) {
         in 80..90 -> {
             println("A")
         }
         in 70..80 -> {
             println("B")
         }
         in 60..70 -> {
             println("C")
         }
         in 0..60 -> {
             println("F")
         }
     }
}
fun delNum(first: Int) : Int {
    var num1 : Int = 1
    var firNum : Int = 0
    var secNum : Int = 0
    for ( i in 1 .. 9 ) {
        num1 = i * 10
        if (first-num1>0 && first-num1<=10){

            firNum = first-num1
            secNum = i

        }
    }

    var result : Int = firNum + secNum
    if (first >= 100 || first < 10){
        println("두자리수가 아니므로 0입니다.")
    }
    return result
}
fun MutiTable (first: Int): Unit {
    for (i in 1 .. 9 ) {
        println( " "+first +" x "+i+" = "+first*i)
    }
}
fun gugudan (number:Int): Unit {
    for (i in 1..9) {
        for (z in 1..9){
            println(" "+i+" * "+ z + " = "+i * z)
        }
    }
}

fun main(array: Array<String>) {
    println("첫번째 문제")
    var a : Int = 0;
    var b : Int = 0;
    val firlistnum = mutableListOf<Int>()
    val firlistDiv = mutableListOf<String>()
        for (i in 0 until 9) {
            a++
            firlistnum.add(i, a)

        }
        println(firlistnum)
    for ((index,item) in firlistnum.withIndex()) {
        if (item % 2 == 0){
            firlistDiv.add(b, "True")
        }else{
            firlistDiv.add(b,"false")
        }

    }
    println(firlistDiv)
    println()
    println("두번째 문제")
    grade(86)
    grade(79)
    grade(67)
    grade(10)
    println()
    println("세번째 문제")
    val result1 = delNum(31)
    println(result1)
    val result2 = delNum(123)
    println(result2)

    println()
    println("네번째 문제")
    MutiTable(9)
    println(gugudan(1))
}