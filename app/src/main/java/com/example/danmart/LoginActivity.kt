package com.example.danmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var edtusername = findViewById(R.id.edtusername) as EditText
        var edtpassword = findViewById(R.id.edtpassword) as EditText
        var btnsignup = findViewById(R.id.btnsignup) as Button
        var btnlogin = findViewById(R.id.btnlogin) as Button

        btnsignup.setOnClickListener {
            val intent = Intent(applicationContext, SignupActivity::class.java)
            startActivity(intent);
        }


        btnlogin.setOnClickListener {
            if (edtpassword.getText().toString().equals("admin") &&
                edtusername.getText().toString().equals("admin")
            ) {
                Toast.makeText(this@LoginActivity, "Welcome " + edtusername.text, Toast.LENGTH_LONG)
                    .show()
                val intent = Intent(applicationContext, NavigationActivity::class.java)
                startActivity(intent);
            } else if (edtpassword.text.isEmpty() ||
                edtusername.text.isEmpty()
            ) {
                Toast.makeText(
                    this@LoginActivity,
                    "Please Fill all fields to continue  " ,
                    Toast.LENGTH_LONG
                ).show()

            } else {
                Toast.makeText(
                    this@LoginActivity,
                    "Wrong Credentials for  " + edtusername.text + "Please Signup if you don't have an account",
                    Toast.LENGTH_LONG
                ).show()


            }
        }
    }
}

