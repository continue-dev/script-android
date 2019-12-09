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

        var script = ""
        val assetManager = this.getResources().getAssets()
        try {
            // CSVファイルの読み込み
            val inputStream = assetManager.open("script.jump")
            val inputStreamReader = InputStreamReader(inputStream)
            val bufferReader = BufferedReader(inputStreamReader)
            var line: String
//            line = bufferReader.readLine()
//

            val lines = bufferReader.readLines()
            for (item in lines) {
                script += item + "\n"
            }


            bufferReader.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }

        println(script);
    }
}
