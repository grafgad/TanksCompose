package com.example.tankscompose.ui

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
import com.example.tankscompose.NavigationItem

@Composable
fun TabsNavigationScreen(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    Scaffold (
        modifier = Modifier.navigationBarsPadding(),
        bottomBar = { BottomNavigationBar(navController) },
        content = {paddingValues ->
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
        startDestination = NavigationItem.Clans.route,
        modifier = modifier) {
        composable(NavigationItem.Clans.route) {
            ClansScreen()
        }
        composable(NavigationItem.Players.route) {
            PlayersScreen()
        }
    }
}
