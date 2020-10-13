package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        //new -> old (old = new + old)
        var new = "0" //이전에 입력했던 값
        var old = 0 //지급 입력하고 있는 값
        var middle  = "0"
        var showresult = 0
        //형 변환에 대해 totype()
        // "1" + "1" = "11" 이라는 것.
        var culChar = "0"
        var culChar2 = "0"
        var middlesaving = 0


        one.setOnClickListener {
            new = new + "1"
            result.setText(new)
            middle = middle + "1"
            resultsaving.setText(middle)
        }
        two.setOnClickListener {
            new = new + "2"
            result.setText(new)
            middle = middle + "2"
            resultsaving.setText(middle)
        }
        three.setOnClickListener {
            new = new + "3"
            result.setText(new)
            middle = middle + "3"
            resultsaving.setText(middle)
        }
        four.setOnClickListener {
            new = new + "4"
            result.setText(new)
            middle = middle + "4"
            resultsaving.setText(middle)
        }
        five.setOnClickListener {
            new = new + "5"
            result.setText(new)
            middle = middle + "5"
            resultsaving.setText(middle)
        }
        six.setOnClickListener {
            new = new + "6"
            result.setText(new)
            middle = middle + "6"
            resultsaving.setText(middle)
        }
        seven.setOnClickListener {
            new = new + "7"
            result.setText(new)
            middle = middle + "7"
            resultsaving.setText(middle)
        }
        eight.setOnClickListener {
            new = new + "8"
            result.setText(new)
            middle = middle + "8"
            resultsaving.setText(middle)
        }
        nine.setOnClickListener {
            new = new + "9"
            result.setText(new)
            middle = middle + "9"
            resultsaving.setText(middle)
        }
        zero.setOnClickListener {
            new = new + "0"
            result.setText(new)
            middle = middle + "0"
            resultsaving.setText(middle)
        }

        clear.setOnClickListener {
            new = "0"
            old = 0
            middle = "0"
            result.setText("0")
            resultsaving.setText("0")
        }
        plus.setOnClickListener {
            old = new.toInt()
            middle = middle + "+"
            result.setText(new)
            new = "0"
            resultsaving.setText (middle)
            if (showresult == 0){
                showresult = old
                culChar = "+"
            }
            else {
                when (culChar){
                    "+" -> showresult =  showresult + old
                    "-" -> showresult =  showresult - old
                    "*" -> showresult =  showresult * old
                    "/" -> showresult =  showresult / old
                }
                culChar = "+"
            }
            }

        minus.setOnClickListener {
            old = new.toInt()
            middle = middle + "-"
            result.setText(new)
            new = "0"
            resultsaving.setText (middle)
            if (showresult == 0){
                showresult = old
                culChar = "-"
            }
            else {
                when (culChar){
                    "+" -> culChar2 = "+"
                    "-" -> culChar2 = "-"
                    "*" -> showresult =  showresult * old
                    "/" -> showresult =  showresult / old
                }
                culChar = "-"
            }

        }
        multiply.setOnClickListener {
            old = new.toInt()
            middle = middle + "x"
            result.setText(new)
            new = "0"
            resultsaving.setText (middle)
            if (showresult == 0){
                showresult = old
                culChar = "*"
            }
            else if (culChar2 == "+") {
                when (culChar) {
                    "*" ->{
                        showresult = showresult + (middlesaving*old)
                    }
                    "/"->{
                        showresult = showresult + (middlesaving/old)
                    }
                }
                culChar2 = "0"
            }
            else if (culChar2 == "-") {
                when (culChar) {
                    "*" ->{
                        showresult = showresult - (middlesaving*old)
                    }
                    "/"->{
                        showresult = showresult - (middlesaving/old)
                    }
                }
                culChar2 = "0"

            }
            else {
                when (culChar){
                    "+" ->{ culChar2 = "+"
                        middlesaving = old
                        culChar = "*"
                    }
                    "-" ->{ culChar2 = "-"
                        middlesaving = old
                        culChar = "*"
                    }
                    "*" ->{ showresult =  showresult * old
                        culChar = "*"}
                    "/" ->{ showresult =  showresult / old
                        culChar = "*"}


                }

            }

        }
        divid.setOnClickListener {
            old = new.toInt()
            middle = middle + "/"
            result.setText(new)
            new = "0"
            resultsaving.setText (middle)
            if (showresult == 0){
                showresult = old
                culChar = "/"
            }
            else if (culChar2 == "+") {
                when (culChar) {
                    "*" ->{
                        showresult = showresult + (middlesaving*old)
                    }
                    "/"->{
                        showresult = showresult + (middlesaving/old)
                    }
                }
                culChar2 = "0"
            }
            else if (culChar2 == "-") {
                when (culChar) {
                    "*" ->{
                        showresult = showresult - (middlesaving*old)
                    }
                    "/"->{
                        showresult = showresult - (middlesaving/old)
                    }
                }
                culChar2 = "0"

            }
            else {
                when (culChar){
                    "+" ->{ culChar2 = "+"
                        middlesaving = old
                        culChar = "/"
                    }
                    "-" ->{ culChar2 = "-"
                        middlesaving = old
                        culChar = "/"
                    }
                    "*" ->{ showresult =  showresult * old
                        culChar = "/"}
                    "/" ->{ showresult =  showresult / old
                        culChar = "/"}


                }

            }

        }
        equal.setOnClickListener {
            old = new.toInt()
            if (culChar2 == "+"){
                when (culChar) {
                    "*" ->{
                        showresult = showresult + (middlesaving*old)
                    }
                    "/"->{
                        showresult = showresult + (middlesaving/old)
                    }
                }

            }
            else if (culChar2 == "-"){
                when (culChar) {
                    "*" ->{
                        showresult = showresult - (middlesaving*old)
                    }
                    "/"->{
                        showresult = showresult - (middlesaving/old)
                    }
                }
            }
            else {
                when (culChar) {
                    "+" -> showresult = showresult + old
                    "-" -> showresult = showresult - old
                    "*" -> showresult = showresult * old
                    "/" -> showresult = showresult / old
                }
            }


            result.setText("$showresult")
            resultsaving.setText(middle)

            showresult = 0
            middle = "0"
            old = 0
            new = "0"
            }
        }

    }


