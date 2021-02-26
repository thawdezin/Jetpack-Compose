package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView

import androidx.compose.ui.unit.dp

class TestingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ComposeView(applicationContext).apply {
            setContent {
                Column(Modifier.padding(20.dp)) {
                    Column() {
                        Text(text = "0")
                        //Ali(alignment = Alignment.TopEnd) {
                        Text(text = "testOperation")
                        //}
                    }
                }
            }
        })
    }
}

