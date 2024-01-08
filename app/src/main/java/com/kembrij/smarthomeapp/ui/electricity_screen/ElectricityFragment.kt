package com.kembrij.smarthomeapp.ui.electricity_screen

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.kembrij.smarthomeapp.databinding.FragmentClimateBinding
import com.kembrij.smarthomeapp.databinding.FragmentElectricityBinding
import com.kembrij.smarthomeapp.ui.climate_screen.ClimateViewModel

@AndroidEntryPoint
class ElectricityFragment : Fragment() {


    private val viewModel: ElectricityViewModel by viewModels()
    private lateinit var binding: FragmentElectricityBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentElectricityBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
    }


}
