package com.example.myapplication.Android실습

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        val carList = ArrayList<CarForList2>()
        for (i in 0 until 10) {
            carList.add(CarForList2("" + i + "번째 자동차", "" + i + "순위 엔진"))
        }

        val adapter = ListViewAdapter(carList, this)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->  //부모, 해당 뷰 , 그 아이템 , 그 아이템의 아이디
            // 이 아이템을 클릭했을 때 정보를 toast 메세지로 떠올리게 하는것
            val carName =
                (adapter.getItem(position) as CarForList2).name //해당 번 째 carforlist의 name이 나온다.
            val carEngine = (adapter.getItem(position) as CarForList2).engin

            Toast.makeText(this, "" + carName + " " + carEngine, Toast.LENGTH_SHORT).show()
        }
    }
}

class ListViewAdapter(
    val carForList: ArrayList<CarForList2>,
    val context: ListViewActivity
) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//        //리스트를 그리게 되면 id를 부여해줘야 하는데 id를 position으로 하겠다 이거다!
//        //View를 그리는 부분
//        val layoutInflater = LayoutInflater.from(context) //뷰를 그리기 위해서는 layoutInflater를 생성해줘야 한다.
//        val view = layoutInflater.inflate(R.layout.item_view,null)
//        var carNameTextView = view.findViewById<TextView>(R.id.car_name)
//        var carEngineTextView = view.findViewById<TextView>(R.id.car_engin)
//
//        carNameTextView.setText(carForList.get(position).name)
//        carEngineTextView.setText(carForList.get(position).engin)
//
//        return view

        val view: View
        val holder: ViewHolder

        if (convertView == null) {
            val layoutInflater = LayoutInflater.from(context)
            view = layoutInflater.inflate(R.layout.item_view, null)
            holder = ViewHolder()
            holder.carName = view.findViewById(R.id.car_name)
            holder.carEngine = view.findViewById(R.id.car_engin)

            view.tag = holder //tag 는 저장소라고 생각하면 될 듯. holder를 view tag에 저장 //찾을 수 있도록 tag를 달아준것!
        } else { //재활용을 하도록
            holder = convertView.tag as ViewHolder //ViewHolder로 캐스팅한 converView에서 tag를 가지고 온다.
            view = convertView
        }
        holder.carName?.setText(carForList.get(position).name)
        holder.carEngine?.setText(carForList.get(position).engin)

        return view
    }

    override fun getItem(position: Int): Any { //position 은 순서 //해당 인덱스에 들어가는 아이템 정보를 알려줘야 한다.
        //그리고자 하는 아이템 리스트의 하나(포지션에 해당하는)
        return carForList.get(position)

    }

    override fun getItemId(position: Int): Long {
        //해당 포지션에 위치해 있는 아이템뷰의 아이디 설정
        return position.toLong()
    }

    override fun getCount(): Int { // 내가 가지고 있는 리스트 (Carforlist)의 숫자를 알려줘야 한다.
        //그리고자 하는 아이템 리스트의 전체 갯수
        return carForList.size

    }
}

class ViewHolder {
    var carName: TextView? = null
    var carEngine: TextView? = null

}