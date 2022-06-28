package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

//    fun ButtonClick(view: View){
//        val goHomeButton: Button = findViewById(R.id.goHomeButton)
//        val goNextButton: Button = findViewById(R.id.goNextButton)
//
//        goHomeButton.setOnClickListener{
//            Navigation.findNavController(view).navigate(R.id.action_titleFragment_to_secondFragment)
//        }
//        goNextButton.setOnClickListener{
//            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_titleFragment)
//        }
//
//    }
}