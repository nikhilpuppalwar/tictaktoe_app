package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);
        TextView txtnik=findViewById(R.id.txtnikh);
        TextView txttic=findViewById(R.id.txttick);
        Intent ihome=new Intent(SplashScreen.this,buttonplay.class);
        Animation tran= AnimationUtils.loadAnimation(SplashScreen.this,R.anim.alpha);
        Animation scale= AnimationUtils.loadAnimation(SplashScreen.this,R.anim.scale);
        txttic.startAnimation(scale);
        txtnik.startAnimation(tran);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(ihome);
                finish();
            }
        },4000);
    }
}