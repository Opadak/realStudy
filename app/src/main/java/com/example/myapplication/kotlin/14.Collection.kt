package com.example.myapplication.kotlin

//14.Collection (집합)
// -> list, set , map
// 값을 변경 할 수 없는 -> Immutable Collection
// 값을 변경 할 수 있는 -> Mutable Collection

fun main (array: Array<String>){

    //List ->중복을 허용한다.
    //배열과 유사하다.
    val numberlist = listOf<Int>(1,2,3,3)
    println(numberlist)
    println(numberlist.get(0))
    println(numberlist[0])
    println()
    //Set ->집합
    // 1.동일값(중복)을 허용하지 않음.
    // 2.순서가 없다 (= index가 없다)
    //즉 get으로 값을 불러올 수 없다.
    val numberSet = setOf<Int>(1,2,3,3,3)
    println(numberSet)
    numberlist.forEach{
        println(it)
    }
    println()
    //Map -> key,value 방식으로 관리한다.
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println(numberMap.get("one"))

    // List, map , Set 은 값을 변경 할 수 없는 콜렉션이다. (추가, 변경 x)
    //이러한 것들을 Immutable Collection 이라고 한다.

    //Mutable Collection (변경가능)
    val mnumberList = mutableListOf<Int>(1,2,3)
    mnumberList.add(3,4)
    println()
    println(mnumberList)

    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(10)
    println()
    println(mNumberSet)
    //set은 index가 없어서 add에 값을 하나 넣으면 됨.

    val mNumberMap = mutableMapOf<String,Int>("one" to 1)
    mNumberMap.put("two",2)
    println()
    println(mNumberMap)

}