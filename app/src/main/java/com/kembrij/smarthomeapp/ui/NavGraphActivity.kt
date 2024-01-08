package com.kembrij.smarthomeapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.appbar.MaterialToolbar
import com.kembrij.smarthomeapp.BuildConfig
import com.kembrij.smarthomeapp.R
import com.kembrij.smarthomeapp.databinding.ActivityNavGraphBinding
import com.kembrij.smarthomeapp.ui.actuator_screen.ActuatorFragment
import com.kembrij.smarthomeapp.ui.climate_screen.ClimateFragment
import com.kembrij.smarthomeapp.ui.electricity_screen.ElectricityFragment
import com.kembrij.smarthomeapp.ui.heating_screen.HeatingFragment
import com.kembrij.smarthomeapp.ui.home_screen.HomeFragment
import com.kembrij.smarthomeapp.ui.lighting_screen.LightingFragment
import com.kembrij.smarthomeapp.ui.lock_screen.LockFragment
import com.kembrij.smarthomeapp.ui.script_screen.ScriptFragment
import com.kembrij.smarthomeapp.ui.sensor_screen.SensorFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NavGraphActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavGraphBinding

    public lateinit var toolbar: MaterialToolbar

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNavGraphBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.topAppBar)
        toolbar = binding.topAppBar
        supportActionBar?.setTitle("Умный дом")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.home_layout) as NavHostFragment

    }
}