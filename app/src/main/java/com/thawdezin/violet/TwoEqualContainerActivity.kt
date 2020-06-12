package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.Box
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.layout.RowScope.weight
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Card
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import kotlin.coroutines.Continuation

class TwoEqualContainerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                MaterialTheme {
                    Row {
                        Box(modifier = Modifier.weight(1f)) {
                            Column() {
                                Text(text = "Centered ", style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold))
                            }
                        }
                        Box(modifier = Modifier.weight(1f), gravity = Alignment.TopStart) {
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



