package com.kracubo.pictureaplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class InLinkActivity extends AppCompatActivity {
    ImageView imImageView;
    Button buttonLinkOk;
    EditText editTextLink;
    String urlTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_link);
        buttonLinkOk = (Button) findViewById(R.id.btnOkLink);
        editTextLink = (EditText) findViewById(R.id.editTxtLink);
        imImageView = (ImageView) findViewById(R.id.imgViewLink);




        buttonLinkOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          //      urlTitle = String.valueOf(editTextLink.getText());
                Picasso.with(InLinkActivity.this)
                        .load("http://zastavki-oboi.ru/thumbs/melkie_lepestki-4620.jpg")
                        .placeholder(R.drawable.ic_swap_vert_black_24dp)
                        .error(R.drawable.ic_highlight_off_black_24dp)
                        .resize(300,300)
                        .into(imImageView);

            }
        });
    }
}
