package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
//import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.platform.setContent
//import androidx.ui.core.Clip
//import androidx.ui.core.Text
//import androidx.ui.core.setContent
//import androidx.ui.foundation.shape.corner.RoundedCornerShape
//import androidx.ui.layout.Row
//import androidx.ui.material.Card
//import androidx.ui.material.MaterialTheme
//import androidx.ui.material.Scaffold
//import androidx.ui.material.surface.Card
//import androidx.ui.text.style.TextOverflow
//import androidx.ui.unit.dp


class RallyActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                MaterialTheme() {

                }
                Card(){}
                Row(){}
                //TextOverflow.Clip(shape = RoundedCornerShape(20.dp)) {}
            }
        }
}