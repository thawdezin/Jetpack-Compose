package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.platform.ComposeView

class RallyActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            val a = ComposeView(applicationContext).apply{
                setContent {
                    MaterialTheme() {

                    }
                    Card(){}
                    Row(){}
                }

            }
        }
}