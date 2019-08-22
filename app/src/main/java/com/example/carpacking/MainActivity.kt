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
        findViewById<Button>(R.id.park2_button).setOnClickListener {
            showinput2(it)
        }
        findViewById<Button>(R.id.park3_button).setOnClickListener {
            showinput3(it)
        }
    }
    private fun showinput(view: View){

        val idcarEditText = findViewById<EditText>(R.id.id_car)
        val brandcarEditText = findViewById<EditText>(R.id.brand_car)
        val namedirverEditText = findViewById<EditText>(R.id.name_dirver)

        val park2Button = findViewById<Button>(R.id.park2_button)
        val park3Button = findViewById<Button>(R.id.park3_button)


        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        idcarEditText.visibility = View.VISIBLE
        brandcarEditText.visibility = View.VISIBLE
        namedirverEditText.visibility = View.VISIBLE
        updateButton.visibility = View.VISIBLE
        cancelButton.visibility = View.VISIBLE

        findViewById<Button>(R.id.update_button).setOnClickListener {
            inputcar1(it)
        }

    }
    private fun inputcar1 (view: View){
        val idcarEditText = findViewById<EditText>(R.id.id_car)
        val brandcarEditText = findViewById<EditText>(R.id.brand_car)
        val namedirverEditText = findViewById<EditText>(R.id.name_dirver)

        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        idcarEditText.visibility = View.GONE
        brandcarEditText.visibility = View.GONE
        namedirverEditText.visibility = View.GONE
        updateButton.visibility = View.GONE
        cancelButton.visibility = View.GONE

        val park1Button = findViewById<Button>(R.id.park1_button)
        park1Button.text = idcarEditText.text

    }

    private fun showinput2(view: View){

        val idcarEditText = findViewById<EditText>(R.id.id_car)
        val brandcarEditText = findViewById<EditText>(R.id.brand_car)
        val namedirverEditText = findViewById<EditText>(R.id.name_dirver)

        val park2Button = findViewById<Button>(R.id.park2_button)
        val park3Button = findViewById<Button>(R.id.park3_button)


        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        idcarEditText.visibility = View.VISIBLE
        brandcarEditText.visibility = View.VISIBLE
        namedirverEditText.visibility = View.VISIBLE
        updateButton.visibility = View.VISIBLE
        cancelButton.visibility = View.VISIBLE

        findViewById<Button>(R.id.update_button).setOnClickListener {
            inputcar2(it)
        }

    }
    private fun inputcar2 (view: View){
        val idcarEditText = findViewById<EditText>(R.id.id_car)
        val brandcarEditText = findViewById<EditText>(R.id.brand_car)
        val namedirverEditText = findViewById<EditText>(R.id.name_dirver)

        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        idcarEditText.visibility = View.GONE
        brandcarEditText.visibility = View.GONE
        namedirverEditText.visibility = View.GONE
        updateButton.visibility = View.GONE
        cancelButton.visibility = View.GONE

        val park2Button = findViewById<Button>(R.id.park2_button)
        park2Button.text = idcarEditText.text

    }
    private fun showinput3(view: View){

        val idcarEditText = findViewById<EditText>(R.id.id_car)
        val brandcarEditText = findViewById<EditText>(R.id.brand_car)
        val namedirverEditText = findViewById<EditText>(R.id.name_dirver)

        val park2Button = findViewById<Button>(R.id.park2_button)
        val park3Button = findViewById<Button>(R.id.park3_button)


        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        idcarEditText.visibility = View.VISIBLE
        brandcarEditText.visibility = View.VISIBLE
        namedirverEditText.visibility = View.VISIBLE
        updateButton.visibility = View.VISIBLE
        cancelButton.visibility = View.VISIBLE

        findViewById<Button>(R.id.update_button).setOnClickListener {
            inputcar3(it)
        }

    }
    private fun inputcar3 (view: View){
        val idcarEditText = findViewById<EditText>(R.id.id_car)
        val brandcarEditText = findViewById<EditText>(R.id.brand_car)
        val namedirverEditText = findViewById<EditText>(R.id.name_dirver)

        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        idcarEditText.visibility = View.GONE
        brandcarEditText.visibility = View.GONE
        namedirverEditText.visibility = View.GONE
        updateButton.visibility = View.GONE
        cancelButton.visibility = View.GONE

        val park3Button = findViewById<Button>(R.id.park3_button)
        park3Button.text = idcarEditText.text

    }






}
