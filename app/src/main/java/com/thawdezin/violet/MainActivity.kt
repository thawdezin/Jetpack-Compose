package com.thawdezin.violet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Suppress("UNCHECKED_CAST")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val contentView = ComposeView(context = applicationContext).apply {
            setContent {
                mainContent()
            }
            // // since no window is bound
        }
        setContentView(contentView)
    }

    @Preview
    @Composable
    fun mainContent() {
        MaterialTheme {
            Scaffold {
                Row(Modifier.scrollable(rememberScrollState(), Orientation.Vertical)) {
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
        val readableClassName = goTo?.simpleName ?: "NULL"
        //Box(gravity = Alignment.Center) {
            Button(
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


