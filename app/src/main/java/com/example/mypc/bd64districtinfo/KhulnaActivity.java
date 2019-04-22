package com.example.mypc.bd64districtinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KhulnaActivity extends AppCompatActivity implements View.OnClickListener{

    private Button khulna_button,bagerhat_button,narail_button,chuadanga_button,kushtia_button,jhenaidah_button,magura_button,meherpur_button,jessore_button,shatkhira_button;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna);

        khulna_button = (Button) findViewById(R.id.khulnaId);
        bagerhat_button = (Button) findViewById(R.id.bagerhatId);
        narail_button = (Button) findViewById(R.id.norailId);
        chuadanga_button = (Button) findViewById(R.id.cuadangaId);
        kushtia_button = (Button) findViewById(R.id.kushtiaId);
        jhenaidah_button = (Button) findViewById(R.id.jhinaidaId);
        magura_button = (Button) findViewById(R.id.maguraId);
        meherpur_button = (Button) findViewById(R.id.meherpurId);
        jessore_button = (Button) findViewById(R.id.jessoreId);
        shatkhira_button = (Button) findViewById(R.id.satkhiraId);

        khulna_button.setOnClickListener(this);
        bagerhat_button.setOnClickListener(this);
        narail_button.setOnClickListener(this);
        chuadanga_button.setOnClickListener(this);
        kushtia_button.setOnClickListener(this);
        jhenaidah_button.setOnClickListener(this);
        magura_button.setOnClickListener(this);
        meherpur_button.setOnClickListener(this);
        jessore_button.setOnClickListener(this);
        shatkhira_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.khulnaId){
            intent = new Intent(KhulnaActivity.this,ProfileActivity.class);
            intent.putExtra("name","12");
            startActivity(intent);
        }
        if(v.getId() == R.id.bagerhatId){
            intent = new Intent(KhulnaActivity.this,ProfileActivity.class);
            intent.putExtra("name","13");
            startActivity(intent);
        }

if(v.getId() == R.id.norailId){
            intent = new Intent(KhulnaActivity.this,ProfileActivity.class);
            intent.putExtra("name","14");
            startActivity(intent);
        }
if(v.getId() == R.id.cuadangaId){
            intent = new Intent(KhulnaActivity.this,ProfileActivity.class);
            intent.putExtra("name","15");
            startActivity(intent);
        }
if(v.getId() == R.id.kushtiaId){
            intent = new Intent(KhulnaActivity.this,ProfileActivity.class);
            intent.putExtra("name","16");
            startActivity(intent);
        }
if(v.getId() == R.id.jhinaidaId){
            intent = new Intent(KhulnaActivity.this,ProfileActivity.class);
            intent.putExtra("name","17");
            startActivity(intent);
        }
if(v.getId() == R.id.maguraId){
            intent = new Intent(KhulnaActivity.this,ProfileActivity.class);
            intent.putExtra("name","18");
            startActivity(intent);
        }
if(v.getId() == R.id.meherpurId){
            intent = new Intent(KhulnaActivity.this,ProfileActivity.class);
            intent.putExtra("name","19");
            startActivity(intent);
        }
if(v.getId() == R.id.jessoreId){
            intent = new Intent(KhulnaActivity.this,ProfileActivity.class);
            intent.putExtra("name","20");
            startActivity(intent);
        }
if(v.getId() == R.id.satkhiraId){
            intent = new Intent(KhulnaActivity.this,ProfileActivity.class);
            intent.putExtra("name","21");
            startActivity(intent);
        }

    }
}
