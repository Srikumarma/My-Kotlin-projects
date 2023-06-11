package com.example.day4

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val radioGroup2 = findViewById<RadioGroup>(R.id.radioGroup2)
        val radioGroup3 = findViewById<RadioGroup>(R.id.radioGroup3)
        val radioGroup4 = findViewById<RadioGroup>(R.id.radioGroup4)

        val button = findViewById<Button>(R.id.btnDisplay)

        button.setOnClickListener {
            val intSelectButton: Int = radioGroup!!.checkedRadioButtonId
            val intSelectButton2: Int = radioGroup2!!.checkedRadioButtonId
            val intSelectButton3: Int = radioGroup3!!.checkedRadioButtonId
            val intSelectButton4: Int = radioGroup4!!.checkedRadioButtonId

            val radioButton = findViewById<RadioButton>(intSelectButton)
            val radioButton2 = findViewById<RadioButton>(intSelectButton2)
            val radioButton3 = findViewById<RadioButton>(intSelectButton3)
            val radioButton4 = findViewById<RadioButton>(intSelectButton4)

            val ans = radioButton.text
            val ans2 = radioButton2.text
            val ans3 = radioButton3.text
            val ans4 = radioButton4.text

            val final ="$ans,$ans2,$ans3,$ans4"

            Toast.makeText(baseContext, final, Toast.LENGTH_SHORT).show()


        }
    }
}





