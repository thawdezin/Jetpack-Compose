package com.thawdezin.violet

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.DatePicker
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.layout.Column
import androidx.ui.material.Button
import androidx.ui.material.OutlinedButtonStyle
import java.util.*


class DateTimeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        val mHour = c[Calendar.HOUR_OF_DAY]
        val mMinute = c[Calendar.MINUTE]

        val datePickerDialog = DatePickerDialog(
            this, DatePickerDialog.OnDateSetListener
            { datePicker: DatePicker, day: Int, month: Int, year: Int ->
                setContent {
                    Column {
                        Text("$day, $month, $year")
                    }
                }
            }, year, month, day
        )


        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                setContent {
                    Column {
                        Text("$hourOfDay:$minute")
                    }
                }
            }, mHour, mMinute, false
        )


        setContent {
            Column {
                Button(text = "Date",
                    style = OutlinedButtonStyle(),
                    onClick = {
                        datePickerDialog.show()
                    })
                Button(text = "Time",
                    style = OutlinedButtonStyle(),
                    onClick = {
                        timePickerDialog.show()
                    })
            }
        }
    }
}

