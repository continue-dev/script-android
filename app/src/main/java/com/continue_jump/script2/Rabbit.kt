package com.continue_jump.script2

import android.content.res.Resources
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

class Rabbit {
    fun run(scriptFile: String, resource: Resources){
        var script = ""
        val assetManager = resource.getAssets()
        try {
            // CSVファイルの読み込み
            val inputStream = assetManager.open(scriptFile)
            val inputStreamReader = InputStreamReader(inputStream)
            val bufferReader = BufferedReader(inputStreamReader)
            var line: String
//            line = bufferReader.readLine()
//

            val lines = bufferReader.readLines()
            for (item in lines) {
                script += item + "\n"
                script += "rabbit:"
            }


            bufferReader.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }

        println(script);

    }
}