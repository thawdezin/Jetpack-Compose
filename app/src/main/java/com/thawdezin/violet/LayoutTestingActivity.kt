package com.thawdezin.violet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.compose.Model
import androidx.ui.core.Alignment
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.AdapterList
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.surface.Card
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp

@Model
class CheckState(var count: Int = 0)

class LayoutTestingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val state = CheckState()
            Column(){
                Button(){
                    Text("Button")
                }
                MainView(state = state) // Overlap with Button
                ScrollView(state = state) // No overlap with Button
            }
        }
    }

    @Composable
    fun MainView(state: CheckState) {
        AdapterList(
            data = (0..12).map { it }.toList()
        ) {
            if (it % 2 == 0) {
                Text("$it Even", style = TextStyle(fontSize = 40.sp, color = Color.Gray))
            } else {
                Text(text = "$it Odd", style = TextStyle(fontSize = 70.sp))
            }
        }
    }

    @Composable
    fun ScrollView(state: CheckState){
        VerticalScroller(isScrollable = true) {
            Column(){
                for (i in state.count..12){
                    if (i % 2 == 0) {
                        Text("$i Even", style = TextStyle(fontSize = 40.sp, color = Color.Gray))
                    } else {
                        Text(text = "$i Odd", style = TextStyle(fontSize = 70.sp))
                    }
                }
            }
        }
    }
}