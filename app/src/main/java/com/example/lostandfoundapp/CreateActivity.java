package com.example.lostandfoundapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lostandfoundapp.data.DatabaseHelper;
import com.example.lostandfoundapp.model.Advertisement;

public class CreateActivity extends AppCompatActivity {
    DatabaseHelper db;
    RadioGroup checkboxGroup;
    EditText NameInput, PhoneInput, DescriptionInput, DateInput, LocationInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_create_activity);
        db = new DatabaseHelper(this);
        checkboxGroup = findViewById(R.id.checkBoxGroup);
        NameInput = findViewById(R.id.NameInput);
        PhoneInput = findViewById(R.id.PhoneInput);
        DescriptionInput = findViewById(R.id.DescriptionInput);
        DateInput = findViewById(R.id.DateInput);
        LocationInput = findViewById(R.id.LocationInput);
    }
    public void onClickSave(View view) {
        int selectedId = checkboxGroup.getCheckedRadioButtonId();
        String name = NameInput.getText().toString();
        String phone = PhoneInput.getText().toString();
        String description = DescriptionInput.getText().toString();
        String date = DateInput.getText().toString();
        String location = LocationInput.getText().toString();

        //Checks if all fields have been filled in
        if (selectedId == -1 || name.isEmpty() || phone.isEmpty() || description.isEmpty() || date.isEmpty() || location.isEmpty()) {
            Toast.makeText(CreateActivity.this, "ALL FIELDS MUST BE FILLED", Toast.LENGTH_SHORT).show();
            return;
        }
        // gets type of advertisement and inserts it into the database
        String selectedOption = "";
        RadioButton selectedRadioButton = findViewById(selectedId);
        selectedOption = selectedRadioButton.getText().toString();
        long result = db.insertAdvertisement(new Advertisement(selectedOption, name, phone, description, date, location));
        if (result > 0) {
            Toast.makeText(CreateActivity.this, "REGISTERED USER", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(CreateActivity.this, "THERE WAS AN ISSUE REGISTERING THIS USER", Toast.LENGTH_SHORT).show();
        }
        finish();
    }
}