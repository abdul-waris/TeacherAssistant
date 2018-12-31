package com.snailtail.teacherassistant;

import com.stephentuso.welcome.BasicPage;
import com.stephentuso.welcome.TitlePage;
import com.stephentuso.welcome.WelcomeActivity;
import com.stephentuso.welcome.WelcomeConfiguration;

public class Welcome extends WelcomeActivity {

    @Override
    protected WelcomeConfiguration configuration() {
        return new WelcomeConfiguration.Builder(this)
                .defaultBackgroundColor(R.color.white)
                .page(new TitlePage(R.mipmap.logo,
                        "An All in one Assistant App for teachers")
                        .titleColor(getResources().getColor(R.color.yellow)).
                )
                .page(new BasicPage(R.drawable.ic_person_outline_black_24dp,
                        "Profiles",
                        "Student Profiles displaying the details")
                        .background(R.color.yellow)
                )
                .page(new BasicPage(R.drawable.ic_alarm_on_black_24dp,
                        "Scheduler",
                        "Set reminders and schedule important tasks.")
                        .background(R.color.pink)
                )
                .page(new BasicPage(R.drawable.ic_assignment_ind_black_24dp,
                        "Attendance",
                        "Student attendance record details.")
                        .background(R.color.new1)
                )
                .page(new BasicPage(R.drawable.ic_create_black_24dp,
                        "Notes",
                        "Takes personal notes.")
                        .background(R.color.green)
                )
                .page(new BasicPage(R.drawable.ic_school_black_24dp,
                        "GPA calculator",
                        "Calculate GPA.")
                        .background(R.color.deepPurple)
                )

                .swipeToDismiss(true)
                .build();
    }
}
