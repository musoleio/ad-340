package com.musoleio.ad340

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


const val ZIP_CODE = "com.musoleio.ad340.ZIPCODE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitZip: Button = findViewById(R.id.btn_submit_zipcode)

        submitZip.setOnClickListener {
            val userInput = findViewById<EditText>(R.id.edit_zipcode).text.toString()
            Toast.makeText(this, userInput, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayZipcode::class.java).apply {
                putExtra(ZIP_CODE, userInput)
            }
            startActivity(intent)
        }

    }
}