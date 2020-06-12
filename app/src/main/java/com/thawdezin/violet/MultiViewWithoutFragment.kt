package com.thawdezin.violet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.compose.Immutable

import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.Box

import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Scaffold
import androidx.ui.material.Card
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.sp

@Immutable
class Changes(var count: Int = 0)

class MultiViewWithoutFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            val state = Changes()
            MaterialTheme() {
                Scaffold() {
                    primaryView(state)
                }
            }
        }
    }
}


@Composable
private fun primaryView(state: Changes) {
    Column(){
        Card(modifier = Modifier.weight(1f), color = Color.Green){
            Box(modifier = Modifier.weight(1f)){
                if(state.count %2 == 0){
                    FirstView()
                }
                else{
                    SecondView()
                }
            }
        }
        Card(modifier = Modifier.weight(1f), color = Color.Yellow){
            Box(){
                Button(onClick = {state.count++}){
                    Text("Click me to see what happens")
                }
            }
        }
    }
}

@Preview("First View")
@Composable
fun FirstView(){
    Box(){
        Text("First View", style = TextStyle(color = Color.Green, fontSize = 32.sp))
    }

}

@Preview("Second View")
@Composable
fun SecondView(){
    Box() {
        Text("Second View", style = TextStyle(color = Color.Yellow, fontSize = 32.sp))
    }
}

