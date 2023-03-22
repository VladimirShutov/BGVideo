package com.example.bgvideo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bgvideo.databinding.ActivityMainMapBinding
import com.yandex.mapkit.Animation
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.mapview.MapView

class MainActivity_map : AppCompatActivity() {

    lateinit var mapView: MapView
    val apiKey_yaMaps = "3a8b31ff-ea03-4c29-b536-711c0d6ca7cf"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MapKitFactory.setApiKey(apiKey_yaMaps)
        MapKitFactory.initialize(this)
        setContentView(R.layout.activity_main_map)
        mapView = findViewById(R.id.ya_mapview)
        mapView.map.move(CameraPosition(Point(64.546068, 40.551780), 13f, 0.0f, 0.0f),
        Animation(Animation.Type.SMOOTH, 1.5f), null)
    }

    override fun onStop() {
        mapView.onStop()
        MapKitFactory.getInstance().onStop()
        super.onStop()
    }

    override fun onStart() {
        mapView.onStart()
        MapKitFactory.getInstance().onStart()
        super.onStart()
    }
}