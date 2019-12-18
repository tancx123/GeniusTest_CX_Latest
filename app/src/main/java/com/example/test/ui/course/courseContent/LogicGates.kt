package com.example.test.ui.course.courseContent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.test.R
import com.example.test.ui.tutor.TutorCourse
import kotlinx.android.synthetic.main.activity_add_course.view.*

class LogicGates : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logic_gates)

        val btnTesting = findViewById<Button>(R.id.buttonTesting)

        btnTesting.setOnClickListener {

            val intent = Intent(this, TutorCourse::class.java )
            startActivity(intent)

        }


    }
}
