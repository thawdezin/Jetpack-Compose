package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.Model
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.layout.ColumnScope.weight
import androidx.ui.material.Button
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Scaffold
import androidx.ui.material.Card
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

@Model
class ModelClass(var count: Int = 0)

class ScrollerOnDataChange : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme() {
                Scaffold() {
                    val state = ModelClass()
                    LayoutPlaygroundFirstView(state)
                }
            }
        }
    }

    @Composable
    fun LayoutPlaygroundFirstView(state: ModelClass) {
        Column {
            Card(modifier = Modifier.weight(1f), color = Color.Yellow) {
                //LayoutPlaygroundButtonView()
                Row() {
                    Container(Modifier.weight(1f), expanded = true) {
                        Button(onClick = { state.count++ }){
                            Text("Click to Increase 1")
                        }
                    }
                    Container(Modifier.weight(1f), expanded = true) {
                        Button(onClick = { state.count-- }){
                            Text("Click to decrease 1")
                        }
                    }
                    Container(Modifier.weight(1f), expanded = true) {
                        Button(onClick = { state.count = 0 }){
                            Text("Click to Reset")
                        }
                    }
                }
            }
            Card(modifier = Modifier.weight(8f), color = Color.Green) {
                //LayoutPlaygroundScrollerView()
               Container(modifier = LayoutWeight(8f), expanded = true) {
                    oneToVertical(state)
                }
            }
        }
    }

    @Composable
    fun nestedScrollContent(state: ModelClass) {
        val st = state
        oneToVertical(st)
    }

    @Composable
    fun oneToVertical(state: ModelClass) {
        VerticalScroller() {
            Column {
                for (i in state.count..100) {
                    Container(height = 100.dp, expanded = true){
                        Text("$i")
                    }
                }
            }
        }
    }
}
