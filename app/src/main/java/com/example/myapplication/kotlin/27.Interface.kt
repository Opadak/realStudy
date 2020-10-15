package com.example.myapplication.kotlin

//27. Interface
//인터페이스는 '약속'이다.

//상속과 인터페이스의 차이점
//상속은 상속을 하게 되면 부모의 클래스를 '사용'할 수 있게 물려받게된다.
//인터페이스를 '구현'하는 클래스는 인터페이스가 가지고있는 함수(기능)를 반드시 구현해줘야 한다.
// 함수의 구체적인 기능을 만들어 줘야 한다는 것이다.

//인터페이스를 구현을 하고 싶다면 반드시 아래 기능을 구현해라!! -> implement method
fun main (array: Array<String>){
    val student_:Student_ = Student_()
    student_.eat()
    student_.sleep()
}

interface Person_ { //생성자가 없음 = 인스턴스화 할 수 없다 = 설명서가 아니다 = 지침서이다 (니가 이것을 구현하고 싶다면 '반드시' 아래에 있는 기능을 구현을 해야 한다.
    fun eat()
    fun sleep()
}

class Student_ : Person_ { //implement = 구현하다. //구현하는 클래스
    override fun eat() {

    }

    override fun sleep() {

    }
}

class SoccoerPlay : Person_ { //구현하는 클래스 // Person의 타입이다.
    override fun eat() {

    }

    override fun sleep() {

    }
}










//상속과 다른점
// 상속? 조상을 찾아가는 느낌 : 여러가지 사람들의 공통적인 부분 (최소한의 기능을 모아둔 기능)
// 인터페이스는 종의 특징 : 사람이라면 먹고 잔다.













open class Person(){
   open fun eat(){

    }
    fun sleep(){

    }
}

class Studemt():Person(){
    override fun eat() {
        super.eat()
    }
}
class Teacher():Person(){}

//문제점> 부모와 자식이 크게 다르면? -> 인터페이스를 사용해 구현해준다.