package com.example.cafe86menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cafe86menu.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity()
{
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}