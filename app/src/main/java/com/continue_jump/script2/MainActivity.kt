package com.continue_jump.script2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.io.InputStreamReader
import java.io.BufferedReader
import java.io.IOException
import java.util.stream.Stream

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rabbit = Rabbit()
        rabbit.run("script.jump", this.getResources())
    }
}
