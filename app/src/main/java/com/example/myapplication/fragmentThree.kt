package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class fragmentThree : Fragment() {
    override fun onCreateView( //view를 그리는 애 ****
        inflater: LayoutInflater, // inflater > View 를 그려주는 애
        container: ViewGroup?,    // container > 부모 View
        savedInstanceState: Bundle? //객체를 저장하는 용도
    ): View? {
        Log.d("Life_cycle", "F onCreateView")
        // 프라그먼트가 인터페이스를 처음으로 그릴때 호출된다.
        return inflater.inflate(R.layout.fragment1, container, false)//root >>내가 붙을 뿌리
        //원래 override하면 자동적으로 return이 생기는데 return은 view를 리턴을 함
        //41줄이 view 그자체이기 떄문에 return을 앞에다 붙여주면 리턴값 완성임.
    }
}