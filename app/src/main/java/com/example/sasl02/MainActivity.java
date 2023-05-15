package com.example.sasl02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1= findViewById(R.id.tvHasil);
        EditText et1=findViewById(R.id.etangka1);
        EditText et2=findViewById(R.id.etangka2);
        Button bt1=findViewById(R.id.btjumlah);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jumlah=" ";
                if(view.getId()==bt1.getId()){
                    int x1= Integer.parseInt(et1.getText().toString());
                    int x2= Integer.parseInt(et2.getText().toString());
                    int hasil= x1 + x2;
                    jumlah=String.valueOf(hasil);
                    tv1.setText(jumlah);
                }
            }
        });
    }

}