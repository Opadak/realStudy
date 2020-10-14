package com.example.myapplication.kotl

fun main (array: Array<String>) {
    val night = Night(20,4)
    val monster = Monster(15,5)

    night.attack(monster)
    monster.attack(night)



}

//기사
class Night (private var hp: Int ,private var power : Int) {
    fun attack(monster: Monster) {
        monster.defense(power)


    }

    fun defense(damage: Int) {
        hp -= damage
        if (hp>0) {
            heal()
            println("기사 현재 체력은 $hp 입니다.")

        }
        else println("기사가 죽었습니다.")
    }
   private fun heal () {
        hp += 3
    }

}

class Moster2 (private val hp: Int , private val power: Int) {
    //코딩을 만들 때 외부 접근을 최소화 할 수 있게 작성하는 것이 좋다!!!!
    // private 꼭 붙여 주고 val로 변수 생성하기!!!!! > 나중에 변경하면 됨~
    private fun attack() {
        //습관 중요!!!
        // 항상 최소한으로 만드는게 중요!!!!!!

    }


}


class Monster (private var hp: Int,private var power: Int ){

    fun attack(night: Night) {
        night.defense(power)
    }
    fun defense(damage: Int) {
        hp -= damage
        if (hp>0) println("몬스터 현재 체력은 $hp 입니다.")
        else println("몬스터가 죽었습니다.")
    }

}