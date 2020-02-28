package com.thawdezin.violet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.setContent
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.graphics.Image
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
                        showButton("Stack Layout", StackLayoutActivity::class.javaObjectType as Class<Any>?)
                        showButton("Nested Scroll Activity", NestedScrollActivity::class.javaObjectType as Class<Any>?)
                        showButton("Navigation", BottomNavigation::class.javaObjectType as Class<Any>?)
                        showButton("Image", ImageActivity::class.javaObjectType as Class<Any>?)
                        showButton("Date Time Picker", DateTimeActivity::class.javaObjectType as Class<Any>)
                        showButton("Image via btn", DateTimeActivity::class.javaObjectType as Class<Any>?)
                    }
                }
           }
        }
    }

    private fun showButton(text:String = "Button", goTo: Class<Any>?) {
        Container(expanded = true, alignment = Alignment.Center) {
            Button(
                text = text,
                onClick = { startActivity(Intent(applicationContext, goTo)) }
            )
        }
        Divider(color = Color.Green, height = 3.dp)
    }
}//MainActivity





