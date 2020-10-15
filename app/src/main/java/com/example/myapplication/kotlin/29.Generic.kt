package com.example.myapplication.kotlin

// 29.Generic(제너릭)
// 제너릭에 목적
// -다양한 타입의 객채둘을 다루는 메서드나 컬렉션
//  클래스에서 컴파일 시에 타입을 체크해주는 기능
// 간단하게 말해서 > 타입을 체크하는 기능이다.

//제너릭은 만들기 어렵고 실제로 만들일이 거의 없기 때문에 사용하는 방법만 숙지한다.

fun main(array: Array<String>) {
    //<String> 이것이 제너릭!!@!!

    //제너릭을 사용하지 않은 경우 = > 형 변환을 해줘야 한다.
    val list = listOf(1,2,3,"가")
    val b:String = list[2].toString() //형 변환 (타입 변환)
    //제너릭을 사용하는 경우 = > 타입이 안전하다 (형변환 x)
    val list2 = listOf<String>("a","b","c")
    val c : String = list2[2]

    //강한 타입을 체크 할 수 있다.
    val list3 = listOf(1,2,3,4,"가","나",3.0)
    val list4 = listOf<Int>(1,2,3) //강한 타입 체크

    //제너릭을 사용하지 않는 경우
    val list5 = listOf(1,2,3,"가") // -> Any라는 타입으로 지정
    //Any는 type들의 조상이다.****


}