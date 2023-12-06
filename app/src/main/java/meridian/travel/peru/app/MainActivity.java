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

import de.hdodenhof.circleimageview.CircleImageView;
import meridian.travel.peru.app.utils.MainGameUtils;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private CircleImageView img_current_map_element;
    private LinearLayout ll_london_progress, ll_valencia_progress, ll_albufera_progress, ll_ajim_progress,
            ll_tamanrasset_progress, ll_gonna_re_zhu_progress, ll_longa_market_progress, ll_botswana_progress, ll_antarctica_progress;
    private ConstraintLayout cl_for_sharing, cl_main_page, cl_for_study_about_current_stop,
            cl_with_quiz_questions, cl_with_quiz_questions_list, cl_with_cities, cl_with_festival,
            cl_with_photos, cl_with_progress;
    private ImageView img_current_stop, img_current_city, img_map_marker;
    private ImageButton img_btn_airbnb, img_btn_booking;
    private int currentLevel = 1, currentMenuItem = 0;
    private String previousLayout = "";
    private boolean firstStart;
    private TextView tv_current_city, tv_london, tv_valencia, tv_albufera, tv_ajim, tv_tamanrasset, tv_gonna_re_zhu,
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
        ll_london_progress.setOnClickListener(v -> {
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        img_btn_airbnb.setOnClickListener(v -> {
//todo: create HTTP request to tickets for current city
        });
        img_btn_booking.setOnClickListener(v -> {
//todo: create HTTP request to hotels for current city
        });
        img_map_marker.setOnClickListener(v -> {
//todo: show info about current city
        });
        tv_london.setOnClickListener(v -> {
            previousLayout = "cl_with_cities";
            hideAllComponents();
            tv_current_city.setText(R.string.txt_london);
            mainGameUtils.showPictures(cl_with_photos);
        });
        tv_with_festival.setOnClickListener(v -> {
            previousLayout = "cl_with_festival";
//todo: show info about festivals current city but you don`t have access if you don`t complete all quiz
        });
        tv_study.setOnClickListener(v -> {
            previousLayout = "cl_main_page";
            hideAllComponents();
            mainGameUtils.showViewForStudy(cl_for_study_about_current_stop);
        });
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case menu_learn:
                    hideAllComponents();
                    mainGameUtils.showQuizListProgress(cl_with_progress, currentLevel);
                    return true;
                case menu_pave_way:
                    hideAllComponents();
                    mainGameUtils.showMainElements(cl_main_page);
                    return true;
                case menu_festivals:
                    hideAllComponents();
                    mainGameUtils.showFestivalElements(cl_with_festival);
                    return true;
                case menu_healthicons_travel:
                    hideAllComponents();
                    mainGameUtils.showAllOpenCities(cl_with_cities);
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
        if (firstStart) {
            mainGameUtils.showMainElements(cl_main_page);
            firstStart = false;
        }
        setMenuInCorrectPosition(currentMenuItem);
    }

    @Override
    protected void onStop() {
        super.onStop();
        currentMenuItem = bottomNavigationView.getSelectedItemId();
    }

    @Override
    public void onBackPressed() {
        if (previousLayout.isEmpty())
            super.onBackPressed();
        returnBack(previousLayout);
    }

    private void initAllComponents() {
        mainGameUtils = new MainGameUtils();
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        //imageButtons
        img_btn_airbnb = findViewById(R.id.img_btn_airbnb);
        img_btn_booking = findViewById(R.id.img_btn_booking);
        //imageViews
        img_current_city = findViewById(R.id.img_current_city);
        img_current_stop = findViewById(R.id.img_current_stop);
        img_map_marker = findViewById(R.id.img_map_marker);
        img_current_map_element = findViewById(R.id.img_current_map_element);
        //textViews
        tv_current_city = findViewById(R.id.tv_current_city);
        tv_with_festival = findViewById(R.id.tv_with_festival);
        tv_london = findViewById(R.id.tv_london);
        tv_valencia = findViewById(R.id.tv_valencia);
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
        cl_with_cities = findViewById(R.id.cl_with_cities);
        cl_main_page = findViewById(R.id.cl_main_page);
        cl_with_quiz_questions = findViewById(R.id.cl_with_quiz_questions);
        cl_with_quiz_questions_list = findViewById(R.id.cl_with_quiz_questions_list);
        cl_with_festival = findViewById(R.id.cl_with_festival);
        cl_with_photos = findViewById(R.id.cl_with_photos);
        cl_with_progress = findViewById(R.id.cl_with_progress);
        ll_london_progress = findViewById(R.id.ll_london_progress);
        ll_valencia_progress = findViewById(R.id.ll_valencia_progress);
        ll_albufera_progress = findViewById(R.id.ll_albufera_progress);
        ll_ajim_progress = findViewById(R.id.ll_ajim_progress);
        ll_tamanrasset_progress = findViewById(R.id.ll_tamanrasset_progress);
        ll_gonna_re_zhu_progress = findViewById(R.id.ll_gonna_re_zhu_progress);
        ll_longa_market_progress = findViewById(R.id.ll_longa_market_progress);
        ll_botswana_progress = findViewById(R.id.ll_botswana_progress);
        ll_antarctica_progress = findViewById(R.id.ll_antarctica_progress);
    }

    private void checkPolicy() {

    }


    private void setMenuInCorrectPosition(int currentPosition) {
        switch (currentPosition) {
            case menu_learn:
                bottomNavigationView.setSelectedItemId(R.id.menu_learn);
                hideAllComponents();
                mainGameUtils.showQuizListProgress(cl_with_progress, currentLevel);
                break;
            case menu_festivals:
                bottomNavigationView.setSelectedItemId(R.id.menu_festivals);
                hideAllComponents();
                mainGameUtils.showFestivalElements(cl_with_festival);
                break;
            case menu_healthicons_travel:
                bottomNavigationView.setSelectedItemId(R.id.menu_healthicons_travel);
                hideAllComponents();
                mainGameUtils.showAllOpenCities(cl_with_cities);
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
        cl_with_cities.setVisibility(View.GONE);
        cl_main_page.setVisibility(View.GONE);
        cl_for_study_about_current_stop.setVisibility(View.GONE);
        cl_with_quiz_questions.setVisibility(View.GONE);
        cl_with_quiz_questions_list.setVisibility(View.GONE);
        cl_with_festival.setVisibility(View.GONE);
        cl_with_photos.setVisibility(View.GONE);
        cl_with_progress.setVisibility(View.GONE);
    }

    private void returnBack(String previousLayout) {
        if (!previousLayout.isEmpty()) {
            switch (previousLayout) {
                case "cl_with_cities":
                    hideAllComponents();
                    mainGameUtils.showAllOpenCities(cl_with_cities);
                    this.previousLayout = "";
                    break;
                case "cl_main_page":
                    hideAllComponents();
                    mainGameUtils.showAllOpenCities(cl_main_page);
                    this.previousLayout = "";
                    break;
                case "cl_with_progress":
                    hideAllComponents();
                    mainGameUtils.showAllOpenCities(cl_with_progress);
                    this.previousLayout = "";
                    break;
                default:
                    finish();
                    break;
            }
        }
    }
}