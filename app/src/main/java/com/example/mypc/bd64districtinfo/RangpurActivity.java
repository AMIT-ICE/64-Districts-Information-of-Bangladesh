package com.example.mypc.bd64districtinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RangpurActivity extends AppCompatActivity implements View.OnClickListener{

    private Button kurigram,gaibandha,thakurgaon,dinajpur,nilphamari,panchagarh,rangpur,lalmonirhat;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rongpur);

        kurigram = (Button) findViewById(R.id.kurigramID);
        gaibandha = (Button) findViewById(R.id.gaibandhaId);
        thakurgaon = (Button) findViewById(R.id.thakurgaoId);
        dinajpur = (Button) findViewById(R.id.dinajpurId);
        nilphamari = (Button) findViewById(R.id.nilphamariID);
        panchagarh = (Button) findViewById(R.id.panchagarId);
        rangpur = (Button) findViewById(R.id.rangpurId);
        lalmonirhat = (Button) findViewById(R.id.lalmonirhatId);

        kurigram.setOnClickListener(this);
        gaibandha.setOnClickListener(this);
        thakurgaon.setOnClickListener(this);
        dinajpur.setOnClickListener(this);
        nilphamari.setOnClickListener(this);
        panchagarh.setOnClickListener(this);
        rangpur.setOnClickListener(this);
        lalmonirhat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.kurigramID){
            intent = new Intent(RangpurActivity.this,ProfileActivity.class);
            intent.putExtra("name","44");
            startActivity(intent);
        }if(v.getId() == R.id.gaibandhaId){
            intent = new Intent(RangpurActivity.this,ProfileActivity.class);
            intent.putExtra("name","45");
            startActivity(intent);
        }if(v.getId() == R.id.thakurgaoId){
            intent = new Intent(RangpurActivity.this,ProfileActivity.class);
            intent.putExtra("name","46");
            startActivity(intent);
        }if(v.getId() == R.id.dinajpurId){
            intent = new Intent(RangpurActivity.this,ProfileActivity.class);
            intent.putExtra("name","47");
            startActivity(intent);
        }if(v.getId() == R.id.nilphamariID){
            intent = new Intent(RangpurActivity.this,ProfileActivity.class);
            intent.putExtra("name","48");
            startActivity(intent);
        }if(v.getId() == R.id.panchagarId){
            intent = new Intent(RangpurActivity.this,ProfileActivity.class);
            intent.putExtra("name","49");
            startActivity(intent);
        }if(v.getId() == R.id.rangpurId){
            intent = new Intent(RangpurActivity.this,ProfileActivity.class);
            intent.putExtra("name","50");
            startActivity(intent);
        }if(v.getId() == R.id.lalmonirhatId){
            intent = new Intent(RangpurActivity.this,ProfileActivity.class);
            intent.putExtra("name","51");
            startActivity(intent);
        }
    }
}
