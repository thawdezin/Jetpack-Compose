package com.thawdezin.violet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.compose.Immutable
import androidx.ui.core.setContent
import androidx.ui.layout.Column
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
    val items = mutableListOf<MenuItem>(a,b,c,d)
    SortableTable(menuItems = items)
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


