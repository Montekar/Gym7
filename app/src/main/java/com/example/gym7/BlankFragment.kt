package com.example.gym7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.gym7.databinding.FragmentBlankBinding
import com.example.gym7.databinding.FragmentExercisesBinding
import com.example.gym7.databinding.FragmentTrackingBinding

class BlankFragment : Fragment() {

    private lateinit var binding: FragmentBlankBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentBlankBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnGoBackFromBlank.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment_to_statisticsFragment)
        }
    }
}