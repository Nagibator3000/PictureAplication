package com.kracubo.pictureaplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonFile;
    Button buttonLink;
    Button buttonVkId;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonFile = (Button) findViewById(R.id.btnFile);
        buttonLink = (Button) findViewById(R.id.btnLink);
        buttonVkId = (Button) findViewById(R.id.btnVkId);

        buttonFile.setOnClickListener(this);
        buttonLink.setOnClickListener(this);
        buttonVkId.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnFile:
                intent = new Intent(this,InFileActivity.class);
                startActivity(intent);
                break;
            case R.id.btnLink:
                intent = new Intent(this, InLinkActivity.class);
                startActivity(intent);
                break;
            case R.id.btnVkId:
                intent = new Intent(this, InVkIdActivity.class);
                startActivity(intent);
                break;

        }
    }
}
