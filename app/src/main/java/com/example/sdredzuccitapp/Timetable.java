package com.example.sdredzuccitapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Timetable extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
        pdfView = findViewById(R.id.pdfView);

        pdfView.fromAsset("Schedule.pdf").load();
    }
}
