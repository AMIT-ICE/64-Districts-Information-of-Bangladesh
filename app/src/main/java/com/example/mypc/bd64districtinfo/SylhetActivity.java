package com.example.mypc.bd64districtinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SylhetActivity extends AppCompatActivity implements View.OnClickListener {
    private Button hobiganj_button,sunamganj_button,mulvibazar_button,sylhet_button;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet);

        hobiganj_button = (Button) findViewById(R.id.habiganjId);
        sunamganj_button = (Button) findViewById(R.id.sunamganjId);
        mulvibazar_button = (Button) findViewById(R.id.moulavibazarId);
        sylhet_button = (Button) findViewById(R.id.sylhetdistrctId);

        hobiganj_button.setOnClickListener(this);
        sunamganj_button.setOnClickListener(this);
        mulvibazar_button.setOnClickListener(this);
        sylhet_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.habiganjId){
            intent = new Intent(SylhetActivity.this,ProfileActivity.class);
            intent.putExtra("name","22");
            startActivity(intent);
        }
        if(v.getId() == R.id.sunamganjId){
            intent = new Intent(SylhetActivity.this,ProfileActivity.class);
            intent.putExtra("name","23");
            startActivity(intent);
        }
        if(v.getId() == R.id.moulavibazarId){
            intent = new Intent(SylhetActivity.this,ProfileActivity.class);
            intent.putExtra("name","24");
            startActivity(intent);
        }
        if(v.getId() == R.id.sylhetdistrctId){
            intent = new Intent(SylhetActivity.this,ProfileActivity.class);
            intent.putExtra("name","25");
            startActivity(intent);
        }

    }
}
