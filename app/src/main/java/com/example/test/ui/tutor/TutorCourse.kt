package com.example.test.ui.tutor


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.test.R
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_tutor_course.view.*

/**
 * A simple [Fragment] subclass.
 */
class TutorCourse : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tutor_course, container, false)

        view.btnAddCourse.setOnClickListener {
            val intent = Intent(activity, AddCourse ::class.java)
            startActivity(intent)
        }

        return view
    }


}
