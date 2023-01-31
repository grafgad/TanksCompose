package com.example.tankscompose

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

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
}