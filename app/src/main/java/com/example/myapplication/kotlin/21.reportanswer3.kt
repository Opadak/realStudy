package com.example.myapplication.kotlin

import androidx.annotation.BoolRes

fun main (array: Array<String>) {
    val tv = TV(listOf<String>("k","M","S"))
    tv.Switch()
    println(tv.onOtOff)

    tv.channelUp()
    println(tv.checkCurrentChanel())
    tv.channelUp()
    println(tv.checkCurrentChanel())
    tv.channelUp()
    println(tv.checkCurrentChanel())
    tv.channelUp()
    println(tv.checkCurrentChanel())
    tv.channeldown()
    println(tv.checkCurrentChanel())
    tv.channeldown()
    println(tv.checkCurrentChanel())
    tv.channeldown()
    println(tv.checkCurrentChanel())
    tv.channeldown()


}

class TV (val channels : List<String>) {

    var onOtOff : Boolean = false
    var currentChannelNumber = 0
        set(value) {
            field = value
            if(field > 2) {
                field = 0
            }
            if(field < 0){
                field = 2
            }

//            currentChannelNumber = value
        }//set이라는 함수 안에서 currrntChannelNumber의 변화를 체크할 수 있다. 단. 바로 밑에 작성을 해야 한다.
    //값의 할당이 될때 set이 갑지하는 원리 인데
    //22절은 값을 할당해주는 것이라 21절을 안적어주면 무한 루프에 빠지게 된다. overflow<= 무한루프
    //값의 할당
    //a = b
    get() {
            println("호출되었습니다.")
            return field
    } //누군가에 의해 사용이 될때는 get이 호출이 되고 누군가에 의해 할당이 되었을 때는 set이 호출되는 것!


    fun Switch() {
        onOtOff = !onOtOff
    }

    fun checkCurrentChanel() :String{
        return channels[currentChannelNumber]
    }

    fun channelUp() {
        currentChannelNumber = currentChannelNumber + 1
  //      channels.forEachIndexed{index,value ->
    //        if (currentChannelNumber == index){
     //           currentChannelNumber = currentChannelNumber + 1
     //           return
            }
    fun channeldown() {
        currentChannelNumber = currentChannelNumber -1
        //   channels.forEachIndexed { index,value ->
        //      if (currentChannelNumber == index){
        //          currentChannelNumber = currentChannelNumber -1
        //         return
    }
    }





