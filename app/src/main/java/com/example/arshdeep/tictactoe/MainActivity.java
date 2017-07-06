package com.example.arshdeep.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int turn;
    Animation anim;
    String player1_name,player2_name,player_draw = "----";
    String winner_player = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        turn = 1;
        anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadin);
        Bundle start_data = getIntent().getExtras();
        if(start_data == null){
            return;
        }
        player1_name = start_data.getString("player1_name");
        player2_name = start_data.getString("player2_name");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b1.getText().toString().equals("")) {
                    b1.startAnimation(anim);
                    Log.i("----", "Button 1 anim");
                    if (turn == 1) {
                        turn = 2;
                        b1.setBackgroundResource(R.drawable.cross);
                        b1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b1.setBackgroundResource(R.drawable.circle);
                        b1.setText("O");;
                    }

                    b1.clearAnimation();
                }
                endGame();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b2.getText().toString().equals("")) {
                    b2.startAnimation(anim);
                    Log.i("----", "Button 2 anim");
                    if (turn == 1) {
                        turn = 2;
                        b2.setBackgroundResource(R.drawable.cross);
                        b2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setBackgroundResource(R.drawable.circle);
                        b2.setText("O");;
                    }
                    b2.clearAnimation();
                }
                endGame();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b3.getText().toString().equals("")) {
                    b3.startAnimation(anim);
                    Log.i("----", "Button 3 anim");
                    if (turn == 1) {
                        turn = 2;
                        b3.setBackgroundResource(R.drawable.cross);
                        b3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b3.setBackgroundResource(R.drawable.circle);
                        b3.setText("O");;
                    }

                    b3.clearAnimation();
                }
                endGame();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b4.getText().toString().equals("")) {
                    b4.startAnimation(anim);
                    Log.i("----", "Button 4 anim");
                    if (turn == 1) {
                        turn = 2;
                        b4.setBackgroundResource(R.drawable.cross);
                        b4.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b4.setBackgroundResource(R.drawable.circle);
                        b4.setText("O");;
                    }

                    b4.clearAnimation();
                }
                endGame();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b5.getText().toString().equals("")) {
                    b5.startAnimation(anim);
                    Log.i("----", "Button 5 anim");
                    if (turn == 1) {
                        turn = 2;
                        b5.setBackgroundResource(R.drawable.cross);
                        b5.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b5.setBackgroundResource(R.drawable.circle);
                        b5.setText("O");;
                    }

                    b5.clearAnimation();
                }
                endGame();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b6.getText().toString().equals("")) {
                    b6.startAnimation(anim);
                    Log.i("----", "Button 6 anim");
                    if (turn == 1) {
                        turn = 2;
                        b6.setBackgroundResource(R.drawable.cross);
                        b6.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setBackgroundResource(R.drawable.circle);
                        b6.setText("O");;
                    }

                    b6.clearAnimation();
                }
                endGame();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b7.getText().toString().equals("")) {
                    b7.startAnimation(anim);

                    if (turn == 1) {
                        turn = 2;
                        b7.setBackgroundResource(R.drawable.cross);
                        b7.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setBackgroundResource(R.drawable.circle);
                        b7.setText("O");;
                    }
                    b7.clearAnimation();
                }
                endGame();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b8.getText().toString().equals("")) {
                    b8.startAnimation(anim);

                    if (turn == 1) {
                        turn = 2;
                        b8.setBackgroundResource(R.drawable.cross);
                        b8.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setBackgroundResource(R.drawable.circle);
                        b8.setText("O");;
                    }
                    b8.clearAnimation();
                }
                endGame();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b9.getText().toString().equals("")) {
                    b9.startAnimation(anim);

                    if (turn == 1) {
                        turn = 2;
                        b9.setBackgroundResource(R.drawable.cross);
                        b9.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setBackgroundResource(R.drawable.circle);
                        b9.setText("O");;
                    }
                    b9.clearAnimation();
                }
                endGame();
            }
        });

    }


    public void endGame(){
        String a,b,c,d,e,f,g,h,i;
        boolean end = false;
        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();
        if(b.equals("X") && c.equals("X") && a.equals("X")){
            Toast.makeText(MainActivity.this, "Winner Player X!",Toast.LENGTH_LONG).show();
            winner_player = "X";
            end = true;
        }
        if(e.equals("X") && i.equals("X") && a.equals("X")){
            Toast.makeText(MainActivity.this, "Winner Player X!",Toast.LENGTH_LONG).show();
            winner_player = "X";
            end = true;
        }
        if(d.equals("X") && g.equals("X") && a.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            winner_player = "X";
            end = true;
        }
        if(e.equals("X") && h.equals("X") && b.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            winner_player = "X";
            end = true;
        }
        if(c.equals("X") && e.equals("X") && g.equals("X")){
            Toast.makeText(MainActivity.this, "Winner Player X!",Toast.LENGTH_LONG).show();
            winner_player = "X";
            end = true;
        }
        if(c.equals("X") && f.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this, "Winner Player X!",Toast.LENGTH_LONG).show();
            winner_player = "X";
            end = true;
        }
        if(d.equals("X") && e.equals("X") && f.equals("X")){
            Toast.makeText(MainActivity.this, "Winner Player X!",Toast.LENGTH_LONG).show();
            winner_player = "X";
            end = true;
        }
        if(g.equals("X") && h.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this, "Winner Player X!",Toast.LENGTH_LONG).show();
            winner_player = "X";
            end = true;
        }

        if(b.equals("O") && c.equals("O") && a.equals("O")){
            Toast.makeText(MainActivity.this, "Winner Player O!",Toast.LENGTH_LONG).show();
            winner_player = "O";
            end = true;
        }
        if(e.equals("O") && i.equals("O") && a.equals("O")){
            Toast.makeText(MainActivity.this, "Winner Player O!",Toast.LENGTH_LONG).show();
            winner_player = "O";
            end = true;
        }
        if(d.equals("O") && g.equals("O") && a.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            winner_player = "O";
            end = true;
        }
        if(e.equals("O") && h.equals("O") && b.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            winner_player = "O";
            end = true;
        }
        if(c.equals("O") && e.equals("O") && g.equals("O")){
            Toast.makeText(MainActivity.this, "Winner Player O!",Toast.LENGTH_LONG).show();
            winner_player = "O";
            end = true;
        }
        if(c.equals("O") && f.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this, "Winner Player O!",Toast.LENGTH_LONG).show();
            winner_player = "O";
            end = true;
        }
        if(d.equals("O") && e.equals("O") && f.equals("O")){
            Toast.makeText(MainActivity.this, "Winner Player O!",Toast.LENGTH_LONG).show();
            winner_player = "O";
            end = true;
        }
        if(g.equals("O") && h.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this, "Winner Player O!",Toast.LENGTH_LONG).show();
            winner_player = "O";
            end = true;
        }
        if(!a.isEmpty() && !b.isEmpty() && !c.isEmpty() && !d.isEmpty() && !e.isEmpty() && !f.isEmpty() && !g.isEmpty() && !h.isEmpty() && !i.isEmpty() && end == false){
            Toast.makeText(MainActivity.this, "Draw", Toast.LENGTH_SHORT).show();
            winner_player = "N";
            end = true;
        }
        if(end){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            Intent in = new Intent(this,WinnerActivity.class);
            if(winner_player == "X"){
                in.putExtra("winner_player",player1_name);
            }else if(winner_player == "O"){
                in.putExtra("winner_player",player2_name);
            }else{
                in.putExtra("winner_player",player_draw);
            }
            startActivity(in);
        }
    }
}
