package com.example.werent_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Email, password;
    private Button Login;

    private String testEmail = "shashi@gmail.com";
    private  String testPassword = "shashi123";

    boolean isValid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = findViewById(R.id.txtEmailAddress);
        password = findViewById(R.id.txtpassword);
        Login = findViewById(R.id.btnlogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputEmail = Email.getText().toString();
                String inputPassword = password.getText().toString();

                if(inputEmail.isEmpty() || inputPassword.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please Enter Your All details correctly", Toast.LENGTH_SHORT).show();
                }else {
                    isValid = validate(inputEmail, inputPassword);

                }
            }
        });
    }
    private boolean validate(String eEmail, String ePassword)
    {
        if (eEmail.equals(testEmail) && ePassword.equals(ePassword))
        {
            return true;
        }
        return  false;
    }
}