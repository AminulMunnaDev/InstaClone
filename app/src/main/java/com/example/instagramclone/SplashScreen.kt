package com.example.instagramclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

       Handler(Looper.getMainLooper()).postDelayed({
           val intent = android.content.Intent(this,MainActivity::class.java)
           startActivity(intent)
           finish()
       },3000)
        WindowInsetsControllerCompat(window,window.decorView).hide(WindowInsetsCompat.Type.statusBars())
        actionBar?.hide()
        supportActionBar?.hide()
    }
}