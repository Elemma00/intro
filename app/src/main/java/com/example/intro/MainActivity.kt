package com.example.intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.MultiAutoCompleteTextView
import android.widget.MultiAutoCompleteTextView.CommaTokenizer
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvExample = findViewById<TextView>(R.id.tvExample)
        tvExample.text = "texto cambiado desde código"

        var autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        val paisesSudamerica = resources.getStringArray(R.array.paises_sudamerica)

        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,paisesSudamerica)
        autoCompleteTextView.setAdapter(adapter)

        var multiAutoCompleteTextView = findViewById<MultiAutoCompleteTextView>(R.id.multiAutoCompleteTextView)
        multiAutoCompleteTextView.setAdapter(adapter)
        multiAutoCompleteTextView.setTokenizer(CommaTokenizer())


    }
}