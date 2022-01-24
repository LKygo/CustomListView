package com.example.customlistview

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class Adapter(private val context: Activity, private val arrayList: ArrayList<User>):
    ArrayAdapter<User>(context, R.layout.list_item, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item, null)

        val imageView :ImageView = view.findViewById(R.id.imgProfilePic)
        val name : TextView = view.findViewById(R.id.txvName)
        val regNo: TextView = view.findViewById(R.id.txvRegNo)

        imageView.setImageResource(arrayList[position].imageId)
        name.text = arrayList[position].name
        regNo.text = arrayList[position].regNo



        return view
    }
}