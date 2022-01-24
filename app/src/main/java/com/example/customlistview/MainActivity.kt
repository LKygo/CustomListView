package com.example.customlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customlistview.databinding.ActivityMainBinding


private lateinit var binding : ActivityMainBinding
private lateinit var userArrayList: ArrayList<User>

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)


        val imageId = intArrayOf(
            R.drawable.profile, R.drawable.prof3, R.drawable.prof4, R.drawable.prof5, R.drawable.prof6, R.drawable.prof7,
        )
        val name = arrayOf(
            "Leeroy Kigo", "Raphael Ndiritu", "Musa Maxwell","chainz Ombuthia", "Muhohlings Kinyanjui", "Ndikwa Orkoiyot"
        )

        val regNo = arrayOf(
            "SCT222-0138/2019","SCT222-0141/2019","SCT222-0137/2019","SCT222-0131/2019","SCT222-0128/2019","SCT222-0127/2019",
        )

        val course = arrayOf(
            "BBC", "BBC", "BBC", "Animal husbandry", "Avocado irrigation with IT", "Fishing with tae kwon-do"
        )

        userArrayList = ArrayList()

        for(i in name.indices){
            val user = User(name[i], regNo[i], imageId[i], course[i])
            userArrayList.add(user)
        }

        binding.lsvListView.isClickable = true
        binding.lsvListView.adapter = Adapter(this, userArrayList)
        binding.lsvListView.setOnItemClickListener { adapterView, view, position, id ->

            val name = name[position]
            val reg = regNo[position]
            val course = course[position]
            val imageId = imageId[position]

            val studentPage = Intent(this, StudentActivity::class.java)
            studentPage.putExtra("name", name)
            studentPage.putExtra("image", imageId)
            studentPage.putExtra("reg", reg)
            studentPage.putExtra("course", course)
            startActivity(studentPage)


        }
    }
}