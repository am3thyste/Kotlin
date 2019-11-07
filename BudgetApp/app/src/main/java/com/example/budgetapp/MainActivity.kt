package com.example.budgetapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Calendars:
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val c2 = Calendar.getInstance()
        val year2 = c2.get(Calendar.YEAR)
        val month2 = c2.get(Calendar.MONTH)
        val day2 = c2.get(Calendar.DAY_OF_MONTH)


        //button click to show DatePickerDialog
        pickDateBtn.setOnClickListener {
            val dpd = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener {view, mYear, mMonth, mDay ->
                    dateTv.setText("$mDay/$mMonth/$mYear")
                },
                year,
                month,
                day
            )
            dpd.show()
        }

        pickDateBtn2.setOnClickListener {
            val dpd2 = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener {view2, mYear2, mMonth2, mDay2 ->
                    dateTv2.setText("$mDay2/$mMonth2/$mYear2")
                },
                year2,
                month2,
                day2
            )
            dpd2.show()
        }

        //button to create/modify period
        budgetPeriod.setOnClickListener {
        }
    }


}
