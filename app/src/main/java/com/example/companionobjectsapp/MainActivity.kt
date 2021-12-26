package com.example.companionobjectsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.ChangeTransform
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
class Time {

    companion object{

        val night = "night"
        val day = "day"

    }

    fun changeBackground(layout:View, type:String){

        if (type == night) {
            layout.setBackgroundResource(R.drawable.night)
        }
        else if(type == day){
            layout.setBackgroundResource(R.drawable.day)
        }


    }

    }

class MainActivity : AppCompatActivity() {
    private lateinit var typeConstraintLayout: ConstraintLayout
    private lateinit var typeEditText: EditText
    private lateinit var changeButton: Button
    private lateinit var typeTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        typeConstraintLayout = findViewById(R.id.layout)
        typeEditText = findViewById(R.id.et_dayOrNight)
        changeButton = findViewById(R.id.btnChangeBG)
        typeTextView = findViewById(R.id.tv_dayOrNight)

        changeButton.setOnClickListener {
            var dayOrNightStr = typeEditText.text?.toString()
            if(dayOrNightStr?.toLowerCase() == Time.day){
                val time = Time()
                    time.changeBackground(typeConstraintLayout,Time.day)
                    typeEditText.setTextColor(Color.BLACK)
                    typeTextView.setTextColor(Color.BLACK)
                }
            else if(dayOrNightStr?.toLowerCase() == Time.night){

                val time = Time()
                    time.changeBackground(typeConstraintLayout,Time.night)
                    typeEditText.setTextColor(Color.WHITE)
                    typeTextView.setTextColor(Color.WHITE)
                }
            }
        }





    }
