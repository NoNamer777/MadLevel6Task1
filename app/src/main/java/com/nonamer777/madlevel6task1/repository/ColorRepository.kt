package com.nonamer777.madlevel6task1.repository

import com.nonamer777.madlevel6task1.model.ColorItem

class ColorRepository {

    fun getColorItems(): List<ColorItem> = arrayListOf(
        ColorItem("000000", "Black"),
        ColorItem("FF0000", "Red"),
        ColorItem("0000FF", "Blue"),
        ColorItem("FFFF00", "Yellow"),
        ColorItem("008000", "Green"),
    )
}
