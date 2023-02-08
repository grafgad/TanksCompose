package com.example.tankscompose.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tankscompose.screens.claninfoscreen.ClanInfoScreen
import com.example.tankscompose.screens.clanslistscreen.ClansListScreen
import com.example.tankscompose.screens.mainscreen.StartScreen
import com.example.tankscompose.screens.playerinfoscreen.PlayerInfoScreen
import com.example.tankscompose.screens.playerslistscreen.PlayersListScreen

@Composable
fun ScreensNavigationScreen(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    Box(
        modifier = modifier
            .fillMaxSize()
            .statusBarsPadding()
    ) {
        ScreenNavigation(navHostController = navController)
    }
}

@Composable
fun ScreenNavigation(
    navHostController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navHostController,
        startDestination = ScreensNavigationItem.StartScreen.className,
        modifier = modifier
    ) {
        composable(ScreensNavigationItem.ClanInfoScreen.className) {
            ClanInfoScreen()
        }
        composable(ScreensNavigationItem.ClanListScreen.className) {
            ClansListScreen(navController = rememberNavController())
        }
        composable(ScreensNavigationItem.PlayerInfoScreen.className) {
            PlayerInfoScreen()
        }
        composable(ScreensNavigationItem.PlayerListScreen.className) {
            PlayersListScreen(navController = rememberNavController())
        }
        composable(ScreensNavigationItem.StartScreen.className) {
            StartScreen()
        }
    }
}