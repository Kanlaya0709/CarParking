package com.example.carpacking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        id_car.visibility = View.GONE
        brand_car.visibility = View.GONE
        name_dirver.visibility = View.GONE
        update_button.visibility = View.GONE
        cancel_button.visibility = View.GONE

        findViewById<Button>(R.id.park1_button).setOnClickListener {
            showinput(it)
        }
    }
    private fun showinput(view: View){

        val idcarEditText = findViewById<EditText>(R.id.id_car)
        val brandcarEditText = findViewById<EditText>(R.id.brand_car)
        val namedirverEditText = findViewById<EditText>(R.id.name_dirver)

        val park1Button = findViewById<Button>(R.id.park1_button)

        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        idcarEditText.visibility = View.VISIBLE
        brandcarEditText.visibility = View.VISIBLE
        namedirverEditText.visibility = View.VISIBLE
        updateButton.visibility = View.VISIBLE
        cancelButton.visibility = View.VISIBLE

    }
    private fun input (view: View){


    }
}
