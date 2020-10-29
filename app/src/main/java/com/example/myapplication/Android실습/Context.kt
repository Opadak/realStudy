package com.example.myapplication.Android실습

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Context : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context)


        val context: Context = this //this라는 것은 Context의 자식 클래스이기 때문에 this넣어줘도 됨,


        val applicationContext: Context = getApplicationContext() as Context

    }
}