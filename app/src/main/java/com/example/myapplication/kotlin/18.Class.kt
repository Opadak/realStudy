package com.example.myapplication.kotlin

//18.class (제일 중요한!)
// OOP -> Object Oriented Programing (객체 지향 프로그래밍)

//객체란?
//- 이름이 있는 모든 것.

//프로그래밍을 하는 것은 결국 우리가 가지고 있는 어떠한 문제를 해결하는 과정
//문제를 해결하는 방식이 있다.
//절차 지향 프로그래밍 문제해결방법 은 코드를 위에서 부터 아래로 실행을 하면서 문제를 해결한다!
//객체 지향 프로그래밍 문제해결방법 은 객체를 만들어서 객체에게 일을 시켜서 문제를 해결한다!

// 객페를 만드는 방법
// - 설명서가 있어야 한다.

fun main(array: Array<String>) {
    //클래스(설명서)를 통해서 실체를 만드는 방법
    // -> 인스턴스화를 통해 인스턴스를 만든다  (인스턴스 = 객체)
    Car("v8 engine","big")
    val bigCar = Car("v8 engine","big")
    //우리가 만든 클래스(설명서)는 자료형이 된다
    val bigCar1 : Car = Car("v8 engine","big")

    val SuperCar : SuperCar = SuperCar("good engine" , "big", "white")

    //인스턴스가 가지고 있는 기능을 사용하는 방법
    val runableCar: RunableCar = RunableCar("simple engine","big body")
    runableCar.ride()
    runableCar.drive()
    runableCar.navi("부산")

    val runableCar2: RunableCar2 = RunableCar2("simple engine", "long body")
    runableCar2.ride()
    runableCar2.drive()
    runableCar2.navi("서울")

    println()
    val testClass = TestClass()
    testClass.test(1)
    testClass.test(1,2)
}

//클래스(설명서) 만드는 방법(1) - 축약을 해서 만든것.
class Car(var engine : String,var body : String) {

}
// *클래스(설명서) 만드는 방법(2) - 정석
class SuperCar{
    var engine : String
    var body : String
    var door : String

    constructor(engine: String, body: String,door: String){
        this.engine = engine // this.engine은 34절을 호출하는 것.
        this.body = body
        this.door = door



    }


}
//클래스(설명서) 만드는 방법(3) -> 1번 방법의 확장
class Car1 constructor(engine: String,body: String) {
    var door: String = ""

    //생성자
    constructor(engine: String,body: String,door: String) : this(engine, body){
        this.door = door

    }
}
//*클래스(설명서) 만드는 방법(4) -> 2번의 확장 방법

class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

        constructor(engine: String,body: String) {
            this.engine = engine
            this.body = body

        }
        constructor(engine: String,body: String,door: String){
            this.engine = engine
            this.body = body
            this.door = door

        }
}


class RunableCar(engine: String, body: String) {
    fun ride () {
        println("탑승 하였습니다")
    }
    fun drive () {
        println("달립니다 !")
    }
    fun navi (destination : String) {
        println("$destination 으로 목적지가 설정되었습니다. ")
    }
}

class RunableCar2 {
    var engine :String
    var body : String

    constructor(engine: String,body: String) {
        this.body = body
        this.engine = engine
    }
    init {
        //객체를 만들게 되면 무조건적으로 호출이 되는 것.
        //초기 셋팅을 할 때 유용하다.
        println("RunableCar2가 만들어졌습니다")
    }

    fun ride () {
        println("탑승 하였습니다")
    }
    fun drive () {
        println("달립니다 !")
    }
    fun navi (destination : String) {
        println("$destination 으로 목적지가 설정되었습니다. ")
    }
}

//오버로딩
class TestClass() {
    fun test(a: Int) {
    println("up")
    }
    fun test(a: Int , b:Int) {
        println("down")
    }
    //같은 이름의 함수는 신텍스 에러가 생기지만 (파라미터가 다르다면 ) 구분할 수 있다면 만들 수 있다.
}