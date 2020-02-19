package com.thawdezin.violet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.setContent
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.material.Button
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Scaffold
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mainContent()
        }
    }


    @Preview
    @Composable
    fun mainContent() {
        MaterialTheme {
            Scaffold {
                VerticalScroller {
                    Column  {
                        Container(expanded = true, alignment = Alignment.Center){
                            Button(
                                text = "Stack Layout",
                                onClick = { startActivity(Intent(application, StackLayoutActivity::class.java)) }
                            )
                        }
                        Divider(color = Color.Green, height = 3.dp)
                    }
                }
           }
        }
    }
}//MainActivity


