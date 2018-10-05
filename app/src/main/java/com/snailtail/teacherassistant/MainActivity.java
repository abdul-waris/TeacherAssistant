package com.snailtail.teacherassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.stephentuso.welcome.WelcomeHelper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView profile_cv,scheduler_cv,attendance_cv,notes_cv,gpaCal_cv;
    WelcomeHelper welcomeScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeScreen = new WelcomeHelper(this, Welcome.class);
        welcomeScreen.show(savedInstanceState);

        profile_cv=  findViewById(R.id.profile_cardview);
        scheduler_cv= findViewById(R.id.scheduler_cardview);
        attendance_cv=  findViewById(R.id.attendance_cardview);
        notes_cv= findViewById(R.id.notes_cardview);
        gpaCal_cv= findViewById(R.id.gpaCal_cardview);

        profile_cv.setOnClickListener(this);
        scheduler_cv.setOnClickListener(this);
        attendance_cv.setOnClickListener(this);
        notes_cv.setOnClickListener(this);
        gpaCal_cv.setOnClickListener(this);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        welcomeScreen.onSaveInstanceState(outState);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.profile_cardview: i = new Intent(this,Profile.class); startActivity(i); break;
            case R.id.scheduler_cardview: i = new Intent(this,Scheduler.class); startActivity(i); break;
            case R.id.notes_cardview: i = new Intent(this,Notes.class); startActivity(i); break;
            case R.id.attendance_cardview: i = new Intent(this,Attendance.class); startActivity(i); break;
            case R.id.gpaCal_cardview: i = new Intent(this,GpaCal.class); startActivity(i); break;
            default: break;
        }
    }
}
