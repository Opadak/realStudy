package com.example.myapplication.kotlin

fun main(array: Array<String>) {
    first()
    val result1 : String = second(87)
    println(result1)
    gugudan()
}
fun first() {
    val list1 = MutableList(9,{0})
    val list2 = MutableList(9,{true})

    for (i in 0..8) {
        list1[i] = i + 1
    }
    println(list1)
    list1.forEachIndexed{ index, value ->
        if(value % 2 == 0){
            list2[index] = true
        }else{
            list2[index] = false
        }

    }
    println(list2)
}

fun second(score : Int ) :String {
    when (score) {
        in 90 .. 100 -> {
            return "A"
        }
        in 80 .. 90 -> {
            return "B"
        }
        in 70 .. 90 -> {
            return  "C"
        }
        else-> {
            return "F"
        }

    }

}
fun third (number:Int) : Int {
    val a:Int = number / 10
    val b:Int = number % 10

    return a + b
}

fun gugudan() {
    for (x in 1..9) {
        for (y in 1..9 ){
            println("$x * $y = "+ x * y)
        }
    }
}
