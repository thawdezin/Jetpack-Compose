package com.thawdezin.violet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Row
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Scaffold
import androidx.ui.tooling.preview.Preview

class NestedScrollActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            nestedScrollContent()
        }
    }
}

@Preview
@Composable
fun nestedScrollContent(){
    MaterialTheme {
        Scaffold {
            VerticalScroller {
                Column(){
                    for (i in 1 .. 100) {
                        if(i%10 == 0){
                            HorizontalScroller {
                                Row {
                                    for(i in 'a' .. 'z'){
                                        Text("\n  $i  \n")
                                    }
                                }
                            }
                        }
                        else{
                            Text("$i")
                        }
                        Divider(color = Color.Green)
                    }
                }
            }
        }
    }
}