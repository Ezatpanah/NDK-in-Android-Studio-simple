package com.example.ndk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    init {
        System.loadLibrary("api-keys")
    }
    external fun getKeys() : String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"API KEY"+ getKeys(),Toast.LENGTH_LONG).show()


    }
}