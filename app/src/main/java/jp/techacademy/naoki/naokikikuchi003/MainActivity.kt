package jp.techacademy.naoki.naokikikuchi003

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num = 10
        Log.d("kotlintest" , Integer.toString(num))

        num = 50
        Log.d("kotlintest" , num.toString())
    }
}