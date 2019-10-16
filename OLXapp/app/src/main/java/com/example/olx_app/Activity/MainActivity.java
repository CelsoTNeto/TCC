package com.example.olx_app.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

    private EditText campoNome, campoEmail, campoSenha, campoEndereco, campoTelefone, campoCPF;
    private FirebaseAuth autenticacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoNome = findViewById(R.id.campoNome);
        campoEmail = findViewById(R.id.campoEmail);
        campoSenha = findViewById(R.id.campoSenha);
        campoEndereco = findViewById(R.id.campoEndereco);
        campoTelefone = findViewById(R.id.campoTEL);
        campoCPF = findViewById(R.id.campoCPF);


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

    public void validarUsuario(View view) {
        String textoNome = campoNome.getText().toString();
        String textoEmail = campoEmail.getText().toString();
        String textoSenha = campoSenha.getText().toString();
        String textoEndereco = campoEndereco.getText().toString();
        String textoTelefone = campoTelefone.getText().toString();
        String textoCPF = campoCPF.getText().toString();

        if (!textoNome.isEmpty() &&
                !textoEmail.isEmpty() &&
                !textoSenha.isEmpty() &&
                !textoEndereco.isEmpty() &&
                !textoTelefone.isEmpty() &&
            !textoCPF.isEmpty()) {

        }
        else {
            Toast.makeText(MainActivity.this, "preencha todos os dados !", Toast.LENGTH_SHORT).show();
        }
    }
}