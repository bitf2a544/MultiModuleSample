package com.example.zeesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.dateformater.formatDate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var str:String = "abcdf"
        str.formatDate("","")
        Toast.makeText(this,"",Toast.LENGTH_LONG).show()
    }
}