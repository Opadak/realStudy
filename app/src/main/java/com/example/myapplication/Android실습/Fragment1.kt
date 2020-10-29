package com.example.myapplication.Android실습

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment1.*


//fragment 를 만들기

class Fragment1:Fragment(){

    interface OnDataPassListener {
        fun onDataPass(data: String?)

    }
    lateinit var  dataPassListener : OnDataPassListener

    override fun onAttach(context: Context) {
        Log.d("Life_cycle","F onAttach")
        super.onAttach(context)
        dataPassListener = context as OnDataPassListener
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Life_cycle","F onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView( //view를 그리는 애 ****
        inflater: LayoutInflater, // inflater > View 를 그려주는 애
        container: ViewGroup?,    // container > 부모 View
        savedInstanceState: Bundle? //객체를 저장하는 용도
    ): View? {
        Log.d("Life_cycle","F onCreateView")
        // 프라그먼트가 인터페이스를 처음으로 그릴때 호출된다.
       return inflater.inflate(R.layout.fragment1,container,false)//root >>내가 붙을 뿌리
        //원래 override하면 자동적으로 return이 생기는데 return은 view를 리턴을 함
        //41줄이 view 그자체이기 떄문에 return을 앞에다 붙여주면 리턴값 완성임.
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("Life_cycle","F onViewCreated")
        super.onViewCreated(view, savedInstanceState)

        //Activity의 Oncreate에서 했던 작업을 여기에서 한다.
        pass.setOnClickListener{
            dataPassListener.onDataPass("Goodbye")
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("Life_cycle","F onActivityCreated")

        val data = arguments?.getString("hello")
        Log.d("data",data)
        //data를 log로 찍을려고 하는데 이 data가 null이다. >>nullpointException

        super.onActivityCreated(savedInstanceState)

    }

    override fun onStart() {
        Log.d("Life_cycle","F onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("Life_cycle","F onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("Life_cycle","F onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("Life_cycle","F onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("Life_cycle","F onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d("Life_cycle","F onDetach")
        super.onDetach()
    }
}
