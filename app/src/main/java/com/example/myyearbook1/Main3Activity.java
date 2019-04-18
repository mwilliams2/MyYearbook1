package com.example.myyearbook1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        public void sendMessage(View view)
        {
            Intent intent = new Intent(FromActivity.this, ToActivity.class);
            startActivity(intent);


                });
            }
        }
    }
}
