package com.example.myapplication.kotlin

//사칙연산
fun main (array: Array<String>) {
    println("첫번째 문제")
    val calculation :Calculation = Calculation(9,3)
    calculation.plus()
    calculation.minus()
    calculation.multi()
    calculation.div()
    println()
    println("두번째 문제")
    val bank:Bank = Bank(10000)
    bank.makeAccount("오혜민",20000119)
    bank.money()

    bank.saving(5000).withdraw(7000)
    bank.saving(2000)
    println()
    println("세번째 문제")
    val tv : Tv = Tv ("KBS")
    tv.onoff("on")
    tv.chanelChange("MBC")

}

class Calculation (val firstNum : Int, val secondNum : Int) {

   fun plus () {
       println("$firstNum 와 $secondNum 을 더합니다.")
       println(firstNum + secondNum)

   }
    fun minus () {
        println("$firstNum 와 $secondNum 을 뺍니다.")
       println(firstNum-secondNum)
    }
    fun multi () {
        println("$firstNum 와 $secondNum 을 곱합니다.")
        println(firstNum * secondNum)
    }
    fun div (){
        println("$firstNum 와 $secondNum 을 나눕니다.")
        println(firstNum/secondNum)
    }


}

class Bank {
    val capital: Int
    //withdraw는 출금 saving 예금 capital 자금
    constructor(capital : Int) {
        this.capital = capital
    }
    fun makeAccount (name : String, birthday : Int) {
        println("$name 님의 계좌의 이름은"+name+birthday+"입니다.")
    }
    fun money() {
        println("지금 현재 남은 잔고는 $capital 입니다.")

    }
    fun withdraw(withdrawMoney : Int) : Bank {
    val result = this.capital - withdrawMoney
        println("출금을 원하시는 금액은 $withdrawMoney 입니다.")
        println("현재 남은 금액은 $result 입니다.")
        return Bank(result)

        println()

    }
    fun saving(savingMoney : Int) : Bank{
        val result1 = this.capital + savingMoney
        println("입금을 원하시는 금액은 $savingMoney 입니다.")
        println("현재 총 금액은 $result1 입니다.")
        return Bank(result1)
        println()
    }
}

class Tv {
    val Chanel : String

    constructor(Chanel : String){
    this.Chanel = Chanel
    }
    fun onoff (state: String) {
        if (state == "on") {
            println("tv가 켜졌습니다.")
        } else if (state == "off") {
            println("tv가 꺼졌습니다.")
        } else {
            println("잘못 입력하셨습니다.")
        }
    }
    fun chanelChange(chanel : String) {
        when (chanel) {
            "SBS" -> {
                println("현재 체널은 ${Chanel}입니다.")
                println("SBS 채널로 돌렸습니다.")
            }
            "MBC" -> {
                println("현재 채널은 ${Chanel}입니다.")
                println("MBC 채널로 돌렸습니다.")
            }
            "KBS" -> {
                println("현재 채널은 ${Chanel}입니다.")
                println("KBS 채널로 돌렸습니다.")
            }
        }
    }
}