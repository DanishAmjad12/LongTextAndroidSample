package com.longtextsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

/**
 * Created by Danish on 5/18/2018.
 */

public class MainActivity extends AppCompatActivity
{
    AppCompatButton buttonClick;
    AppCompatButton buttonTwo;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);


        buttonClick= (AppCompatButton) findViewById(R.id.click);
        buttonTwo= (AppCompatButton) findViewById(R.id.click_two);


        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, WithRecyclerViewActivity.class);
                startActivity(intent);
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, WithoutRecyclerViewActivity.class);
                startActivity(intent);

            }
        });
    }
}
