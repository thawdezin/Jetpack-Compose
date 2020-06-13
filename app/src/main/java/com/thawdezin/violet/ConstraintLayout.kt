package com.thawdezin.violet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.core.tag
import androidx.ui.foundation.Box
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview

class ConstraintLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MaterialTheme() {
//                Box(
//                    //gravity = Alignment.BottomCenter,
//                    modifier = Modifier.fillMaxWidth().fillMaxHeight(),
//                    backgroundColor = Color.Green
//                ) {
//
//                }
                TestConstraintLayout()
            }
        }
    }
}

@Preview("Constraint Layout")
@Composable
fun TestConstraintLayout(){
    var amountTag = "N"
    ConstraintLayout(
        modifier = Modifier.fillMaxHeight().fillMaxWidth(),
        constraintSet = ConstraintSet{
//        val decreaseTag = "Tag"
//        val decreaseConstraint = tag(decreaseTag).apply {
//            left constrainTo parent.left
//        }

            tag(amountTag).apply {
                //left constrainTo parent.left
                bottom constrainTo parent.bottom
                right constrainTo parent.right
                //top constrainTo parent.top
//                centerHorizontally()
//                centerVertically()
            }
    }) {
        Text(text = "OK Constraint Layout", modifier = Modifier.tag(amountTag))
    }
}