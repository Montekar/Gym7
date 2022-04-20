package com.example.gym7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.SearchView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.gym7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController= Navigation.findNavController(this,R.id.activity_main_nav_host_fragment)
        setupWithNavController(binding.bottomNavigationView,navController)


/*

        val user = arrayOf("Abhay","Joseph","Maria","Avni","Apoorva","Chris","David","Kaira","Dwayne","Christopher",
            "Jim","Russel","Donald","Brack","Vladimir")

        val userAdapter : ArrayAdapter<String> = ArrayAdapter(
            this,android.R.layout.simple_list_item_1,
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


        val secondBtn = findViewById<Button>(R.id.btnGoToNewActivity)

        secondBtn.setOnClickListener() {
            val intent = Intent(this, Activity3::class.java)
            startActivity(intent)
        }


 */

    }
}