package com.ronykenson.mytodoappsony;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class EditItemActivity extends AppCompatActivity {
    private TextView TodoDescription;
    public Button saveButton;
    ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        TodoDescription = (TextView) findViewById(R.id.editText2);
        saveButton = (Button) findViewById(R.id.btnSaveButton);
        Intent intent = getIntent();
        String text = intent.getExtras().getString("text");
        String action = intent.getAction();
        String Type = intent.getType();

        TodoDescription.setText(text);
    }




    public void onSubmit(View v) {
        EditText Tododescription = (EditText) findViewById(R.id.editText2);
        Intent data = new Intent();
        data.putExtra("text", Tododescription.getText().toString());
        int TodoIndex = getIntent().getIntExtra("position",  0);
        data.putExtra("position", TodoIndex);
        setResult(RESULT_OK, data);
        finish();
    }





}
