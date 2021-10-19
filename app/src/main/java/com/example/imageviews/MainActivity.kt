package com.example.imageviews

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import java.util.*
import kotlin.concurrent.fixedRateTimer

class MainActivity : AppCompatActivity() {
//    lateinit var btn1: Button
//    lateinit var btn2: Button
      lateinit var img: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



       img = findViewById(R.id.img)
    }

    fun Image1(view: android.view.View) {

        img.setImageResource(R.drawable.day)
       }
    fun Image2(view: View) {

        img.setImageResource(R.drawable.ic_launcher_background)

    }

}




