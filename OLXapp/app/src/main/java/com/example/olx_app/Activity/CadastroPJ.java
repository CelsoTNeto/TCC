package com.example.olx_app.Activity;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.olx_app.R;





public class CadastroPJ extends AppCompatActivity {
    private EditText campoNomeF , campoEmail, campoSenha, campoEndereco, campoTelefone, campoCNPJ;
    Button btnValidarEmpresa = (Button) findViewById(R.id.btnValidar);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pj);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        campoNomeF = findViewById(R.id.campoNomeF);
        campoEmail = findViewById(R.id.campoEmail);
        campoSenha = findViewById(R.id.campoSenha);
        campoEndereco = findViewById(R.id.campoEndereco);
        campoTelefone = findViewById(R.id.campoTelefone);
        campoCNPJ = findViewById(R.id.campoCNPJ);


        btnValidarEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoNomeF = campoNomeF.getText().toString();
                String textoEmail = campoEmail.getText().toString();
                String textoSenha = campoSenha.getText().toString();
                String textoEndereco = campoEndereco.getText().toString();
                String textoTelefone = campoTelefone.getText().toString();
                String textoCNPJ = campoCNPJ.getText().toString();
                if (!textoCNPJ.isEmpty() && !textoEmail.isEmpty()
                && !textoEndereco.isEmpty()&& !textoNomeF.isEmpty()
                && !textoSenha.isEmpty() && !textoTelefone.isEmpty()){

                }
                else{
                    Toast.makeText(CadastroPJ.this,"Preencha todos os campos",Toast.LENGTH_SHORT ).show();
                }
            }
        });
        {

        }






    }

}
