package com.example.designthinkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void contactsBtnClicked(View view) {
            Intent intent = new Intent(this, ContactsPage.class);
            startActivity(intent);
    }

    public void cameraBtnClicked(View view) {
        Intent intent = new Intent(this, Camera.class);
        startActivity(intent);
    }

    public void utilitiesBtnClicked(View view) {
        Intent intent = new Intent(this, UtilitiesActivity.class);
        startActivity(intent);
    }

    public void googleBtnClicked(View view) {
        Intent intent = new Intent(this, GoogleActivity.class);
        startActivity(intent);
    }

    public void settingsBtnClicked(View view) {
        try {
        Intent intent = new Intent(this, SettingActivity.class);
        startActivity(intent);
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}