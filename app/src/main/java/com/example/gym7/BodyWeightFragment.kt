package com.example.gym7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.gym7.databinding.FragmentBodyWeightBinding
import com.example.gym7.databinding.FragmentWorkoutPlansBinding

class BodyWeightFragment : Fragment() {

    private lateinit var binding: FragmentBodyWeightBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentBodyWeightBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnGoBackFromBodyWeight.setOnClickListener {
            findNavController().navigate(R.id.action_bodyWeightFragment_to_trackingFragment)
        }
    }
}