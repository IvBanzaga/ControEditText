package com.vanzaga.controedittext;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText txt_name, txt_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txt_name = findViewById(R.id.txt_name);
        txt_password = findViewById(R.id.txt_password);
    }

    public void Registro (View view){

        String nombre = txt_name.getText().toString();
        String password = txt_password.getText().toString();

        if (nombre.isEmpty()) {
            Toast.makeText(this, "Debe introducir un usuario",
                    Toast.LENGTH_SHORT).show();
        }
        if (password.isEmpty()){
            Toast.makeText(this,"Debe introducir una contraseña",Toast.LENGTH_SHORT).show();
        }
        if (!nombre.isEmpty() && !password.isEmpty()){
            Toast.makeText(this,"Realizando Registro",Toast.LENGTH_LONG).show();
        }
    }
}