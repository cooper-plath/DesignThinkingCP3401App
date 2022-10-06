package com.example.designthinkingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddContactActivity extends AppCompatActivity {
    EditText nameInput;
    EditText numberInput;
    Button addContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        addContact = findViewById(R.id.addContact);
        nameInput = findViewById(R.id.nameInput);
        numberInput = findViewById(R.id.numberInput);

    }

    public void addContactClicked(View view) {
        Toast.makeText(getApplicationContext(), "Contact Name: " + nameInput.getText().toString() +
                "\n" + "Number: " + numberInput.getText().toString(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ContactsPage.class);
        intent.putExtra("name", nameInput.getText().toString());
        intent.putExtra("number", numberInput.getText().toString());
        startActivity(intent);
    }
}