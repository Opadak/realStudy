package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_thread.*

class ThreadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)


        val runnable: Runnable = object : Runnable {
            override fun run() {
                Log.d("thread", "Thread is made")
            }
        }
        val thread1: Thread = Thread(runnable)
        //쓰레드를 만드는 이유는 이 쓰레드에서 하고 싶은 일이 있기 때문이다. Runnable = 하고 싶은 일을 넣어주는 애
        // Runnable을 Thread에 넣어준다.
        //바로 실행이 되는게 아니다. 시작하라는 순간 시작이 되는것!
        //쓰레드를 출발 시킬려면 아래와 같이 한다.
        button.setOnClickListener {

            thread1.start()

        }


        //밒에 방법처럼 사용할 수 있다.


        Thread(object : Runnable {
            override fun run() {
                Log.d("thread2", "Thread2 is made")
            }
        }).start()
        Thread(Runnable {


            Thread.sleep(2000) //잠깐 중지하는것. //2초를 쉬는것!
            Log.d("thread3", "Thread3 is made")

            runOnUiThread {

                button.setBackgroundColor(getColor(R.color.textViewColor))
            }//Main Thread 위에서 작용하는 쓰레드 이다.
            //2초동안 잔다음 ui 쓰레드로 간다. 이 쓰레드에서 버튼의 색을 바꾼다.
            // ui쓰레드만이 디자인을 바꿀 수 있다.
            //쓰레드를 만들려는데 ui를 바꾸고 싶다 할 때 사용하는 방법이다.


        }).start()


    }
}