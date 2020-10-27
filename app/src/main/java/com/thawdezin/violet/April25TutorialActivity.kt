package com.thawdezin.violet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
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
            },backgroundColor = Color.Magenta)

            Text(text = "This is Text")
            Button(onClick = {click.count++},contentColor = Color.Red){
                Text("Click ${click.count}")
            }

            Button(onClick = {startActivity(Intent(this@April25TutorialActivity,MainActivity::class.java))}){
                Text("Go")
            }

        }
    }

    @Immutable
    class ClickCount(var count: Int = 0)
}