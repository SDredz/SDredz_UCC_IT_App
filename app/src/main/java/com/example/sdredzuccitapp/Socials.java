package com.example.sdredzuccitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Socials extends AppCompatActivity {

    ImageView facebookPic;
    TextView facebook;
    ImageView twitterPic;
    TextView twitter;
    ImageView instaPic;
    TextView insta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socials);

        facebookPic = findViewById(R.id.ivFacebook);
        facebook = findViewById(R.id.tvFacebook);
        twitterPic = findViewById(R.id.ivTwitter);
        twitter = findViewById(R.id.tvTwitter);
        instaPic = findViewById(R.id.ivInsta);
        insta = findViewById(R.id.tvInsta);

        facebookPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.facebook.com/uccjamaica/");
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.facebook.com/uccjamaica/");
            }
        });
        twitterPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://twitter.com/UCCjamaica?s=20&t=i1uGfhGjOK1p9ow_6f07Ug");
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://twitter.com/UCCjamaica?s=20&t=i1uGfhGjOK1p9ow_6f07Ug");
            }
        });
        instaPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/uccjamaica/?hl=en");
            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/uccjamaica/?hl=en");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}