package com.example.bgvideo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.bgvideo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onClickButtonLogin(view : View){
        //buttonLogin = findViewById<Button>(R.id.Button_login)
        bindingClass.ButtonLogin.setOnClickListener{
            setContentView(R.layout.activity_main_map)
        }
    }

}