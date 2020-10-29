package com.example.myapplication.Android실습

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent.*

class intent1 : AppCompatActivity() { // 패키지명을 바꿀때 > 패키지명 우클릭 > Refator > rename
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        val abc = 10 // 클래스 명이나 함수명도 위와 동일하게 변경 가능.
        val b = abc + 10
        val c = abc + 10
        //화면 전환
        change_activity.setOnClickListener{
//            val intent = Intent(this@intent1, intent2::class.java)
//            //요청을 만듬
//            intent.putExtra("number1",1)
//            intent.putExtra("number2",2)
//            //요청 할 때 데이터를 보냄
//            //key와 value를 쌍으로 만들어 저장한다. (=> Dictionary)
//            startActivity(intent)
//            //요청을 받음

//            val intent2 = Intent(this@intent1, intent2::class.java)
//            intent2.apply {
//                this.putExtra("number1",1)
//                this.putExtra("number2",1)
//            }
//            //startActivity(intent2)
//            //-전달만 하는 요청
//            startActivityForResult(intent2,200)
            //-리턴을 받는 요청
            //이름 200이라는 것을 intent2를 intent1액티비티가 intent2액티비티에게 보내는 것임.
            //리턴을 받는 것이 여러개 일 경우 겹치면 안되기 때문에 숫자로 된 이름을 만들어줌.


            //둘의 차이점
            //코드를 읽는 사람들이 후자로 만들 수록 더 편하게 읽을 수 있다.
            //유지,보수를 하는 사람 입장을 배려하기 위해선 아래로!!!!
            //apply -> 지원한다 <?> 이런뜻

            //암시적 인텐트
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
            startActivity(intent)
            //실제로 모바일로 실행할 시에 앱을 킬 수 있는 브라우저가 여러개 있더라면 물어본다.
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
    //requestCode => intent2에 36절 " Activity.RESULT_OK " 이것이 resultCode에 보내는 것.
    //data => intent2dp 36절 "resultIntent"가 들어오는 것.

    {
        if(requestCode == 200) {
            Log.d("number", ""+requestCode)
            Log.d("number", ""+resultCode)
          val result =   data?.getIntExtra("result",0)
            Log.d("number",""+result)
        }
        Log.d("number", "111")

        super.onActivityResult(requestCode, resultCode, data)
    }
}

