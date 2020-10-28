package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val carlist = ArrayList<CarForList2>()

        for (i in 0 until 10) {
            carlist.add(CarForList2("" + i + "번째 자동차", " " + i + "순위 엔진"))
        }
        val adapter = RecyclerViewAdapter(carlist, LayoutInflater.from(this@RecyclerViewActivity))
        recyclerview.adapter = adapter
        recyclerview.layoutManager = LinearLayoutManager(this@RecyclerViewActivity)
    }
}

//어답터 생성
class RecyclerViewAdapter(
    val itemlist: ArrayList<CarForList2>,
    val inflater: LayoutInflater
) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() { //<>에 들어가는 것은 제너릭 타입
    //RecyclerView.Adapter의 상속을 받는데 ViewHolder 타입이다.
    //RecyclerView는
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val carName: TextView
        val carEngine: TextView

        init { //ViewHolder 클래스가 시작하자마자 실행이 되는 것들.
            //흔히 초기화 블럭이라고도 한다.
            carName = itemView.findViewById(R.id.car_name)
            carEngine = itemView.findViewById(R.id.car_engin)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //뷰를 그려준다
        val view = inflater.inflate(R.layout.item_view, parent, false)
        return RecyclerViewAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        //아이템 리스트 사이즈 내보내줌
        return itemlist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //재활용해주는 역할을 해준다.
        //Bind 한다 = 묶어주겠다.
        holder.carName.setText(itemlist.get(position).name)
        holder.carEngine.setText(itemlist.get(position).engin)
        //33줄과 34줄에 실재로 넣어주는 애들.

    }
}