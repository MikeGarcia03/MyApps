package com.example.tics.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MyEditTextActivity extends AppCompatActivity  implements View.OnClickListener{

    private EditText mEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.scrollview);
         mEditText = (EditText) findViewById(R.id.my_edit_text);
         findViewById(R.id.my_button).setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
         Toast.makeText(this, mEditText.getText(), Toast.LENGTH_SHORT).show();
    }
}
