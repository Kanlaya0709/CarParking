package com.example.carpacking

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var car1 = Car(" "," "," ",false)
    private var car2 = Car(" "," "," ",false)
    private var car3 = Car(" "," "," ",false)

    var checkEditText: Boolean = false
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
        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        if(car1.status == true ){
            idcarEditText.setText(car1.id)
            brandcarEditText.setText(car1.brand)
            namedirverEditText.setText(car1.name)
        }else if (checkEditText == true){
            idcarEditText.text.clear()
            brandcarEditText.text.clear()
            namedirverEditText.text.clear()
        }
        idcarEditText.visibility = View.VISIBLE
        brandcarEditText.visibility = View.VISIBLE
        namedirverEditText.visibility = View.VISIBLE
        updateButton.visibility = View.VISIBLE
        cancelButton.visibility = View.VISIBLE

        val num = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        num.showSoftInput(idcarEditText, 0)

        findViewById<Button>(R.id.update_button).setOnClickListener {
            inputcar1(it)
        }

        findViewById<Button>(R.id.cancel_button).setOnClickListener {
            cancel1(it)
        }

    }
    private fun inputcar1 (view: View){
        val idcarEditText = findViewById<EditText>(R.id.id_car)
        val brandcarEditText = findViewById<EditText>(R.id.brand_car)
        val namedirverEditText = findViewById<EditText>(R.id.name_dirver)

        val park1Button = findViewById<Button>(R.id.park1_button)
        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        park1Button.text = idcarEditText.text

        car1.status = true
        car1.id = idcarEditText.text.toString()
        car1.brand = brandcarEditText.text.toString()
        car1.name = namedirverEditText.text.toString()

        checkEditText = true

        idcarEditText.visibility = View.GONE
        brandcarEditText.visibility = View.GONE
        namedirverEditText.visibility = View.GONE
        updateButton.visibility = View.GONE
        cancelButton.visibility = View.GONE

        view.invalidate()

        val input = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        input.hideSoftInputFromWindow(view.windowToken, 0)



    }

    private fun showinput2(view: View){

        val idcarEditText = findViewById<EditText>(R.id.id_car)
        val brandcarEditText = findViewById<EditText>(R.id.brand_car)
        val namedirverEditText = findViewById<EditText>(R.id.name_dirver)

        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        if(car2.status == true ){
            idcarEditText.setText(car2.id)
            brandcarEditText.setText(car2.brand)
            namedirverEditText.setText(car2.name)
        }else if (checkEditText == true){
            idcarEditText.text.clear()
            brandcarEditText.text.clear()
            namedirverEditText.text.clear()
        }

        idcarEditText.visibility = View.VISIBLE
        brandcarEditText.visibility = View.VISIBLE
        namedirverEditText.visibility = View.VISIBLE
        updateButton.visibility = View.VISIBLE
        cancelButton.visibility = View.VISIBLE

        val num = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        num.showSoftInput(idcarEditText, 0)

        findViewById<Button>(R.id.update_button).setOnClickListener {
            inputcar2(it)
        }
        findViewById<Button>(R.id.cancel_button).setOnClickListener {
            cancel2(it)
        }

    }
    private fun inputcar2 (view: View){
        val idcarEditText = findViewById<EditText>(R.id.id_car)
        val brandcarEditText = findViewById<EditText>(R.id.brand_car)
        val namedirverEditText = findViewById<EditText>(R.id.name_dirver)
        val park2Button = findViewById<Button>(R.id.park2_button)
        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        park2Button.text = idcarEditText.text
        car2.status = true
        car2.id = idcarEditText.text.toString()
        car2.brand = brandcarEditText.text.toString()
        car2.name = namedirverEditText.text.toString()

        checkEditText = true

        idcarEditText.visibility = View.GONE
        brandcarEditText.visibility = View.GONE
        namedirverEditText.visibility = View.GONE
        updateButton.visibility = View.GONE
        cancelButton.visibility = View.GONE


        view.invalidate()

        val input = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        input.hideSoftInputFromWindow(view.windowToken, 0)

    }
    private fun showinput3(view: View){

        val idcarEditText = findViewById<EditText>(R.id.id_car)
        val brandcarEditText = findViewById<EditText>(R.id.brand_car)
        val namedirverEditText = findViewById<EditText>(R.id.name_dirver)


        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        if(car3.status == true ){
            idcarEditText.setText(car2.id)
            brandcarEditText.setText(car2.brand)
            namedirverEditText.setText(car2.name)
        }else if (checkEditText == true){
            idcarEditText.text.clear()
            brandcarEditText.text.clear()
            namedirverEditText.text.clear()
        }

        idcarEditText.visibility = View.VISIBLE
        brandcarEditText.visibility = View.VISIBLE
        namedirverEditText.visibility = View.VISIBLE
        updateButton.visibility = View.VISIBLE
        cancelButton.visibility = View.VISIBLE

        val num = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        num.showSoftInput(idcarEditText, 0)

        findViewById<Button>(R.id.update_button).setOnClickListener {
            inputcar3(it)
        }
        findViewById<Button>(R.id.cancel_button).setOnClickListener {
           cancel3(it)
        }

    }
    private fun inputcar3 (view: View){
        val idcarEditText = findViewById<EditText>(R.id.id_car)
        val brandcarEditText = findViewById<EditText>(R.id.brand_car)
        val namedirverEditText = findViewById<EditText>(R.id.name_dirver)
        val park3Button = findViewById<Button>(R.id.park3_button)
        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)
        park3Button.text = idcarEditText.text
        car3.status = true
        car3.id = idcarEditText.text.toString()
        car3.brand = brandcarEditText.text.toString()
        car3.name = namedirverEditText.text.toString()

        checkEditText = true

        idcarEditText.visibility = View.GONE
        brandcarEditText.visibility = View.GONE
        namedirverEditText.visibility = View.GONE
        updateButton.visibility = View.GONE
        cancelButton.visibility = View.GONE

        view.invalidate()

        val input = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        input.hideSoftInputFromWindow(view.windowToken, 0)

    }
    private fun cancel1 (view: View) {
        val idcarEditText = findViewById<EditText>(R.id.id_car)
        val brandcarEditText = findViewById<EditText>(R.id.brand_car)
        val namedirverEditText = findViewById<EditText>(R.id.name_dirver)
        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)


        idcarEditText.text.clear()
        brandcarEditText.text.clear()
        namedirverEditText.text.clear()

        idcarEditText.visibility = View.GONE
        brandcarEditText.visibility = View.GONE
        namedirverEditText.visibility = View.GONE
        updateButton.visibility = View.GONE
        cancelButton.visibility = View.GONE


        park1_button.text ="ว่าง"

    }
    private fun cancel2 (view: View) {
        val idcarEditText = findViewById<EditText>(R.id.id_car)
        val brandcarEditText = findViewById<EditText>(R.id.brand_car)
        val namedirverEditText = findViewById<EditText>(R.id.name_dirver)
        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        idcarEditText.text.clear()
        brandcarEditText.text.clear()
        namedirverEditText.text.clear()

        idcarEditText.visibility = View.GONE
        brandcarEditText.visibility = View.GONE
        namedirverEditText.visibility = View.GONE
        updateButton.visibility = View.GONE
        cancelButton.visibility = View.GONE

        park2_button.text ="ว่าง"

    }
    private fun cancel3 (view: View) {
        val idcarEditText = findViewById<EditText>(R.id.id_car)
        val brandcarEditText = findViewById<EditText>(R.id.brand_car)
        val namedirverEditText = findViewById<EditText>(R.id.name_dirver)
        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        idcarEditText
        brandcarEditText.getText().clear()
        namedirverEditText.getText().clear()

        idcarEditText.visibility = View.GONE
        brandcarEditText.visibility = View.GONE
        namedirverEditText.visibility = View.GONE
        updateButton.visibility = View.GONE
        cancelButton.visibility = View.GONE

        park3_button.text ="ว่าง"
    }

}
