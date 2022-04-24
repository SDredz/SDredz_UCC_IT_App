//Stuck for the firebase app
package com.example.sdredzuccitapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.github.barteksc.pdfviewer.PDFView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val courseBtn = findViewById<Button>(R.id.viewCourseBtn)
        val emailBtn = findViewById<Button>(R.id.EmailHodBtn)
        val viewSocialBtn = findViewById<Button>(R.id.viewSocialBtn)
        val viewAdmissionsBtn = findViewById<Button>(R.id.viewAdminssionBtn)
        val viewTimtblBtn = findViewById<Button>(R.id.viewTimtblBtn)
        val viewDirectBtn = findViewById<Button>(R.id.viewDirectBtn)

        courseBtn.setOnClickListener {
            var i = Intent(this,CourseDB::class.java)
            startActivity(i)
        }

        emailBtn.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO,
            Uri.fromParts("mailto", "ithod@ucc.edu.jm", null))
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }

        viewSocialBtn.setOnClickListener {
            val i = Intent(this,Socials::class.java)
            startActivity(i)
        }

        viewAdmissionsBtn.setOnClickListener {
            var i = Intent(this,Admissions::class.java)
            startActivity(i)
        }

        viewTimtblBtn.setOnClickListener {
            var i = Intent(this,Timetable::class.java)
            startActivity(i)
        }

        viewDirectBtn.setOnClickListener {
            var i = Intent(this,Directory::class.java)
            startActivity(i)
        }

    }}
