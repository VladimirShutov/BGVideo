package com.example.bgvideo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import com.example.bgvideo.databinding.ActivityMainBinding
import com.example.bgvideo.databinding.ActivityMainMapBinding
import com.yandex.mapkit.MapKitFactory

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass : ActivityMainBinding
    lateinit var binActMap : ActivityMainMapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        // тестирование запуска новой активити с картой по нажатию на кнопку регистрация/вход (ButtonLogin)
        bindingClass.ButtonLogin.setOnClickListener {
            val startMap = Intent(this, MainActivity_map::class.java)
            startActivity(startMap)
        }

    }

    override fun onStart() {
        super.onStart()
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        // тестирование запуска новой активити с картой по нажатию на кнопку регистрация/вход (ButtonLogin)
        bindingClass.ButtonLogin.setOnClickListener {
            val startMap = Intent(this, MainActivity_map::class.java)
            startActivity(startMap)
        }
    }

    override fun onRestart() {
        super.onRestart()
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        // тестирование запуска новой активити с картой по нажатию на кнопку регистрация/вход (ButtonLogin)
        bindingClass.ButtonLogin.setOnClickListener {
            val startMap = Intent(this, MainActivity_map::class.java)
            startActivity(startMap)
        }
    }

    override fun onResume() {
        super.onResume()
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        // тестирование запуска новой активити с картой по нажатию на кнопку регистрация/вход (ButtonLogin)
        bindingClass.ButtonLogin.setOnClickListener {
            val startMap = Intent(this, MainActivity_map::class.java)
            startActivity(startMap)
        }
    }

    fun onClickButtonLogin(view : View){
        //bindingClass.ButtonLogin.setOnClickListener{
            //setContentView(R.layout.activity_main_map)
        //}

        //val startMap = Intent(this, MainActivity_map::class.java)
        //startActivity(startMap)
    }

}