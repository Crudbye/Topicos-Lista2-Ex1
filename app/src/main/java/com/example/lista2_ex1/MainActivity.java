package com.example.lista2_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText nome;
    private TextView titu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.botao);
        nome = (EditText) findViewById(R.id.nome);
        titu = (TextView) findViewById(R.id.titu);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titu.setText(nome.getText());
                Toast.makeText(getApplicationContext(),nome.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
        //btn.setOnClickListener(this);

    }

}
