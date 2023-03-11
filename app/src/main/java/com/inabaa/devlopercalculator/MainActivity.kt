package com.inabaa.devlopercalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText


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
         clearButton = findViewById(R.id.clearButton)
         binaryNumberText = findViewById(R.id.binaryNumber)


//         clearButton.setOnClickListener(object : View.OnClickListener {
//             override fun onClick(p0: View?) {
//                 binaryNumberText.text.clear()
//                 octNumberText.text.clear()
//                 decimalNumberText.text.clear()
//                 hexNumberText.text.clear()
//             }
//
//         })

//        initView()

     }
     fun onClickSubmitButton(v:View) {
         
     }
   fun onClickResetButton(v:View) {
             binaryNumberText.text.clear()
             octNumberText.text.clear()
             decimalNumberText.text.clear()
             hexNumberText.text.clear()
     }
 }

