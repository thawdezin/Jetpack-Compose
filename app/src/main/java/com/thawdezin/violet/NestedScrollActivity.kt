package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.ScrollableRow
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

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
    Card(backgroundColor = Color.Yellow) {
        //Box(gravity = Alignment.Center){
            ScrollableRow() {
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
            //}
        }
    }
}

@Preview("AtoZ_Horizontal")
@Composable
fun aToZhorizontal() {
    Card(backgroundColor = Color.Green){
        //Box(gravity = Alignment.Center) {
            ScrollableColumn(isScrollEnabled = true) {
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
            //}
        }
    }
}

@Composable
fun aToZvertical() {
    Card(backgroundColor = Color.Red) {
        //Box(gravity = Alignment.Center){
            ScrollableRow() {
                Column {
                    for (i in 'a'..'z') {
                        if (i=='d') {
                            Box(modifier = Modifier.height(200.dp)) {
                                OneToHorizontal()
                            }
                            //Text("HERE")
                        } else {
                            Box(modifier = Modifier.height(100.dp), alignment = Alignment.Center) {
                                Text("$i")
                            }
                        }
                    }
                }
            //}
        }
    }
}


@Composable
fun OneToHorizontal(){
    Card(backgroundColor = Color.Blue){
        //Box(gravity = Alignment.Center) {
            ScrollableColumn(isScrollEnabled = true) {
                Row {
                    for (i in 1..100) {
                        if (i == 10) {
                            Box(modifier = Modifier.width(150.dp)){
                                OneVertical()
                            }
                        } else {

                                Box(modifier = Modifier.width(100.dp), alignment = Alignment.Center){
                                    Text(" $i ")
                                }

                        }
                    }
                }
           // }
        }
    }
}

@Composable
fun OneVertical(){
    Card(backgroundColor = Color.Magenta) {
        //Box(gravity = Alignment.Center){
            ScrollableRow() {
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
            //}
        }
    }
}

@Composable
fun TwoHorizontal(){
    Card(backgroundColor = Color.White){
        //Box(gravity = Alignment.Center) {
            ScrollableColumn(isScrollEnabled = true) {
                Row {
                    for (i in 1..100) {
                        Text(" $i ")
                    }
                }
            }
        //}
    }
}

