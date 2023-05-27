package com.example.aboutme

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    private lateinit var nicknameEdit: EditText
    private lateinit var nicknameText: TextView
    private lateinit var doneButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nicknameEdit = findViewById(R.id.edit_nickname)
        nicknameText = findViewById(R.id.txt_nickname)
        doneButton = findViewById(R.id.btn_done)

        doneButton.setOnClickListener {
            addNickname()
        }

    }

    private fun addNickname() {
        nicknameText.text = nicknameEdit.text
        nicknameEdit.visibility = View.GONE
        doneButton.visibility = View.GONE
        nicknameText.visibility = View.VISIBLE

        // Hide the keyboard.
        val view = this.currentFocus
        //if (view != null) {
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view?.windowToken, 0)
        //}
    }
}