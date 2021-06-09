package com.taskfoundation.buttoncounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userINput: EditText = findViewById<EditText>(R.id.editText)
        val button: Button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)

        userINput.setText("")

        textView?.text = ""

        textView?.movementMethod = ScrollingMovementMethod()

        button.setOnClickListener {
            textView?.append(userINput.text.toString() + "\n")
            userINput.text.clear()
        }
    }
}