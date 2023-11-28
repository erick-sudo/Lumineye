package com.optic.lumineye.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.optic.lumineye.R

enum class Brand(
    @StringRes name: Int,
    @DrawableRes icon: Int
) {
    Carrera(
        name = R.string.brand_carrera,
        icon = R.drawable.baseline_remove_red_eye_24
    ),
    Raycloud(
        name = R.string.brand_raycloud,
        icon = R.drawable.baseline_remove_red_eye_24
    ),
    Optica(
        name = R.string.brand_optica,
        icon = R.drawable.baseline_remove_red_eye_24
    ),
    TV(
        name = R.string.brand_tv,
        icon = R.drawable.baseline_remove_red_eye_24
    ),
    Guess(
        name = R.string.brand_guess,
        icon = R.drawable.baseline_remove_red_eye_24
    ),
    Cactus(
        name = R.string.brand_cactus,
        icon = R.drawable.baseline_remove_red_eye_24
    ),
    Emporio(
        name = R.string.brand_emporio,
        icon = R.drawable.baseline_remove_red_eye_24
    )
}