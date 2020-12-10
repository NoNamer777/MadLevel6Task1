package com.nonamer777.madlevel6task1.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nonamer777.madlevel6task1.repository.ColorRepository

class ColorItemViewModel: ViewModel() {

    val colorItems: LiveData<List<ColorItem>> get() = _colorItems

    private val colorRepo = ColorRepository()

    private val _colorItems = MutableLiveData<List<ColorItem>>().apply {
        value = colorRepo.getColorItems()
    }
}