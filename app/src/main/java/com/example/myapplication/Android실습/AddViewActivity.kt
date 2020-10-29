package com.example.myapplication.Android실습

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import com.example.myapplication.R

class AddViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_view)


        //item list 준비
        val carList = ArrayList<CarForList2>()
        for (i in 0 until 10) {
            carList.add(
                CarForList2(
                    "" + i + "번째 자동차",
                    "" + i + "순위 엔진"
                )
            )
        }


        val container = findViewById<LinearLayout>(R.id.addview_container)
        val inflater = LayoutInflater.from(this)
        for (i in 0 until carList.size) {
            val itemView = inflater.inflate(R.layout.item_view, null)//...
            val carnameView = itemView.findViewById<TextView>(R.id.car_name)
            val carEnginView = itemView.findViewById<TextView>(R.id.car_engin)

            carnameView.setText(carList.get(i).name)
            carEnginView.setText(carList.get(i).engin)
            container.addView(itemView)
        }

    }
}

class CarForList2(val name: String, val engin: String) {


}