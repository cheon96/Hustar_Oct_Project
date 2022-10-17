package com.example.oct_17;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_next;
    CalendarView cal;
    TextView btn_day;
    private String str;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cal =findViewById(R.id.cal);
        btn_day = findViewById(R.id.btn_day);

        cal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
                                        @Override
                                        public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                                            btn_day.setText((month+1) + " 월 " + day + " 일의 추천 루틴");
                                        }
                                    });

                btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = btn_day.getText().toString();
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra("str", str);
                startActivity(intent);
            }
        });


    }

}