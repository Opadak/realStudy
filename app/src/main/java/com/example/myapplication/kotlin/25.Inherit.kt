package com.example.myapplication.kotlin

//25.상속

fun main(array: Array<String>) {
    val superCar100: SuperCar100 = SuperCar100()
    println(superCar100.drive())
    superCar100.stop()
    val bus100: Bus100 = Bus100()
    bus100.drive()

}
//부모 : Car 100
//자식 : SuperCar100, Bus100()

open class Car100() { //private 가 클래스에 기본적으로 있음. 그래서 open을 적어줘야 한다.
   open fun drive():String {
        return "달린다"
 }
   fun stop() {

    }

}
class SuperCar100(): Car100() {
    override fun drive():String {
       val run = super.drive()
        return "빨리$run"
        //부모의 기능을 이용해서 수정을 해서 새로운 기능을 추가 한다.
        //부모의 기능을 무시하고 새로운 것으로 바꾼다. 
    }
}


class Bus100(): Car100()  {

}




// 발생하는 불편함 > 똑같은 기능을 4개의 클래스에다 만들어야 하는것
// 번복하는 불편함
// 개발할 때  '두번까지는 봐준다' ' 두번 익상이 넘어가면 리펙토링 해라 '
// 리펙토링 - 정리정돈해라 (단, 기능에는 변함이 없어야 한다.)
//