package com.example.tankscompose.screens.mainscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tankscompose.screens.clanslistscreen.ClansListScreen
import com.example.tankscompose.screens.playerslistscreen.PlayersListScreen

@Composable
fun TabsNavigationScreen(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    Scaffold(
        modifier = Modifier.navigationBarsPadding(),
        bottomBar = { BottomNavigationBar(navController) },
        content = { paddingValues ->
            Box(modifier = modifier.padding(paddingValues)) {
                TabNavigation(navHostController = navController)
            }
        }
    )
}

@Composable
private fun TabNavigation(
    navHostController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navHostController,
        startDestination = NavigationItem.StartScreen.route,
        modifier = modifier
    ) {
        composable(NavigationItem.Clans.route) {
            ClansListScreen()
        }
        composable(NavigationItem.Players.route) {
            PlayersListScreen()
        }
    }
}
