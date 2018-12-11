package com.example.khawariz_.limasvolume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText tinggi , panjang , lebar ;
    Button hitung;
    TextView volume;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tinggi =  (EditText)findViewById(R.id.tinggi);
        panjang = (EditText)findViewById(R.id.panjang);
        lebar = (EditText)findViewById(R.id.lebar);
        hitung = (Button)findViewById(R.id.hitung);
        volume = (TextView)findViewById(R.id.volume);

    }
    public void hitungvolume(View view){
        try {
            validasi();
            hitung.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    volume.setText(String.valueOf(
                            Integer.valueOf(panjang.getText().toString()) * Integer.valueOf(lebar.getText().toString()) * Integer.valueOf(tinggi.getText().toString()) / 3
                    ));
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void validasi(){
        if ((panjang.getText().toString().length() == 0) || (tinggi.getText().toString().length() == 0) || (lebar.getText().toString().length() == 0)) {
            Toast.makeText(this, "Harap Diisi Semua", Toast.LENGTH_LONG).show();

        }
    }
}
