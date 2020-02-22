package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mtruebutton;
    private Button mfalsebutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtruebutton=(Button)findViewById(R.id.True);
        mfalsebutton=(Button)findViewById(R.id.False);
        mtruebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                                R.string.Incorrect_toast,
                                Toast.LENGTH_SHORT).show();
            }
        });
        mfalsebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                               R.string.Correct_toast,
                                Toast.LENGTH_SHORT).show();
            }
        });
    }
}
