package com.example.examenrecycleview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

public class ThirdActivity extends AppCompatActivity {
    private Button btn;
    private TextView text ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        btn = findViewById(R.id.button2);
        text = findViewById(R.id.textView2);

        Bundle bundle = getIntent().getExtras();
        text.setText(bundle.getSerializable("uno").toString());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ThirdActivity.this,SecondActivty.class);
                i.putExtra("dos",text.getText().toString());
                setResult(RESULT_OK,i);
                finish();
            }
        });







    }
}
