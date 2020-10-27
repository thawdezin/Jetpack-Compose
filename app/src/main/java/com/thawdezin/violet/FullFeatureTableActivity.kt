package com.thawdezin.violet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Immutable
import androidx.compose.ui.platform.setContent
//import androidx.ui.material.DataTable
//import androidx.ui.material.DefaultDataTableSorting

class FullFeatureTableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Column(){
                Table()
            }
        }
    }
}

@Immutable
data class MenuItem(val number: Int)

@Composable
fun Table(){
    val a = MenuItem(1)
    val b = MenuItem( 2)
    val c = MenuItem( 100)
    val d = MenuItem(500)
    //val items = {mutableListOf<MenuItem>(a,b,c,d)}
    //SortableTable(menuItems = items)
}

@Composable
fun SortableTable(menuItems: MutableList<MenuItem>) {
//    DataTable(
//        columns = 1,
//        sorting = DefaultDataTableSorting(
//            sortableColumns = setOf(0),
//            onSortRequest = { _, isAscending ->
//                if (isAscending) {
//                    menuItems.sortBy { it.number }
//                } else {
//                    menuItems.sortByDescending { it.number }
//                }
//            })
//    ) {
//        //headerRow {Text(text = "Number")}
//        for (menuItem in menuItems) {
////            dataRow {
////                Text("${menuItem.number}")
////            }
//        }
//    }
}


