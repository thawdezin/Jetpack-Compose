package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.background
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Card
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import kotlin.coroutines.Continuation

class CenterElementInColumnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                MaterialTheme {
                    Row {
                        Container(modifier = LayoutFlexible(1f), alignment = Alignment.TopCenter, expanded = true) {
                            Column() {
                                Text(text = "Centered ", style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold))
                            }
                        }
                        Container(modifier = LayoutFlexible(1f), alignment = Alignment.TopLeft, expanded = true) {
                            Column {
                                Text(text = "Line One ", style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold))
                                Text(text = "Line Two ", style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold))
                            }
                        }
                    }
                }
            }
        }
    }
}



