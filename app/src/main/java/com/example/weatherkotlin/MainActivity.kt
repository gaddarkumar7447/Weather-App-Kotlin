package com.example.weatherkotlin

import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import androidx.databinding.ViewDataBinding
import com.example.weatherkotlin.databinding.ActivityMainBinding
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.tasks.Task

class MainActivity : AppCompatActivity() {

    //private lateinit var fusedLocationProviderClient : FusedLocationProviderClient
    // change ViewDataBinding to ActivityMAinBinding
    //private lateinit var activityMainBinding: ViewDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        window.statusBarColor = ContextCompat.getColor(this,R.color.statusBarCol)

        //fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)
        //getCurrentLocation()

    }

    /*private fun getCurrentLocation(){
        if (checkPermissions()){
            if (isLocationEnbled()){
                if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this,android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED){
                    requestPermission()
                    return
                }
                fusedLocationProviderClient.lastLocation.addOnCompleteListener(this){ task->
                    var location: Location ?= task.result
                    if (location == null){
                        Toast.makeText(this, "Null request", Toast.LENGTH_SHORT).show()
                    }else{
                        fetchCurrentLocationWeather(location.latitude.toString(), location.longitude.toString())
                    }
                }
            }
            else{
                Toast.makeText(this, "Turn on location", Toast.LENGTH_SHORT).show()
                val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
                startActivity(intent)
            }
        }
        else{
            requestPermission()
        }
    }*/

    /*private fun checkPermissions(): Boolean {
        return true
    }

    private fun isLocationEnbled(): Boolean {
        return true
    }

    private fun requestPermission() {

    }

    private fun fetchCurrentLocationWeather(latitude: String, longitude: String) {

    }*/
}