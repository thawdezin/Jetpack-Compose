package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.Immutable
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Box
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Row
import androidx.ui.material.Button
import androidx.ui.material.Card
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Scaffold

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
                    Box(Modifier.weight(1f)) {
                        Button(onClick = { state.count++ }) {
                            Text("Click to Increase 1")
                        }
                    }
                    Box(Modifier.weight(1f)) {
                        Button(onClick = { state.count-- }) {
                            Text("Click to decrease 1")
                        }
                    }
                    Box(Modifier.weight(1f)) {
                        Button(onClick = { state.count = 0 }) {
                            Text("Click to Reset")
                        }
                    }
                }
            }
            Card(modifier = Modifier.weight(8f), color = Color.Green) {
                //LayoutPlaygroundScrollerView()
                Box(modifier = Modifier.weight(8f)) {
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
                    Box() {
                        Text("$i")
                    }
                }
            }
        }
    }
}
