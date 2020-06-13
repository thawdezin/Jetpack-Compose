package com.thawdezin.violet

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.Immutable
import androidx.ui.core.setContent
import androidx.ui.foundation.AdapterList
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.text.TextStyle
import androidx.ui.unit.sp

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
        AdapterList(
            data = (0..32).map { it }.toList()
        ) {
            if (it % 2 == 0) {
                Text("$it Even", style = TextStyle(fontSize = 40.sp, color = Color.Green))
            } else {
                Text(text = "$it Odd", style = TextStyle(fontSize = 70.sp))
            }
        }
    }

    @Composable
    fun ScrollView(state: CheckState) {
        VerticalScroller(isScrollable = true) {
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