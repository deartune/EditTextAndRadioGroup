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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        TextView tv=(TextView)findViewById(R.id.textView2);
        RadioGroup rg0 =(RadioGroup)findViewById(R.id.gender);
        int id = rg0.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(id);
        RadioGroup rg1 =(RadioGroup)findViewById(R.id.job);
        int id1 = rg1.getCheckedRadioButtonId();
        RadioButton rb1 = (RadioButton) findViewById(id1);
        String name=((EditText)findViewById(R.id.EditTextName)).getText().toString();
        String age=((EditText)findViewById(R.id.EditTextAge)).getText().toString();

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
                tv.setText(text2); break ;}}}








