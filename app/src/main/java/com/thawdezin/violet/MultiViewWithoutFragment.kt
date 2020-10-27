package com.thawdezin.violet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview

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
        Card(modifier = Modifier.weight(1f), backgroundColor = Color.Green){
            Box(modifier = Modifier.weight(1f)){
                if(state.count %2 == 0){
                    FirstView()
                }
                else{
                    SecondView()
                }
            }
        }
        Card(modifier = Modifier.weight(1f, true), backgroundColor = Color.Yellow){
            //Box(){
                Button(onClick = {state.count++}){
                    Text("Click me to see what happens")
                }
            //}
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

