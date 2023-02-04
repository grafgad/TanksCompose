package com.example.tankscompose.screens.clanslistscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tankscompose.R
import com.example.tankscompose.theme.TanksTheme

@Composable
fun ClansListScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    var text by remember {
        mutableStateOf("")
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(TanksTheme.color.background)
            .statusBarsPadding()
    ) {
        Text(text = stringResource(id = R.string.enter_clan_name))
        Spacer(modifier = modifier.height(10.dp))
        OutlinedTextField(
            value = text,
            onValueChange = { text = it }
        )
        Spacer(modifier = modifier.height(10.dp))
        Button(onClick = { navController.navigate("ClanInfoScreen") }) {
            Text(text = stringResource(id = R.string.find_button_text))
        }
    }
}

//@Preview
//@Composable
//fun ClansListScreenPreview() {
//    ClansListScreen()
//}