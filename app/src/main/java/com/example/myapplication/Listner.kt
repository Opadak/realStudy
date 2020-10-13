package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_listner.*

class Listner : AppCompatActivity() {

    var number = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listner)


        //textview를 불러오는 방법 (1) - 직접 찾아서 가지고 온다.
       // val textView : TextView = findViewById(R.id.hello)
        //textview를 불러오는 방법 (2) - xml을 import해서 가지고 온다.
       // hello.

        //클릭했을때 원하는 동작을 작동시키는 법
            //1.람다방식
        hello.setOnClickListener {
            Log.d("click","click!!")
            //setOnClickListener 는 주의 깊게 듣고 있다가 사용자가 클릭했을 때 안에 내용이 호출이 되는 것.
            // 안드로이드 os 에서 모든 Listener 정보를 알려주면 그것에 해당하는 Listener 가 호출이 된다.
            // click된 view를 it으로 받아준다. it:View!
            //람다 ( 익명 함수의 표현 방법이 바뀐것. >> 문법적으로 길게 작성 되는 부분을 축약한 것.)

        }

    //익명 함수 (23~29와 동일한 동작을 한다. )
        hello.setOnClickListener( object : View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("click","click!!")
            }
        })


        //3. 이름이 필요한 경우 (Click) - 길게 풀어씀.
        val click = object : View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("click","click!!")
                hello.setText("안녕하세요")
                image.setImageResource(R.drawable.boy)
                number += 10
                Log.d("number", ""+number)
                //""+number => 급하게 int형을 String으로 바꿀때 사용
            }
        }

        hello.setOnClickListener(click)
            // 익명 함수라는 것은 말그대로 함수의 이름이 없는 것인데 3번째 보면 click이라는 변수이름을 만들어주고 setOnClickListner에 바로 넣은 것을 보여주는데
            //이름을 없애고 그대로 hello.setOnClickListener에 넣어준게 2번 방식이다.
            //귀찮아서 만든게 1번 람다 방식

        //view를 조작하는 함수들
        //setText
        //setImageResource



    }

}


