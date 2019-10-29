package com.example.olx_app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.olx_app.R;

public class Nav_header extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_header_logado);

        Button btnchamalogin = (Button) findViewById(R.id.btnValidar);


        btnchamalogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), Login.class);
                startActivity(it);
            }
        });


    }
public void irparatelalogin(View view){
    Button btnchamalogin = (Button) findViewById(R.id.btnValidar);

        alert("deu certo");
}
    private void alert(String s)
    {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
