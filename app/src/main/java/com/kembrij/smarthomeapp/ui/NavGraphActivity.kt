package com.kembrij.smarthomeapp.ui

import android.os.Bundle
import android.view.Menu
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.appbar.MaterialToolbar
import com.kembrij.smarthomeapp.R
import com.kembrij.smarthomeapp.databinding.ActivityNavGraphBinding
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
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
    }
}