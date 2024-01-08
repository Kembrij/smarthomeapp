package com.kembrij.smarthomeapp.ui.lighting_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.kembrij.smarthomeapp.R
import com.kembrij.smarthomeapp.databinding.FragmentHomeBinding
import com.kembrij.smarthomeapp.databinding.FragmentLightingBinding
import com.kembrij.smarthomeapp.ui.home_screen.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LightingFragment : Fragment() {

    private val viewModel: LightingViewModel by viewModels()
    private lateinit var binding: FragmentLightingBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLightingBinding.inflate(inflater, container, false)
        requireActivity().supportFragmentManager.beginTransaction()
            .add(R.id.fcvMain, KitchenLightingFragment::class.java, null).commit()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()

        setListeners()
    }


    private fun setListeners() {

        val bedroom: CardView = binding.bedroomCvLightId
        val bathroom: CardView = binding.bathroomCvLightId
        val livingroom: CardView = binding.livingroomCvLightId
        val kitchen: CardView = binding.kitchenCvLightId
        val corridor: CardView = binding.corridorCvLightId

        bedroom.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fcvMain, BedroomLightingFragment::class.java, null)
                .commit()

        }
        bathroom.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fcvMain, BathroomLightingFragment::class.java, null)
                .commit()
        }
        livingroom.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fcvMain, LivingroomLightingFragment::class.java, null)
                .commit()
        }
        kitchen.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fcvMain, KitchenLightingFragment::class.java, null)
                .commit()
        }
        corridor.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fcvMain, CorridorLightingFragment::class.java, null)
                .commit()
        }
    }

}