package com.example.android.personas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Agregar_Personas extends AppCompatActivity {
    private EditText cedula,nombre,apellido;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar__personas);
        resources = this.getResources();
        cedula = (EditText) findViewById(R.id.txtcedula);
        nombre = (EditText) findViewById(R.id.txtapellido);
        apellido = (EditText) findViewById(R.id.txtapellido);
    }

    public void Guardar(View v){
        String ced,nom,apel;
        ced = cedula.getText().toString().trim();
        nom = nombre.getText().toString().trim();
        apel = apellido.getText().toString().trim();

        Personas p = new Personas(nom,ced,apel);

        p.Guardar();
        Toast.makeText(this,resources.getString(R.string.mensaje_exitoso),Toast.LENGTH_SHORT).show();

    }

}
