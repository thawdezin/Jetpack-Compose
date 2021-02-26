package com.thawdezin.violet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.ComposeView

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class FragmentContainerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val manager: FragmentManager = fragmentManager
//        val transaction: FragmentTransaction = manager.beginTransaction()
//        transaction.add(R.id.container, YOUR_FRAGMENT_NAME, YOUR_FRAGMENT_STRING_TAG)
//        transaction.addToBackStack(null)
//        transaction.commit()
        setContentView(ComposeView(applicationContext).apply{
        setContent{

        }})
    }
}