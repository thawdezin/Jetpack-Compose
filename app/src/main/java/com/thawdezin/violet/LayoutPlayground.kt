package com.thawdezin.violet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.ui.core.setContent
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Padding
import androidx.ui.material.surface.Card
import androidx.ui.unit.dp

class LayoutPlayground : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Column() {
                Card(modifier = LayoutFlexible(1f), color = Color.Yellow){

                }
                Card(modifier = LayoutFlexible(8f), color = Color.Green){

                }
            }
        }
    }
}