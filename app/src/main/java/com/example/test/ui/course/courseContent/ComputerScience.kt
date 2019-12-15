package com.example.test.ui.course.courseContent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.test.R

class ComputerScience : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_computer_science)


        val btnNextTopic = findViewById<Button>(R.id.btnNextTopic)

        btnNextTopic.setOnClickListener {

            val intent = Intent(this, LogicGates ::class.java)
            startActivity(intent)

        }



    }
}
