package com.kembrij.smarthomeapp.ui.lighting_screen


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.kembrij.smarthomeapp.databinding.FragmentLightingBinding
import com.kembrij.smarthomeapp.databinding.FragmentLightingKitchenBinding
import com.kembrij.smarthomeapp.databinding.FragmentLightingLivingroomBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class LivingroomLightingFragment: Fragment() {

    private val viewModel: LightingViewModel by viewModels()
    private lateinit var binding: FragmentLightingLivingroomBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLightingLivingroomBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
    }

}