package com.example.mypc.bd64districtinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BarishalActivity extends AppCompatActivity implements View.OnClickListener{

    private Button jhalokathi,patuakhali,pirojpur,barguna,barishal,bhola;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barishal);

        jhalokathi = (Button) findViewById(R.id.jhalokathiID);
        patuakhali = (Button) findViewById(R.id.patuakhaliID);
        pirojpur = (Button) findViewById(R.id.pirajpurID);
        barguna = (Button) findViewById(R.id.bargunaID);
        barishal = (Button) findViewById(R.id.barishaldstrctID);
        bhola = (Button) findViewById(R.id.bholaID);

        jhalokathi.setOnClickListener(this);
        patuakhali.setOnClickListener(this);
        pirojpur.setOnClickListener(this);
        barguna.setOnClickListener(this);
        barishal.setOnClickListener(this);
        bhola.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.jhalokathiID){
            intent = new Intent(BarishalActivity.this,ProfileActivity.class);
            intent.putExtra("name","38");
            startActivity(intent);
        }
        if(v.getId() == R.id.patuakhaliID){
            intent = new Intent(BarishalActivity.this,ProfileActivity.class);
            intent.putExtra("name","39");
            startActivity(intent);
        }
        if(v.getId() == R.id.pirajpurID){
            intent = new Intent(BarishalActivity.this,ProfileActivity.class);
            intent.putExtra("name","40");
            startActivity(intent);
        }
        if(v.getId() == R.id.bargunaID){
            intent = new Intent(BarishalActivity.this,ProfileActivity.class);
            intent.putExtra("name","41");
            startActivity(intent);
        }
        if(v.getId() == R.id.barishaldstrctID){
            intent = new Intent(BarishalActivity.this,ProfileActivity.class);
            intent.putExtra("name","42");
            startActivity(intent);
        }
        if(v.getId() == R.id.bholaID){
            intent = new Intent(BarishalActivity.this,ProfileActivity.class);
            intent.putExtra("name","43");
            startActivity(intent);
        }
    }
}
