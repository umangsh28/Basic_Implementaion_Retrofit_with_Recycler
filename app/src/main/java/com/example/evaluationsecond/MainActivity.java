package com.example.evaluationsecond;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mtemail;
    private EditText mtpassword;
    private Button mbtn;
    private Button mbtn2;
    private String emailvalidation= "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }


    private void initview() {
        mtemail=findViewById(R.id.email);
        mtpassword=findViewById(R.id.password);
        mbtn=findViewById(R.id.btn);
        mbtn2=findViewById(R.id.btn2);
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isEmail() && ispassword()){
                    Intent intent=new Intent(MainActivity.this,Homescreen.class);
                    startActivity(intent);
                }
            }
        });
        mbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Homescreen.class);
                startActivity(intent);
            }
        });

    }
    public boolean isEmail(){
        if(mtemail.getText().toString().matches(emailvalidation)){
            return true;
        }else{
            mtemail.setError("InValid Email");
            return  false;
        }
    }
    public boolean ispassword(){
        if(mtpassword.getText().toString().length()>=6){
            return true;
        }else{
            mtpassword.setError(" Password is very short.");
            return  false;
        }
    }






}