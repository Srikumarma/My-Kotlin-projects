package com.example.sretchats

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Signup : AppCompatActivity() {

    private lateinit var edt_uname: EditText
    private lateinit var edtEmail: EditText
    private lateinit var edtpassword: EditText
    private lateinit var signup: Button
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        supportActionBar?.hide()
        mAuth = FirebaseAuth.getInstance()
        edt_uname = findViewById(R.id.edt_uname)
        edtEmail = findViewById(R.id.edt_email)
        edtpassword = findViewById(R.id.edt_password)
        signup = findViewById(R.id.signup)

        signup.setOnClickListener {
            val email = edtEmail.text.toString()
            val password = edtpassword.text.toString()

            signUp(email,password);
        }
    }
    private fun signUp(email: String, password: String){
        //creating user
        mAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    //code for jumping to home
                    val intent = Intent(this@Signup, MainActivity::class.java)
                    startActivity(intent)

                } else {
                    Toast.makeText(this@Signup, "Some error occured", Toast.LENGTH_SHORT).show()

                }
            }
    }
}