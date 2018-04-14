package com.example.tics.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class activity_custom_adapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*TextView textView = findViewById(R.id.text);
        ArrayList<User> arrayOfUsers = new ArrayList<User>();
        UserAdapter adapter = new UserAdapter(this, arrayOfUsers);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);*/
    }
}
