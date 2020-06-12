package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Box
import androidx.ui.foundation.Text
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.Scaffold
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

class StackLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContainer()
        }
    }
}


@Preview
@Composable
fun MainContainer() {
    //MaterialTheme {
    Scaffold {
        Stack {

            //Align(Alignment.TopCenter) {
            Column(verticalArrangement = Arrangement.Center) {
                Box(
                    //background(Color.Green),
                    gravity = Alignment.TopCenter,
                    //height = 350.dp,
                    modifier = Modifier.width(450.dp).width(350.dp)
                ) {
                    Text("Up")
                }

            }
            //}

            //Align(alignment = Alignment.BottomCenter) {
            Column(//background(Color.Yellow),
                verticalArrangement = Arrangement.Center
            ) {
                Box(
                    gravity = Alignment.Center,
                    modifier = Modifier.width(200.dp).height(200.dp)
                    //expanded = true
                ) {
                    Text("Down")
                }
            }
            //}

            //Align(Alignment.Center) {
            Column(verticalArrangement = Arrangement.Center) {//background(Color.White),
                Box(gravity = Alignment.Center, modifier = Modifier.height(200.dp).width(200.dp)) {
                    //TextOverflow.Clip(shape = RoundedCornerShape(8.dp)) {
                    LoginContainer()
                    //}
                }
            }
            //}
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
        Button(onClick = {}) {
            Text("Login")
        }
    }
}

