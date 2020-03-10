package com.thawdezin.violet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.ui.core.Alignment
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.layout.Align
import androidx.ui.layout.Column
import androidx.ui.layout.LayoutPadding
import androidx.ui.unit.dp

class TestingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Column(LayoutPadding(20.dp)) {
                Column(){
                    Text(text = "0")
                    Align(alignment = Alignment.TopRight) {
                        Text(text = "testOperation")
                    }
                }
            }
        }
    }
}

