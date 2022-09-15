package com.example.designthinkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SettingActivity extends AppCompatActivity {

    public SettingActivity(Intent intent) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }

    public void goHome(View view) {
        Intent intent = new Intent(SettingActivity.this, MainActivity.class);
        new SettingActivity(intent);
    }

    public void goSettings(View view) {
        Intent intent = new Intent(SettingActivity.this, SettingActivity.class);
        new SettingActivity(intent);
    }
}