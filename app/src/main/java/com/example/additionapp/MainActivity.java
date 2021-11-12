package com.example.additionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button addButton;
    TextView putView;
    EditText Number1, Number2;

    int n1, n2, ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //list the items
        addButton = findViewById(R.id.addButton);
        putView = findViewById(R.id.putView);
        Number1 = findViewById(R.id.Number1);
        Number2 = findViewById(R.id.Number2);

        //add numbers when button is clicked
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //get the 2 number given by the user
                n1 = Integer.parseInt(Number1.getText().toString());
                n2 = Integer.parseInt(Number2.getText().toString());
                ans = n1 + n2;

                putView.setText(n1 + " + " + n2 + " = " + ans);
            }
        });
    }
}