package com.thawdezin.violet.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.layout.Center
import androidx.ui.layout.FlexColumn
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import com.thawdezin.violet.R

class ThawFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentView = inflater.inflate(R.layout.fragment_thaw, container, false)

        (fragmentView as ViewGroup).setContent {
            Hello("Jetpack Compose")
        }
        return fragmentView
    }

    @Composable
    fun Hello(name: String) = MaterialTheme {
        FlexColumn {
            inflexible {
                // Item height will be equal content height
                TopAppBar( // App Bar with title
                    title = { Text("Jetpack Compose Sample") }
                )
            }
            expanded(1F) {
                // occupy whole empty space in the Column
                Center {
                    // Center content
                    Text("Hello $name!") // Text label
                }
            }
        }
    }
}