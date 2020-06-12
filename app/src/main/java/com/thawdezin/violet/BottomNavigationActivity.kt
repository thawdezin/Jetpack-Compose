package com.thawdezin.violet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.ui.core.Alignment
import androidx.ui.core.setContent
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.foundation.Image
import androidx.ui.graphics.imageFromResource
import androidx.ui.layout.Column
import androidx.ui.material.*
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

class BottomNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            //val img = imageResource(R.drawable.ic_menu_camera)
            //BottomAppBarNoFab(getMyActionImage = { img }, getMyNavigationImage = { img })
        }
        
    }

//    @Composable
//    fun BottomAppBarNoFab(getMyActionImage: () -> Image?, getMyNavigationImage: () -> Image?) {
//        val someActionImage: Image? = getMyActionImage()
//        val someNavigationImage: Image? = getMyNavigationImage()
//        val navigationIcon: @Composable() () -> Unit = {
//            someNavigationImage?.let { AppBarIcon(it) { /* doSomething()*/ } }
//        }
//        val actionData = listOf(someActionImage)
//        BottomAppBar(
//            navigationIcon = navigationIcon,
//            actionData = actionData
//        ) { actionImage ->
//            actionImage?.let { AppBarIcon(it) { /* doSomething()*/ } }
//        }
//    }
}

