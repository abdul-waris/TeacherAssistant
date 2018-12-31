package com.snailtail.teacherassistant;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


//animated splash screen using thread but in the current test mode it is being used
public class Splash extends AppCompatActivity {

    private TextView tv;
    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        tv= findViewById(R.id.tv);
        iv=findViewById(R.id.iv);

        Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.mytransition);

        tv.startAnimation(myAnim);
        iv.startAnimation(myAnim);
        final Intent i = new Intent(this, MainActivity.class);

        Thread timer = new Thread(){
            @Override
            public void run(){

                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();

                }
            }
        };

            timer.start();


    }
}
