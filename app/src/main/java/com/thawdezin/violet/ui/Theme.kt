package com.thawdezin.violet.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

//private val DarkColorPalette = darkColorPalette(
//        primary = purple200,
//        primaryVariant = purple700,
//        secondary = teal200
//)
//
//private val LightColorPalette = lightColorPalette(
//        primary = purple500,
//        primaryVariant = purple700,
//        secondary = teal200
//
//        /* Other default colors to override
//    background = Color.White,
//    surface = Color.White,
//    onPrimary = Color.White,
//    onSecondary = Color.Black,
//    onBackground = Color.Black,
//    onSurface = Color.Black,
//    */
//)

@Composable
fun VioletTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        //DarkColorPalette
    } else {
        //LightColorPalette
    }

    MaterialTheme(
            typography = typography,
            shapes = shapes,
            content = content
    )
}