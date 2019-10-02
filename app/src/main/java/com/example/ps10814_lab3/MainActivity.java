package com.example.ps10814_lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;
import java.lang.String;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapComponent();
        setOnClickLister();
    }

    private EditText txtID = null;//
    private EditText txtPass = null;//
    private Button btnLogin = null;//
    private  String ok = "Đăng nhập thành công!";
    private  String notOk = "Đăng nhập thât bại";

    private void mapComponent(){
        if(txtID==null){
            txtID = findViewById(R.id.txtID);
        }
        if(txtPass==null){
            txtPass = findViewById(R.id.txtPass);
        }
        if(btnLogin==null){
            btnLogin = findViewById(R.id.btnLogin);
        }

    }
    private void setOnClickLister(){
        if(txtID==null){
            mapComponent();
        }
        if(txtPass==null){
            mapComponent();
        }
        if(btnLogin==null){
            mapComponent();
        }
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userID = txtID.getText().toString();
                String pass = txtPass.getText().toString();
                if(userID.equals("admin") && pass.equals("admin"))
                    Toast.makeText(MainActivity.this, ok, Toast.LENGTH_SHORT).show();

                else
                    Toast.makeText(MainActivity.this, notOk, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
