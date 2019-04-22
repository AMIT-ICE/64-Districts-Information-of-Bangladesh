package com.example.mypc.bd64districtinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MymensinghActivity extends AppCompatActivity implements View.OnClickListener{

    private Button netrokona_button,sherpur_button,jamalpur_button,mymensingh_button;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymensing);
        netrokona_button = (Button) findViewById(R.id.netrokonaId);
        sherpur_button = (Button) findViewById(R.id.sherpurId);
        jamalpur_button = (Button) findViewById(R.id.jamalpurId);
        mymensingh_button = (Button) findViewById(R.id.mymensinghId);

        netrokona_button.setOnClickListener(this);
        sherpur_button.setOnClickListener(this);
        jamalpur_button.setOnClickListener(this);
        mymensingh_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.jamalpurId){
            intent = new Intent(MymensinghActivity.this,ProfileActivity.class);
            intent.putExtra("name","26");
            startActivity(intent);
        }
        if(v.getId() == R.id.netrokonaId){
            intent = new Intent(MymensinghActivity.this,ProfileActivity.class);
            intent.putExtra("name","27");
            startActivity(intent);
        }
        if(v.getId() == R.id.mymensinghId){
            intent = new Intent(MymensinghActivity.this,ProfileActivity.class);
            intent.putExtra("name","28");
            startActivity(intent);
        }
        if(v.getId() == R.id.sherpurId){
            intent = new Intent(MymensinghActivity.this,ProfileActivity.class);
            intent.putExtra("name","29");
            startActivity(intent);
        }
    }
}
