package au.edu.swin.sdmd.w01_historicalimages

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAbout = findViewById<Button>(R.id.btnAbout)
        btnAbout.setOnClickListener{
            displayAbout(it)
        }
    }

    fun displayAbout(v: View) {
        Toast.makeText(v.context, "Historical Image App - 2024", Toast.LENGTH_LONG).show()
    }
}