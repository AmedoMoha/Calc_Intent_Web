package com.example.intent_calc_web

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var Txanswer:TextView
    lateinit var edtfnum:EditText
    lateinit var edtsnum:EditText
    lateinit var Buttonadd:Button
    lateinit var Buttonsub:Button
    lateinit var Buttonmult:Button
    lateinit var Buttondiv:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Txanswer=findViewById(R.id.textView)
        edtfnum=findViewById(R.id.Edt_Fnum)
        edtsnum=findViewById(R.id.Edt_Snum)
        Buttonadd=findViewById(R.id.Btn_add)
        Buttonsub=findViewById(R.id.Btn_sub)
        Buttonmult=findViewById(R.id.Btn_mult)
        Buttondiv=findViewById(R.id.Btn_div)

        Buttonadd.setOnClickListener {
            val firstnum=edtfnum.text.toString()
            val secondnum=edtsnum.text.toString()
            if (firstnum.isEmpty()&& secondnum.isEmpty()){
                Txanswer.text="Please fill in all details"
            }else{
                var answer=firstnum.toDouble()+secondnum.toDouble()
                Txanswer.text=answer.toString()
            }
        }

        Buttonsub.setOnClickListener {
            val firstnum=edtfnum.text.toString()
            val secondnum=edtsnum.text.toString()
            if (firstnum.isEmpty()&& secondnum.isEmpty()){
                Txanswer.text="Please fill in all details"
            }else{
                var answer=firstnum.toDouble()-secondnum.toDouble()
                Txanswer.text=answer.toString()
            }
        }

        Buttonmult.setOnClickListener {
            val firstnum=edtfnum.text.toString()
            val secondnum=edtsnum.text.toString()
            if (firstnum.isEmpty()&& secondnum.isEmpty()){
                Txanswer.text="Please fill in all details"
            }else{
                var answer=firstnum.toDouble()*secondnum.toDouble()
                Txanswer.text=answer.toString()
            }
        }

        Buttondiv.setOnClickListener {
            val firstnum=edtfnum.text.toString()
            val secondnum=edtsnum.text.toString()
            if (firstnum.isEmpty()&& secondnum.isEmpty()){
                Txanswer.text="Please fill in all details"
            }else{
                var answer=firstnum.toDouble()/secondnum.toDouble()
                Txanswer.text=answer.toString()
            }
        }

    }
}
