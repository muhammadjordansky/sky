package com.example.sky.data

import com.example.sky.R
import com.example.sky.model.sky

class Datasource {

    fun loadsky(): List<sky> {
        return listOf<sky>(
            sky(R.string.sky1, R.drawable.images1),
            sky(R.string.sky2, R.drawable.images2),
            sky(R.string.sky3, R.drawable.images3),
            sky(R.string.sky4, R.drawable.images4),
            sky(R.string.sky5, R.drawable.images5),
            sky(R.string.sky6, R.drawable.images6),
            sky(R.string.sky7, R.drawable.images7),
            sky(R.string.sky8, R.drawable.images8),
            sky(R.string.sky9, R.drawable.images9),
            sky(R.string.sky10, R.drawable.images10)
        )
    }
}