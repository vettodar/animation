package com.example.animation


import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.animation.R
import kotlinx.android.synthetic.main.animation.*


class animation: AppCompatActivity() {

    lateinit var anim: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animation)

        imageView2.setBackgroundResource(R.drawable.gif)
        (imageView2.background as AnimationDrawable).start()
    }
}