package com.thawdezin.violet

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ScrollableRow
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

/**
Adapter List ရော Scroller ရောကို Columnနဲ့ တွဲထည့်ထားရင် ၂ခုလုံး ပေါ်မလာဘူး
 */

@Immutable
class CheckState(var count: Int = 0)

class AdapterListVsScrollerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme() {
                val state = CheckState()
                Column() {
                    MainView(state = state) // Overlap with Button
                    Button(onClick = {
                        Toast.makeText(applicationContext, "Button", Toast.LENGTH_SHORT).show()
                    }) {
                        Text("Button")
                    }
                    ScrollView(state = state) // No overlap with Button
                }
            }

        }
    }

    @Composable
    fun MainView(state: CheckState) {

    }

    @androidx.compose.runtime.Composable
    fun ScrollView(state: CheckState) {
        ScrollableRow() {
            Column() {
                for (i in state.count..32) {
                    if (i % 2 == 0) {
                        Text("$i Even", style = TextStyle(fontSize = 40.sp, color = Color.Red))
                    } else {
                        Text(text = "$i Odd", style = TextStyle(fontSize = 70.sp))
                    }
                }
            }
        }
    }
}