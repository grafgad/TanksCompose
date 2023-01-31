package com.example.tankscompose.screens.mainscreen

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.tankscompose.R

sealed class NavigationItem(
    val route: String,
    @DrawableRes
    val iconRes: Int,
    @StringRes
    val title: Int
) {
    object Players : NavigationItem(
        route = "players",
        iconRes = R.drawable.ic_baseline_face_24,
        title = R.string.players
    )

    object Clans : NavigationItem(
        route = "clans",
        iconRes = R.drawable.ic_baseline_people_24,
        title = R.string.clans
    )

    object StartScreen : NavigationItem(
        route = "startScreen",
        iconRes = 0,
        title = 0
    )
}