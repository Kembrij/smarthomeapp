package com.kembrij.smarthomeapp.ui.lock_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint

import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.kembrij.smarthomeapp.databinding.FragmentHeatingBinding
import com.kembrij.smarthomeapp.databinding.FragmentLocksBinding
import com.kembrij.smarthomeapp.ui.heating_screen.HeatingViewModel

@AndroidEntryPoint
class LockFragment : Fragment() {



    private val viewModel: LockViewModel by viewModels()
    private lateinit var binding: FragmentLocksBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLocksBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
    }


}
