package com.latihan.project1a_erwinjulistiawan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText txtinputnama;
TextView txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtinputnama=findViewById(R.id.txtinputnama);
        txthasil=findViewById(R.id.txthasil);

    }
   public void btntampil(View view){
       txthasil.setText("Nama anda Adalah : "+txtinputnama.getText());
   }
}