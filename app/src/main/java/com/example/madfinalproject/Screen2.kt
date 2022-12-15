package com.example.madfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Screen2 : AppCompatActivity() {

    lateinit var radioGroup: RadioGroup
    lateinit var emailInput: EditText
    lateinit var dateInput: EditText
    lateinit var confirmButton: Button
    lateinit var radioButton: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        radioGroup = findViewById(R.id.radioGroup)
        emailInput = findViewById(R.id.email_input)
        dateInput = findViewById(R.id.date_input)
        confirmButton = findViewById(R.id.confirm_button)



        //makes a Toast of which button you clicked
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            radioButton = findViewById(checkedId)
            if (checkedId == R.id.radioButton1) {
                Toast.makeText(
                    applicationContext,
                    "You selected: ${radioButton.text}",
                    Toast.LENGTH_SHORT
                ).show()

            }
            if (checkedId == R.id.radioButton2) {
                Toast.makeText(
                    applicationContext,
                    "You selected: ${radioButton.text}",
                    Toast.LENGTH_SHORT
                ).show()

            }
            if(checkedId == R.id.radioButton3){
                Toast.makeText(
                    applicationContext,
                    "You selected: ${radioButton.text}",
                    Toast.LENGTH_SHORT
                ).show()

            }

        //when you click confirm button
        confirmButton.setOnClickListener {
            var email = emailInput.text.toString()
            var choice = radioButton.text.toString()
            var date = dateInput.text.toString()

            //if email or date is empty, do not proceed
            if (email.isEmpty() || date.isEmpty()) {
                Toast.makeText(applicationContext, "Please enter an email/Date", Toast.LENGTH_SHORT)
                    .show()
                emailInput.error = "No Email/date"
                dateInput.error = "No Email/Date"
                } else {
                    Intent(this@Screen2, Screen3::class.java).also {

                        it.putExtra("EXTRA_EMAIL", email)
                        it.putExtra("EXTRA_CHOICE", choice)
                        it.putExtra("EXTRA_DATE", date)
                        startActivity(it)
                    }
                }
            }



        }



        }



    }