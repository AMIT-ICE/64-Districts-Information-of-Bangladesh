package com.example.mypc.bd64districtinfo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button dhakabutton,khulnabutton,developerbutton,rajshahibutton,chittagongbutton,sylhetbutton,rongpurbutton,barishalbutton,mymensingbutton;
    private Intent intent;
    private AlertDialog.Builder alertDialogBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dhakabutton = (Button) findViewById(R.id.dhakaId);
        khulnabutton = (Button) findViewById(R.id.khulnaId);
        developerbutton = (Button) findViewById(R.id.DeveloperId);
        rajshahibutton = (Button) findViewById(R.id.rajshahiId);
        chittagongbutton = (Button) findViewById(R.id.chittagongId);
        sylhetbutton = (Button) findViewById(R.id.sylhetId);
        rongpurbutton = (Button) findViewById(R.id.rongpurId);
        barishalbutton = (Button) findViewById(R.id.barishalId);
        mymensingbutton = (Button) findViewById(R.id.mymensinghId);

        dhakabutton.setOnClickListener(this);
        khulnabutton.setOnClickListener(this);
        developerbutton.setOnClickListener(this);
        rajshahibutton.setOnClickListener(this);
        chittagongbutton.setOnClickListener(this);
        sylhetbutton.setOnClickListener(this);
        rongpurbutton.setOnClickListener(this);
        barishalbutton.setOnClickListener(this);
        mymensingbutton.setOnClickListener(this);

        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setTitle(R.string.title_text);
        alertDialogBuilder.setMessage(R.string.message_text);
        alertDialogBuilder.setIcon(R.drawable.info);
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"You have clicked on cancel button",Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.dhakaId){
            intent = new Intent(MainActivity.this,DhakaActivity.class);
        startActivity(intent);}
        if(v.getId()==R.id.khulnaId){
            intent = new Intent(MainActivity.this,KhulnaActivity.class);
        startActivity(intent);}
        if (v.getId()==R.id.rajshahiId){
            intent = new Intent(MainActivity.this,RajshahiActivity.class);
        startActivity(intent);}
        if (v.getId()==R.id.chittagongId){
            intent = new Intent(MainActivity.this,ChittagongActivity.class);
        startActivity(intent);}
        if (v.getId()==R.id.sylhetId){
            intent = new Intent(MainActivity.this,SylhetActivity.class);
        startActivity(intent);}
        if (v.getId()==R.id.rongpurId){
            intent = new Intent(MainActivity.this,RangpurActivity.class);
        startActivity(intent);}
        if (v.getId()==R.id.barishalId){
            intent = new Intent(MainActivity.this,BarishalActivity.class);
        startActivity(intent);}
        if (v.getId()==R.id.mymensinghId){
            intent = new Intent(MainActivity.this,MymensinghActivity.class);
        startActivity(intent);}
        if(v.getId()==R.id.DeveloperId) {
            intent = new Intent(MainActivity.this, DeveloperActivity.class);
            startActivity(intent);}
    }
    @Override
    public void onBackPressed() {
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.shareId){
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/type");
            String subject = "৬৪ জেলার তথ্য";
            String body = "Hi! Friends, The app will provide information about 64 districts along with their individual district maps.\nThank You!";
            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);
            startActivity(Intent.createChooser(intent,"Share via"));
        }
        return super.onOptionsItemSelected(item);
    }
}

