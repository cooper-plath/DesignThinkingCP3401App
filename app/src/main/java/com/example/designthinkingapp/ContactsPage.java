package com.example.designthinkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class ContactsPage extends AppCompatActivity {
    Button contact1;
    Button contact2;
    Button contact3;
    Button contact4;
    String contactEntry;
    TableLayout contactsTable;
    String nameInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_page);

        contact1 = findViewById(R.id.contact1);
        contact2 = findViewById(R.id.contact2);
        contact3 = findViewById(R.id.contact3);
        contact4 = findViewById(R.id.contact4);
        contactsTable = findViewById(R.id.contactsTable);

        Intent newContact = getIntent();
        Bundle bundle = newContact.getExtras();

        if (bundle != null) {
            nameInput = bundle.getString("name");
            String numberInput = bundle.getString("number");
            System.out.println(nameInput + "  " + numberInput);
            updateTable(nameInput);
        }
    }

    @SuppressLint("ResourceAsColor")
    private void updateTable(String name) {


        TableRow row = new TableRow(this);
        row.setLayoutParams(new TableRow.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT));
        Button contactBtn = new Button(this);
        contactBtn.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
        contactBtn.setText(name);
        contactBtn.setTextColor(R.color.white);
        contactBtn.setBackgroundResource(R.color.purple_500);
        contactBtn.setTextSize(35);
        contactBtn.setPadding(10, 10, 10, 10);
        row.addView(contactBtn);
        contactsTable.addView(row);
        contactBtn.setId(View.generateViewId());
        contactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contactEntry = nameInput;
                passIntent();
            }
        });
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
        passIntent();

    }

    private void passIntent() {
        Intent intent = new Intent(this, ContactDetailsPage.class);
        intent.putExtra("contactEntry", contactEntry);
        startActivity(intent);
    }

    public void addContactClicked(View view) {
        Intent intent = new Intent(this, AddContactActivity.class);
        startActivity(intent);
    }
}