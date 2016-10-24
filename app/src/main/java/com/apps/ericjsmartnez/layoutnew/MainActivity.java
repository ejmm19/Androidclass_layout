package com.apps.ericjsmartnez.layoutnew;
///IMPORTACION DE CLASES NECESARIAS PARA CONECTAR
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


//NOMBRE DEL LA CLASE O ACTIVIDAD
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
///DECLARACION DE VARIABLES DE CLASE
    Button boton1;
    Button boton2;
    Button boton3;
    Button boton4;
    Button boton5;
    TextView etiqueta;
    EditText cuadro;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //FUNCTION INICIAL DE LA ACTIVIDAD
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = (Button)findViewById(R.id.button); //ASIGNACION DE DATOS A LAS VARIABLES R.ID PARA SELECCIONAR LA ID
        boton2 = (Button)findViewById(R.id.button2);
        boton3 = (Button)findViewById(R.id.button3);
        boton4 = (Button)findViewById(R.id.button4);
        boton5 = (Button)findViewById(R.id.button5);
        etiqueta = (TextView)findViewById(R.id.textView);
        cuadro = (EditText)findViewById(R.id.editText);


        //AGREGARLE EVENTOS A LOS BOTONES
        boton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Context context = getApplicationContext();
                CharSequence text = "Boton 1 pulsado";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
            ///DELEGATE
        boton2.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        Context context = getApplicationContext();
        Toast toast;
        CharSequence  text;
        String texto;
        int duration = Toast.LENGTH_SHORT;
        switch (v.getId()){
            case(R.id.button2):
                text = "Boton 2 pulsado";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case(R.id.button3):
                text = "Boton 3 pulsado";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case(R.id.button4):
                text = "Boton 4 pulsado";
                texto = etiqueta.getText().toString();
                texto = texto + "Usuario";
                etiqueta.setText(texto);
                break;
            case(R.id.button5):
                text = "Boton 4 pulsado";
                texto = cuadro.getText().toString();
                texto = texto + "abc";
                cuadro.setText(texto);
                break;
        }


    }
}
