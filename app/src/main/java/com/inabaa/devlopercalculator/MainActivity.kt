package com.inabaa.devlopercalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

     lateinit var clearButton: Button
     lateinit var submitButton: Button
     lateinit var binaryNumberText: EditText
     lateinit var hexNumberText: EditText
     lateinit var decimalNumberText: EditText
     lateinit var octNumberText: EditText



     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)


         initView()
         addCallBacks()
     }
         private fun addCallBacks() {
             clearButton.setOnClickListener {
                 clearInput()
             }
         }

             private fun initView() {
                 clearButton = findViewById(R.id.clearButton)
                 binaryNumberText = findViewById(R.id.binaryNumber)
                 octNumberText = findViewById(R.id.octNumber)
                 decimalNumberText = findViewById(R.id.decimalNumber)
                 hexNumberText = findViewById(R.id.hexNumber)

             }

             private fun clearInput() {

                 binaryNumberText.text.clear()
                 octNumberText.text.clear()
                 decimalNumberText.text.clear()
                 hexNumberText.text.clear()

             }


             fun onClickSubmitButton(v: View) {
                 val decimal = decimalNumberText.text
                 val binary = Integer.toBinaryString(decimal.toString().toInt())
                 binaryNumberText.setText(binary)
                 val hex =Integer.toHexString(decimal.toString().toInt())
                 hexNumberText.setText(hex)
                 val oct = Integer.toOctalString(decimal.toString().toInt())
                 octNumberText.setText(oct)

             }
         }



