package com.example.myapplication.kotlin

//기사, 몬스터 >부모
// 수퍼기사, 수퍼몬스터 > 자식
//상속하는 방법으로
//자유롭게 둘이 공격하고 방어 할 수 있도록

fun main (array: Array<String>) {
    val knight1 : Superknight = Superknight(40,5)

    val monster1 : SuperMoster = SuperMoster(20,2)
    knight1.attack(monster1)
    monster1.attack(knight1)
    monster1.bite(knight1)
}
//상속이 만들어낸 특징
//-자식 클래스는 부모 클래스의 타입이다.
//-부모가 자식의 상위호환이다. > 부모 클래스는 자식 클래스의 타입이 될 수 없다. 



open class Charator(var hp:Int, val power: Int) {

    fun attack(Charator: Charator, power: Int = this.power) {
        // this를 적는 이유> 클래스에 있는 파워가 적용되는 범위가 중첩이 됩.
        // 상위에 있는 파워를 쓰고 싶으면 this.power를 적어주면됨.
        Charator.depence(power)
    }

    open fun depence(damage: Int) {
        hp -= damage
        if (hp > 0) {
            println("${javaClass.simpleName}의 체력은 $hp 입니다.")
        } else {
            println("${javaClass.simpleName}는 죽었습니다.")
        }
    }
}
//자식 클래스가 인스턴스화 되기 위해서 부모 클래스가 선행되서 인스턴스화 되어야 한다.
class Superknight (hp: Int, power: Int): Charator(hp,power) {
    val defensePower = 2
    override fun depence(damage: Int) {
        super.depence(damage-defensePower)

    }
}
class SuperMoster (hp:Int, power: Int): Charator(hp,power){

    fun bite(charator: Charator) {
        super.attack(charator, power+2)
    }
}