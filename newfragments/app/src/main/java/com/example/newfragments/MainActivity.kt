package com.example.newfragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val A = findViewById<Button>(R.id.bt1)
        A.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)

            startActivity(intent)

        }
    }
}