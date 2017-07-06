package com.example.arshdeep.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StartActivity extends AppCompatActivity {

    EditText name1,name2;
    Button b_play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        name1 = (EditText) findViewById(R.id.name1);
        name2 = (EditText) findViewById(R.id.name2);
        b_play = (Button) findViewById(R.id.b_play);

        b_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String player1_name = name1.getText().toString();
                String player2_name = name2.getText().toString();
                Intent i = new Intent(StartActivity.this, MainActivity.class);
                i.putExtra("player1_name", player1_name);
                i.putExtra("player2_name", player2_name);
                startActivity(i);
            }
        });


    }
}
