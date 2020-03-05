package com.thawdezin.violet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.compose.Model
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.background
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.FlexColumn
import androidx.ui.layout.LayoutPadding
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Scaffold
import androidx.ui.material.surface.Card
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp

@Model
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
        Card(modifier = LayoutFlexible(1f), color = Color.Green){
            Container(LayoutFlexible(1f), expanded = true){
                if(state.count %2 == 0){
                    FirstView()
                }
                else{
                    SecondView()
                }
            }
        }
        Card(modifier = LayoutFlexible(1f), color = Color.Yellow){
            Container(LayoutFlexible(1f), expanded = true){
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
    Container(background(Color.Black)){
        Text("First View", style = TextStyle(color = Color.Green, fontSize = 32.sp))
    }

}

@Preview("Second View")
@Composable
fun SecondView(){
    Container(background(Color.Red)) {
        Text("Second View", style = TextStyle(color = Color.Yellow, fontSize = 32.sp))
    }
}

