package com.example.examenrecycleview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

public class SecondActivty extends AppCompatActivity {

    private EditText textonombre;
    private TextView textView;
    private Button btnenviar;
    private  RepositorioOficio repo;
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        repo = new RepositorioOficio();

        textonombre =  findViewById(R.id.editTextTextPersonName);
        textView = findViewById(R.id.txtvwtexto);
        btnenviar = findViewById(R.id.button2222);
        spinner = findViewById(R.id.spinner);




        ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),result -> {

            Intent i = result.getData();

            Bundle bundle= i.getExtras();
            textView.setText(bundle.getSerializable("dos").toString());




        });


        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivty.this,ThirdActivity.class);
                i.putExtra("uno",textonombre.getText().toString());
                activityResultLauncher.launch(i);
            }
        });

        ArrayAdapter<Oficio> myadaptaror = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,repo.getAll());
        spinner.setAdapter(myadaptaror);

    }
}
