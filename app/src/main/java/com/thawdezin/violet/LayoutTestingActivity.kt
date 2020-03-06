package com.thawdezin.violet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.AdapterList
import androidx.ui.foundation.Clickable
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.surface.Card
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp

class LayoutTestingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainView()
//                Row{
//                    Container(modifier = LayoutFlexible(1f), expanded = true) {
//
//                    }
//                }
        }
    }


    @Preview
    @Composable
    fun MainView() {
        AdapterList(
            data = (1..20).map { it }.toList()
        ) {
            if (it % 2 == 0) {
                Text("$it Even", style = TextStyle(fontSize = 40.sp, color = Color.Gray))
            } else {
                Text(text = "$it Odd", style = TextStyle(fontSize = 70.sp))
            }
        }
    }
}