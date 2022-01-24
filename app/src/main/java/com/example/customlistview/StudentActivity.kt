package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customlistview.databinding.ActivityStudentBinding


private lateinit var binding: ActivityStudentBinding
class StudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityStudentBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        val name = intent.getStringExtra("name")
        val regNo = intent.getStringExtra("reg")
        val course = intent.getStringExtra("course")
        val dp = intent.getIntExtra("image", R.drawable.profile)


        binding.civStdDP.setImageResource(dp)
        binding.txvStdName.text = name
        binding.txvSdReg.text = regNo
        binding.txvStdCourse.text = course
    }
}