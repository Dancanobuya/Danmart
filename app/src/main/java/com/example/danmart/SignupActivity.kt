package com.example.danmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        var edtfirstname = findViewById(R.id.edtFirstName) as EditText
        var edtlastname = findViewById(R.id.edtLastName) as EditText
        var edtemail = findViewById(R.id.edtEmail) as EditText
        var edtphone = findViewById(R.id.edtPhone) as EditText
        var btnsignin = findViewById(R.id.btnSignin) as Button
        var btnSignup = findViewById(R.id.btnSignup) as Button
        btnSignup.setOnClickListener {
            if (edtfirstname.text .equals("")|| edtlastname.text .isEmpty() || edtemail.text .isEmpty()  || edtphone.text.isEmpty()  ){
                Toast.makeText(
                    this@SignupActivity,
                    "Please Fill all fields to continue  " ,
                    Toast.LENGTH_LONG
                ).show()
            }else {
                Toast.makeText(
                    this@SignupActivity,
                    "Successful Sign up for  " + edtfirstname.text + " " + edtlastname.text,
                    Toast.LENGTH_LONG
                ).show()
                val intent = Intent(applicationContext, NavigationActivity::class.java)
                startActivity(intent);
            }
        }
        btnsignin.setOnClickListener {
            val intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent);
        }
    }
}