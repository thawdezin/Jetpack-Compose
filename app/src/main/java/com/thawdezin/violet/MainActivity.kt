package com.thawdezin.violet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Clip
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.background
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Scaffold
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            //MainContainer()
            var intent: Intent = Intent(application, TestActivity::class.java)


            Button(
                text = "Click Me",
            onClick = { startActivity(intent)}
            )
        }


    }
}

@Preview
@Composable
fun MainContainer() {
    //MaterialTheme {
        Scaffold {
        Stack {

            Align(Alignment.TopCenter) {
                Column(arrangement = Arrangement.Center) {
                    Container(
                        background(Color.Green),
                        alignment = Alignment.TopCenter,
                        //height = 350.dp,
                        width = 450.dp,
                        expanded = true
                    ) {
                        Text("Up")
                    }

                }
            }

            Align(alignment = Alignment.BottomCenter) {
                Column(background(Color.Yellow), arrangement = Arrangement.Center) {
                    Container(
                        alignment = Alignment.Center,
                        height = 350.dp,
                        width = 450.dp
                        //expanded = true
                    ) {
                        Text("Down")
                    }
                }
            }

            Align(Alignment.Center) {
                Column(background(Color.White), arrangement = Arrangement.Center) {
                    Container(alignment = Alignment.Center, height = 250.dp, width = 250.dp) {
                        Clip(shape = RoundedCornerShape(8.dp)) {
                            LoginContainer()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun LoginContainer() {
    Column {
        //val img = imageResource(id = R.drawable.ic_violet)
        //DrawImage(image = img)
        Text("Username")
        Text("Password")
        Button("Login")
    }
}

