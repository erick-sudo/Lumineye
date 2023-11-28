package com.optic.lumineye.models

import androidx.annotation.StringRes
import com.optic.lumineye.R

enum class FrameSize(
    @StringRes size: Int,
    @StringRes abbr: Int
) {
    Small(
        size = R.string.frame_size_small,
        abbr = R.string.frame_size_small_abbreviation
    ),
    Medium(
        size = R.string.frame_size_medium,
        abbr = R.string.frame_size_medium_abbreviation
    ),
    Large(
        size = R.string.frame_size_large,
        abbr = R.string.frame_size_large_abbreviation
    )
}