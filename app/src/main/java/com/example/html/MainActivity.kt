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

        val button_chapter1 = findViewById<Button>(R.id.chapterBtn1)
        val button_chapter2 = findViewById<Button>(R.id.chapterBtn2)
        val button_chapter3 = findViewById<Button>(R.id.chapterBtn3)
        val button_chapter4 = findViewById<Button>(R.id.chapterBtn4)
        val button_chapter5 = findViewById<Button>(R.id.chapterBtn5)

        button_chapter1.setOnClickListener{
            val intent =Intent(this, Chapter1::class.java)
            startActivity(intent)
        }

        button_chapter2.setOnClickListener{
            val intent =Intent(this, Chapter2::class.java)
            startActivity(intent)
        }

        button_chapter3.setOnClickListener{
            val intent =Intent(this, Chapter3::class.java)
            startActivity(intent)
        }

        button_chapter4.setOnClickListener{
            val intent =Intent(this, Chapter4::class.java)
            startActivity(intent)
        }

        button_chapter5.setOnClickListener{
            val intent =Intent(this, Chapter5::class.java)
            startActivity(intent)
        }

    }
}