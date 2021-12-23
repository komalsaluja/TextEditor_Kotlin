package com.example.texteditor

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv=findViewById<TextView>(R.id.textView);
        val et=findViewById<EditText>(R.id.plainText);
        val btn=findViewById<Button>(R.id.button);

        btn.setOnClickListener{
            tv.setText(et.text.toString())
        }

        var sp1=findViewById<Spinner>(R.id.spinner);
        var sp2=findViewById<Spinner>(R.id.spinner2);
        var sp3=findViewById<Spinner>(R.id.spinner3);

        sp2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var pos = sp2.selectedItemPosition
                when(pos)
                {
                    1->tv.setTextColor(Color.RED);
                    2->tv.setTextColor(Color.BLACK);
                    3->tv.setTextColor(Color.GREEN);
                    4->tv.setTextColor(Color.BLUE);
                    5->tv.setTextColor(Color.CYAN);                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        //-----------------------------------------------------------------------------

        sp1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var pos = sp1.selectedItemPosition
                when(pos)
                {
                    1->tv.setTextSize(20F);
                    2->tv.setTextSize(25F);
                    3->tv.setTextSize(30F);
                    4->tv.setTextSize(35F);
                    5->tv.setTextSize(40F);                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
//-----------------------------------------------------------------------------

        sp3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var pos = sp1.selectedItemPosition
                when(pos)
                {
                    1->tv.setTypeface(Typeface.DEFAULT);
                    2->tv.setTypeface(Typeface.DEFAULT_BOLD);
                    3->tv.setTypeface(Typeface.MONOSPACE);
                    4->tv.setTypeface(Typeface.SANS_SERIF);
                    5->tv.setTypeface(Typeface.SERIF);
                                 }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


    }
}