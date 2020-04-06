package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
//import androidx.ui.core.Clip
//import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.Container
import androidx.ui.layout.Row
import androidx.ui.material.Card
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Scaffold
//import androidx.ui.material.surface.Card
import androidx.ui.text.style.TextOverflow
import androidx.ui.unit.dp


class RallyActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                MaterialTheme() {

                }
                Card(){}
                Container(){}
                Row(){}
                //TextOverflow.Clip(shape = RoundedCornerShape(20.dp)) {}
            }
        }
}