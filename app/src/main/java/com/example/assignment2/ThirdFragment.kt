package com.example.assignment2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class ThirdFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

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
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        val goHomeButton2 = view.findViewById<Button>(R.id.goHomeButton2)
        val goNextButton2 = view.findViewById<Button>(R.id.goNextButton2)
        goHomeButton2.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_titleFragment)

        }
        goNextButton2.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_secondFragment)
        }

        return view
    }


}