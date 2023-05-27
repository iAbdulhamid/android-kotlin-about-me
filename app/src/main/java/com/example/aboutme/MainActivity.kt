package com.example.aboutme

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aboutme.ui.theme.AboutMeTheme

class MainActivity : ComponentActivity() {

    private lateinit var nicknameText : EditText
    private lateinit var doneButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //doneButton.setOnClickListener {
        //    nicknameText = findViewById<EditText?>(R.id.edit_nickname)
        //    Toast.makeText(this, "${nicknameText.text}", Toast.LENGTH_SHORT).show()
        //}

    }
}