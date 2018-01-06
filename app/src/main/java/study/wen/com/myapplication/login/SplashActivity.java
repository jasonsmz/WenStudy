package study.wen.com.myapplication.login;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import study.wen.com.myapplication.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                LoginActivity.StartLoginActivity(SplashActivity.this);
                finish();
            }
        },2000);

    }
}
