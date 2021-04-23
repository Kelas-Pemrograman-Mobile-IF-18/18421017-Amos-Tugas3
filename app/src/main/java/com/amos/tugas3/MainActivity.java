package com.amos.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtNilaiA, edtNilaiB;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    TextView txHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNilaiA = (EditText) findViewById(R.id.edtNilaiA);
        edtNilaiB = (EditText) findViewById(R.id.edtNilaiB);

        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);

        txHasil = (TextView) findViewById(R.id.txHasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int A = Integer.parseInt(edtNilaiA.getText().toString());
                int B = Integer.parseInt(edtNilaiB.getText().toString());
                int Hasil = A + B;

                txHasil.setText(String.valueOf(Hasil));
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int A = Integer.parseInt(edtNilaiA.getText().toString());
                int B = Integer.parseInt(edtNilaiB.getText().toString());
                int Hasil = A - B;

                txHasil.setText(String.valueOf(Hasil));
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int A = Integer.parseInt(edtNilaiA.getText().toString());
                int B = Integer.parseInt(edtNilaiB.getText().toString());
                int Hasil = A * B;

                txHasil.setText(String.valueOf(Hasil));
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int A = Integer.parseInt(edtNilaiA.getText().toString());
                int B = Integer.parseInt(edtNilaiB.getText().toString());
                int Hasil = A / B;

                txHasil.setText(String.valueOf(Hasil));
            }
        });
        
    }
}