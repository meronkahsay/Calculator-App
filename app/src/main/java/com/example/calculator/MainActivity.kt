package com.example.calculator

import android.icu.text.SymbolTable
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//class MainActivity : AppCompatActivity() {
//    lateinit var etNum1 : EditText
//    lateinit var etNum2 :EditText
//    lateinit var btnAdd: Button
//    lateinit var btnSubtract:Button
//    lateinit var btnMultiply:Button
//    lateinit var btnDivide:Button
//    lateinit var tvResult: TextView
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        castView()
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//    }
//
//    fun castView(){
//        etNum1 = findViewById(R.id.etNum1)
//        etNum2 = findViewById(R.id.etNum2)
//        btnAdd = findViewById(R.id.btnadd)
//        btnSubtract = findViewById(R.id.btnsubtract)
//        btnMultiply = findViewById(R.id.btnmultiply)
//        btnDivide = findViewById(R.id.btndivide)
//        tvResult = findViewById(R.id.TextView)
//    }
//    override fun onResume() {
//        super.onResume()
//        btnAdd.setOnClickListener {
//            tvResult.text =obtainValue("+").toString()
//        }
//        btnSubtract.setOnClickListener {
//            tvResult.text =obtainValue("-").toString()
//
//        }
//        btnDivide.setOnClickListener {
//            tvResult.text =obtainValue("/").toString()
//        }
//        btnMultiply.setOnClickListener {
//            tvResult.text =obtainValue("*").toString()
//        }
//    }
//
//
//    fun obtainValue(symbol:String):Double{
//        val num1 = etNum1.text.toString()
//        val num2 = etNum2.text.toString()
//        if(num1.isBlank()){
//            etNum1.error="Num1 Is required"
//return 0.0
//        }
//if(num2.isBlank()){
//    etNum1.error="Num2 Is required"
//    return 0.0
//}
//
//        fun performCalculation(symbol: String,num1:String,num)
//      return when(symbol){
//           "+" ->  num1.toDouble()+num2.toInt()
//           "-" ->  num1.toDouble()-num2.toInt()
//           "*" ->  num1.toDouble()*num2.toInt()
//           "/" ->  num1.toDouble()/num2.toInt()
//           else -> 0.0
//       }
//    }
//}


class MainActivity : AppCompatActivity() {
    lateinit var etNum1: EditText
    lateinit var etNum2: EditText
    lateinit var btnAdd: Button
    lateinit var btnSubract: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivide: Button
    lateinit var tvResult: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        castViews()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun castViews() {
        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        btnAdd = findViewById(R.id.btnadd)
        btnSubract = findViewById(R.id.btnsubtract)
        btnMultiply = findViewById(R.id.btnmultiply)
        btnDivide = findViewById(R.id.btndivide)
        tvResult = findViewById(R.id.TextView)
    }

    override fun onResume() {
        super.onResume()
        btnAdd.setOnClickListener {
          obtainValues("+").toString()
        }
        btnSubract.setOnClickListener {
          obtainValues("-").toString()
        }
        btnMultiply.setOnClickListener {
        obtainValues("x").toString()
        }
        btnDivide.setOnClickListener {
       obtainValues("/").toString()
        }
    }
    fun obtainValues(symbol: String) {
        val num1= etNum1.text.toString()
        val num2= etNum2.text.toString()
        if (num1.isBlank()){
            etNum1.error="Num 1 is required"
            return
        }
        if (num2.isBlank()){
            etNum2.error="Num 2 required "
            return
        }

        performCalculation(symbol, num1,num2)
    }

    fun performCalculation(symbol: String, num1:String, num2: String){
        val result=  when(symbol){
            "+" -> num1.toDouble() + num2.toInt()
            "-" -> num1.toDouble() - num2.toInt()
            "x" -> num1.toDouble() * num2.toInt()
            "/" -> num1.toDouble() / num2.toInt()
            else -> 0.0
        }
tvResult.text=result.toString()
    }
}
