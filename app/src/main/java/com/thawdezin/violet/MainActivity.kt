package com.thawdezin.violet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ScrollableRow
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
//import androidx.compose.foundation.Box
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
//import androidx.ui.core.Alignment
//import androidx.ui.core.setContent
//import androidx.ui.foundation.Box
//import androidx.ui.foundation.Text
//import androidx.ui.foundation.VerticalScroller
//import androidx.ui.graphics.Color
//import androidx.ui.layout.Column
//import androidx.ui.material.Button
//import androidx.ui.material.Divider
//import androidx.ui.material.MaterialTheme
//import androidx.ui.material.Scaffold
import androidx.ui.tooling.preview.Preview
//import androidx.ui.unit.dp

@Suppress("UNCHECKED_CAST")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mainContent()
        }
    }

    @Preview
    @Composable
    fun mainContent() {
        MaterialTheme {
            Scaffold {
                ScrollableRow() {
                    Column {
                        showButton(ConstraintLayout::class.javaObjectType as Class<Any>)
                        showButton(AdapterListVsScrollerActivity::class.javaObjectType as Class<Any>)
                        showButton(ScrollerOnDataChange::class.javaObjectType as Class<Any>)
                        showButton(StackLayoutActivity::class.javaObjectType as Class<Any>)
                        showButton(NestedScrollActivity::class.javaObjectType as Class<Any>)
                        showButton(ImageActivity::class.javaObjectType as Class<Any>)
                        showButton(DateTimeActivity::class.javaObjectType as Class<Any>)
                        showButton(DateTimeActivity::class.javaObjectType as Class<Any>)
                        showButton(TwoEqualContainerActivity::class.javaObjectType as Class<Any>)
                        showButton(BottomNavigationActivity::class.javaObjectType as Class<Any>)
                        showButton(TextChangedOnButtonClickActivity::class.javaObjectType as Class<Any>)
                        showButton(MultiViewWithoutFragment::class.javaObjectType as Class<Any>)
                        showButton(TestingActivity::class.javaObjectType as Class<Any>)
                        showButton(FullFeatureTableActivity::class.javaObjectType as Class<Any>)
                        showButton(DrawModel::class.javaObjectType as Class<Any>)
                        showButton(goTo = April25TutorialActivity::class.javaObjectType as Class<Any>)
                    }
                }
            }
        }
    }

    @Composable
    private fun showButton(goTo: Class<Any>?) {

        //val readableClassName = goTo!!.simpleName.split(("(?=\\p{Upper})").toRegex()).dropLastWhile { it.isEmpty() }
                //.toTypedArray().joinToString(prefix = "", postfix = "", separator = " ")
        val readableClassName = "Temp"
        //Box(gravity = Alignment.Center) {
            Button(
                backgroundColor = Color.Green,
                contentColor = Color.Black,
                elevation = 12.dp,
                onClick = { startActivity(Intent(applicationContext, goTo)) }
            ) {
                Text(text = readableClassName)
            }
        //}
        Divider(color = Color.Transparent, thickness = 3.dp)
    }
}//MainActivity


//
//@Composable
//fun BottomAppBarNoFab(getMyActionImage: () -> Image, getMyNavigationImage: () -> Image) {
//    val someActionImage: Image = getMyActionImage()
//    val someNavigationImage: Image = getMyNavigationImage()
//    val navigationIcon: @Composable() () -> Unit = {
//        AppBarIcon(someNavigationImage) { /* doSomething()*/ }
//    }
//    val actionData = listOf(someActionImage)
//    BottomAppBar(
//        navigationIcon = navigationIcon,
//        actionData = actionData
//    ) { actionImage ->
//        AppBarIcon(actionImage) { /* doSomething()*/ }
//    }
//}


