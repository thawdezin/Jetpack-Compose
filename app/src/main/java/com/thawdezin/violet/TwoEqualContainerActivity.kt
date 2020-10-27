package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

class TwoEqualContainerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Row {
                    Box(modifier = Modifier.weight(1f),)} // backgroundColor = Color.Red) {
                        Column() {
                            Text(text = "Centered ", style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold))
                        }
                    }
                    Box(modifier = Modifier, alignment = Alignment.TopStart,){ //backgroundColor = Color.Green) {
                        Column {
                            Text(text = "Line One ", style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold))
                            Text(text = "Line Two ", style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold))
                        }
                    }
                }
            }
        }





