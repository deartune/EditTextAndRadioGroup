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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText EditTextName = (EditText) findViewById(R.id.EditTextName);
        EditTextName.setOnKeyListener(this);
        EditText EditTextAge = (EditText) findViewById(R.id.EditTextAge);
        EditTextAge.setOnKeyListener(this);
        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(this);
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(this);
        Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(this);
        rg0 = (RadioGroup) findViewById(R.id.gender);
        rg1 = (RadioGroup) findViewById(R.id.job);
        TextView tv = (TextView) findViewById(R.id.textView2);



    }



    @Override
    public void onClick(View v) {
        int id = rg0.getCheckedRadioButtonId();
        int id1 = rg1.getCheckedRadioButtonId();
        //getCheckedRadioButtonId() 의 리턴값은 선택된 RadioButton 의 id 값.
        RadioButton rb = (RadioButton) findViewById(id);
        RadioButton rb1 = (RadioButton) findViewById(id1);



        String text = rb.getText().toString() + rb1.getText().toString();
        text = "성별 : " + text;
        tv.setText(text);
    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        return false;
    }


}













