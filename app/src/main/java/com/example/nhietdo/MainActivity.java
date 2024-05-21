package com.example.nhietdo;

import android.icu.text.DecimalFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button btncf,btnfc;
EditText edtdoC,edtdoF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edtdoC = findViewById(R.id.editTextText);
        edtdoF = findViewById(R.id.editTextText2);
        btncf = findViewById(R.id.button);
        btnfc = findViewById(R.id.button2);
        btncf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                DecimalFormat dcf=new DecimalFormat("#.00");
                String doC = edtdoC.getText()+"";
                //
                int C=Integer.parseInt(doC);
                edtdoF.setText(""+dcf.format(C*1.8+32));

            }
        });
        btnfc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                DecimalFormat dcf=new DecimalFormat("#.00");
                // TODO Auto-generated method stub
                String doF = edtdoF.getText()+"";
                int F=Integer.parseInt(doF);
                edtdoC.setText(""+dcf.format((F-32)/1.8));
            }
        });

    }
}