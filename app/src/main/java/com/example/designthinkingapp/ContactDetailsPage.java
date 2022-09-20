package com.example.designthinkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.net.URISyntaxException;

public class ContactDetailsPage extends AppCompatActivity {
    TextView contactEntry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details_page);

        contactEntry = findViewById(R.id.contactEntryText);

        Intent intent = getIntent();
        String entry = intent.getStringExtra("contactEntry");
        contactEntry.setText(entry);
    }

    public void callBtnClicked(View view) {
        Intent intent = new Intent(this, CallPage.class);
        startActivity(intent);
    }

    public void messageBtnClicked(View view) {
        Intent intent = new Intent(this, MessagePage.class);
        startActivity(intent);
    }
}