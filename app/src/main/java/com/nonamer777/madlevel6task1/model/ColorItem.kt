package com.nonamer777.madlevel6task1.model

data class ColorItem(

    var hexadecimal: String,

    var name: String
) {

    fun getImageUrl() = "http://singlecolorimage.com/get/$hexadecimal/1080x1080"
}

