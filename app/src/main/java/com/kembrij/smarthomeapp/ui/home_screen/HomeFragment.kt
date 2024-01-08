package com.kembrij.smarthomeapp.ui.home_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import com.kembrij.smarthomeapp.R

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.kembrij.smarthomeapp.databinding.FragmentHomeBinding
import com.kembrij.smarthomeapp.ui.NavGraphActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private val viewModel: HomeViewModel by viewModels()
    private lateinit var binding: FragmentHomeBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
        setListeners()
    }
    private fun setListeners() {
        val cardViewLighting: CardView = binding.lightingCvId
        val cardViewActuators: CardView = binding.actuatorCvId
        val cardViewClimate: CardView = binding.climateCvId
        val cardViewElectricity: CardView = binding.socketsCvId
        val cardViewHeating: CardView = binding.heatingCvId
        val cardViewLocks: CardView = binding.lockCvId
        val cardViewScripts: CardView = binding.automationCvId
        val cardViewSensors: CardView = binding.sensorsCvId

        cardViewLighting.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_lightingFragment)
        }
        cardViewActuators.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_actuatorFragment)
        }
        cardViewClimate.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_climateFragment)
        }
        cardViewElectricity.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_electricityFragment)
        }
        cardViewHeating.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_heatingFragment)
        }
        cardViewLocks.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_lockFragment)
        }
        cardViewScripts.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_scriptFragment)
        }
        cardViewSensors.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_sensorFragment)
        }


    }

}

