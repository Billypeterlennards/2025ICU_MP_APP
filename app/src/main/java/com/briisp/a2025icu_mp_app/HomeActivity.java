package com.briisp.a2025icu_mp_app;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.ComponentActivity;

public class HomeActivity extends ComponentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a TextView programmatically
        TextView welcomeTextView = new TextView(this);
        welcomeTextView.setText("Welcome to Library App");
        welcomeTextView.setTextSize(24); // Set text size if needed
        welcomeTextView.setPadding(16, 16, 16, 16); // Set padding if needed

        // Set the TextView as the content view of the activity
        setContentView(welcomeTextView);
    }
}
