package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.navigation.Navigator
import androidx.ui.core.Alignment
import androidx.ui.core.AnimationClockAmbient
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.ScrollerPosition
import androidx.ui.foundation.VerticalScroller

import androidx.ui.graphics.Color
import androidx.ui.layout.Center
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.Row
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Scaffold
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
@Composable fun nestedScrollContent() {
    MaterialTheme {
        Scaffold {
            oneToVertical()
        }
    }
}


@Preview
@Composable
fun oneToHorizontal(){
    Container(alignment = Alignment.Center){
        HorizontalScroller {
            Row {
                for (i in 1..100){
                    Center{
                        Container(width = 60.dp, height = 60.dp, alignment = Alignment.Center){ //background(Color.Transparent),
                            Text("$i")
                        }
                    }

                }
                Divider(color = Color.Green)
            }
        }
    }
}


@Composable
fun oneToVertical(){
    Container(alignment = Alignment.Center){
        VerticalScroller {
            Column {
                for (i in 1..100){
                    if(i%20 == 0){
                        aToZhorizontal()
                    }else{
                        Text("$i")
                    }
                }
                Divider(color = Color.Green)
            }
        }
    }
}


@Composable
fun aToZhorizontal(){
    VerticalScroller {
        Column {
            for (i in 'a'..'z'){

                if(i == 'k'){
                    Center{
                        Container(width = 100.dp, height = 100.dp, alignment = Alignment.Center){ //background(Color.Green),
                            oneToHorizontal()
                        }
                    }

                }
                else{
                    Center{
                        Container(height = 100.dp, alignment = Alignment.Center){ //background(Color.Transparent),
                            Text("$i")
                        }
                    }
                }

            }
            Divider(color = Color.Red)
        }
    }
}


@Composable
fun aToZvertical(){
    VerticalScroller {
        Column {
            for (i in 'a'..'z'){

                if(i == 'k'){
                    Center{
                        Container(width = 100.dp, height = 100.dp, alignment = Alignment.Center){ //background(Color.Green),
                            oneToHorizontal()
                        }
                    }

                }
                else{
                    Center{
                        Container(height = 100.dp, alignment = Alignment.Center){ //background(Color.Transparent),
                            Text("$i")
                        }
                    }
                }

            }
            Divider(color = Color.Red)
        }
    }
}