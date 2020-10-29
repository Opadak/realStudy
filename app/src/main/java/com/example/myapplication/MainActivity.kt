package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    //클래스의 이름은 MainActivity이고 AppCompatActivity를 상속 받았다.

    override fun onCreate(savedInstanceState: Bundle?) {
        //onCreate라는 함수, override라는 키워드, Bundle 타입이다.
        super.onCreate(savedInstanceState)
        //(super = )AppCompatActivity에 onCreate함수에다가 savedInstanceState를 넣어준다.
        //onCreate 에는 단 한번만 실행될 때 적어주는 것인데. 15절을 보면 화면을 생성해주고 나중에는 불러오는 형식으로 ! 그래서 단 한번만 그려주면 된다.
        setContentView(R.layout.activity_main)
        //이부분이 화면을 그려주는 역활을 한다.

        Log.d("Life_cycle","onCreate")
        //Log => 기록하는 것.
        //Log를 찍겠다 = 개발자가 원하는 행동들을 기록하겠다 이것이다.
        //Log를 확인하는 방법은 => 앱을 실행하고 아래 메뉴에 "Logcat"을 누른다음 18절에 내가 설정한 tag를 검색하면 나온다.
    }

    //마우스 우클릭 => Generate => Override Method  (overriding 할 수 있는 것들을 보여 준다.)
    override fun onStart() {
        super.onStart()
        Log.d("Life_cycle","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Life_cycle","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Life_cycle","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Life_cycle","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Life_cycle","onDestroy")
    }
}