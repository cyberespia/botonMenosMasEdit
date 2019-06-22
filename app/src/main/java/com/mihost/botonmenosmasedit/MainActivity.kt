package com.mihost.botonmenosmasdit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*

// import kotlinx.android.synthetic.main.activity_main.* con esto ya no es necesario usar findViewById para recuperar las vistas
// https://devexperto.com/kotlin-android-extensions/

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        increase.setOnClickListener { increaseInteger() }
        decrease.setOnClickListener { decreaseInteger() }
    }

    fun increaseInteger() {
        display(integer_number.text.toString().toInt() + 1)
    }

    fun decreaseInteger() {
        display(integer_number.text.toString().toInt() - 1)
    }

    private fun display(number: Int) {
        integer_number.setText("$number")
    }
}