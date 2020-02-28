package com.sajib.spring2018;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText e1;
    private RadioButton rad1,rad2;
    private Button btn1;
    private TextView resultTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        rad1=findViewById(R.id.rad1);
        rad2=findViewById(R.id.rad2);
        btn1=findViewById(R.id.btn1);
        resultTv=findViewById(R.id.resultTV);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(e1.getText().toString().equals(""))
        {
            Toast.makeText(this, "enter number pls", Toast.LENGTH_SHORT).show();
        }
        else {
            Double val = Double.parseDouble(e1.getText().toString());
            if(rad1.isChecked()){
                Double result = (val-32)*5/9;
                resultTv.setText(String.valueOf(result));
            }
            else if(rad2.isChecked()){{
                Double result = (val*9)/5+32;
                resultTv.setText(String.valueOf(result));
            }}
        }

    }
}
