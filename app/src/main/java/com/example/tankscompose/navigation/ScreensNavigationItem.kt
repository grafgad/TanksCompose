package com.example.tankscompose.navigation

sealed class ScreensNavigationItem(
    val className: String
) {
    object ClanListScreen : ScreensNavigationItem(
        className = "ClanListScreen"
    )
    object ClanInfoScreen : ScreensNavigationItem(
        className = "ClanInfoScreen"
    )
    object PlayerListScreen : ScreensNavigationItem(
        className = "PlayerListScreen"
    )
    object PlayerInfoScreen : ScreensNavigationItem(
        className = "PlayerInfoScreen"
    )
    object StartScreen : ScreensNavigationItem(
        className = "StartScreen"
    )
}
