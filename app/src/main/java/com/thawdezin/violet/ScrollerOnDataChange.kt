package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ScrollableRow
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent


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
            Card(modifier = Modifier.weight(1f), backgroundColor = Color.Yellow) {
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
            Card(modifier = Modifier.weight(8f), backgroundColor = Color.Green) {
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
        ScrollableRow() {
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
