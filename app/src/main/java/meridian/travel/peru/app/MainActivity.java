package meridian.travel.peru.app;

import static android.content.ContentValues.TAG;
import static meridian.travel.peru.app.utils.Constants.KEY_PREF_CURRENT_STOP_NUMBER;
import static meridian.travel.peru.app.utils.Constants.NAME_PREF;
import static meridian.travel.peru.app.utils.london.ConstantsLondon.TXT_MAIN_GREENWICH;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import meridian.travel.peru.app.activities.allMap.AllMapActivity;
import meridian.travel.peru.app.utils.MainGameUtils;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;
    private BottomNavigationView bottomNavigationView;
    private CircleImageView img_current_map_element;
    private LinearLayout ll_london_progress, ll_valencia_progress, ll_albufera_progress, ll_ajim_progress,
            ll_tamanrasset_progress, ll_gonna_re_zhu_progress, ll_longa_market_progress, ll_botswana_progress, ll_antarctica_progress;
    private ConstraintLayout cl_for_sharing, cl_main_page, cl_for_study_about_current_stop,
            cl_with_quiz_question, cl_with_quiz_questions_list, cl_with_cities, cl_with_festival,
            cl_with_photos, cl_with_progress, cl_with_info_about_current_city;
    private ImageView img_current_stop, img_current_city, img_map_marker;
    private ImageButton img_btn_airbnb, img_btn_booking;
    private int currentLevel = 0, currentMenuItem = 0;
    private String previousLayout = "";
    private boolean firstStart;
    private TextView tv_current_city, tv_london, tv_valencia, tv_albufera, tv_ajim, tv_tamanrasset, tv_gonna_re_zhu,
            tv_longa_market, tv_botswana, tv_antarctica, tv_study, tv_quiz, tv_with_festival, tv_london_progress, tv_valencia_progress, tv_albufera_progress,
            tv_ajim_progress, tv_tamanrasset_progress, tv_gonna_re_zhu_progress, tv_longa_market_progress, tv_botswana_progress, tv_antarctica_progress,
            tv_quiz_question_1, tv_quiz_question_2, tv_quiz_question_3, tv_quiz_question_4, tv_quiz_question_5, tv_quiz_question_6, tv_quiz_question_7,
            tv_quiz_question_8, tv_quiz_question_9, tv_quiz_question_10, tv_quiz_variant_a, tv_quiz_variant_b, tv_quiz_variant_c, tv_quiz_variant_d,
            tv_next_place_for_study_about_current_stop, tv_quiz_about_current_stop;
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
        //handle progress activity
        ll_london_progress.setOnClickListener(v -> {
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        tv_london_progress.setOnClickListener(v -> {
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        //handle show questions
        tv_quiz_question_1.setOnClickListener(v -> {
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        //handle all way at the map
        img_current_map_element.setOnClickListener(v -> {
            Intent goAllMapActivity = new Intent(this, AllMapActivity.class);
//            goAllMapActivity.putExtra(KEY_PREF_CURRENT_STOP_NUMBER, currentLevel);
            startActivity(goAllMapActivity);
        });
        //handle touch answers
        tv_quiz_variant_a.setOnClickListener(v -> {
            if (mainGameUtils.checkAnswerClick(tv_quiz_variant_a, currentLevel)) {
                Toast.makeText(this, R.string.txt_right_answer, Toast.LENGTH_LONG).show();
                addCountProgress(currentLevel);
                currentLevel++;
                onBackPressed();
            } else {
                Toast.makeText(this, R.string.txt_wrong_answer, Toast.LENGTH_LONG).show();
            }
        });
        tv_quiz_variant_b.setOnClickListener(v -> {
            if (mainGameUtils.checkAnswerClick(tv_quiz_variant_b, currentLevel)) {
                Toast.makeText(this, R.string.txt_right_answer, Toast.LENGTH_LONG).show();
                addCountProgress(currentLevel);
                currentLevel++;
                onBackPressed();
            } else {
                Toast.makeText(this, R.string.txt_wrong_answer, Toast.LENGTH_LONG).show();
            }
        });
        tv_quiz_variant_c.setOnClickListener(v -> {
            if (mainGameUtils.checkAnswerClick(tv_quiz_variant_c, currentLevel)) {
                Toast.makeText(this, R.string.txt_right_answer, Toast.LENGTH_LONG).show();
                addCountProgress(currentLevel);
                currentLevel++;
                onBackPressed();
            } else {
                Toast.makeText(this, R.string.txt_wrong_answer, Toast.LENGTH_LONG).show();
            }
        });
        tv_quiz_variant_d.setOnClickListener(v -> {
            if (mainGameUtils.checkAnswerClick(tv_quiz_variant_d, currentLevel)) {
                Toast.makeText(this, R.string.txt_right_answer, Toast.LENGTH_LONG).show();
                addCountProgress(currentLevel);
                currentLevel++;
                onBackPressed();
            } else {
                Toast.makeText(this, R.string.txt_wrong_answer, Toast.LENGTH_LONG).show();
            }
        });

        img_btn_airbnb.setOnClickListener(v -> {
//todo: create HTTP request to tickets for current city
        });
        img_btn_booking.setOnClickListener(v -> {
//todo: create HTTP request to hotels for current city
        });
        //handle touch to map marker
        img_map_marker.setOnClickListener(v -> {
            ImageView img_current_city = findViewById(R.id.img_current_city);
            hideAllComponents();
            previousLayout = "cl_main_page";
            mainGameUtils.startCityImageAnimation(img_current_city, mainGameUtils.getIdDrawable(currentLevel));
            mainGameUtils.showInfoAboutCurrentPlace(cl_with_info_about_current_city, currentLevel);
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
        //handle cl_main_page
        tv_study.setOnClickListener(v -> {
            previousLayout = "cl_main_page";
            hideAllComponents();
            mainGameUtils.showViewForStudy(cl_for_study_about_current_stop);
        });
        tv_quiz.setOnClickListener(v -> {
            previousLayout = "cl_main_page";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
            bottomNavigationView.setSelectedItemId(R.id.menu_learn);
        });
        tv_quiz_about_current_stop.setOnClickListener(v -> {
            previousLayout = "cl_main_page";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
            bottomNavigationView.setSelectedItemId(R.id.menu_learn);
        });
        tv_next_place_for_study_about_current_stop.setOnClickListener(v -> {
            if (tv_next_place_for_study_about_current_stop.getText().toString().equals("Next place")) {
                Log.d(TAG, "onCreate: WORKING!!!");
                previousLayout = "cl_for_study_about_current_stop";
                hideAllComponents();
                mainGameUtils.showSecondPlace(cl_for_study_about_current_stop);
//                bottomNavigationView.setSelectedItemId(R.id.menu_learn);
            } else {
                Log.d(TAG, "onCreate: NO WORKING!!!");
                onBackPressed();
            }
        });
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case menu_learn:
                    hideAllComponents();
                    mainGameUtils.showQuizListProgress(cl_with_progress, currentLevel);
                    return true;
                case menu_pave_way:
                    hideAllComponents();
                    mainGameUtils.showMainElements(cl_main_page, img_map_marker);
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
        Log.d(TAG, "onResume: currentLevel1: " + currentLevel);
        currentLevel = prefs.getInt(KEY_PREF_CURRENT_STOP_NUMBER, 0);
        Log.d(TAG, "onResume: currentLevel2: " + currentLevel);
        mainGameUtils.initGameProcessInterface(MainActivity.this, currentLevel);
        if (firstStart) {
            mainGameUtils.showMainElements(cl_main_page, img_map_marker);
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
        prefs = getSharedPreferences(NAME_PREF, Context.MODE_PRIVATE);
        editor = prefs.edit();
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
        tv_london_progress = findViewById(R.id.tv_london_progress);
        tv_valencia_progress = findViewById(R.id.tv_valencia_progress);
        tv_albufera_progress = findViewById(R.id.tv_albufera_progress);
        tv_ajim_progress = findViewById(R.id.tv_ajim_progress);
        tv_tamanrasset_progress = findViewById(R.id.tv_tamanrasset_progress);
        tv_gonna_re_zhu_progress = findViewById(R.id.tv_gonna_re_zhu_progress);
        tv_longa_market_progress = findViewById(R.id.tv_longa_market_progress);
        tv_botswana_progress = findViewById(R.id.tv_botswana_progress);
        tv_antarctica_progress = findViewById(R.id.tv_antarctica_progress);
        tv_quiz_question_1 = findViewById(R.id.tv_quiz_question_1);
        tv_quiz_question_2 = findViewById(R.id.tv_quiz_question_2);
        tv_quiz_question_3 = findViewById(R.id.tv_quiz_question_3);
        tv_quiz_question_4 = findViewById(R.id.tv_quiz_question_4);
        tv_quiz_question_5 = findViewById(R.id.tv_quiz_question_5);
        tv_quiz_question_6 = findViewById(R.id.tv_quiz_question_6);
        tv_quiz_question_7 = findViewById(R.id.tv_quiz_question_7);
        tv_quiz_question_8 = findViewById(R.id.tv_quiz_question_8);
        tv_quiz_question_9 = findViewById(R.id.tv_quiz_question_9);
        tv_quiz_question_10 = findViewById(R.id.tv_quiz_question_10);
        tv_quiz_variant_a = findViewById(R.id.tv_quiz_variant_a);
        tv_quiz_variant_b = findViewById(R.id.tv_quiz_variant_b);
        tv_quiz_variant_c = findViewById(R.id.tv_quiz_variant_c);
        tv_quiz_variant_d = findViewById(R.id.tv_quiz_variant_d);
        tv_next_place_for_study_about_current_stop = findViewById(R.id.tv_next_place_for_study_about_current_stop);
        tv_quiz_about_current_stop = findViewById(R.id.tv_quiz_about_current_stop);
        //Bigger views
        cl_for_sharing = findViewById(R.id.cl_for_sharing);
        cl_for_study_about_current_stop = findViewById(R.id.cl_for_study_about_current_stop);
        cl_with_cities = findViewById(R.id.cl_with_cities);
        cl_main_page = findViewById(R.id.cl_main_page);
        cl_with_quiz_question = findViewById(R.id.cl_with_quiz_question);
        cl_with_quiz_questions_list = findViewById(R.id.cl_with_quiz_questions_list);
        cl_with_festival = findViewById(R.id.cl_with_festival);
        cl_with_photos = findViewById(R.id.cl_with_photos);
        cl_with_progress = findViewById(R.id.cl_with_progress);
        cl_with_info_about_current_city = findViewById(R.id.cl_with_info_about_current_city);
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
                mainGameUtils.showMainElements(cl_main_page, img_map_marker);
                break;
        }
    }

    private void hideAllComponents() {
        mainGameUtils.stopMarkerAnimation();
        mainGameUtils.stopImageAnimation();
        cl_for_sharing.setVisibility(View.GONE);
        cl_with_cities.setVisibility(View.GONE);
        cl_main_page.setVisibility(View.GONE);
        cl_for_study_about_current_stop.setVisibility(View.GONE);
        cl_with_quiz_question.setVisibility(View.GONE);
        cl_with_quiz_questions_list.setVisibility(View.GONE);
        cl_with_festival.setVisibility(View.GONE);
        cl_with_photos.setVisibility(View.GONE);
        cl_with_progress.setVisibility(View.GONE);
        cl_with_info_about_current_city.setVisibility(View.GONE);
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
                    mainGameUtils.showMainElements(cl_main_page, img_map_marker);
                    this.previousLayout = "";
                    break;
                case "cl_with_progress":
                    hideAllComponents();
                    mainGameUtils.showQuizListProgress(cl_with_progress, currentLevel);
                    this.previousLayout = "";
                    break;
                case "cl_with_quiz_questions_list":
                    hideAllComponents();
                    mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
                    this.previousLayout = "cl_with_progress";
                    break;
                case "cl_for_study_about_current_stop":
                    hideAllComponents();
                    mainGameUtils.showViewForStudy(cl_for_study_about_current_stop);
                    this.previousLayout = "cl_main_page";
                    break;
                default:
                    finish();
                    break;
            }
        }
    }

    private void addCountProgress(int currentLevel) {
        editor.putInt(KEY_PREF_CURRENT_STOP_NUMBER, currentLevel);
        editor.apply();
    }
}