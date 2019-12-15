package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.test.ui.course.courseContent.ComputerScience

class CourseContent : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_content)


        /*Testing for button click to another page*/

        val btnBinary = findViewById<Button>(R.id.btnTopicOne)
        val btnStartCourse = findViewById<Button>(R.id.btnStartCourse)

        btnStartCourse.setOnClickListener {
            val intent = Intent(this, ComputerScience ::class.java)
            startActivity(intent)

        }


        btnBinary.setOnClickListener {
            val intent = Intent(this, ComputerScience ::class.java)
            startActivity(intent)

         }

    }
}
