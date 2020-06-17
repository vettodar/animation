package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.AnimationDrawable
import android.provider.MediaStore
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.example.animation.animation
import com.example.animation.R
import kotlinx.android.synthetic.main.activity_main.*
//import kotlinx.android.synthetic.main.kadr.*
//import kotlinx.android.synthetic.main.transform.*

class MainActivity : AppCompatActivity() {

    lateinit var anim: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun toKadr(view: View)
    {
        val tokadr = Intent(this, animation::class.java)
        startActivity(tokadr)
    }

    fun toTransform(view: View)
    {
        val toTransform = Intent(this, transform::class.java)
        startActivity(toTransform)
    }
}