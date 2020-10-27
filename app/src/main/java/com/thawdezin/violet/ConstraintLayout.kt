package com.thawdezin.violet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.ConstraintSet
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
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
//    val amountTag = "N"
//    ConstraintLayout(
//        modifier = Modifier.fillMaxHeight().fillMaxWidth(),
//        constraintSet = ConstraintSet{
////        val decreaseTag = "Tag"
////        val decreaseConstraint = tag(decreaseTag).apply {
////            left constrainTo parent.left
////        }
//
//            tag(amountTag).apply {
//                //left constrainTo parent.left
//                bottom constrainTo parent.bottom
//                right constrainTo parent.right
//                //top constrainTo parent.top
////                centerHorizontally()
////                centerVertically()
//            }
//    }) {
//        Text(text = "OK Constraint Layout", modifier = Modifier.tag(amountTag))
//    }
}