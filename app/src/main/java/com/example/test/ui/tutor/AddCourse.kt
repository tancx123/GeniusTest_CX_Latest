package com.example.test.ui.tutor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import com.example.test.R

class AddCourse : AppCompatActivity() {

    internal lateinit var sp :Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_course)


        /*val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, listOf("None", "Top", "Bottom"))
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        positionSpinner.adapter = adapter*/

        /*sp = findViewById<Spinner>(R.id.spnTopicCover)
        val topicCovered = arrayOf("Binary", "Logic")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, topicCovered)
        sp.adapter = adapter*/

    }
}
