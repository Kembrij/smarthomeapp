package com.kembrij.smarthomeapp.ui.home_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.kembrij.smarthomeapp.databinding.HomeFragmentBinding
import com.kembrij.smarthomeapp.databinding.ItemRoomBinding
import com.kembrij.smarthomeapp.ui.NavGraphActivity
import dagger.hilt.android.AndroidEntryPoint
import com.kembrij.smarthomeapp.domain.model.Room
import com.kembrij.smarthomeapp.utils.executeAfter


class RoomsAdapter constructor(

    private val lifecycleOwner: LifecycleOwner,
    private val viewModel: HomeViewModel,
    private val roomList: List<Room>

) : RecyclerView.Adapter<ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = ItemRoomBinding.inflate(inflater, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = roomList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

}

class ViewHolder(val binding: ItemRoomBinding) :
    RecyclerView.ViewHolder(binding.root)
