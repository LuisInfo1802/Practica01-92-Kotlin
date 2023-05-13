package com.example.practica01_92_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSaludar = findViewById<Button>(R.id.btnSaludar) as Button;
        val txtNombre = findViewById<EditText>(R.id.txtNombre) as EditText;
        val lblSaludar = findViewById<TextView>(R.id.lblSaludo) as TextView;
        val btnCerrar = findViewById<Button>(R.id.btnCerrar) as Button;

        btnSaludar.setOnClickListener(View.OnClickListener {

            if(txtNombre.text.toString()=="")
            {
                Toast.makeText(this@MainActivity, "El campo esta vacio",Toast.LENGTH_SHORT).show();
            }
            else
            {
                val str="Hola "+txtNombre.getText().toString()+" ¿Como estas?";
                lblSaludar.text=str.toString();
            }

        })



    }




}