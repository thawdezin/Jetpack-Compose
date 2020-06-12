package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Alignment.Companion.Center
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.Box
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Scaffold
import androidx.ui.material.Card
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

class NestedScrollActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            nestedScrollContent()
        }
    }
}

@Preview
@Composable
fun nestedScrollContent() {
    MaterialTheme {
        Scaffold {
                oneToVertical()
        }
    }
}

@Composable
fun oneToVertical() {
    Card(color = Color.Yellow) {
        Box(gravity = Alignment.Center){
            VerticalScroller {
                Column {
                    for (i in 1..100) {
                        if (i == 20) {
                            Box(modifier = Modifier.height(300.dp)) { // The height of Green
                                aToZhorizontal()
                            }
                            //Text("HERE")
                        } else {
                            Box(modifier = Modifier.height(100.dp)){ // height of Numbers
                                Text("$i")
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview("AtoZ_Horizontal")
@Composable
fun aToZhorizontal() {
    Card(color = Color.Green){
        Box(gravity = Alignment.Center) {
            HorizontalScroller(isScrollable = true) {
                Row {
                    for (i in 'a'..'z') {
                        if (i == 'd') {
                            Box(modifier = Modifier.width(300.dp)){
                                aToZvertical()
                            }
                        } else {

                                Box(modifier = Modifier.width(100.dp)){
                                    Text(" $i ")
                                }

                        }
                    }
                }
            }
        }
    }
}

@Composable
fun aToZvertical() {
    Card(color = Color.Red) {
        Box(gravity = Alignment.Center){
            VerticalScroller {
                Column {
                    for (i in 'a'..'z') {
                        if (i=='d') {
                            Box(modifier = Modifier.height(200.dp)) {
                                OneToHorizontal()
                            }
                            //Text("HERE")
                        } else {
                            Box(modifier = Modifier.height(100.dp), gravity = Alignment.Center) {
                                Text("$i")
                            }
                        }
                    }
                }
            }
        }
    }
}


@Composable
fun OneToHorizontal(){
    Card(color = Color.Blue){
        Box(gravity = Alignment.Center) {
            HorizontalScroller(isScrollable = true) {
                Row {
                    for (i in 1..100) {
                        if (i == 10) {
                            Box(modifier = Modifier.width(150.dp)){
                                OneVertical()
                            }
                        } else {

                                Box(modifier = Modifier.width(100.dp), gravity = Alignment.Center){
                                    Text(" $i ")
                                }

                        }
                    }
                }
            }
        }
    }
}

@Composable
fun OneVertical(){
    Card(color = Color.Magenta) {
        Box(gravity = Alignment.Center){
            VerticalScroller {
                Column {
                    for (i in 'a'..'z') {
                        if (i=='d') {
                            Box(modifier = Modifier.height(150.dp)) {
                                TwoHorizontal()
                            }
                            //Text("HERE")
                        } else {
                                Box(modifier = Modifier.height(100.dp)){
                                    Text("$i")
                                }

                        }
                    }
                }
            }
        }
    }
}

@Composable
fun TwoHorizontal(){
    Card(color = Color.White){
        Box(gravity = Alignment.Center) {
            HorizontalScroller(isScrollable = true) {
                Row {
                    for (i in 1..100) {
                        Text(" $i ")
                    }
                }
            }
        }
    }
}

