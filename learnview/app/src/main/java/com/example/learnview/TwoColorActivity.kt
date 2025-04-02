package com.example.learnview

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TwoColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_two_color)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        settingButtons()
    }

    fun settingButtons(){

        val btn_red = Button(this)
        btn_red.findViewById<Button>(R.id.btn_red)

        val btn_blue = Button(this)
        btn_blue.findViewById<Button>(R.id.btn_blue)

        btn_red.setOnClickListener {
            val framgentTransaction = supportFragmentManager.beginTransaction()
            framgentTransaction.replace(R.id.frame_layout, RedFragment())
            framgentTransaction.commit()
        }

        btn_blue.setOnClickListener {
            val framgentTransaction = supportFragmentManager.beginTransaction()
            framgentTransaction.replace(R.id.frame_layout, BlueFragment())
            framgentTransaction.commit()
        }
    }
}