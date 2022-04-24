package com.example.sdredzuccitapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Directory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_directory)

        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)



        button.setOnClickListener {
            val emailIntent = Intent(
                Intent.ACTION_SENDTO,
                Uri.fromParts("mailto", "ithod@ucc.edu.jm", null))
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }

        button2.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("mailto", "hosbourne@ucc.edu.jm", null))
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }

        button3.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("mailto", "cwhite01@faculty.ucc.edu.jm", null))
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }

        button4.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("mailto", "jbiggs@faculty.ucc.edu.jm", null))
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }

        button5.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("mailto", "itfaculty@ucc.edu.jm", null))
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }



    }
}