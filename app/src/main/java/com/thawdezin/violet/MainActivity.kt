package com.thawdezin.violet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.Model
import androidx.navigation.ActivityNavigatorExtras
import androidx.navigation.NavController
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.ui.NavigationUI
import androidx.ui.core.Alignment
import androidx.ui.core.Draw
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.SimpleImage
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Canvas
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.material.Button
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Scaffold
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.PxSize
import androidx.ui.unit.dp
import com.thawdezin.violet.R.drawable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mainContent()
            FragmentNavigatorExtras()
            ActivityNavigatorExtras()
        }
    }


    @Preview
    @Composable
    fun mainContent() {
        //MaterialTheme {
            //Scaffold {
                VerticalScroller {
                    Column  {
                        Container(expanded = true, alignment = Alignment.Center){
                            Button(
                                text = "Stack Layout",
                                onClick = { startActivity(Intent(application, StackLayoutActivity::class.java)) }
                            )
                        }
                        Divider(color = Color.Green, height = 3.dp)

                        Container(expanded = true, alignment = Alignment.Center){
                            Button(
                                text = "Nested Scroll View (RecyclerView)",
                                onClick = { startActivity(Intent(application, NestedScrollActivity::class.java)) }
                            )
                        }
                        Divider(color = Color.Green, height = 3.dp)

                        Container(expanded = true, alignment = Alignment.Center){
                            Button(
                                text = "Navigation",
                                onClick = { startActivity(Intent(application, BottomNavigation::class.java)) }
                            )
                        }
                        Divider(color = Color.Green, height = 3.dp)

                        Container(expanded = true, alignment = Alignment.Center){
                            Button(
                                text = "Image",
                                onClick = { startActivity(Intent(application, ImageActivity::class.java)) }
                            )
                        }
                        Divider(color = Color.Green, height = 3.dp)

                        Container(expanded = true, alignment = Alignment.Center){
                            Button(
                                text = "DateTimePicker",
                                onClick = { startActivity(Intent(application, DateTimeActivity::class.java)) }
                            )
                        }
                        Divider(color = Color.Green, height = 3.dp)
                    }
                }
           //}
        //}
    }
}//MainActivity





@Model
object NavController{
    var currentScreen: Screen = Screen.UserList
}

sealed class Screen{
    object UserList: Screen()
    data class UserDetails(val userId: String): Screen()
}

fun navigateTo(destination: Screen){
    //NavController.currentScreen = destination
}