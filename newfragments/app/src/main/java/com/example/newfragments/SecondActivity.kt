package com.example.newfragments

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondactivity)
        val btnStartOneAnotherActivity=findViewById<Button>(R.id.bt2)
        btnStartOneAnotherActivity.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

    }
}

