package com.example.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        button = (Button) findViewById(R.id.toast_button);

        addEvents();
    }


    private String resultCheckListLayout() {
        String str = "Toppings: ";
        for (int i = 0; i < linearLayout.getChildCount() - 1; i++) {
            CheckBox checkBox = (CheckBox) linearLayout.getChildAt(i);
            if (checkBox.isChecked()) {
                str += checkBox.getText().toString() + " ";
            }
        }
        return str;
    }

    private void addEvents() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, resultCheckListLayout(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}