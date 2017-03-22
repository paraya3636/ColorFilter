package org.paradrops.colorfilter

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter

class ColorFilter {
    fun monochrome() : ColorMatrixColorFilter {
        val matrix = ColorMatrix().apply {
            setSaturation(0f)
        }
        return ColorMatrixColorFilter(matrix)
    }
}
