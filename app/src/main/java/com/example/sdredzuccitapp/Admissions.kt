package com.example.sdredzuccitapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Admissions : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admissions)

        val btnApply = findViewById<Button>(R.id.btnApply)

        btnApply.setOnClickListener {
            gotoUrl("https://apply.online.ucc.edu.jm/s/login/?ec=302&startURL=%2Fs%2F")
        }

    }
    private fun gotoUrl(s: String) {
        val uri = Uri.parse(s)
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }

}