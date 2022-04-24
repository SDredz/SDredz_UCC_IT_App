package com.example.sdredzuccitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*
import com.google.firebase.firestore.auth.User

class CourseDB : AppCompatActivity() {

    private lateinit var dbref : DatabaseReference
    private lateinit var courseRecyclerview : RecyclerView
    private lateinit var courseArrayList : ArrayList<Course>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_db)

        courseRecyclerview = findViewById(R.id.courseList)
        courseRecyclerview.layoutManager = LinearLayoutManager(this)
        courseRecyclerview.setHasFixedSize(true)

        courseArrayList = arrayListOf<Course>()
        getUserData()

    }

    private fun getUserData() {

        dbref = FirebaseDatabase.getInstance("https://sdredz-ucc-it-app-default-rtdb.firebaseio.com/").getReference("availableCourses")

        dbref.addValueEventListener(object : ValueEventListener {

            override fun onDataChange(p0: DataSnapshot) {

                if (p0.exists()){

                    for (courseP0 in p0.children){


                        val courses = courseP0.getValue(Course::class.java)
                        courseArrayList.add(courses!!)

                    }

                    courseRecyclerview.adapter = MyAdapter(courseArrayList)

                }

            }

            override fun onCancelled(p0: DatabaseError) {
                TODO("Not yet implemented")
            }


        })

    }
}