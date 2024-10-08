package com.example.mumin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registro1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void registrar(View v){
        //Recuperar view
        EditText etNombre = (EditText) findViewById(R.id.etNombre);
        EditText etApellido = (EditText) findViewById(R.id.etApellido);
        EditText etCorreo = (EditText) findViewById(R.id.etCorreo);
        EditText etPass = (EditText) findViewById(R.id.etPass);
        EditText etPass2 = (EditText) findViewById(R.id.etPass2);
        //Recuperar el valor de esa view
        String nombre = etNombre.getText().toString();
        String apellido = etApellido.getText().toString();
        String correo = etCorreo.getText().toString();
        String password = etPass.getText().toString();
        String password2 = etPass2.getText().toString();

        if(password.equals(password2)){
            Toast.makeText(this, "Registrado con exito", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }else{
            Toast.makeText(this, "Error al registrar", Toast.LENGTH_SHORT).show();
        }
    }
}