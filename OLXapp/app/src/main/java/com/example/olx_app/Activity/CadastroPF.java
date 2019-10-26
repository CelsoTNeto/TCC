package com.example.olx_app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.olx_app.R;
import com.example.olx_app.config.CPFauth;
import com.google.firebase.auth.FirebaseAuth;

public class CadastroPF extends AppCompatActivity {

    private EditText campoNome, campoEmail, campoSenha, campoEndereco, campoTelefone, campoCPF;
    private FirebaseAuth autenticacao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoNome = findViewById(R.id.campoNome);
        campoEmail = findViewById(R.id.campoEmail);
        campoSenha = findViewById(R.id.campoSenha);
        campoCPF = findViewById(R.id.campoCPF);
        Button btnValidar = (Button) findViewById(R.id.btnValidar);



        btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    String textoNome = campoNome.getText().toString();
                    String textoEmail = campoEmail.getText().toString();
                    String textoSenha = campoSenha.getText().toString();
                    //String textoCPF = campoCPF.getText().toString();

                    CPFauth validarCPF = new CPFauth();

                    if (!textoNome.isEmpty() &&
                            !textoEmail.isEmpty() &&
                            !textoSenha.isEmpty()){

                    }
                    else {
                        Toast.makeText(CadastroPF.this, "preencha todos os dados !", Toast.LENGTH_SHORT).show();
                    }
            }
        });






    }

    }
