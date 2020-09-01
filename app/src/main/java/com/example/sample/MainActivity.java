package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText ename,eemail,ephone,epassword;
    RadioButton rmale,rfemale;
    CheckBox cc,cj,cp,ca,ccp;
    Spinner sbranch;
    String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=findViewById(R.id.result);
        ename  = findViewById(R.id.name);
        eemail = findViewById(R.id.email);
        ephone = findViewById(R.id.phone);
        epassword = findViewById(R.id.password);
        rmale=findViewById(R.id.male);
        rfemale = findViewById(R.id.female);
        cc = findViewById(R.id.c);
        cj = findViewById(R.id.java);
        cp = findViewById(R.id.python);
        ca = findViewById(R.id.android);
        ccp= findViewById(R.id.cpp);
        sbranch = findViewById(R.id.depart);
    }


    @SuppressLint("SetTextI18n")
    public void display(View view) {

        String name = ename.getText().toString(),email = eemail.getText().toString(),phone=ephone.getText().toString();
        String password = epassword.getText().toString();
        if (rmale.isChecked())
            gender = rmale.getText().toString();
        else if (rfemale.isChecked())
            gender = rfemale.getText().toString()  ;
        StringBuilder builder = new StringBuilder();
        if (cc.isChecked())
            builder.append(cc.getText().toString());
        if (ca.isChecked())
            builder.append(ca.getText().toString());
        if (cj.isChecked())
            builder.append(cj.getText().toString());
        if (cp.isChecked())
            builder.append(cp.getText().toString());
        if (ccp.isChecked())
            builder.append(ccp.getText().toString());
        String branch = sbranch.getSelectedItem().toString();
        result.setText(name+"\n"+ email+"\n"+ phone +"\n"+ password+"\n"+ gender+"\n"+ builder.toString()+"\n"+ branch);


    }
}