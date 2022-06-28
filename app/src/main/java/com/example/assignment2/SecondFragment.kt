package com.example.assignment2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_second, container, false)
        val goHomeButton = view.findViewById<Button>(R.id.goHomeButton)

        goHomeButton.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_titleFragment)
        }
        val nextButton2 = view.findViewById<Button>(R.id.nextButton2)
        nextButton2.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }
        return view
    }

}