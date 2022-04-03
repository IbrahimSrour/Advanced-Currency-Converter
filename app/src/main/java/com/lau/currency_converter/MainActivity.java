package com.lau.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button changePage;
    private EditText updatedRate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changePage.findViewById(R.id.changePageButton);
        updatedRate.findViewById(R.id.updatedRate);
    }
    public void goToPage2(View view){
        Intent obj = new Intent(getApplicationContext(), Page2.class);
        startActivity(obj);
    }
}