package com.example.ibay

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val buttonvoltar1: Button = findViewById<Button>(R.id.buttonvoltar1)
        val buttonperfil:  Button = findViewById<Button>(R.id.buttonperfil)
        val buttoncarrinho1: Button = findViewById<Button>(R.id.buttoncarrinho1)
        val btnadicionar1: Button = findViewById<Button>(R.id.btnAdicionar1)
        val btnadicionar2: Button = findViewById<Button>(R.id.btnAdicionar2)
        val btnadicionar3: Button = findViewById<Button>(R.id.btnAdicionar3)
        val btnadicionar4: Button = findViewById<Button>(R.id.btnAdicionar4)

        buttonvoltar1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        buttonperfil.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        buttoncarrinho1.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

    }
}