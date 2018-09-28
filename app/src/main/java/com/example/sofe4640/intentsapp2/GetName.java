package com.example.sofe4640.intentsapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GetName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_name);
    }


    public void goBack(View v){
        Intent messageIntent = new Intent(Intent.ACTION_PICK);
        EditText txtMessage = (EditText) findViewById(R.id.txtName);
        messageIntent.putExtra("name",txtMessage.getText().toString());
        setResult(RESULT_OK,messageIntent);

        finish();
    }
}
