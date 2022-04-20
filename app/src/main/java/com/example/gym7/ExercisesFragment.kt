package com.example.gym7

import android.content.Context
import android.os.Bundle
import android.view.*
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.gym7.databinding.Activity3Binding.inflate
import com.example.gym7.databinding.ActivityMainBinding.inflate
import com.example.gym7.databinding.FragmentExercisesBinding
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class ExercisesFragment : Fragment() {

    private lateinit var binding: FragmentExercisesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentExercisesBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnGoBackFromExercises.setOnClickListener {
            findNavController().navigate(R.id.action_exercisesFragment_to_trackingFragment)
        }


/*
        val user = arrayOf("Abhay","Joseph","Maria","Avni","Apoorva","Chris","David","Kaira","Dwayne","Christopher",
            "Jim","Russel","Donald","Brack","Vladimir")

        val v : View = LayoutInflater.inflate(R.layout.fragment_exercises,false)

        val userAdapter : ArrayAdapter<String> = ArrayAdapter(
            activity as Context,R.layout.fragment_exercises,
            user
        )

        binding.exerciseList.adapter = userAdapter;

        binding.searchView.setOnQueryTextListener(object  : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                binding.searchView.clearFocus()
                if (user.contains(query)){

                    userAdapter.filter.filter(query)

                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                userAdapter.filter.filter(newText)
                return false
            }


        })

 */

        
    }
}