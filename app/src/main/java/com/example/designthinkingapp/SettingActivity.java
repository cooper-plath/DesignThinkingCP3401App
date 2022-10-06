package com.example.designthinkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SettingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }

    public void modifyApp(View view) {
        Intent intent = new Intent(this, settingModify.class);
        startActivity(intent);
    }

    public void goSettingsFont(View view) {
        Intent intent = new Intent(this, SettingFont.class);
        startActivity(intent);
    }

    public void goSettingsBackground(View view) {
        Intent intent = new Intent(this, settingBackground.class);
        startActivity(intent);
    }

    public void goSettingsLanguage(View view) {
        Intent intent = new Intent(this, SettingLanguage.class);
        startActivity(intent);
    }

    public void closeApp(View view) {
    }

}