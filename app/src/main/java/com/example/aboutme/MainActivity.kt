package com.example.aboutme

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //setContentView(R.layout.activity_main)

        binding.btnDone.setOnClickListener {
            addNickname()
        }
    }

    private fun addNickname() {
        binding.apply {
            txtNickname.text = editNickname.text
            editNickname.visibility = View.GONE
            btnDone.visibility = View.GONE
            txtNickname.visibility = View.VISIBLE
        }

        // Hide the keyboard.
        val view = this.currentFocus
        //if (view != null) {
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view?.windowToken, 0)
        //}
    }
}