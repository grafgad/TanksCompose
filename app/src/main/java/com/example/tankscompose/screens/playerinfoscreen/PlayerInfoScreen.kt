package com.example.tankscompose.screens.playerinfoscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tankscompose.theme.TanksTheme

@Composable
fun PlayerInfoScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(TanksTheme.color.background)
            .statusBarsPadding()
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Player Name")
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Rating")
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Win percent")
            Spacer(modifier = Modifier.height(10.dp))
        }
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "in game since")
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "last battle")
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "battles played")
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "max destroyed")
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "max experience")
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "hits percent")
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "avg experience")
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "wins")
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "draws")
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "spotted enemies")
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "trees felled")
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Preview
@Composable
fun PlayerInfoScreenPreview() {
    PlayerInfoScreen()
}