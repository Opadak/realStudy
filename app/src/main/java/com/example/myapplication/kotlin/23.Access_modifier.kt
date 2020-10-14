package com.example.myapplication.kotlin

//23.접근 제어자

fun main(array: Array<String>){
    val testAcess : TestAcess = TestAcess("아무개")
    //클래스를 생성했을 때 무조건 할 수 있는 일이 있다.
    testAcess.test()
//    println(testAcess.name)
    //문제 > 클래스를 만들기만 하면은 이 name을 아무때나 변경할 수 있는데
//    testAcess.name = "아무개 투"
//    println(testAcess.name)
    //객체를 만들자마자 이 객체안에 있는 맴버 변수를 자기 마음대로 바꿀 수 있다는 점이다.

//    val reward : Reward = Reward()
//    reward.rewardAmont = 2000
    //1000을 지정해준걸 2000으로 임의로 지정 해줄 수 있다 .
    //지역변수나 전역변수로는 해결 할 수 없는 문제이다.
    //왜냐하면 class변수이기에 main은 당연히 접근 가능하기 때문이다.
    //그래서 해결 하는 방법은 private를 붙여준다.
    //private = 클래스 내부의 접근을 제어해준다. = main에서 바꿀 수 없게 된다.



}
class Reward() {
    private var rewardAmont : Int = 1000
}


class TestAcess {
    private var name:String = "홍길동"
    constructor(name :String) {
        this.name= name
    }
    fun test() {
        println("테스트")
    }
}