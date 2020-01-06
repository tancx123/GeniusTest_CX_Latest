package com.example.test.ui.tutor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class AddCourse : AppCompatActivity() {

    //internal lateinit var sp :Spinner
    lateinit var mRecycleView : RecyclerView
    lateinit var mDatabase : DatabaseReference


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

        mDatabase = FirebaseDatabase.getInstance().getReference("Course")
        mRecycleView = findViewById(R.id.list_view)

        //addCourse("Computer Science", "")
        logRecycleView()

    }

    private fun logRecycleView()
    {
        var FirebaseRecyclerAdapter = object : FirebaseRecyclerAdapter<AllCourse, UserViewHolders>(


            AllCourse::class.java,
            R.layout.list_course,
            UserViewHolders::class.java,
            mDatabase

        )
        {

            override fun populateViewHolder(p0: UserViewHolders?, p1: AllCourse?, p2: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        }
    }


    class UserViewHolders(itemView: View?) : RecyclerView.ViewHolder(itemView!!)
    {

    }

    /*private fun addCourse(courseName: String, image: String) {
        val course = AllCourse(courseName, image)
        mDatabase.child(courseName).setValue(course)
    }*/
}
