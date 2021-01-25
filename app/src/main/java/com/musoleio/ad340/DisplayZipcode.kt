package com.musoleio.ad340

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayZipcode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_zipcode)

        val zipCode = intent.getStringExtra(ZIP_CODE)

        val userZipCode = findViewById<TextView>(R.id.text_display_zipcode)
        userZipCode.text = zipCode
    }
}