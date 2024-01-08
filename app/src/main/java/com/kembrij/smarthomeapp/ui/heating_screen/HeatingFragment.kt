package com.kembrij.smarthomeapp.ui.heating_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.kembrij.smarthomeapp.databinding.FragmentElectricityBinding
import com.kembrij.smarthomeapp.databinding.FragmentHeatingBinding
import com.kembrij.smarthomeapp.ui.electricity_screen.ElectricityViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HeatingFragment : Fragment() {


    private val viewModel: HeatingViewModel by viewModels()
    private lateinit var binding: FragmentHeatingBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHeatingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
    }

}
