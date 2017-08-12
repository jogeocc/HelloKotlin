package com.example.lissa.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var buttonBye : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonBye = findViewById(R.id.Button)

        buttonBye?.setOnClickListener {

            Toast.makeText(this,getString(R.string.saludo),Toast.LENGTH_LONG).show()
        }
    }
}
