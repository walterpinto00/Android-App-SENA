package com.deportest.primerapp3235588;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalculadoraActivity extends AppCompatActivity {

    //Declaracion de variables
    private EditText num1, num2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculadora);

        //Programacion

        num1 = findViewById(R.id.TxtNum1Calc);
        num2 = findViewById(R.id.txtNum2Calc);
        resultado = findViewById(R.id.TxtResCalc);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    //Sumar
    public void Sumar(View view) {
        double n1 = Double.parseDouble(num1.getText().toString());
        double n2 = Double.parseDouble(num2.getText().toString());
        double suma = n1 + n2;
        resultado.setText(String.valueOf(suma));
    }
   //Restar
public void Restar(View view) {
    double n1 = Double.parseDouble(num1.getText().toString());
    double n2 = Double.parseDouble(num2.getText().toString());
    double resta = n1 - n2;
    resultado.setText(String.valueOf(resta));
}

//Multiplicar
    public void Multiplicar(View view) {
        double n1 = Double.parseDouble(num1.getText().toString());
        double n2 = Double.parseDouble(num2.getText().toString());
        double multiplicacion = n1 * n2;
        resultado.setText(String.valueOf(multiplicacion));
    }
//Dividir
    public void Dividir(View view) {
        double n1 = Double.parseDouble(num1.getText().toString());
        double n2 = Double.parseDouble(num2.getText().toString());

        if (n2 == 0) {
            resultado.setText("Error");
        } else {
            double division = n1 / n2;
            resultado.setText(String.valueOf(division));
        }
    }



    // Método nuevo para que funcione el botón de regresar
    public void volver(View view) {
        finish();
    }
}