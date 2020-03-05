package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.Model
import androidx.ui.core.Alignment
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.Row
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Scaffold
import androidx.ui.material.surface.Card

@Model
class ModelClass(var count: Int = 0)

class LayoutPlayground : AppCompatActivity() {
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
            Card(modifier = LayoutFlexible(1f), color = Color.Yellow) {
                //LayoutPlaygroundButtonView()
                Row(){
                    Container(LayoutFlexible(1f), expanded = true) {
                        Button(onClick = {state.count++} , text = "Click to Increase 1")
                    }
                    Container(LayoutFlexible(1f), expanded = true) {
                        Button(onClick = {state.count--} , text = "Click to decrease 1")
                    }
                    Container(LayoutFlexible(1f), expanded = true) {
                        Button(onClick = {state.count = 0} , text = "Click to Reset")
                    }
                }
            }
            Card(modifier = LayoutFlexible(8f), color = Color.Green) {
                //LayoutPlaygroundScrollerView()
                Container(LayoutFlexible(1f), expanded = true) {
                    Text("B")
                }
            }
        }
    }
}

//    @Composable
//    fun LayoutPlaygroundButtonView() {
//        Container(modifier = LF(1f), expanded = true) {
//            Text("B")
//        }
//    }
//
//    @Composable
//    fun LayoutPlaygroundScrollerView() {
//        Container(LayoutFlexible(1f), expanded = true) {
//            Text("B")
//        }
//    }