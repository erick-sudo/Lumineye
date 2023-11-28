package com.optic.lumineye.models

import androidx.compose.ui.graphics.Color

data class Glass(
    val brand: Brand,
    val frameSize: FrameSize,
    val lensWidth: String,
    val color: Color
) {

    constructor() : this(
        Brand.Raycloud,
        FrameSize.Large,
        "51mm - 58mm",
        Color.Black
    )

}