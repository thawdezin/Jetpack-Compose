package com.thawdezin.violet

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.ambient
import androidx.ui.core.Alignment
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.graphics.Color
import androidx.ui.graphics.Image
import androidx.ui.graphics.ImageConfig
import androidx.ui.graphics.colorspace.ColorSpaces
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.material.AppBarIcon
import androidx.ui.material.BottomAppBar
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview

class BottomNavigation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                AppBars()

        }
    }


}


@Composable
fun AppBars() {
    val context = ambient(ContextAmbient)

    Column {
        TopAppBar(
            navigationIcon = {
                AppBarIcon(
                    //imageResource(
                    Image(3, 3, ImageConfig.Argb8888, true, ColorSpaces.Srgb)

                ) { Toast.makeText(context, "Menu", Toast.LENGTH_LONG).show() }
            },
            title = { Text(text = "Jetpack Compose") }, actionData = listOf(
                Image(3, 3, ImageConfig.Argb8888, true, ColorSpaces.Srgb)
            )
        )
        { actionImage ->
            AppBarIcon(actionImage) { Toast.makeText(context, "Search", Toast.LENGTH_LONG).show() }
        }

        Container(alignment = Alignment.BottomCenter, expanded = true) {
            BottomAppBar(
                color = Color.Green,
                navigationIcon = {
                    AppBarIcon(
                        Image(3, 3, ImageConfig.Argb8888, true, ColorSpaces.Ntsc1953)
                    ) {
                        Toast.makeText(context, "Home", Toast.LENGTH_LONG).show()
                    }
                }
                ,
//                fabConfiguration = BottomAppBar.FabConfiguration(cutoutShape = CircleShape) {
//                    FloatingActionButton(
//                        color = (+MaterialTheme.colors()).secondary,
//                        icon = +imageResource(R.drawable.ic_violet),
//                        onClick = { Toast.makeText(context, "Fab", Toast.LENGTH_LONG).show() })
//                },
                actionData = listOf(
                    Image(12, 13, ImageConfig.Argb8888, true, ColorSpaces.Ntsc1953),
                    Image(33, 33, ImageConfig.Rgb565, false, ColorSpaces.Acescg),
                    Image(23, 23, ImageConfig.F16, true, ColorSpaces.SmpteC),
                    Image(23, 23, ImageConfig.F16, true, ColorSpaces.SmpteC)



                )
            ) { actionImage ->
                AppBarIcon(actionImage) {
                    Toast.makeText(context, "Profile", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}

