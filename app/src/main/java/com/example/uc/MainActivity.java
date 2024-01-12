package com.example.uc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView1,textView2,textView3;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView1 = findViewById(R.id.textView4);
        textView2 = findViewById(R.id.textView5);
        textView3 = findViewById(R.id.textView2);
        editText = findViewById(R.id.editTextText);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Hi click listener worked!", Toast.LENGTH_SHORT).show();
//                String s=editText.getText().toString();
//                double kg = Double.parseDouble(s);
//                double g = kg * 1000;
//                String resultAsString = String.valueOf(g);
//                textView3.setText(resultAsString);
//            }
//        });
    }
        public void calculate(View view)
        {
            String s=editText.getText().toString();
                double kg = Double.parseDouble(s);
                double g = kg * 1000;
                String resultAsString = String.valueOf(g);
                textView3.setText(resultAsString);

        }

}