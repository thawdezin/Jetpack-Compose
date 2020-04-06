package com.thawdezin.violet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.compose.Model
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.core.setContent

import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.ColumnScope.weight
import androidx.ui.layout.Container

import androidx.ui.layout.LayoutPadding
import androidx.ui.layout.LayoutWidth
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Scaffold
import androidx.ui.material.Card
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
        Card(modifier = Modifier.weight(1f), color = Color.Green){
            Container(LayoutWeight(1f), expanded = true){
                if(state.count %2 == 0){
                    FirstView()
                }
                else{
                    SecondView()
                }
            }
        }
        Card(modifier = LayoutWeight(1f), color = Color.Yellow){
            Container(LayoutWeight(1f), expanded = true){
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
    Container(){
        Text("First View", style = TextStyle(color = Color.Green, fontSize = 32.sp))
    }

}

@Preview("Second View")
@Composable
fun SecondView(){
    Container() {
        Text("Second View", style = TextStyle(color = Color.Yellow, fontSize = 32.sp))
    }
}

