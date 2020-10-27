package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

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
        Box {

            //Align(Alignment.TopCenter) {
            Column(verticalArrangement = Arrangement.Center) {
                Box(
                    //background(Color.Green),
                    alignment = Alignment.TopCenter,
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
                    alignment = Alignment.Center,
                    modifier = Modifier.width(200.dp).height(200.dp)
                    //expanded = true
                ) {
                    Text("Down")
                }
            }
            //}

            //Align(Alignment.Center) {
            Column(verticalArrangement = Arrangement.Center) {//background(Color.White),
                Box(alignment = Alignment.Center, modifier = Modifier.height(200.dp).width(200.dp)) {
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

