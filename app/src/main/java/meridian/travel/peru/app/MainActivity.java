package meridian.travel.peru.app;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import meridian.travel.peru.app.utils.MainGameUtils;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private ConstraintLayout cl_for_sharing, cl_main_page, cl_for_study_about_current_stop,
            cl_with_quiz_questions, cl_with_quiz_questions_list;
    private LinearLayout ll_with_cities;
    private ImageView img_header, img_current_stop, img_current_city;
    private ImageButton img_btn_airbnb, img_btn_booking;
    private int currentLevel = 1, currentMenuItem = 0;
    private TextView tv_current_city, tv_london, tv_villajoyosa, tv_albufera, tv_ajim, tv_tamanrasset, tv_gonna_re_zhu,
            tv_longa_market, tv_botswana, tv_antarctica, tv_study, tv_quiz, tv_with_festival, tv_header_for_london_quiz, tv_main_txt_london_quiz;
    private MainGameUtils mainGameUtils;
    private final int menu_learn = R.id.menu_learn,
            menu_pave_way = R.id.menu_pave_way,
            menu_festivals = R.id.menu_festivals,
            menu_healthicons_travel = R.id.menu_healthicons_travel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAllComponents();
        img_btn_airbnb.setOnClickListener(v -> {

        });
        img_btn_booking.setOnClickListener(v -> {

        });
        tv_london.setOnClickListener(v -> {
            hideAllComponents();
            tv_current_city.setText(R.string.txt_london);
            mainGameUtils.showPictures(cl_for_sharing);
        });
        tv_with_festival.setOnClickListener(v -> {

        });
        tv_study.setOnClickListener(v -> {
            hideAllComponents();
            mainGameUtils.showViewForStudy(cl_for_study_about_current_stop);
        });
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case menu_learn:
                    hideAllComponents();
                    mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
                    return true;
                case menu_pave_way:
                    hideAllComponents();
                    mainGameUtils.showMainElements(cl_main_page);
                    return true;
                case menu_festivals:
                    hideAllComponents();
                    mainGameUtils.showFestivalElements(tv_with_festival);
                    mainGameUtils.showFestivalDuringLevel(currentLevel, tv_with_festival);
                    return true;
                case menu_healthicons_travel:
                    hideAllComponents();
                    mainGameUtils.showAllOpenCities(ll_with_cities);
                    return true;
                default:
                    return false;
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        checkPolicy();
        currentLevel = mainGameUtils.initGameProcessInterface(this);
        mainGameUtils.showMainElements(cl_main_page);
        setMenuInCorrectPosition(currentMenuItem);
    }

    @Override
    protected void onStop() {
        super.onStop();
        currentMenuItem = bottomNavigationView.getSelectedItemId();
    }

    private void initAllComponents() {
        mainGameUtils = new MainGameUtils();
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        //imageButtons
        img_btn_airbnb = findViewById(R.id.img_btn_airbnb);
        img_btn_booking = findViewById(R.id.img_btn_booking);
        //imageViews
        img_header = findViewById(R.id.img_header);
        img_current_city = findViewById(R.id.img_current_city);
        img_current_stop = findViewById(R.id.img_current_stop);
        //textViews
        tv_current_city = findViewById(R.id.tv_current_city);
        tv_london = findViewById(R.id.tv_london);
        tv_with_festival = findViewById(R.id.tv_with_festival);
        tv_villajoyosa = findViewById(R.id.tv_villajoyosa);
        tv_albufera = findViewById(R.id.tv_albufera);
        tv_ajim = findViewById(R.id.tv_ajim);
        tv_tamanrasset = findViewById(R.id.tv_tamanrasset);
        tv_gonna_re_zhu = findViewById(R.id.tv_gonna_re_zhu);
        tv_longa_market = findViewById(R.id.tv_longa_market);
        tv_botswana = findViewById(R.id.tv_botswana);
        tv_antarctica = findViewById(R.id.tv_antarctica);
        tv_quiz = findViewById(R.id.tv_quiz);
        tv_study = findViewById(R.id.tv_study);
        //Bigger views
        cl_for_sharing = findViewById(R.id.cl_for_sharing);
        cl_for_study_about_current_stop = findViewById(R.id.cl_for_study_about_current_stop);
        ll_with_cities = findViewById(R.id.ll_with_cities);
        cl_main_page = findViewById(R.id.cl_main_page);
        cl_with_quiz_questions = findViewById(R.id.cl_with_quiz_questions);
        cl_with_quiz_questions_list = findViewById(R.id.cl_with_quiz_questions_list);
    }

    private void checkPolicy() {

    }


    private void setMenuInCorrectPosition(int currentPosition) {
        switch (currentPosition) {
            case menu_learn:
                bottomNavigationView.setSelectedItemId(R.id.menu_learn);
                hideAllComponents();
                mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
                break;
            case menu_festivals:
                bottomNavigationView.setSelectedItemId(R.id.menu_festivals);
                hideAllComponents();
                mainGameUtils.showFestivalElements(tv_with_festival);
                mainGameUtils.showFestivalDuringLevel(currentLevel, tv_with_festival);
                break;
            case menu_healthicons_travel:
                bottomNavigationView.setSelectedItemId(R.id.menu_healthicons_travel);
                hideAllComponents();
                mainGameUtils.showAllOpenCities(ll_with_cities);
                break;
            default:
                bottomNavigationView.setSelectedItemId(R.id.menu_pave_way);
                hideAllComponents();
                mainGameUtils.showMainElements(cl_main_page);
                break;
        }
    }

    private void hideAllComponents() {
        cl_for_sharing.setVisibility(View.GONE);
        ll_with_cities.setVisibility(View.GONE);
        tv_with_festival.setVisibility(View.GONE);
        img_header.setVisibility(View.GONE);
        cl_main_page.setVisibility(View.GONE);
        cl_for_study_about_current_stop.setVisibility(View.GONE);
        cl_with_quiz_questions.setVisibility(View.GONE);
        cl_with_quiz_questions_list.setVisibility(View.GONE);
    }
}