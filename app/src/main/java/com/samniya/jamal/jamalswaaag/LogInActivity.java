package com.samniya.jamal.jamalswaaag;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogInActivity extends Activity {
    private EditText emailET1;
    private EditText passwordET1;
    private Button signInBtn;
    private Button signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        emailET1 = findViewById(R.id.emailET1);
        passwordET1 = findViewById(R.id.passwordET1);
        signInBtn = findViewById(R.id.signInBtn);
        signUpBtn = findViewById(R.id.signInBtn);

        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(LogInActivity.this, MainTabsActivity.class);
            }
        });

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogInActivity.this, SignUPActivity.class);
                startActivity(intent);
            }
        });
    }
}
