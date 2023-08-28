package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val email = "wkasd"
        val pass = "pw123"
        with(binding){
            btnLogin.setOnClickListener{
                val emailText = usernameLabel.text.toString()
                val passText = passwordLabel.text.toString()
                //show toast
                if((emailText == email) && (passText == pass)){
                    Toast.makeText(
                        this@MainActivity,
                        "Berhasil Login",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    Toast.makeText(
                        this@MainActivity,
                        "Email atau Password Salah",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}