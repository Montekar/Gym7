package com.example.gym7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.gym7.databinding.FragmentTrackingBinding


class TrackingFragment : Fragment() {

    private lateinit var binding: FragmentTrackingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTrackingBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnGoToExercises.setOnClickListener {
            findNavController().navigate(R.id.action_trackingFragment_to_exercisesFragment)
        }
        binding.btnGoToPlans.setOnClickListener {
            findNavController().navigate(R.id.action_trackingFragment_to_workoutPlansFragment)
        }
        binding.btnGoToBodyWeight.setOnClickListener {
            findNavController().navigate(R.id.action_trackingFragment_to_bodyWeightFragment)
        }

    }


}