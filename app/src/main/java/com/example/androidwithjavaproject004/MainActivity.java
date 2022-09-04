package com.example.androidwithjavaproject004;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Switch switch1, switch2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1 = findViewById(R.id.switch1);
        switch2 = findViewById(R.id.switch2);
    }

    public void verificar(View V) {
        if (switch1.isChecked()) {
            Toast.makeText(this, "Datos activats", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Datos desactivats", Toast.LENGTH_SHORT).show();
        }

        if (switch2.isChecked()) {
            Toast.makeText(this, "Wifi activada", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wifi desactivada", Toast.LENGTH_SHORT).show();
        }
    }

    public void verificarDatos(View V){
        if (switch1.isChecked()){
            Toast.makeText(this, "Datos activats", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Datos desactivats", Toast.LENGTH_SHORT).show();
        }
    }

    public void verificarWifi(View V){
        if (switch2.isChecked()){
            Toast.makeText(this, "Wifi activats", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Wifi desactivats", Toast.LENGTH_SHORT).show();
        }
    }
}