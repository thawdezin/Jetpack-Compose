package com.thawdezin.violet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.compose.Composable
import androidx.compose.Model
import androidx.compose.state
import androidx.compose.unaryPlus

import androidx.ui.core.Text
import androidx.ui.core.TextField
import androidx.ui.core.setContent
import androidx.ui.graphics.Color
import androidx.ui.input.ImeAction
import androidx.ui.input.KeyboardType
import androidx.ui.layout.Column
import androidx.ui.material.Button
import androidx.ui.material.Divider
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.sp

@Model
class CounterState(var count: Int = 0, var txt: String = " ")

@Model
class TextChanged(var changedText: String = " ")

class TextChangedOnButtonClickActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
           loadUi()
        }
    }


@Composable
fun loadUi() {
    //val state = state { EditorModel("smth") }
    val cState: CounterState = CounterState()
    Column {
//        TextField(
//            value = state.value,
//            onValueChange = { new ->
//                state.value = if (new.text.any { it == '\n' }) {
//                    state.value
//                } else {
//                    new
//                }
//            },
//            keyboardType = KeyboardType.Text,
//            imeAction = ImeAction.Search,
//            textStyle = TextStyle(color = Color.DarkGray)
//            //onImeActionPerformed = onImeActionPerformed
//        )
        cState.txt = "OK" //state.value.toString()
        //Divider(color = Color.Red)
        CallSecondView(state = cState)
    }

}

@Preview
@Composable
fun PrimaryView(){
    val couState: CounterState = CounterState()
    CallSecondView(couState)
}

@Composable
fun CallSecondView(state: CounterState) {

    if(state.count >10){
        state.txt = "Over 10"
    }

    Column() {
        Text("${state.count} and ${state.txt}")
        Button(
            onClick = {
                state.count++
            }){
            Text("I've been clicked ${state.count} times")
        }
        Toast.makeText(application,state.count.toString(), Toast.LENGTH_LONG).show()
    }
}

}