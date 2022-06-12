package com.example.cafe86menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity()
{
    private val img = arrayOf(R.drawable.redhot_cheese_burger, R.drawable.chips, R.drawable.drink, R.drawable.molted_chocolate_fudge,)

    private val texts = arrayOf("Burgers","BBQ & Chips",
        "Drinks","Ice Creams")

    private val desc = arrayOf("Rs.300", "Rs.250" ,
        "Rs.200" ,"Rs.150" )

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycleView = findViewById<RecyclerView>(R.id.recycler_view)
        recycleView.layoutManager = LinearLayoutManager(this)
        recycleView.adapter = CustomAdapter(img,texts,desc)
    }
}