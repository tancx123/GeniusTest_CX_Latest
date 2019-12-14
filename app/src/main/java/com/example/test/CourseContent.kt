package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.test.ui.course.courseContent.ComputerScience

class CourseContent : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_content)


        /*Testing for button click to another page*/

        val btnBinary = findViewById<Button>(R.id.btnTopicOne)

        btnBinary.setOnClickListener {
            val intent = Intent(this, ComputerScience ::class.java)
            startActivity(intent)

         }

    }
}
