package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class buttonplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_buttonplay);


        Button btplay;
        EditText first;
        EditText second;

        btplay=findViewById(R.id.btnplay);
        first=findViewById(R.id.edtfirst);
        second=findViewById(R.id.edtsec);

        Animation start= AnimationUtils.loadAnimation(buttonplay.this,R.anim.trans);
        TextView textplay=findViewById(R.id.txtstart);
        textplay.startAnimation(start);


        btplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtfist=first.getText().toString();
                String txtsecond=second.getText().toString();

                Intent start=new Intent(buttonplay.this,MainActivity.class);
                start.putExtra("one",txtfist);
                start.putExtra("two",txtsecond);
                startActivity(start);
            }
        });
    }
}