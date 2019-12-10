package com.example.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener(){
            calculateBMI();
        }

        buttonReset.setOnClickListener(){
            editTextHeight.text = null;
            editTextWeight.text = null;
        }
    }

    private fun calculateBMI(){
        val height: TextView = findViewById(R.id.editTextHeight)
        val weight: TextView = findViewById(R.id.editTextWeight)

        var Theight: Float = height.text.toString().toFloat()
        var Tweight: Float = weight.text.toString().toFloat()

        Theight = Theight/100;

       var BMI: Float = Tweight /(Theight * Theight);

        textViewBMI.text ="BMI : " +String.format("%.2f", BMI);

        if(BMI < 18.5){
            imageViewProfile.setImageResource(R.drawable.under)
        }
        else if (BMI >= 18.5 && BMI<= 24.9){
            imageViewProfile.setImageResource(R.drawable.normal)
        }
        else if(BMI > 25){
            imageViewProfile.setImageResource(R.drawable.over)
        }
    }

}
