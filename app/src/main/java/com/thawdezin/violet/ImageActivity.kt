package com.thawdezin.violet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.SimpleImage
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.res.imageResource

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            val img = imageResource(id = R.drawable.qr)
            Column{
                VerticalScroller() {
                    DrawImage(image = img)
                    DrawImage(image = imageResource(id = R.drawable.folder))
                    DrawImage(image = imageResource(id = R.drawable.house))
                    DrawImage(image = imageResource(id = R.drawable.qr))
                }

                //SimpleImage(imageResource(id = R.drawable.qr), tint = Color.Green)
            }
            //DrawImage(image = img)
            //SimpleImage(image = img, tint = Color.Green)
        }
    }
}

