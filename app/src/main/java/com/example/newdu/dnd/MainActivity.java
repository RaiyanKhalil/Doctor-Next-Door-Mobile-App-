package com.example.newdu.dnd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //DbManager db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        db = new DbManager(this);
//        Cursor cursor = db.alldata();
//        if(cursor.getCount()==0){
//
//        }
    }

    public void startDbapp(View view){
        new DbManager(this);
        startActivity(new Intent(this,insertData.class));
    }
}
