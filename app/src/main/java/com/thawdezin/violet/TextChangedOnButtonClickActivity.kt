package com.thawdezin.violet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.compose.Model
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.layout.Column
import androidx.ui.material.Button
import androidx.ui.tooling.preview.Preview

@Model
class CounterState(var count: Int = 0)

@Model
class TextChanged(var changedText: String = " ")

val tdz = "Thaw De Zin"
var cou = 0

class TextChangedOnButtonClickActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
           PrimaryView()
        }
    }
}

@Preview
@Composable
fun PrimaryView(){
    val couState: CounterState = CounterState()
    CallSecondView(couState)
}

@Composable
fun CallSecondView(state: CounterState) {
    Column() {
        Text("${state.count}")
        Button(text = "I've been clicked ${state.count} times",
            onClick = {
                state.count++
            })
    }
}

