package com.example.assignmenttwo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_calculator.*
import kotlinx.android.synthetic.main.activity_main.*
import java.text.NumberFormat

class CalculatorActivity : AppCompatActivity() {
    private var lastNum = false
    private var lastDot = false
    private var lastOperator = false
    private var lastEqual = false
    private var operator:Char = ' '
    private var textList:MutableList<String> = mutableListOf("", "", "", "", "")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        setSupportActionBar(myToolbar_cal)

        val appBar = supportActionBar

        appBar!!.title = "Simple Calculator"    //set up the title for action bar

        appBar.setDisplayShowHomeEnabled(true)
        appBar.setDisplayUseLogoEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    fun onDigit(view: View) {
        if (!lastEqual)
            tvInput.append((view as Button).text)
        lastNum = true
    }

    private fun TextView.backSpace () {
        if (text.isNotEmpty()) {
            when(text.last()){
                '.' -> lastDot = false
                '-', '+', '×', '÷', '%' -> lastOperator = false
            }
            text = text.subSequence(0, text.length - 1)
        }
    }



    fun onOperator(view: View) {
        if (lastNum && !lastOperator) {
            operator = (view as Button).text.toString()[0]
            tvInput.append(view.text)
            lastOperator = true
            lastNum = false
            lastDot = false
            lastEqual = false
        }
    }

    fun onEqual(view: View) {   //while press "=", this func is invoke
        if (lastNum && lastOperator) {
            val oldText = tvInput.text.toString()
            val (s1, s2) = oldText.split(operator)
            val num1 = s1.toDouble()
            val num2 = s2.toDouble()
            var ret: Double? = null
            when(operator) {
                '×' -> ret = num1 * num2
                '+' -> ret = num1 + num2
                '÷' -> if (num2 != 0.0) ret = num1 / num2
                '-' -> ret = num1 - num2
                '%' -> ret = num1 % num2
            }
            textList.removeAt(0)
            textList.add(oldText)
            showOut.text = textList.joinToString("\n")
            val nf: NumberFormat = NumberFormat.getNumberInstance()
            nf.maximumFractionDigits = 6
            if (ret==null) {
                tvInput.text = "Error"
            }else{
                tvInput.text = nf.format(ret)
            }
            lastDot = true
            lastEqual = true
            lastOperator = false
        }
    }

    fun onDecimalPoint(view: View) {    //
        if (lastNum && !lastDot) {
            tvInput.append(".")
            lastNum = false
            lastDot = true
        }
    }

    fun onClear(view: View) {   //once we click AC button, invoke this func
        tvInput.text = ""
        lastNum = false
        lastOperator = false
        lastDot = false
        lastEqual = false
    }
    fun onBackSpace(view: View) {
        tvInput.backSpace()
    }


}