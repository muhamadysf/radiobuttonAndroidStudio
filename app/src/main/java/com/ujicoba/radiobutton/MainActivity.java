package com.ujicoba.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup opsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opsi = findViewById(R.id.opsi);

        opsi.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.android:
                        Toast.makeText(getApplication(), "Your Choice : Pemrograman Android", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.jaringan:
                        Toast.makeText(getApplication(), "Your Choice : Pemrograman Jaringan", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.operasi:
                        Toast.makeText(getApplication(), "Your Choice : Sistem Operasi", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}