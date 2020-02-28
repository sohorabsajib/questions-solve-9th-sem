package com.sajib.fall2018;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView title;
    EditText in;
    RadioButton r1,r2,r3,r4;
    Button convert;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.t1);
        in = findViewById(R.id.e1);
        r1 = findViewById(R.id.m);
        r2 = findViewById(R.id.ce);
        convert =findViewById(R.id.con);
        res = findViewById(R.id.t2);

        convert.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(in.getText().toString().equals(""))
        {
            Toast.makeText(this, "enter number pls", Toast.LENGTH_SHORT).show();
        }
        else {
            Double val = Double.parseDouble((in.getText().toString()));
            if(r1.isChecked()){
                Double result = val*1000.0;
                res.setText(String.valueOf(result));
            }
            else if(r2.isChecked()){
                Double result = val*100000.0;
                res.setText(String.valueOf(result));
            }

        }


    }
}
