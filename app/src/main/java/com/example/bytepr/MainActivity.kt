package com.example.bytepr

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
import android.util.Log
import com.google.android.gms.location.LocationServices
import androidx.core.content.ContextCompat


private const val Location = 1
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

            } elsif (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                    != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                    REQUEST_LOCATION_PERMISSION)e {
                accesslocation()
            }
        }
        override fun onRequestPermissionsResult(
            requestCode: Int,
            permissions: Array<out String>,
            grantResults: IntArray
        ) {

            super.onRequestPermissionsResult(requestCode, permissions, grantResults)
            if(requestCode==Location)
            {
                if (grantResults.isNotEmpty() && grantResults[0] == PackaageManager.PERMISSION_GRANTED) {
                    accesslocation()
                }
                else
                {
                    Toast.makeText(this ,"permission not given",Toast.LENGTH_SHORT).show()

                }
            }
        }
        fun accesslocation()
        {
            val latitude =
        }
    }
}