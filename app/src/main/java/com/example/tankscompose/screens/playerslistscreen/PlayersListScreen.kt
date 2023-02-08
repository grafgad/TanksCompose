package com.example.tankscompose.screens.playerslistscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.tankscompose.R
import com.example.tankscompose.navigation.ScreensNavigationItem
import com.example.tankscompose.theme.TanksTheme


@Composable
fun PlayersListScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    var player by remember {
        mutableStateOf("")
    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(TanksTheme.color.background)
            .statusBarsPadding()
            .padding(horizontal = 10.dp),

        ) {
        Text(
            text = stringResource(id = R.string.enter_player_name),
            style = TanksTheme.typography.h6
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = player,
            onValueChange = { player = it },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { navController.navigate(ScreensNavigationItem.PlayerInfoScreen.className) },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = stringResource(id = R.string.find_button_text))
        }
    }
}

@Preview
@Composable
fun PlayersListScreenPreview() {
    PlayersListScreen(
        navController = rememberNavController()
    )
}