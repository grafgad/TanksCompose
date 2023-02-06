package com.example.tankscompose.screens.mainscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.tankscompose.R
import com.example.tankscompose.theme.TanksTheme

@Composable
fun StartScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(TanksTheme.color.background)
            .statusBarsPadding()
    ) {
        Text(
            text = stringResource(id = R.string.stack),
            modifier = Modifier.align(Alignment.Center),
            color = TanksTheme.color.content,
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
fun StartScreenPreview() {
    StartScreen()
}