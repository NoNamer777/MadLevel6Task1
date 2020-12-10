package com.nonamer777.madlevel6task1.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.nonamer777.madlevel6task1.R
import com.nonamer777.madlevel6task1.databinding.FragmentColorBinding
import com.nonamer777.madlevel6task1.model.ColorItem

/**
 * A [Fragment] subclass where Users can touch a color and see what that color's name is.
 */
class ColorFragment: Fragment() {

    private lateinit var binding: FragmentColorBinding

    private val colors = arrayListOf<ColorItem>()

    private val colorAdapter = ColorAdapter(colors, ::onColorClick)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentColorBinding.inflate(layoutInflater)

        initializeRecyclerView()

        return binding.root
    }

    private fun initializeRecyclerView() {
        binding.colorsList.layoutManager = LinearLayoutManager(
            activity,
            RecyclerView.VERTICAL,
            false
        )
        binding.colorsList.adapter = colorAdapter

        observeColors()
    }

    private fun onColorClick(colorItem: ColorItem) {
        Snackbar.make(
            binding.colorsList,
            "This color is: ${colorItem.name}",
            Snackbar.LENGTH_LONG
        ).show()
    }

    private fun observeColors() {
        
    }
}
