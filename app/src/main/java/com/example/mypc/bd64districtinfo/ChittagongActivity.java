package com.example.mypc.bd64districtinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChittagongActivity extends AppCompatActivity implements View.OnClickListener{

    Button brahmanbaria_button,comilla_button,laxmipur_button,chadpur_button,noakhali_button,feni_button,chittagong_button,coxsbazar_button,rangamati_button,khagrachari_button,bandarban_button;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong);

        brahmanbaria_button = (Button) findViewById(R.id.brahmanbariaId);
        comilla_button = (Button) findViewById(R.id.comillaId);
        laxmipur_button = (Button) findViewById(R.id.laxmipurId);
        chadpur_button = (Button) findViewById(R.id.chadpurId);
        noakhali_button = (Button) findViewById(R.id.noakhaliId);
        feni_button = (Button) findViewById(R.id.feniId);
        chittagong_button = (Button) findViewById(R.id.chittagongDstrctId);
        coxsbazar_button = (Button) findViewById(R.id.coxsbazarId);
        rangamati_button = (Button) findViewById(R.id.rangamatiId);
        bandarban_button = (Button) findViewById(R.id.bandarbanId);
        khagrachari_button = (Button) findViewById(R.id.khagrachariId);

        brahmanbaria_button.setOnClickListener(this);
        comilla_button.setOnClickListener(this);
        laxmipur_button.setOnClickListener(this);
        chadpur_button.setOnClickListener(this);
        noakhali_button.setOnClickListener(this);
        feni_button.setOnClickListener(this);
        chittagong_button.setOnClickListener(this);
        coxsbazar_button.setOnClickListener(this);
        rangamati_button.setOnClickListener(this);
        bandarban_button.setOnClickListener(this);
        khagrachari_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.brahmanbariaId){
            intent = new Intent(ChittagongActivity.this,ProfileActivity.class);
            intent.putExtra("name","1");
            startActivity(intent);
        }
        if(v.getId() == R.id.comillaId){
            intent = new Intent(ChittagongActivity.this,ProfileActivity.class);
            intent.putExtra("name","2");
            startActivity(intent);
        }

        if(v.getId() == R.id.laxmipurId){
            intent = new Intent(ChittagongActivity.this,ProfileActivity.class);
            intent.putExtra("name","3");
            startActivity(intent);
        }
        if(v.getId() == R.id.chadpurId){
            intent = new Intent(ChittagongActivity.this,ProfileActivity.class);
            intent.putExtra("name","4");
            startActivity(intent);
        }
        if(v.getId() == R.id.noakhaliId){
            intent = new Intent(ChittagongActivity.this,ProfileActivity.class);
            intent.putExtra("name","5");
            startActivity(intent);
        }
        if(v.getId() == R.id.feniId){
            intent = new Intent(ChittagongActivity.this,ProfileActivity.class);
            intent.putExtra("name","6");
            startActivity(intent);
        }
        if(v.getId() == R.id.chittagongDstrctId){
            intent = new Intent(ChittagongActivity.this,ProfileActivity.class);
            intent.putExtra("name","7");
            startActivity(intent);
        }if(v.getId() == R.id.coxsbazarId){
            intent = new Intent(ChittagongActivity.this,ProfileActivity.class);
            intent.putExtra("name","8");
            startActivity(intent);
        }if(v.getId() == R.id.rangamatiId){
            intent = new Intent(ChittagongActivity.this,ProfileActivity.class);
            intent.putExtra("name","9");
            startActivity(intent);
        }if(v.getId() == R.id.khagrachariId){
            intent = new Intent(ChittagongActivity.this,ProfileActivity.class);
            intent.putExtra("name","10");
            startActivity(intent);
        }if(v.getId() == R.id.bandarbanId){
            intent = new Intent(ChittagongActivity.this,ProfileActivity.class);
            intent.putExtra("name","11");
            startActivity(intent);
        }
    }
}
