package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_tab_pager.*

class TabPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_pager)

        tab_layout.addTab(tab_layout.newTab().setText("ONE"))
        tab_layout.addTab(tab_layout.newTab().setText("TWO"))
        tab_layout.addTab(tab_layout.newTab().setText("THREE"))
        //Tab에 메뉴 생성 코드


    }
}

//tablayout과 pager가 서로 연동되어서 사용하기 위해서는 listner가 사용된다.
//pager를 위한 것은 adapter

class PagerAdapter( //화면을 수평으로 보여주는!
    fragmentManager: FragmentManager, //pager가 fragment 를 사용하겠다. ****** (중요)
    val tabCount: Int
) : FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment { // item 하나를 찾을 때 실행됨!

        when (position) {
            0 -> {
                return fragmentOne()
            }
            1 -> {
                return fragmentTwo()
            }
            2 -> {
                return fragmentThree()
            } // 각 Page에 들어가는 부분을 return해 준다.
            else -> {
                return fragmentOne()
            }
        }
    }

    override fun getCount(): Int { //전체 사이즈
        return tabCount
    }
}