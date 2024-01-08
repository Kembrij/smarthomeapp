package com.kembrij.smarthomeapp.ui.script_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.kembrij.smarthomeapp.databinding.FragmentLocksBinding
import com.kembrij.smarthomeapp.databinding.FragmentScriptsBinding
import com.kembrij.smarthomeapp.ui.lock_screen.LockViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ScriptFragment : Fragment() {


    private val viewModel: ScriptViewModel by viewModels()
    private lateinit var binding: FragmentScriptsBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentScriptsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
    }

}