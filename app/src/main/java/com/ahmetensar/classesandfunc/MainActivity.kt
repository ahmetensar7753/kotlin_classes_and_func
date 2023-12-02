package com.ahmetensar.classesandfunc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var myTextView: TextView
    private lateinit var myButton : Button
    private lateinit var nameText : EditText
    private lateinit var ageText : EditText
    private lateinit var jobText : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView = findViewById(R.id.textView)
        myButton = findViewById(R.id.button)
        nameText = findViewById(R.id.nameText)
        ageText = findViewById(R.id.ageText)
        jobText = findViewById(R.id.jobText)

/*
        myButton.setOnClickListener {
            myTextView.text = "setOnClickListener tetiklendi"
        }*/

        myTextView.textSize = 24f

        mySum(12,32)

        println(myMultiply(11,12))

        val homer = Simpson("Homer",50,"Nuclear")

        println(homer.name)

        // Nullability

        var myInt : Int? = null

        // !! - ?
        //println(myInt!! * 10)
        println(myInt?.minus(10))

        if (myInt != null){
            println(myInt.minus(10))
        }else{
            println("myInt is null")
        }
        // elvis operatörü- null gelirse default değer ataması yapılıyor.
        println(myInt?.minus(10) ?: 10)

        myInt?.let {
            // eğer myInt null değilse, 'it' myInt'in değerini alıyor.
            println(it * 10) // gibi

            // null ise bu clousure çalışmıyor.
        }

    }


    fun mySum(a : Int, b:Int){




        //myTextView.text = "Result : ${a+b}"


    }

    fun myMultiply(a: Int, b: Int) : Int {
        return a * b
    }

    fun buttonClicked(view : View){
        var name = nameText.text.toString()
        var age = ageText.text.toString().toIntOrNull() // toInt()
        var job = jobText.text.toString()


        if (age != null){
            val simpson = Simpson(name,age!!,job)
            myTextView.text = "Name: ${simpson.name} Age: ${simpson.age} Job: ${simpson.job}"
        }else {
            myTextView.text = "Yaşa sayı gir"
        }







    }


}