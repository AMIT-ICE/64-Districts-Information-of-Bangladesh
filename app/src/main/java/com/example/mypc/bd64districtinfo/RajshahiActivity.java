package com.example.mypc.bd64districtinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RajshahiActivity extends AppCompatActivity implements View.OnClickListener{
    private Button chapainababganj, joypurhat,naoga,natore,pabna,bagura,rajshahi,shirajganj;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi);

        chapainababganj = (Button) findViewById(R.id.chapainababganjId);
        joypurhat = (Button) findViewById(R.id.joypurhatId);
        naoga = (Button) findViewById(R.id.naogaId);
        natore = (Button) findViewById(R.id.natoreId);
        pabna = (Button) findViewById(R.id.pabnaId);
        bagura = (Button) findViewById(R.id.baguraId);
        rajshahi = (Button) findViewById(R.id.rajshahidstrdtId);
        shirajganj = (Button) findViewById(R.id.shirajganjId);

        chapainababganj.setOnClickListener(this);
        joypurhat.setOnClickListener(this);
        naoga.setOnClickListener(this);
        natore.setOnClickListener(this);
        pabna.setOnClickListener(this);
        bagura.setOnClickListener(this);
        rajshahi.setOnClickListener(this);
        shirajganj.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.chapainababganjId){
            intent = new Intent(RajshahiActivity.this,ProfileActivity.class);
            intent.putExtra("name","30");
            startActivity(intent);
        }
        if(v.getId() == R.id.joypurhatId){
            intent = new Intent(RajshahiActivity.this,ProfileActivity.class);
            intent.putExtra("name","31");
            startActivity(intent);
        }
        if(v.getId() == R.id.naogaId){
            intent = new Intent(RajshahiActivity.this,ProfileActivity.class);
            intent.putExtra("name","32");
            startActivity(intent);
        }
        if(v.getId() == R.id.natoreId){
            intent = new Intent(RajshahiActivity.this,ProfileActivity.class);
            intent.putExtra("name","33");
            startActivity(intent);
        }
        if(v.getId() == R.id.pabnaId){
            intent = new Intent(RajshahiActivity.this,ProfileActivity.class);
            intent.putExtra("name","34");
            startActivity(intent);
        }
        if(v.getId() == R.id.baguraId){
            intent = new Intent(RajshahiActivity.this,ProfileActivity.class);
            intent.putExtra("name","35");
            startActivity(intent);
        }
        if(v.getId() == R.id.rajshahidstrdtId){
            intent = new Intent(RajshahiActivity.this,ProfileActivity.class);
            intent.putExtra("name","36");
            startActivity(intent);
        }
        if(v.getId() == R.id.shirajganjId){
            intent = new Intent(RajshahiActivity.this,ProfileActivity.class);
            intent.putExtra("name","37");
            startActivity(intent);
        }
    }
}
