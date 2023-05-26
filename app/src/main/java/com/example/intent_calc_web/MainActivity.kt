package com.example.intent_calc_web

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var Buttoncalc:Button
    lateinit var Buttonintent:Button
    lateinit var Buttonweb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Buttoncalc=findViewById(R.id.Btn_Calc)
        Buttonintent=findViewById(R.id.Btn_Intent)
        Buttonweb=findViewById(R.id.Btn_Web)

        Buttoncalc.setOnClickListener {
            val intent=Intent(this, CalculatorActivity ::class.java )
            startActivity(intent)
        }
        Buttonintent.setOnClickListener {
            val intent=Intent(this, IntentActivity ::class.java )
            startActivity(intent)
        }
        Buttonweb.setOnClickListener {
            val intent=Intent(this, WebActivity ::class.java )
            startActivity(intent)
        }

    }
}