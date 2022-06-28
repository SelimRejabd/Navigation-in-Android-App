package com.example.assignment2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController


class TitleFragment : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_title, container, false)
        val goNextButton = view.findViewById<Button>(R.id.goNextButton)
        goNextButton.setOnClickListener{
            findNavController().navigate(R.id.action_titleFragment_to_secondFragment)
        }
        val goNextButton3 = view.findViewById<Button>(R.id.goNextButton3)
        goNextButton3.setOnClickListener {
            findNavController().navigate(R.id.action_titleFragment_to_thirdFragment)
        }


        return view
    }




}