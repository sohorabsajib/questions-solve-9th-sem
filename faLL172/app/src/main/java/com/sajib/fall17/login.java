package com.sajib.fall17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    private EditText edit;
    private Button Btn;
    private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Btn=findViewById(R.id.btn1);
        edit=findViewById(R.id.e1);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email=edit.getText().toString().trim();
                Intent intent = new Intent(login.this,MainActivity.class);
                intent.putExtra("email",email);
                startActivity(intent);

            }
        });
    }
}
