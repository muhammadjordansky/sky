package com.example.sky.model
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class sky(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)