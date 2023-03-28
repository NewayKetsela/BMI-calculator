package com.example.bodymassindex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputEditText height =findViewById(R.id.height);
        TextInputEditText weight =findViewById(R.id.weight);
        TextView text =findViewById(R.id.textview);
        Button cal=findViewById(R.id.Calculate);
        height.setEnabled(true);
        weight.setEnabled(true);
        Button res=findViewById(R.id.reset);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (height.getText().toString().isEmpty() || weight.getText().toString().isEmpty()) {

                    Toast.makeText(MainActivity.this, "please fill the above value! ", Toast.LENGTH_SHORT).show();
                }
                else {
                    double h = Double.parseDouble(height.getText().toString());
                    double w = Double.parseDouble(weight.getText().toString());
                    double bmi = w / (h * h);
                    bmi=bmi*10000;
                    text.setText(Double.toString(bmi) + " ");
                }


            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 height.setText("");
                 weight.setText("");
                 text.setText("");
            }
        });


    }
}

