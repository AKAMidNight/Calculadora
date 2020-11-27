package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button n1,n2,n3,n4,n5,n6,n7,n8,n9,n0;
    EditText tResultado;
    Button punto,suma,resta,multiplicacion,division,limpiar,igual;
    Double numero1,numero2,resultadoT;
    int operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tResultado=(EditText) findViewById(R.id.Resultado);

        n1=(Button)findViewById(R.id.btn1);
        n2=(Button)findViewById(R.id.btn2);
        n3=(Button)findViewById(R.id.btn3);
        n4=(Button)findViewById(R.id.btn4);
        n5=(Button)findViewById(R.id.btn5);
        n6=(Button)findViewById(R.id.btn6);
        n7=(Button)findViewById(R.id.btn7);
        n8=(Button)findViewById(R.id.btn8);
        n9=(Button)findViewById(R.id.btn9);
        n0=(Button)findViewById(R.id.btn0);

        punto=(Button)findViewById(R.id.btnPunto);
        suma=(Button)findViewById(R.id.btnSuma);
        resta=(Button)findViewById(R.id.btnResta);
        multiplicacion=(Button)findViewById(R.id.btnMul);
        division=(Button)findViewById(R.id.btnDivision);
        limpiar=(Button)findViewById(R.id.Limpiar);
        igual=(Button)findViewById(R.id.btnIgual);

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"1";
                tResultado.setText(n);
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"2";
                tResultado.setText(n);
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"3";
                tResultado.setText(n);
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"4";
                tResultado.setText(n);
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"5";
                tResultado.setText(n);
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"6";
                tResultado.setText(n);
            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"7";
                tResultado.setText(n);
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"8";
                tResultado.setText(n);
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"9";
                tResultado.setText(n);
            }
        });

        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"0";
                tResultado.setText(n);
            }
        });

        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+".";
                tResultado.setText(n);
                if (tResultado.getText().toString().contains(".")){
                    punto.setEnabled(false);
                }
                else{
                    punto.setEnabled(true);
                }
            }
        });

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*try {

                }catch (NumberFormatException nfe){

                }*/
                    String aux1=tResultado.getText().toString();
                    numero1=Double.parseDouble(aux1);
                    tResultado.setText("");
                    punto.setEnabled(true);
                    operacion=1;

            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1=tResultado.getText().toString();
                numero1=Double.parseDouble(aux1);
                tResultado.setText("");
                punto.setEnabled(true);
                operacion=2;

            }
        });

        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1=tResultado.getText().toString();
                numero1=Double.parseDouble(aux1);
                tResultado.setText("");
                punto.setEnabled(true);
                operacion=3;

            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1=tResultado.getText().toString();
                numero1=Double.parseDouble(aux1);
                tResultado.setText("");
                punto.setEnabled(true);
                operacion=4;

            }
        });

        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tResultado.setText("");
                numero1=0.0;
                numero2=0.0;
                resultadoT=0.0;
                punto.setEnabled(true);
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String aux2=tResultado.getText().toString();
                    numero2=Double.parseDouble(aux2);
                    tResultado.setText("");
                    punto.setEnabled(false);

                    if(operacion==1){
                        resultadoT=numero1+numero2;
                    }else if(operacion==2){
                        resultadoT=numero1-numero2;
                    }else if(operacion==3){
                        resultadoT=numero1*numero2;
                    }else if(operacion==4){
                            if(numero2==0.0){
                                tResultado.setText("error");
                            }
                            else{
                                resultadoT=numero1/numero2;
                            }

                    }

                tResultado.setText(""+resultadoT);
                numero1=resultadoT;
            }
        });
    }
}
