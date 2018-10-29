package com.jmk.edu.edittextandradiogroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,View.OnKeyListener {
    EditText EditTextName,EditTextAge;
    Button button1,button2,button3;
    RadioGroup rg0, rg1;
    TextView tv;
    String gender, job, name, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditTextName = (EditText) findViewById(R.id.EditTextName);
        EditTextName.setOnKeyListener(this);
        EditTextAge = (EditText) findViewById(R.id.EditTextAge);
        EditTextAge.setOnKeyListener(this);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        rg0 = (RadioGroup) findViewById(R.id.gender);
        rg1 = (RadioGroup) findViewById(R.id.job);
        tv = (TextView) findViewById(R.id.textView2);



    }



    @Override
    public void onClick(View v) {
        int id = rg0.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(id);
        int id1 = rg1.getCheckedRadioButtonId();
        RadioButton rb1 = (RadioButton) findViewById(id1);

        switch (v.getId()) {
            case R.id.button1 :

                String text = rb.getText().toString();
                text = "성별 : " + text;
                tv.setText(text);
                 break ;

             case R.id.button2 :

                 String text1 = rb1.getText().toString();
                 text1 = "직업 : " + text1;
                 tv.setText(text1); break ;
            case R.id.button3 :
                String text2 = "성별:"+ rb.getText().toString() + "직업:"+rb1.getText().toString();
                text2 = "이름 :"+name +"나이 : "+age + text2;
                tv.setText(text2); break ;}}








            public boolean onKey(View v, int keyCode, KeyEvent event) {
                switch (v.getId()){
                    case R.id.EditTextName:
                        name=EditTextName.getText().toString();
                        break;

                    case R.id.EditTextAge:
                        age=EditTextAge.getText().toString();
                        break;
                }
                return false;
            }
        }