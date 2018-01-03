package com.apps.sutiksh.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import com.airbnb.lottie.LottieAnimationView;

/**
 * Created by jathin on 31/12/2017.
 */

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Add a timer of 5 seconds and goto calculator acttivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,
                        CalculatorActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}
