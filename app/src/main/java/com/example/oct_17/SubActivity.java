package com.example.oct_17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;



public class SubActivity extends AppCompatActivity {

    private Button btn_prev;
    TextView tx_routine;
// 리스트뷰 만드는중!
//    ListView routine_list;
//
//    String countryList[] = {"스쿼트", "런지"};
//    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countryList);
//
//    ListView routine_list = (ListView) findViewById(R.id.routine_list);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tx_routine = findViewById(R.id.tx_routine);
        btn_prev = findViewById(R.id.btn_prev);
        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Intent intent = getIntent();
        String str = intent.getStringExtra("str");

        tx_routine.setText(str);
    }
}