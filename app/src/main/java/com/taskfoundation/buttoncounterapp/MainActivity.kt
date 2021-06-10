package com.taskfoundation.buttoncounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private const val TAG = "MainActivity"
private const val TEXT_CONTENT = "TextContent"

class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userINput: EditText = findViewById<EditText>(R.id.editText)
        val button: Button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)

        userINput.setText("")

        textView?.text = ""

        textView?.movementMethod = ScrollingMovementMethod()

        button.setOnClickListener {
            Log.d(TAG, "onButtonClicekd: called")
            textView?.append(userINput.text.toString() + "\n")
            userINput.text.clear()
        }
    }

    override fun onStart() {
        Log.d(TAG, "onStart: called")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG, "onRestoreInstanceState: called")
        super.onRestoreInstanceState(savedInstanceState)
        val savedString = savedInstanceState?.getString(TEXT_CONTENT, "")
        textView?.text = savedString
    }

    override fun onResume() {
        Log.d(TAG, "onResume: called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPaused: called")
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG, "onSaveInstanceState: called")
        super.onSaveInstanceState(outState)
        outState?.putString(TEXT_CONTENT, textView?.text.toString())
    }

    override fun onStop() {
        Log.d(TAG, "onStop: called")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(TAG, "onRestart: called")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy: called")
        super.onDestroy()
    }
}