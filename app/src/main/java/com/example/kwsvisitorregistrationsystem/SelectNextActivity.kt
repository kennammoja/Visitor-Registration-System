package com.example.kwsvisitorregistrationsystem

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kwsvisitorregistrationsystem.R.layout.activity_selectnext

class SelectNextActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_selectnext)

        val toCovidScreening = findViewById<View>(R.id.to_covid_screening)
        val toLogOut = findViewById<View>(R.id.to_log_out)

        toCovidScreening.setOnClickListener {
            val intent = Intent(this, CovidScreening::class.java)
            startActivity(intent)
        }

        toLogOut.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)

        }
    }
}