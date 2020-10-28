package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

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
) : RecyclerView.Adapter<Adapter.ViewHolder>() { //<>에 들어가는 것은 제너릭 타입
    //RecyclerView.Adapter의 상속을 받는데 ViewHolder 타입이다.
    //RecyclerView는
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val carName: TextView
        val carEngine: TextView

        init {
            carName = itemView.findViewById(R.id.car_name)
            carEngine = itemView.findViewById(R.id.car_engin)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}