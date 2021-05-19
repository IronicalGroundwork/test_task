package com.ironical_groundwork.test_task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val intent = Intent(this, MainActivity::class.java)

        val btnDota2 = findViewById<Button>(R.id.btn_basketball)
        btnDota2.setOnClickListener {
            intent.putExtra("sport_id", 1)
            startActivity(intent)
        }

        val btnHearthstone = findViewById<Button>(R.id.btn_boxing)
        btnHearthstone.setOnClickListener {
            intent.putExtra("sport_id", 2)
            startActivity(intent)
        }
    }
}