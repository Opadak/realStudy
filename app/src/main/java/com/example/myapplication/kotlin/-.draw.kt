package com.example.myapplication.kotlin

fun main(array: Array<String>){

}

class Account2 {
    val name : String
    val birth : String
    var balance : Int

    constructor(name: String, birth: String, balance: Int){
        this.name = name
        this.birth = birth
  //      this.balance = balance
        if (balance >= 0) {
            this.balance = balance
        } else {
            this.balance = 2
        }
        // 클래스 인스턴스 설정을 조건을 두고 바꿀 수 있다.
        // 이 때 그 조건 속에는 this로 인스턴스 생성을 해
    }

}