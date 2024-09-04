package com.example.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    LinearLayout main;
    int count=0;
    int flag = 0;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        init();

    }
    private void init(){
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        main=findViewById(R.id.main);


    }
    public void check(View v) {
        Button curbtn = (Button) v;
        if (curbtn.getText().toString().equals("")) {

            count++;
            if (flag == 0) {
                curbtn.setText("X");
                flag = 1;
            } else {
                curbtn.setText("O");
                flag = 0;
            }

            if (count > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();
                if (b1.equals(b2) && b2.equals(b3) && !b1.equals(" ")) {
                    Toast.makeText(this, "Winner is: " + name(b1), Toast.LENGTH_SHORT).show();
                    NewGame();
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    Toast.makeText(this, "Winner is: " + name(b4), Toast.LENGTH_SHORT).show();
                    NewGame();
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    Toast.makeText(this, "Winner is: " +name(b7), Toast.LENGTH_SHORT).show();
                    NewGame();
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
//4
                    Toast.makeText(this, "Winner is: " + name(b1), Toast.LENGTH_SHORT).show();
                    NewGame();
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
//5
                    Toast.makeText(this, "Winner is: " + name(b2), Toast.LENGTH_SHORT).show();
                    NewGame();
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
//6
                    Toast.makeText(this, "Winner is: " + name(b3), Toast.LENGTH_SHORT).show();
                    NewGame();
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
//7
                    Toast.makeText(this, "Winner is: " + name(b1), Toast.LENGTH_SHORT).show();
                    NewGame();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
//8
                    Toast.makeText(this, "Winner is: " + name(b3), Toast.LENGTH_SHORT).show();
                    NewGame();
                }



            }
            if (count==9){
                NewGame();
                Toast.makeText(this, "Game is Draw,\n game restart", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public  void NewGame(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count=0;
        flag = 0;
    }

    public String name(String n){
        Intent fromact=getIntent();
        String nameone=fromact.getStringExtra("one");
        String nametwo=fromact.getStringExtra("two");
        if (n.equals("X")){
            return nameone;
        } else if (n.equals("O")) {

            return  nametwo;
        }
        return n;
    }
}