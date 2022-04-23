package com.foysaldev.firebasedatatorecylerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        String fullname = getIntent().getStringExtra("fullname");
        String address = getIntent().getStringExtra("address");
        String phone = getIntent().getStringExtra("phone");

        textView = findViewById(R.id.TextViewId);
        textView.setText(fullname+"\n"+address+"\n"+phone);

    }
}