package com.divya.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    lateinit var near : Button
    lateinit var help1 : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        near = findViewById(R.id.txtngo)

        near.setOnClickListener{

            val intent=Intent(this@MainActivity, NearMe::class.java)
            startActivity(intent)

        }

        help1 = findViewById(R.id.help)

        help1.setOnClickListener {

            val intent= Intent(this@MainActivity,help::class.java)
            startActivity(intent)

        }

    }
}