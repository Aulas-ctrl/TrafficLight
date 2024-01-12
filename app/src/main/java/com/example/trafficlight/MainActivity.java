package com.example.trafficlight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout b_1, b_2, b_3;
    private boolean start_stop = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_1 = findViewById(R.id.bulb1);
        b_2 = findViewById(R.id.bulb2);
        b_3 = findViewById(R.id.bulb3);

    }

    public void onClickStart(View view) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (start_stop) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }


                }
            }
        }).start();



        }

    @Override
    public void onDestroy() {
        super.onDestroy();
        start_stop = false;

    }

}
