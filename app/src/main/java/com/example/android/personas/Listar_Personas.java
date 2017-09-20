package com.example.android.personas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Listar_Personas extends AppCompatActivity {
    private Resources resources;
    private TableLayout tabla;
    private ArrayList<Personas> p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar__personas);
        tabla = (TableLayout) findViewById(R.id.tblTabla);
        p = Datos.Obtener();

        for(int i = 0 ; i< p.size();i++){
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            c1.setText(""+(i+1));
            c2.setText(p.get(i).getNombre());
            c3.setText(p.get(i).getApellido());
            c4.setText(p.get(i).getCedula());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            tabla.addView(fila);
        }
    }
}
