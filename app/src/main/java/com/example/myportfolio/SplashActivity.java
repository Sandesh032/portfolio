package com.example.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    private static int splashTimer = 3000;
    ImageView backgroundImage;
    Animation sideAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        backgroundImage = findViewById(R.id.splash_icon);

        sideAnim = AnimationUtils.loadAnimation(this, R.anim.side_anim);

        backgroundImage.setAnimation(sideAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), Dashboard.class);
                startActivity(intent);
                finish();
            }
        }, splashTimer);
    }
}