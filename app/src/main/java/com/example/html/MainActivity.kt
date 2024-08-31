package com.example.html

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val chapter1Button = findViewById<Button>(R.id.chapter1Btn)
        val chapter2Button = findViewById<Button>(R.id.chapter2Btn)
        val chapter3Button = findViewById<Button>(R.id.chapter3Btn)
        val chapter4Button = findViewById<Button>(R.id.chapter4Btn)
        val chapter5Button = findViewById<Button>(R.id.chapter5Btn)

        chapter1Button.setOnClickListener{
            val intent = Intent(this, Chapter1::class.java)
            startActivity(intent)
        }

        chapter2Button.setOnClickListener{
            val intent = Intent(this, Chapter2::class.java)
            startActivity(intent)
        }

        chapter3Button.setOnClickListener{
            val intent = Intent(this, Chapter3::class.java)
            startActivity(intent)
        }

        chapter4Button.setOnClickListener{
            val intent = Intent(this, Chapter4::class.java)
            startActivity(intent)
        }

        chapter5Button.setOnClickListener{
            val intent = Intent(this, Chapter5::class.java)
            startActivity(intent)
        }
    }
}