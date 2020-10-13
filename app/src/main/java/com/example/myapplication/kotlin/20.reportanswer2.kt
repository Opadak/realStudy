package com.example.myapplication.kotlin
//은행계좌 만들기

fun main (array: Array<String>) {
    val account :Account = Account("홍길동","20000119",1000)
    println(account.checkBalance())
    println(account.save(1000))
    println(account.withdraw(2000))
    println(account.checkBalance())

    println()
    val account2 : Account = Account("홍길동", "20000119",-2000)
    println(account2.checkBalance())
}

class Account {
    val name : String
    val birth : String
    var balance : Int

    constructor(name: String,birth: String,balance: Int){
        this.name = name
        this.birth = birth
        if (balance >= 0 ){
            this.balance = balance
        }else{
            this.balance = 0
        }
    }
    fun checkBalance () : Int {
        return balance
    }
    fun withdraw (amount: Int) : Boolean {
        if( balance >= amount){
            balance = balance-amount
            return true
        } else {
            return false
        }
    }
    fun save (amount: Int) {
        balance += amount
    }
}

class Account3(initialbalances: Int) {
    val balance: Int = if (initialbalances >= 0) initialbalances else 0

    fun CheckBalance(): Int {
        return balance
    }
}
// val,var이 오지 않으면 함수 리턴할때 넣으면 오류가 뜸.
// 50절에 initialbalances를 넣게 되면 신텍스 오류가 뜬다.
// 하지만 이것만 못하는 것일 뿐. 다른 변수 만들어주어 값을 지정해주고 그 변수로 리턴가능.
// 같은 방법은 24절 ~ 28절 이다.
