package com.example.gallery

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Image1= findViewById<ImageView>(R.id.img1)
        val Image2= findViewById<ImageView>(R.id.img3)
        val Image3= findViewById<ImageView>(R.id.img4)
        val Image4= findViewById<ImageView>(R.id.img5)
        val Image5= findViewById<ImageView>(R.id.img6)
        val Image6= findViewById<ImageView>(R.id.img2)



        Image1.setOnClickListener{
            Toast.makeText(this,"Stewie",Toast.LENGTH_LONG).show()

        }

        Image2.setOnClickListener{
            Toast.makeText(this,"Brain",Toast.LENGTH_LONG).show()


        }
        Image3.setOnClickListener{
            Toast.makeText(this,"Peter",Toast.LENGTH_LONG).show()
        }

        Image4.setOnClickListener{
            Toast.makeText(this,"Lois",Toast.LENGTH_LONG).show()
        }

        Image5.setOnClickListener{
            Toast.makeText(this,"Meg",Toast.LENGTH_LONG).show()
        }
        Image6.setOnClickListener{
            Toast.makeText(this,"Chris",Toast.LENGTH_LONG).show()
        }
    }
}
