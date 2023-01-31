package com.example.tankscompose.screens.mainscreen

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.tankscompose.theme.TanksTheme

@Composable
fun BottomNavigationBar(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val items = remember {
        listOf(
            NavigationItem.Players,
            NavigationItem.Clans
        )
    }
    BottomNavigation(
        modifier = modifier,
        backgroundColor = TanksTheme.color.background,
        contentColor = TanksTheme.color.content
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
            BottomNavigationItem(
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(
                        painterResource(id = item.iconRes),
                        contentDescription = stringResource(id = item.title),
                    )
                },
                label = { Text(text = stringResource(id = item.title)) },
                alwaysShowLabel = true,
                selectedContentColor = TanksTheme.color.primary,
                unselectedContentColor = TanksTheme.color.secondary
            )
        }
    }
}