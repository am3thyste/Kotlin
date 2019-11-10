package com.example.budgetapp

import android.app.DatePickerDialog
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*





class MainActivity : AppCompatActivity() {
    private val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e(tag, "Inside onCreate()")


        //Calendars:
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)



        val c2 = Calendar.getInstance()
        val year2 = c2.get(Calendar.YEAR)
        val month2 = c2.get(Calendar.MONTH)
        val day2 = c2.get(Calendar.DAY_OF_MONTH)

        Log.e(tag, "year1: $year")
        Log.e(tag, "month1: $month")
        Log.e(tag, "month2: $month2")
        Log.e(tag, "day1: $day")

        //button click to show DatePickerDialog
        pickDateBtn.setOnClickListener {
            Log.e(tag, pickDateBtn.toString())
            val dpd = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener {_, mYear, mMonth, mDay ->
                    var monthSel=mMonth+1
                    dateTv2.text = "$mDay/$monthSel/$mYear"
                },
                year,
                month,
                day
            )
            Log.e(tag, "dpd1: $dpd")
            Log.e(tag, "dateTv2: $dateTv2")
            Log.e(tag, "dans DatePicker1, month1: $month")



            dpd.show()
            val dpd2 = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener {_, mYear2, mMonth2, mDay2 ->
                    var monthSel2=mMonth2+1
                    dateTv.text="$mDay2/$monthSel2/$mYear2"
                },
                year2,
                month2,
                day2
            )
            dpd2.show()
        }


        //button to create/modify period
        /*budgetPeriod.setOnClickListener {
       val jourDebut: date

createModifyP(){

}
        }
        */
    }


}
