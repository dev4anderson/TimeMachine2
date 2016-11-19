package com.example.rm31308.timemachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.rm31308.timemachine.model.Carro;

public class DetalheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        if(getIntent() != null){
            Carro carro = getIntent().getParcelableExtra("Carro");
            Toast.makeText(this,
                    carro.getNome(),
                    Toast.LENGTH_SHORT).show();
        }

    }
}
