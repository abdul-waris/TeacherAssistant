package com.snailtail.teacherassistant;

import com.stephentuso.welcome.BasicPage;
import com.stephentuso.welcome.TitlePage;
import com.stephentuso.welcome.WelcomeActivity;
import com.stephentuso.welcome.WelcomeConfiguration;

public class Welcome extends WelcomeActivity {

    @Override
    protected WelcomeConfiguration configuration() {
        return new WelcomeConfiguration.Builder(this)
                .defaultBackgroundColor(R.color.yellow)
                .page(new TitlePage(R.drawable.logo,
                        "An All in one Assistant App")
                )
                .page(new BasicPage(R.drawable.avatar_placeholder,
                        "Profiles",
                        "Student Profiles displaying the details")
                        .background(R.color.yellow)
                )
                .page(new BasicPage(R.drawable.ic_assignment_ind_black_24dp,
                        "Lorem ipsum",
                        ".")
                        .background(R.color.pink)
                )
                .page(new BasicPage(R.mipmap.ic_launcher,
                        "Header",
                        "More text.")
                        .background(R.color.yellow)
                )
                .page(new BasicPage(R.mipmap.ic_launcher,
                        "Lorem ipsum",
                        "dolor sit amet.")
                )
                .swipeToDismiss(true)
                .build();
    }
}
