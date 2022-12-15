package com.example.madfinalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    lateinit var loginText: EditText
    lateinit var passwordText: EditText
    lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginText = findViewById(R.id.login_input)
        passwordText = findViewById(R.id.password_input)
        loginButton = findViewById(R.id.login_button)

        //checks if the username and password are correct, responds based on what is correct/incorrect
        loginButton.setOnClickListener {
            when(CheckLogin(loginText.text.toString(), passwordText.text.toString())){

                LoginSuccess.login ->{
                    Toast.makeText(this@MainActivity, getString(R.string.error_login), Toast.LENGTH_SHORT).show()
                    loginText.error = "Invalid Username"
                    loginText.requestFocus()
                    loginText.selectAll()
                }
                LoginSuccess.password ->{
                    Toast.makeText(this@MainActivity, getString(R.string.error_password), Toast.LENGTH_SHORT).show()
                    passwordText.error = "Invalid Password"
                    passwordText.requestFocus()
                    passwordText.selectAll()
                }
                LoginSuccess.success ->{
                    Toast.makeText(this@MainActivity, getString(R.string.success), Toast.LENGTH_SHORT).show()
                    Intent(this@MainActivity, Screen2::class.java).also{
                        startActivity(it)
                    }
                }


            }

        }

    }


    //checks the login and password
    fun CheckLogin(login: String, password: String): LoginSuccess{
        val holdLogin = "login"
        val holdPassword = "password"

        if(holdLogin != login){
            return  LoginSuccess.login
        }
        if(holdPassword != password){
            return LoginSuccess.password
        }
        return LoginSuccess.success

    }

    enum class LoginSuccess(val intValue: Int){
        login(1),
        password(2),
        success(0)
    }
}