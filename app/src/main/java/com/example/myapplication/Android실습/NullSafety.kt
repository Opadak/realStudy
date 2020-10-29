package com.example.myapplication.Android실습

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NullSafety : AppCompatActivity() {

    lateinit var lateCar : Car  //primitive = 원시적인

    class Car(val number: Int){

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)

        lateCar = Car(10)
        Log.d("number","late number : "+lateCar.number)

        val number : Int = 10
        val number1 : Int? = null

        // val number3 = number? + number1  >>오류가 난다 17줄 처럼 써줘야 한다.
        val number3 = number1?.plus(number)  // number1 이 null이기에 number3도 null이 된다.

        //삼항 연산자 -> 앞에 것이 null이 아니면 뒤에걸 넣겠다! -> 엘비스 연산자
        //Null safety 를 위한 도구
        val number4 = number1 ?: 10 // number4 = 10

//,


    }


    fun plus(a:Int , b: Int?):Int{
        if(b != null) return a+b
        else return a
    }

    fun plus2(a:Int, b: Int?):Int? {
        return b?.plus(a)
    }
}