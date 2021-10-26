package com.example.kwsvisitorregistrationsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val confirmLogin = findViewById<View>(R.id.confirmLogin)
        val forgotPassword = findViewById<View>(R.id.forgot_password)

        confirmLogin.setOnClickListener {
            val intent = Intent(this, SelectNextActivity::class.java)
            startActivity(intent)
        }
        forgotPassword.setOnClickListener{
            val intentoo = Intent(this, ForgotPassword::class.java)
            startActivity(intentoo)
        }


    }

   }

