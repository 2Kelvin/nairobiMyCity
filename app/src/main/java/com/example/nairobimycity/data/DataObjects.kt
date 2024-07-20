package com.example.nairobimycity.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CategoryObject (
    @DrawableRes val imageResID: Int,
    @StringRes val text: Int
)

data class RecommendationObject (
    @DrawableRes val imageResID: Int,
    @StringRes val text: Int,
    @DrawableRes val biggerImageResID: Int,
    @StringRes val longDescription: Int,
)
