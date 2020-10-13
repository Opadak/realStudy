package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.provider.FontsContractCompat.FontRequestCallback.RESULT_OK
import com.example.myapplication.kotlin.number1
import kotlinx.android.synthetic.main.activity_intent2.*

class intent2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)




        result.setOnClickListener {
            //putExtra로 보낸 데이터를 가지고 오는 명령어
            val num1 = intent.getIntExtra("number1",0)
            //defualtValue = key값으로 value를 찾으려고 할때 없으면 넣어주는 기본 값. ( 이게 없으면 null이 뜨기에 오류가 나올 수 밖에 없음.)
            val num2 = intent.getIntExtra("number2",0)

            val result = num1 + num2

            val resultIntent = Intent()
           resultIntent.putExtra("result", result)





            setResult(Activity.RESULT_OK, resultIntent)
            //"결과값은 이거야"

            //RESULT_OK => 결과값 잘 전송 한다.
            //RESULT_CANCELED => 결과값 0

            this.finish() // Activity 종료 <= intent1이 나오는 것!


            // stack 개념
            // intent2 ------> 종료   |
            // intent1               | intent1
        }
    }
}