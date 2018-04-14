package com.example.tics.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autocompletetextview);

        Button linearLayoutVerticalButton = findViewById(R.id.linearLayoutVertical);
        linearLayoutVerticalButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, LayoutActivity.class);
                intent.putExtra("LayoutKey",R.layout.vertical);
                startActivity(intent);
            }
        });

        Button linearLayoutHorizontalButton = findViewById(R.id.linearLayoutHorizontal);
        linearLayoutHorizontalButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, LayoutActivity.class);
                intent.putExtra("LayoutKey",R.layout.horizontal);
                startActivity(intent);
            }
        });

        Button RelativeLayoutButton = findViewById(R.id.RelativeLayout);
        RelativeLayoutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, LayoutActivity.class);
                intent.putExtra("LayoutKey",R.layout.relative);
                startActivity(intent);
            }
        });

        Button TableLayoutButton = findViewById(R.id.TableLayout);
        TableLayoutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, LayoutActivity.class);
                intent.putExtra("LayoutKey",R.layout.table);
                startActivity(intent);
            }
        });

        Button FrameLayoutButton = findViewById(R.id.FrameLayout);
        FrameLayoutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, LayoutActivity.class);
                intent.putExtra("LayoutKey",R.layout.frame);
                startActivity(intent);
            }
        });

        Button ListViewButton = findViewById(R.id.ListView);
        ListViewButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, LayoutActivity.class);
                intent.putExtra("LayoutKey",R.layout.listview);
                startActivity(intent);
            }
        });

        Button GridViewButton = findViewById(R.id.GridView);
        GridViewButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,LayoutActivity.class);
                intent.putExtra("LayoutKey",R.layout.gridview);
                startActivity(intent);
            }
        });
    }
}
