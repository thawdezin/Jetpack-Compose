package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.Row
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Scaffold
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

class NestedScrollActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            nestedScrollContent()
        }
    }


    @Preview
    @Composable
    fun nestedScrollContent() {
        MaterialTheme {
            Scaffold {
                Container(width = 50.dp, height = 50.dp) {
                    VerticalScroller {
                        Column {
                            for (i in 1..100) {
                                if (i % 10 == 0) {
                                    Container(width = 50.dp, height = 50.dp) {
                                        HorizontalScroller {
                                            Row {
                                                for (a in 'a'..'z') {
                                                    if (a == 'f') {
                                                        Container(width = 50.dp, height = 50.dp) {
                                                            VerticalScroller {
                                                                Column {
                                                                    for (i in 1..100) {
                                                                        if (i % 10 == 0) {
                                                                            Container(width = 50.dp, height = 50.dp) {
                                                                                HorizontalScroller {
                                                                                    Row {
                                                                                        for (a in 'a'..'z') {
                                                                                            if (a == 'f') {
                                                                                                Text("OK :D")
                                                                                            } else {
                                                                                                Text("$a")
                                                                                            }
                                                                                        }
                                                                                        Divider(color = Color.Yellow)
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            Text("$i")
                                                                        }
                                                                        Divider(color = Color.Red)
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        Text("$a")
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    Text("$i")
                                }
                                Divider(color = Color.Green)
                            }
                        }
                    }
                }
            }
        }
    }
}