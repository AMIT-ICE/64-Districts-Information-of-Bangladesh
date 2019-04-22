package com.example.mypc.bd64districtinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DhakaActivity extends AppCompatActivity implements View.OnClickListener{

    Button dhaka_button, gazipur_button, gopalganj_button, kishoreganj_button, faridpur_button, tangail_button , narshindi_button, narayanganj_button, madaripur_button, munshiganj_button, manikganj_button, shariyatpur_button, rajbari_button;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka);

        dhaka_button = (Button) findViewById(R.id.dhakaDistrictId);
        gazipur_button = (Button) findViewById(R.id.gazipurId);
        gopalganj_button = (Button) findViewById(R.id.gopalganjId);
        kishoreganj_button = (Button) findViewById(R.id.kishoreganjId);
        faridpur_button = (Button) findViewById(R.id.faridpurId);
        tangail_button = (Button) findViewById(R.id.tangailId);
        narshindi_button = (Button) findViewById(R.id.narshindiId);
        narayanganj_button = (Button) findViewById(R.id.narayanId);
        madaripur_button = (Button) findViewById(R.id.madaripurId);
        munshiganj_button = (Button) findViewById(R.id.munshiganjId);
        manikganj_button = (Button) findViewById(R.id.manikganjId);
        shariyatpur_button = (Button) findViewById(R.id.shariyatId);
        rajbari_button = (Button) findViewById(R.id.rajbariId);

        dhaka_button.setOnClickListener(this);
        gazipur_button.setOnClickListener(this);
        gopalganj_button.setOnClickListener(this);
        kishoreganj_button.setOnClickListener(this);
        faridpur_button.setOnClickListener(this);
        tangail_button.setOnClickListener(this);
        narshindi_button.setOnClickListener(this);
        narayanganj_button.setOnClickListener(this);
        madaripur_button.setOnClickListener(this);
        munshiganj_button.setOnClickListener(this);
        manikganj_button.setOnClickListener(this);
        shariyatpur_button.setOnClickListener(this);
        rajbari_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.dhakaDistrictId){
            intent = new Intent(DhakaActivity.this,ProfileActivity.class);
            intent.putExtra("name","Dhaka");
            startActivity(intent);
        }
        if(v.getId() == R.id.gazipurId){
            intent = new Intent(DhakaActivity.this,ProfileActivity.class);
            intent.putExtra("name","Gazipur");
            startActivity(intent);
        }
        if(v.getId() == R.id.gopalganjId){
            intent = new Intent(DhakaActivity.this,ProfileActivity.class);
            intent.putExtra("name","Gopalganj");
            startActivity(intent);
        }
        if(v.getId() == R.id.kishoreganjId){
            intent = new Intent(DhakaActivity.this,ProfileActivity.class);
            intent.putExtra("name","Kishoreganj");
            startActivity(intent);
        }
        if(v.getId() == R.id.manikganjId){
            intent = new Intent(DhakaActivity.this,ProfileActivity.class);
            intent.putExtra("name","Manikganj");
            startActivity(intent);
        }
        if(v.getId() == R.id.munshiganjId){
            intent = new Intent(DhakaActivity.this,ProfileActivity.class);
            intent.putExtra("name","Munshiganj");
            startActivity(intent);
        }
        if(v.getId() == R.id.narayanId){
            intent = new Intent(DhakaActivity.this,ProfileActivity.class);
            intent.putExtra("name","Narayanganj");
            startActivity(intent);
        }
        if(v.getId() == R.id.madaripurId){
            intent = new Intent(DhakaActivity.this,ProfileActivity.class);
            intent.putExtra("name","Madaripur");
            startActivity(intent);
        }
        if(v.getId() == R.id.faridpurId){
            intent = new Intent(DhakaActivity.this,ProfileActivity.class);
            intent.putExtra("name","Faridpur");
            startActivity(intent);
        }
        if(v.getId() == R.id.shariyatId){
            intent = new Intent(DhakaActivity.this,ProfileActivity.class);
            intent.putExtra("name","Shariyatpur");
            startActivity(intent);
        }
        if(v.getId() == R.id.tangailId){
            intent = new Intent(DhakaActivity.this,ProfileActivity.class);
            intent.putExtra("name","Tangail");
            startActivity(intent);
        }
        if(v.getId() == R.id.narshindiId){
            intent = new Intent(DhakaActivity.this,ProfileActivity.class);
            intent.putExtra("name","Narshindi");
            startActivity(intent);
        }
        if(v.getId() == R.id.rajbariId){
            intent = new Intent(DhakaActivity.this,ProfileActivity.class);
            intent.putExtra("name","Rajbari");
            startActivity(intent);
        }

    }
}
