package com.thawdezin.violet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.SimpleImage
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.res.imageResource
import androidx.ui.unit.dp

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            val img = imageResource(id = R.drawable.qr)
            Column{
                Container(width= 50.dp, height = 50.dp){
                    DrawImage(image = img)
                }



                //SimpleImage(imageResource(id = R.drawable.qr), tint = Color.Green)
            }
            //DrawImage(image = img)
            //SimpleImage(image = img, tint = Color.Green)
        }
    }
}

