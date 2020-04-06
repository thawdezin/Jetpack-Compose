package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.foundation.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.Center
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.Row
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
            Container(expanded = true) {
                oneToVertical()
            }
        }
    }
}

@Composable
fun oneToVertical() {
    Card(color = Color.Yellow) {
        Container(alignment = Alignment.Center, expanded = true){
            VerticalScroller {
                Column {
                    for (i in 1..100) {
                        if (i == 20) {
                            Container(height = 300.dp) { // The height of Green
                                aToZhorizontal()
                            }
                            //Text("HERE")
                        } else {
                            Container(height = 100.dp){ // height of Numbers
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
        Container(alignment = Alignment.Center, expanded = true) {
            HorizontalScroller(isScrollable = true) {
                Row {
                    for (i in 'a'..'z') {
                        if (i == 'd') {
                            Container(width = 300.dp){
                                aToZvertical()
                            }
                        } else {
                            Center(){
                                Container(width = 100.dp){
                                    Text(" $i ")
                                }
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
        Container(alignment = Alignment.Center, expanded = true){
            VerticalScroller {
                Column {
                    for (i in 'a'..'z') {
                        if (i=='d') {
                            Container(height = 200.dp) {
                                OneToHorizontal()
                            }
                            //Text("HERE")
                        } else {
                            Center(){
                                Container(height = 100.dp){
                                    Text("$i")
                                }
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
        Container(alignment = Alignment.Center, expanded = true) {
            HorizontalScroller(isScrollable = true) {
                Row {
                    for (i in 1..100) {
                        if (i == 10) {
                            Container(width = 150.dp){
                                OneVertical()
                            }
                        } else {
                            Center(){
                                Container(width = 100.dp){
                                    Text(" $i ")
                                }
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
        Container(alignment = Alignment.Center, expanded = true){
            VerticalScroller {
                Column {
                    for (i in 'a'..'z') {
                        if (i=='d') {
                            Container(height = 150.dp) {
                                TwoHorizontal()
                            }
                            //Text("HERE")
                        } else {
                            Center(){
                                Container(height = 100.dp){
                                    Text("$i")
                                }
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
        Container(alignment = Alignment.Center, expanded = true) {
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

