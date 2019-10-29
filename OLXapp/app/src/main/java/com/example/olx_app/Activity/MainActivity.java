package com.example.olx_app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.olx_app.R;
import com.example.olx_app.config.ConfigFirebase;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {





    private EditText campoNome, campoEmail, campoSenha ,campoCPF;
    private FirebaseAuth autenticacao;
    private boolean CPFauth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        campoNome = findViewById(R.id.campoNome);
        campoEmail = findViewById(R.id.campoEmail);
        campoSenha = findViewById(R.id.campoSenha);
        campoCPF = findViewById(R.id.campoCPF);
        Button btnchamalogin = (Button) findViewById(R.id.btnValidar);


    }
    public void cadastrarUsuario(){

        autenticacao = ConfigFirebase.getAuth();
        autenticacao.createUserWithEmailAndPassword(
                "" , ""
        ).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

            }
        });

    }

    Button btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
    public void validarUsuario(View view) {



        btnCadastrar.setOnClickListener(new View.OnClickListener() {

            final String textoNome = campoNome.getText().toString();
            final String textoEmail = campoEmail.getText().toString();
            final String textoSenha = campoSenha.getText().toString();
            //String textoEndereco = campoEndereco.getText().toString();
            // String textoTelefone = campoTelefone.getText().toString();
            final String textoCPF = campoCPF.getText().toString();
            public void onClick(View v) {
                if (!textoNome.isEmpty() &&
                        !textoEmail.isEmpty() &&
                        !textoSenha.isEmpty() &&
                        !textoCPF.isEmpty() && CPFauth == true) {
                    Toast.makeText(MainActivity.this, "Cadastro realizado com sucesso " , Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "preencha todos os dados !", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}