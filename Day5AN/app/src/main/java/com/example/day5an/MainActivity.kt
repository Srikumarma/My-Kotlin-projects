package com.example.day5an

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        done()
    }
    fun done(){
        val num1 = findViewById(R.id.edit1) as EditText
        val num2 = findViewById(R.id.edit2) as EditText
        val total = findViewById(R.id.edit3) as EditText

        val b1 = findViewById(R.id.btn1) as Button
        val b2 = findViewById(R.id.btn2) as Button
        val b3 = findViewById(R.id.btn3) as Button
        val b4 = findViewById(R.id.btn4) as Button
        val b5 = findViewById(R.id.btn5) as Button

        b1.setOnClickListener{
            val val1 = num1.text.toString().toInt()
            val val2 = num2.text.toString().toInt()
            val result = val1 + val2;
            total.setText(result.toString())
        }
        b2.setOnClickListener{
            val val1 = num1.text.toString().toInt()
            val val2 = num2.text.toString().toInt()
            val result = val1 - val2;
            total.setText(result.toString())
        }
        b3.setOnClickListener{
            val val1 = num1.text.toString().toInt()
            val val2 = num2.text.toString().toInt()
            val result = val1 * val2;
            total.setText(result.toString())
        }
        b4.setOnClickListener{
            val val1 = num1.text.toString().toInt()
            val val2 = num2.text.toString().toInt()
            val result = val1 / val2;
            total.setText(result.toString())
        }
        b5.setOnClickListener {
            num1.setText("")
            num2.setText("")
            total.setText("")
        }
    }
}