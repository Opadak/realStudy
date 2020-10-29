package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        Log.d("Life_cycle", "oncreate")

        val fragmentOne: Fragment1 = Fragment1()

        //프라그먼트의 데이터를 넣어주는 방법
        //bundle을 만들어줘서 프라그먼트에 끼어 넣어야 함.
        val bundle : Bundle = Bundle()
        bundle.putString("hello","hello")
        fragmentOne.arguments = bundle

        button.setOnClickListener{
            //프라그먼트를 동적으로 작동하는 방법
            //프라그먼트 붙이는 방법 replace/add
            // val fragmentOne : Fragment1 = Fragment1()
            val fragmentmanager: FragmentManager = supportFragmentManager // supportFragmentManager < 액티비티가 가지고있음

            //Transaction
            // 작업의 단위 -> 시작과 끝이 있다.
            val fragmentTransaction = fragmentmanager.beginTransaction()
            //시작하겠다.
            fragmentTransaction.replace(R.id.container,fragmentOne)
            //할일
            fragmentTransaction.commit()
            //commit >끝이다
            //끝을내는 방법
            //1. commit    > 시간 될 때 해 ! (이것을 사용하는게 좀 더 안정적이다.)
            //2. commitnow > 지금 당장해! (과부화가 생길 수 가 있다.)


        }
        button2.setOnClickListener{
           // val fragmentOne : Fragment1 = Fragment1() 24절의 구문과 다르다 < 지역함수 그래서 바깥으로 올려줘야함!
            //프라그먼트 remove/detach 하는 방법
            val fragmentManager = supportFragmentManager
            val fragmentTrancation = fragmentManager.beginTransaction()
            fragmentTrancation.remove(fragmentOne) //-> 떼고 붙이고 반복 가능
            //fragmentTrancation.detach(fragmentOne) // ->반복 불가능 한번만 실행 가능
            fragmentTrancation.commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Life_cycle","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Life_cycle","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Life_cycle","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Life_cycle","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Life_cycle","onDestroy")
    }
}