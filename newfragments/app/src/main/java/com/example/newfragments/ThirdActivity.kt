package com.example.newfragments
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.thirdactivity)
        val btnStartOneAnotherActivity=findViewById<Button>(R.id.bt2)
        btnStartOneAnotherActivity.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.javatpoint.com/kotlin-android-explicit-intent"))
            startActivity(intent)
        }




    }

}