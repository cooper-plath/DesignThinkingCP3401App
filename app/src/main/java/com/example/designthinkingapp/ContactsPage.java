package com.example.designthinkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactsPage extends AppCompatActivity {
    Button contact1;
    Button contact2;
    Button contact3;
    Button contact4;
    String contactEntry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_page);

        contact1 = findViewById(R.id.contact1);
        contact2 = findViewById(R.id.contact2);
        contact3 = findViewById(R.id.contact3);
        contact4 = findViewById(R.id.contact4);


    }

    public void onContactBtnClick(View view) {
        switch (view.getId()) {
            case R.id.contact1:
                System.out.println(contact1.getText().toString());
                contactEntry = contact1.getText().toString();
                break;
            case R.id.contact2:
                System.out.println(contact2.getText().toString());
                contactEntry = contact2.getText().toString();
                break;
            case R.id.contact3:
                System.out.println(contact3.getText().toString());
                contactEntry = contact3.getText().toString();
                break;
            case R.id.contact4:
                System.out.println(contact4.getText().toString());
                contactEntry = contact4.getText().toString();
                break;
        }
        Intent intent = new Intent(this, ContactDetailsPage.class);
        intent.putExtra("contactEntry", contactEntry);
        startActivity(intent);

    }
}