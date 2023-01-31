package com.example.tankscompose.ui.theme

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.LocalContentColor
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Immutable
data class TanksColors(
    val primary: Color,
    val primaryVariant: Color,
    val secondary: Color,
    val background: Color,
    val content: Color,
)

val LocalTanksColors = staticCompositionLocalOf {
    TanksColors(
        primary = Color.Unspecified,
        primaryVariant = Color.Unspecified,
        secondary = Color.Unspecified,
        background = Color.Unspecified,
        content = Color.Unspecified
    )
}

val LocalTanksTypography = staticCompositionLocalOf {
    TanksTypography()
}

val LocalTanksElevation = staticCompositionLocalOf {
    TanksElevation(
        default = 4.dp,
        pressed = 8.dp
    )
}

@Immutable
private object TanksRippleTheme : RippleTheme {

    @Composable
    override fun defaultColor() =
        RippleTheme.defaultRippleColor(LocalContentColor.current, lightTheme = true)

    @Composable
    override fun rippleAlpha() = DefaultRippleAlpha
}

private val DefaultRippleAlpha = RippleAlpha(
    pressedAlpha = 0.12f,
    focusedAlpha = 0.12f,
    draggedAlpha = 0.16f,
    hoveredAlpha = 0.08f
)

private val DarkColorPalette = TanksColors(
    primary = AppColors.CustomBlue,
    primaryVariant = Color.Unspecified,
    secondary = AppColors.Black.copy(alpha = 0.4f),
    background = AppColors.BackgroundDark,
    content = AppColors.CustomGray
)

private val LightColorPalette = TanksColors(
    primary = AppColors.CustomBlue,
    primaryVariant = Color.Unspecified,
    secondary = AppColors.Black.copy(alpha = 0.4f),
    background = AppColors.BackgroundDark,
    content = AppColors.CustomGray
)

@Composable
fun TanksTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val tanksColors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    CompositionLocalProvider(
        LocalTanksColors provides tanksColors,
        LocalTanksTypography provides TanksTheme.typography,
        LocalTanksElevation provides TanksTheme.elevation,
        LocalContentColor provides TanksTheme.color.content,
        LocalIndication provides rememberRipple(),
        LocalRippleTheme provides TanksRippleTheme,
        content = content
    )
}

object TanksTheme {
    val color: TanksColors
        @Composable
        get() = LocalTanksColors.current
    val typography: TanksTypography
        @Composable
        get() = LocalTanksTypography.current
    val elevation: TanksElevation
        @Composable
        get() = LocalTanksElevation.current
}