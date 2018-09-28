package com.example.sofe4640.intentsapp2;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final int REQ_CODE = 1;
    public String name ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getName(View v){

        Intent intent = new Intent(this,GetName.class);
        startActivityForResult(intent,REQ_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView lblName = (TextView) findViewById(R.id.lblGreeting) ;

        if(resultCode == RESULT_OK){

            name = data.getStringExtra("name");
            lblName.setText("Hello " + name);

        }

    }


    public void getOrigin(View v){
           String urlLink = "https://www.behindthename.com/name/";
           Uri urlName = Uri.parse(urlLink+name.toLowerCase());
           Intent url = new Intent(Intent.ACTION_VIEW,urlName);
           startActivity(url);

    }
}

