package com.thawdezin.violet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.ui.platform.setContent
import androidx.ui.tooling.preview.Preview


class CounterState(var count: Int = 0, var txt: String = " ")

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