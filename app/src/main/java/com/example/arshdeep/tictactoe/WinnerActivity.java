package com.example.arshdeep.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WinnerActivity extends AppCompatActivity {
    Button b_again;
    TextView winner_name;
    String winner_player_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);
        b_again = (Button) findViewById(R.id.b_again);
        winner_name = (TextView) findViewById(R.id.winner_name);

        Bundle main_data = getIntent().getExtras();
        winner_player_name = main_data.getString("winner_player");
        winner_name.setText(winner_player_name);

        b_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WinnerActivity.this,StartActivity.class);
                startActivity(i);
            }
        });
    }
}
