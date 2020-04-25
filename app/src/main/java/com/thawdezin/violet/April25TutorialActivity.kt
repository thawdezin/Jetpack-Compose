package com.thawdezin.violet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.compose.Model
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.tooling.preview.Preview

class April25TutorialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MaterialTheme() {
                April25()
            }
        }
    }

    @Preview
    @Composable
    fun April25(){
        val click = ClickCount()
        Column{
            TopAppBar(title = {
                Text("This is Toolbar")
            },color = Color.Magenta)

            Text(text = "This is Text")
            Button(onClick = {click.count++},contentColor = Color.Red){
                Text("Click ${click.count}")
            }

            Button(onClick = {startActivity(Intent(this@April25TutorialActivity,MainActivity::class.java))}){
                Text("Go")
            }

        }
    }

    @Model
    class ClickCount(var count: Int = 0)
}