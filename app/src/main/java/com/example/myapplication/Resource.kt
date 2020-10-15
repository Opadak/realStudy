package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_resource.*

class Resource : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)



        //1 (낮은 버전 부터 가능)
        val ment = resources.getString(R.string.hello)
        Log.d("mentt","ment : "+ment)
        //2 (높은 버전 부터 가능)
        val ment2 = getString(R.string.hello)
        Log.d("ment","ment : "+ment)

        val color = getColor(R.color.textViewColor)
        Log.d("ment", "color : "+color)


        button.setOnClickListener {
            button.setBackgroundColor(getColor(R.color.textViewColor))
        }

    }
}