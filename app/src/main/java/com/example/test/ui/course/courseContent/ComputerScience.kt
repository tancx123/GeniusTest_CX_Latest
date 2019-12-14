package com.example.test.ui.course.courseContent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.R
import com.example.test.ui.course.courseContent.ui.computerscience.ComputerScienceFragment

class ComputerScience : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.computer_science_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ComputerScienceFragment.newInstance())
                .commitNow()
        }
    }

}
