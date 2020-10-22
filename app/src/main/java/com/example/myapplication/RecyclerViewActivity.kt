package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val carlist = ArrayList<CarForList2>()

        for (i in 0 until 10) {
            carlist.add(CarForList2("" + i + "번째 자동차", " " + i + "순위 엔진"))
        }

    }
}

//어답터 생성
class Adapter(
    val itemlist: ArrayList<CarForList2>,
    val inflater: LayoutInflater


)