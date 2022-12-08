package com.example.exmpletogglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    lateinit var img : ImageView
    lateinit var txt : TextView
    lateinit var tgl : ToggleButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img = findViewById(R.id.img1)
        txt = findViewById(R.id.txt)
        tgl = findViewById(R.id.tgl)
        tgl.isChecked = true

        tgl.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                img.visibility = View.VISIBLE
                txt.setText(" The image is visible ")
            }
            else {
                img.visibility = View.INVISIBLE
                txt.setText(" The image is invisible ")
            }
        }
    }
}