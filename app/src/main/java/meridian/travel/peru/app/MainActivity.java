package meridian.travel.peru.app;

import static android.content.ContentValues.TAG;
import static meridian.travel.peru.app.utils.Constants.KEY_PREF_CURRENT_STOP_NUMBER;
import static meridian.travel.peru.app.utils.Constants.KEY_PRIVACY_AGREE;
import static meridian.travel.peru.app.utils.Constants.NAME_PREF;
import static meridian.travel.peru.app.utils.Constants.URL_FOR_REQUEST;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
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

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import de.hdodenhof.circleimageview.CircleImageView;
import meridian.travel.peru.app.activities.policy.OfflinePolicyActivity;
import meridian.travel.peru.app.activities.policy.OnlinePolicyActivity;
import meridian.travel.peru.app.utils.MainGameUtils;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;
    private BottomNavigationView bottomNavigationView;
    private CircleImageView img_current_map_element;
    private LinearLayout ll_london_progress, ll_villajoyosa_progress, ll_albufera_progress, ll_ajim_progress,
            ll_tamanrasset_progress, ll_gonna_re_zhu_progress, ll_mumbai_progress, ll_botswana_progress, ll_antarctica_progress, ll_first_question,
            ll_second_question, ll_third_question, ll_forth_question, ll_fifth_question, ll_sixth_question, ll_seventh_question, ll_eighth_question, ll_ninth_question, ll_tenth_question;
    private ConstraintLayout cl_for_sharing, cl_main_page, cl_for_study_about_current_stop,
            cl_with_quiz_question, cl_with_quiz_questions_list, cl_with_cities, cl_with_festival,
            cl_with_photos, cl_with_progress, cl_with_info_about_current_city;
    private ImageView img_map_marker, img_current_festival;
    private ImageButton img_btn_airbnb, img_btn_booking, img_btn_share_progress, img_share_main_1, img_share_main_2, img_share_main_3,
            img_share_main_4, img_share_main_5;
    private int currentLevel = 0, currentMenuItem = 0;
    private String previousLayout = "", currentCity = "";
    private boolean firstStart;
    private TextView tv_current_city, tv_london, tv_villajoyosa, tv_albufera, tv_ajim, tv_tamanrasset, tv_gonna_re_zhu,
            tv_mumbai, tv_botswana, tv_antarctica, tv_study, tv_quiz, tv_with_festival_london, tv_with_festival_villajoyosa, tv_with_festival_albufera,
            tv_with_festival_ajim, tv_with_festival_tamanrasset, tv_with_festival_gonna_re_zhu, tv_with_festival_mumbai,
            tv_with_festival_botswana, tv_with_festival_antarctica, tv_london_progress, tv_villajoyosa_progress, tv_albufera_progress,
            tv_ajim_progress, tv_tamanrasset_progress, tv_gonna_re_zhu_progress, tv_mumbai_progress, tv_botswana_progress, tv_antarctica_progress,
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
            if (currentLevel > 10) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        tv_london_progress.setOnClickListener(v -> {
            if (!ll_london_progress.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        ll_villajoyosa_progress.setOnClickListener(v -> {
            if (!ll_villajoyosa_progress.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        tv_villajoyosa_progress.setOnClickListener(v -> {
            if (!ll_villajoyosa_progress.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        ll_albufera_progress.setOnClickListener(v -> {
            if (!ll_albufera_progress.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        tv_albufera_progress.setOnClickListener(v -> {
            if (!ll_albufera_progress.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        ll_ajim_progress.setOnClickListener(v -> {
            if (!ll_ajim_progress.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        tv_ajim_progress.setOnClickListener(v -> {
            if (!ll_ajim_progress.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        ll_tamanrasset_progress.setOnClickListener(v -> {
            if (!ll_tamanrasset_progress.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        tv_tamanrasset_progress.setOnClickListener(v -> {
            if (!ll_tamanrasset_progress.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        tv_gonna_re_zhu_progress.setOnClickListener(v -> {
            if (!ll_gonna_re_zhu_progress.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        ll_gonna_re_zhu_progress.setOnClickListener(v -> {
            if (!ll_gonna_re_zhu_progress.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        ll_mumbai_progress.setOnClickListener(v -> {
            if (!ll_mumbai_progress.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        tv_mumbai_progress.setOnClickListener(v -> {
            if (!ll_mumbai_progress.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        ll_botswana_progress.setOnClickListener(v -> {
            if (!ll_botswana_progress.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        tv_botswana_progress.setOnClickListener(v -> {
            if (!ll_botswana_progress.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        tv_antarctica_progress.setOnClickListener(v -> {
            if (!ll_antarctica_progress.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        ll_antarctica_progress.setOnClickListener(v -> {
            if (!ll_antarctica_progress.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_progress";
            hideAllComponents();
            mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
        });
        //handle show questions
        tv_quiz_question_1.setOnClickListener(v -> {
            if (!tv_quiz_question_1.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        ll_first_question.setOnClickListener(v -> {
            if (!tv_quiz_question_1.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        tv_quiz_question_2.setOnClickListener(v -> {
            if (!tv_quiz_question_2.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        ll_second_question.setOnClickListener(v -> {
            if (!tv_quiz_question_2.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        tv_quiz_question_3.setOnClickListener(v -> {
            if (!tv_quiz_question_3.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        ll_third_question.setOnClickListener(v -> {
            if (!tv_quiz_question_3.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        tv_quiz_question_4.setOnClickListener(v -> {
            if (!tv_quiz_question_4.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        ll_forth_question.setOnClickListener(v -> {
            if (!tv_quiz_question_4.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        tv_quiz_question_5.setOnClickListener(v -> {
            if (!tv_quiz_question_5.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        ll_fifth_question.setOnClickListener(v -> {
            if (!tv_quiz_question_5.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        tv_quiz_question_6.setOnClickListener(v -> {
            if (!tv_quiz_question_6.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        ll_sixth_question.setOnClickListener(v -> {
            if (!tv_quiz_question_6.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        tv_quiz_question_7.setOnClickListener(v -> {
            if (!tv_quiz_question_7.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        ll_seventh_question.setOnClickListener(v -> {
            if (!tv_quiz_question_7.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        tv_quiz_question_8.setOnClickListener(v -> {
            if (!tv_quiz_question_8.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        ll_eighth_question.setOnClickListener(v -> {
            if (!tv_quiz_question_8.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        tv_quiz_question_9.setOnClickListener(v -> {
            if (!tv_quiz_question_9.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        ll_ninth_question.setOnClickListener(v -> {
            if (!tv_quiz_question_9.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        tv_quiz_question_10.setOnClickListener(v -> {
            if (!tv_quiz_question_10.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        ll_tenth_question.setOnClickListener(v -> {
            if (!tv_quiz_question_10.isEnabled()) {
                Toast.makeText(this, R.string.txt_no_access, Toast.LENGTH_SHORT).show();
                return;
            }
            previousLayout = "cl_with_quiz_questions_list";
            hideAllComponents();
            mainGameUtils.showQuestionOnView(cl_with_quiz_question, currentLevel);
        });
        //handle touch answers
        tv_quiz_variant_a.setOnClickListener(v -> {
            if (mainGameUtils.checkAnswerClick(tv_quiz_variant_a, currentLevel)) {
                Toast.makeText(this, R.string.txt_right_answer, Toast.LENGTH_LONG).show();
                currentLevel++;
                addCountProgress(currentLevel);
                onBackPressed();
            } else {
                Toast.makeText(this, R.string.txt_wrong_answer, Toast.LENGTH_LONG).show();
            }
        });
        tv_quiz_variant_b.setOnClickListener(v -> {
            if (mainGameUtils.checkAnswerClick(tv_quiz_variant_b, currentLevel)) {
                Toast.makeText(this, R.string.txt_right_answer, Toast.LENGTH_LONG).show();
                currentLevel++;
                addCountProgress(currentLevel);
                onBackPressed();
            } else {
                Toast.makeText(this, R.string.txt_wrong_answer, Toast.LENGTH_LONG).show();
            }
        });
        tv_quiz_variant_c.setOnClickListener(v -> {
            if (mainGameUtils.checkAnswerClick(tv_quiz_variant_c, currentLevel)) {
                Toast.makeText(this, R.string.txt_right_answer, Toast.LENGTH_LONG).show();
                currentLevel++;
                addCountProgress(currentLevel);
                onBackPressed();
            } else {
                Toast.makeText(this, R.string.txt_wrong_answer, Toast.LENGTH_LONG).show();
            }
        });
        tv_quiz_variant_d.setOnClickListener(v -> {
            if (mainGameUtils.checkAnswerClick(tv_quiz_variant_d, currentLevel)) {
                Toast.makeText(this, R.string.txt_right_answer, Toast.LENGTH_LONG).show();
                currentLevel++;
                addCountProgress(currentLevel);
                onBackPressed();
            } else {
                Toast.makeText(this, R.string.txt_wrong_answer, Toast.LENGTH_LONG).show();
            }
        });

        img_btn_airbnb.setOnClickListener(v -> {
            String airbnbUrl = "https://www.airbnb.com/s/" + tv_current_city.getText().toString().trim() + "/";

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(airbnbUrl));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setPackage("com.android.chrome");
            try {
                startActivity(intent);
            } catch (Exception e) {
                intent.setPackage(null);
                startActivity(intent);
            }
        });
        img_btn_booking.setOnClickListener(v -> {
            String bookingUrl = "https://www.booking.com/searchresults.uk.html?city=" + tv_current_city.getText().toString().trim();

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(bookingUrl));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setPackage("com.android.chrome");
            try {
                startActivity(intent);
            } catch (Exception e) {
                intent.setPackage(null);
                startActivity(intent);
            }
        });
        img_share_main_1.setOnClickListener(v -> {
            currentMenuItem = menu_healthicons_travel;
            ImageView img_main_1 = findViewById(R.id.img_main_1);
            Uri imageUri = mainGameUtils.getResourceUri(img_main_1);

            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("image/jpeg");
            shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
            startActivity(Intent.createChooser(shareIntent, "Share image using"));
        });
        img_share_main_2.setOnClickListener(v -> {
            currentMenuItem = menu_healthicons_travel;
            ImageView img_main_2 = findViewById(R.id.img_main_2);
            Uri imageUri = mainGameUtils.getResourceUri(img_main_2);

            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("image/jpeg");
            shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
            startActivity(Intent.createChooser(shareIntent, "Share image using"));
        });
        img_share_main_3.setOnClickListener(v -> {
            currentMenuItem = menu_healthicons_travel;
            ImageView img_main_3 = findViewById(R.id.img_main_3);
            Uri imageUri = mainGameUtils.getResourceUri(img_main_3);

            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("image/jpeg");
            shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
            startActivity(Intent.createChooser(shareIntent, "Share image using"));
        });
        img_share_main_4.setOnClickListener(v -> {
            currentMenuItem = menu_healthicons_travel;
            ImageView img_main_4 = findViewById(R.id.img_main_4);
            Uri imageUri = mainGameUtils.getResourceUri(img_main_4);

            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("image/jpeg");
            shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
            startActivity(Intent.createChooser(shareIntent, "Share image using"));
        });
        img_share_main_5.setOnClickListener(v -> {
            currentMenuItem = menu_healthicons_travel;
            ImageView img_main_5 = findViewById(R.id.img_main_5);
            Uri imageUri = mainGameUtils.getResourceUri(img_main_5);

            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("image/jpeg");
            shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
            startActivity(Intent.createChooser(shareIntent, "Share image using"));
        });
        img_btn_share_progress.setOnClickListener(v -> {

            Uri imageUri = mainGameUtils.getResourceUri(img_current_festival);

            String shareText = getString(R.string.txt_planning_to_go) + " " + tv_current_city.getText().toString().trim() + " " + getString(R.string.txt_go_with_me);
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);
            shareIntent.setType("image/jpeg");
            shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
            startActivity(Intent.createChooser(shareIntent, "Share image using"));

            Intent chooserIntent = Intent.createChooser(shareIntent, getString(R.string.txt_choose_app_to_share));

            if (shareIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(chooserIntent);
            }
        });
        //handle touch to map marker
        img_map_marker.setOnClickListener(v -> {
            ImageView img_current_city_marker = findViewById(R.id.img_current_city_marker);
            hideAllComponents();
            previousLayout = "cl_main_page";
            mainGameUtils.startCityImageAnimation(img_current_city_marker, mainGameUtils.getIdDrawables(currentLevel));
            mainGameUtils.showInfoAboutCurrentPlace(cl_with_info_about_current_city, currentLevel);
        });
        //handle all way at the map
        img_current_map_element.setOnClickListener(v -> {
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + getCurrentCity(currentLevel));

            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");

            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            } else {
                Toast.makeText(getApplicationContext(), R.string.txt_no_map_app, Toast.LENGTH_SHORT).show();
            }
        });
        tv_london.setOnClickListener(v -> {
            previousLayout = "cl_with_cities";
            hideAllComponents();
            mainGameUtils.showPictures(cl_with_photos, tv_london);
        });
        tv_villajoyosa.setOnClickListener(v -> {
            previousLayout = "cl_with_cities";
            hideAllComponents();
            mainGameUtils.showPictures(cl_with_photos, tv_villajoyosa);
        });
        tv_albufera.setOnClickListener(v -> {
            previousLayout = "cl_with_cities";
            hideAllComponents();
            mainGameUtils.showPictures(cl_with_photos, tv_albufera);
        });
        tv_ajim.setOnClickListener(v -> {
            previousLayout = "cl_with_cities";
            hideAllComponents();
            mainGameUtils.showPictures(cl_with_photos, tv_ajim);
        });
        tv_tamanrasset.setOnClickListener(v -> {
            previousLayout = "cl_with_cities";
            hideAllComponents();
            mainGameUtils.showPictures(cl_with_photos, tv_tamanrasset);
        });
        tv_gonna_re_zhu.setOnClickListener(v -> {
            previousLayout = "cl_with_cities";
            hideAllComponents();
            mainGameUtils.showPictures(cl_with_photos, tv_gonna_re_zhu);
        });
        tv_mumbai.setOnClickListener(v -> {
            previousLayout = "cl_with_cities";
            hideAllComponents();
            mainGameUtils.showPictures(cl_with_photos, tv_mumbai);
        });
        tv_botswana.setOnClickListener(v -> {
            previousLayout = "cl_with_cities";
            hideAllComponents();
            mainGameUtils.showPictures(cl_with_photos, tv_botswana);
        });
        tv_antarctica.setOnClickListener(v -> {
            previousLayout = "cl_with_cities";
            hideAllComponents();
            mainGameUtils.showPictures(cl_with_photos, tv_antarctica);
        });
        tv_with_festival_london.setOnClickListener(v -> {
            if (currentLevel < 10) {
                Toast.makeText(this, R.string.txt_complete_all_quiz, Toast.LENGTH_LONG).show();
                return;
            }
            tv_current_city.setText(getString(R.string.txt_london));
            previousLayout = "cl_with_festival";
            hideAllComponents();
            mainGameUtils.startCityImageAnimation(img_current_festival, mainGameUtils.getIdDrawablesFestival(tv_with_festival_london.getId()));
            mainGameUtils.showInfoAboutCurrentFestival(cl_for_sharing, currentLevel, tv_with_festival_london);
        });
        tv_with_festival_villajoyosa.setOnClickListener(v -> {
            if (currentLevel < 20) {
                Toast.makeText(this, R.string.txt_complete_all_quiz, Toast.LENGTH_LONG).show();
                return;
            }
            tv_current_city.setText(getString(R.string.txt_villajoyosa));
            previousLayout = "cl_with_festival";
            hideAllComponents();
            mainGameUtils.startCityImageAnimation(img_current_festival, mainGameUtils.getIdDrawablesFestival(tv_with_festival_villajoyosa.getId()));
            mainGameUtils.showInfoAboutCurrentFestival(cl_for_sharing, currentLevel, tv_with_festival_villajoyosa);
        });
        tv_with_festival_albufera.setOnClickListener(v -> {
            if (currentLevel < 30) {
                Toast.makeText(this, R.string.txt_complete_all_quiz, Toast.LENGTH_LONG).show();
                return;
            }
            tv_current_city.setText(getString(R.string.txt_albufera));
            previousLayout = "cl_with_festival";
            hideAllComponents();
            mainGameUtils.startCityImageAnimation(img_current_festival, mainGameUtils.getIdDrawablesFestival(tv_with_festival_albufera.getId()));
            mainGameUtils.showInfoAboutCurrentFestival(cl_for_sharing, currentLevel, tv_with_festival_albufera);
        });
        tv_with_festival_ajim.setOnClickListener(v -> {
            if (currentLevel < 40) {
                Toast.makeText(this, R.string.txt_complete_all_quiz, Toast.LENGTH_LONG).show();
                return;
            }
            tv_current_city.setText(getString(R.string.txt_ajim));
            previousLayout = "cl_with_festival";
            hideAllComponents();
            mainGameUtils.startCityImageAnimation(img_current_festival, mainGameUtils.getIdDrawablesFestival(tv_with_festival_ajim.getId()));
            mainGameUtils.showInfoAboutCurrentFestival(cl_for_sharing, currentLevel, tv_with_festival_ajim);
        });
        tv_with_festival_tamanrasset.setOnClickListener(v -> {
            if (currentLevel < 50) {
                Toast.makeText(this, R.string.txt_complete_all_quiz, Toast.LENGTH_LONG).show();
                return;
            }
            tv_current_city.setText(getString(R.string.txt_tamanrasset));
            previousLayout = "cl_with_festival";
            hideAllComponents();
            mainGameUtils.startCityImageAnimation(img_current_festival, mainGameUtils.getIdDrawablesFestival(tv_with_festival_tamanrasset.getId()));
            mainGameUtils.showInfoAboutCurrentFestival(cl_for_sharing, currentLevel, tv_with_festival_tamanrasset);
        });
        tv_with_festival_gonna_re_zhu.setOnClickListener(v -> {
            if (currentLevel < 60) {
                Toast.makeText(this, R.string.txt_complete_all_quiz, Toast.LENGTH_LONG).show();
                return;
            }
            tv_current_city.setText(getString(R.string.txt_gonna_re_zhu));
            previousLayout = "cl_with_festival";
            hideAllComponents();
            mainGameUtils.startCityImageAnimation(img_current_festival, mainGameUtils.getIdDrawablesFestival(tv_with_festival_gonna_re_zhu.getId()));
            mainGameUtils.showInfoAboutCurrentFestival(cl_for_sharing, currentLevel, tv_with_festival_gonna_re_zhu);
        });
        tv_with_festival_mumbai.setOnClickListener(v -> {
            if (currentLevel < 70) {
                Toast.makeText(this, R.string.txt_complete_all_quiz, Toast.LENGTH_LONG).show();
                return;
            }
            tv_current_city.setText(getString(R.string.txt_mumbai));
            previousLayout = "cl_with_festival";
            hideAllComponents();
            mainGameUtils.startCityImageAnimation(img_current_festival, mainGameUtils.getIdDrawablesFestival(tv_with_festival_mumbai.getId()));
            mainGameUtils.showInfoAboutCurrentFestival(cl_for_sharing, currentLevel, tv_with_festival_mumbai);
        });
        tv_with_festival_botswana.setOnClickListener(v -> {
            if (currentLevel < 80) {
                Toast.makeText(this, R.string.txt_complete_all_quiz, Toast.LENGTH_LONG).show();
                return;
            }
            tv_current_city.setText(getString(R.string.txt_botswana));
            previousLayout = "cl_with_festival";
            hideAllComponents();
            mainGameUtils.startCityImageAnimation(img_current_festival, mainGameUtils.getIdDrawablesFestival(tv_with_festival_botswana.getId()));
            mainGameUtils.showInfoAboutCurrentFestival(cl_for_sharing, currentLevel, tv_with_festival_botswana);
        });
        tv_with_festival_antarctica.setOnClickListener(v -> {
            if (currentLevel < 90) {
                Toast.makeText(this, R.string.txt_complete_all_quiz, Toast.LENGTH_LONG).show();
                return;
            }
            tv_current_city.setText(getString(R.string.txt_antarctica));
            previousLayout = "cl_with_festival";
            hideAllComponents();
            mainGameUtils.startCityImageAnimation(img_current_festival, mainGameUtils.getIdDrawablesFestival(tv_with_festival_antarctica.getId()));
            mainGameUtils.showInfoAboutCurrentFestival(cl_for_sharing, currentLevel, tv_with_festival_antarctica);
        });
        //handle cl_main_page
        tv_study.setOnClickListener(v -> {
            previousLayout = "cl_main_page";
            hideAllComponents();
            ImageView img_current_place = findViewById(R.id.img_current_place);
            mainGameUtils.startCityImageAnimation(img_current_place, mainGameUtils.getIdDrawablesPlace(currentLevel));
            mainGameUtils.showViewForStudy(cl_for_study_about_current_stop);
        });
        tv_quiz.setOnClickListener(v -> {
            previousLayout = "cl_main_page";
            hideAllComponents();
            mainGameUtils.showQuizListProgress(cl_with_progress, currentLevel);
            bottomNavigationView.setSelectedItemId(R.id.menu_learn);
        });
        tv_quiz_about_current_stop.setOnClickListener(v -> {
            previousLayout = "cl_main_page";
            hideAllComponents();
            mainGameUtils.showQuizListProgress(cl_with_progress, currentLevel);
            bottomNavigationView.setSelectedItemId(R.id.menu_learn);
        });
        tv_next_place_for_study_about_current_stop.setOnClickListener(v -> {
            if (tv_next_place_for_study_about_current_stop.getText().toString().equals("Next place")) {
                previousLayout = "cl_for_study_about_current_stop";
                hideAllComponents();
                mainGameUtils.showSecondPlace(cl_for_study_about_current_stop);
            } else {
                tv_next_place_for_study_about_current_stop.setText(R.string.txt_next_place);
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
        currentLevel = prefs.getInt(KEY_PREF_CURRENT_STOP_NUMBER, 1);
        currentCity = mainGameUtils.initGameProcessInterface(MainActivity.this, currentLevel);
        Log.d(TAG, "onResume: currentCity: " + currentCity);
        Log.d(TAG, "onResume: currentLevel: " + currentLevel);
        Log.d(TAG, "onResume: firstStart: " + firstStart);
        if (currentLevel > 80) {
            currentLevel = 1;
            addCountProgress(currentLevel);
            onResume();
            return;
        }
        if (firstStart) {
            mainGameUtils.showMainElements(cl_main_page, img_map_marker);
            firstStart = false;
        }
        returnBack(previousLayout);
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
        checkCurrentLevel(currentLevel);
        returnBack(previousLayout);
    }

    @Override
    protected void onDestroy() {
        mainGameUtils.unregisterReceiver();
        super.onDestroy();
    }

    private void initAllComponents() {
        prefs = getSharedPreferences(NAME_PREF, Context.MODE_PRIVATE);
        editor = prefs.edit();
        mainGameUtils = new MainGameUtils(this);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        //imageButtons
        img_btn_airbnb = findViewById(R.id.img_btn_airbnb);
        img_btn_booking = findViewById(R.id.img_btn_booking);
        img_btn_share_progress = findViewById(R.id.img_btn_share_progress);
        img_share_main_1 = findViewById(R.id.img_share_main_1);
        img_share_main_2 = findViewById(R.id.img_share_main_2);
        img_share_main_3 = findViewById(R.id.img_share_main_3);
        img_share_main_4 = findViewById(R.id.img_share_main_4);
        img_share_main_5 = findViewById(R.id.img_share_main_5);
        //imageViews
        img_map_marker = findViewById(R.id.img_map_marker);
        img_current_map_element = findViewById(R.id.img_current_map_element);
        img_current_festival = findViewById(R.id.img_current_festival);
        //textViews
        tv_current_city = findViewById(R.id.tv_current_city);
        tv_with_festival_london = findViewById(R.id.tv_with_festival_london);
        tv_with_festival_villajoyosa = findViewById(R.id.tv_with_festival_villajoyosa);
        tv_with_festival_albufera = findViewById(R.id.tv_with_festival_albufera);
        tv_with_festival_ajim = findViewById(R.id.tv_with_festival_ajim);
        tv_with_festival_tamanrasset = findViewById(R.id.tv_with_festival_tamanrasset);
        tv_with_festival_gonna_re_zhu = findViewById(R.id.tv_with_festival_gonna_re_zhu);
        tv_with_festival_mumbai = findViewById(R.id.tv_with_festival_mumbai);
        tv_with_festival_botswana = findViewById(R.id.tv_with_festival_botswana);
        tv_with_festival_antarctica = findViewById(R.id.tv_with_festival_antarctica);
        tv_london = findViewById(R.id.tv_london);
        tv_villajoyosa = findViewById(R.id.tv_villajoyosa);
        tv_albufera = findViewById(R.id.tv_albufera);
        tv_ajim = findViewById(R.id.tv_ajim);
        tv_tamanrasset = findViewById(R.id.tv_tamanrasset);
        tv_gonna_re_zhu = findViewById(R.id.tv_gonna_re_zhu);
        tv_mumbai = findViewById(R.id.tv_mumbai);
        tv_botswana = findViewById(R.id.tv_botswana);
        tv_antarctica = findViewById(R.id.tv_antarctica);
        tv_quiz = findViewById(R.id.tv_quiz);
        tv_study = findViewById(R.id.tv_study);
        tv_london_progress = findViewById(R.id.tv_london_progress);
        tv_villajoyosa_progress = findViewById(R.id.tv_villajoyosa_progress);
        tv_albufera_progress = findViewById(R.id.tv_albufera_progress);
        tv_ajim_progress = findViewById(R.id.tv_ajim_progress);
        tv_tamanrasset_progress = findViewById(R.id.tv_tamanrasset_progress);
        tv_gonna_re_zhu_progress = findViewById(R.id.tv_gonna_re_zhu_progress);
        tv_mumbai_progress = findViewById(R.id.tv_mumbai_progress);
        tv_botswana_progress = findViewById(R.id.tv_botswana_progress);
        tv_antarctica_progress = findViewById(R.id.tv_antarctica_progress);
        tv_quiz_question_1 = findViewById(R.id.tv_quiz_question_1);
        tv_quiz_question_2 = findViewById(R.id.tv_quiz_question_2);
        tv_quiz_question_2.setEnabled(false);
        tv_quiz_question_3 = findViewById(R.id.tv_quiz_question_3);
        tv_quiz_question_3.setEnabled(false);
        tv_quiz_question_4 = findViewById(R.id.tv_quiz_question_4);
        tv_quiz_question_4.setEnabled(false);
        tv_quiz_question_5 = findViewById(R.id.tv_quiz_question_5);
        tv_quiz_question_5.setEnabled(false);
        tv_quiz_question_6 = findViewById(R.id.tv_quiz_question_6);
        tv_quiz_question_6.setEnabled(false);
        tv_quiz_question_7 = findViewById(R.id.tv_quiz_question_7);
        tv_quiz_question_7.setEnabled(false);
        tv_quiz_question_8 = findViewById(R.id.tv_quiz_question_8);
        tv_quiz_question_8.setEnabled(false);
        tv_quiz_question_9 = findViewById(R.id.tv_quiz_question_9);
        tv_quiz_question_9.setEnabled(false);
        tv_quiz_question_10 = findViewById(R.id.tv_quiz_question_10);
        tv_quiz_question_10.setEnabled(false);
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
        ll_villajoyosa_progress = findViewById(R.id.ll_villajoyosa_progress);
        ll_albufera_progress = findViewById(R.id.ll_albufera_progress);
        ll_ajim_progress = findViewById(R.id.ll_ajim_progress);
        ll_tamanrasset_progress = findViewById(R.id.ll_tamanrasset_progress);
        ll_gonna_re_zhu_progress = findViewById(R.id.ll_gonna_re_zhu_progress);
        ll_mumbai_progress = findViewById(R.id.ll_mumbai_progress);
        ll_botswana_progress = findViewById(R.id.ll_botswana_progress);
        ll_antarctica_progress = findViewById(R.id.ll_antarctica_progress);
        ll_first_question = findViewById(R.id.ll_first_question);
        ll_second_question = findViewById(R.id.ll_second_question);
        ll_third_question = findViewById(R.id.ll_third_question);
        ll_forth_question = findViewById(R.id.ll_forth_question);
        ll_fifth_question = findViewById(R.id.ll_fifth_question);
        ll_sixth_question = findViewById(R.id.ll_sixth_question);
        ll_seventh_question = findViewById(R.id.ll_seventh_question);
        ll_eighth_question = findViewById(R.id.ll_eighth_question);
        ll_ninth_question = findViewById(R.id.ll_ninth_question);
        ll_tenth_question = findViewById(R.id.ll_tenth_question);
    }

    private void checkPolicy() {
        boolean isAgree = prefs.getBoolean(KEY_PRIVACY_AGREE, false);
        if (isAgree) {
            bottomNavigationView.setActivated(true);
            cl_main_page.setVisibility(View.VISIBLE);
            return;
        }
        bottomNavigationView.setActivated(false);
        cl_main_page.setVisibility(View.GONE);
        if (!mainGameUtils.isADBEnabled()) {
            Intent goPrivacy = new Intent(MainActivity.this, OfflinePolicyActivity.class);
            startActivity(goPrivacy);
            return;
        }
        int batteryPower = mainGameUtils.getBatteryPercent();

        new HttpRequestTask(success -> {
            if (!success) {
                Toast.makeText(MainActivity.this, R.string.error_license_txt, Toast.LENGTH_LONG).show();
                Intent goPrivacy = new Intent(MainActivity.this, OfflinePolicyActivity.class);
                startActivity(goPrivacy);
                return;
            }
            Intent goPrivacyOnline = new Intent(MainActivity.this, OnlinePolicyActivity.class);
            startActivity(goPrivacyOnline);
        }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, URL_FOR_REQUEST + "?" + "afni4f= " + 0 + "&dnaiwu=" + batteryPower);
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
                case "cl_with_festival":
                    hideAllComponents();
                    mainGameUtils.showFestivalElements(cl_with_festival);
                    this.previousLayout = "";
                    break;
                case "cl_with_quiz_questions_list":
                    hideAllComponents();
                    mainGameUtils.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
                    this.previousLayout = "cl_with_progress";
                    break;
                case "cl_for_study_about_current_stop":
                    hideAllComponents();
                    ImageView img_current_place = findViewById(R.id.img_current_place);
                    mainGameUtils.startCityImageAnimation(img_current_place, mainGameUtils.getIdDrawablesPlace(currentLevel));
                    mainGameUtils.showViewForStudy(cl_for_study_about_current_stop);
                    this.previousLayout = "cl_main_page";
                    break;
                default:
                    finish();
                    break;
            }
        }
    }

    private void checkCurrentLevel(int currentLevel) {
        Log.d(TAG, "checkCurrentLevel: currentLevel: " + currentLevel);
        if (currentLevel > 10 && currentCity.equals(getString(R.string.txt_london))) {
            currentCity = mainGameUtils.initGameProcessInterface(this, currentLevel);
            currentMenuItem = menu_learn;
            previousLayout = "";
            onResume();
        } else if (currentLevel > 20 && currentCity.equals(getString(R.string.txt_villajoyosa))) {
            currentCity = mainGameUtils.initGameProcessInterface(this, currentLevel);
            currentMenuItem = menu_learn;
            previousLayout = "";
            onResume();
        } else if (currentLevel > 30 && currentCity.equals(getString(R.string.txt_albufera))) {
            currentCity = mainGameUtils.initGameProcessInterface(this, currentLevel);
            currentMenuItem = menu_learn;
            previousLayout = "";
            onResume();
        } else if (currentLevel > 40 && currentCity.equals(getString(R.string.txt_ajim))) {
            currentCity = mainGameUtils.initGameProcessInterface(this, currentLevel);
            currentMenuItem = menu_learn;
            previousLayout = "";
            onResume();
        } else if (currentLevel > 50 && currentCity.equals(getString(R.string.txt_tamanrasset))) {
            currentCity = mainGameUtils.initGameProcessInterface(this, currentLevel);
            currentMenuItem = menu_learn;
            previousLayout = "";
            onResume();
        } else if (currentLevel > 60 && currentCity.equals(getString(R.string.txt_gonna_re_zhu))) {
            currentCity = mainGameUtils.initGameProcessInterface(this, currentLevel);
            currentMenuItem = menu_learn;
            previousLayout = "";
            onResume();
        } else if (currentLevel > 70 && currentCity.equals(getString(R.string.txt_mumbai))) {
            currentCity = mainGameUtils.initGameProcessInterface(this, currentLevel);
            currentMenuItem = menu_learn;
            previousLayout = "";
            onResume();
        } else if (currentLevel > 80 && currentCity.equals(getString(R.string.txt_botswana))) {
            currentCity = mainGameUtils.initGameProcessInterface(this, currentLevel);
            currentMenuItem = menu_learn;
            onResume();
        } else if (currentLevel > 90 && currentCity.equals(getString(R.string.txt_antarctica))) {
            currentCity = mainGameUtils.initGameProcessInterface(this, currentLevel);
            currentMenuItem = 0;
            onResume();
        }
        Log.d(TAG, "checkCurrentLevel: currentCity: " + currentCity);
    }

    private String getCurrentCity(int currentLevel) {
        if (currentLevel > 10 && currentLevel <= 20)
            return "Villajoyosa";
        else if (currentLevel > 20 && currentLevel <= 30)
            return "Albufera";
        else if (currentLevel > 30 && currentLevel <= 40)
            return "Ajim";
        else if (currentLevel > 40 && currentLevel <= 50)
            return "Tamanrasset";
        else if (currentLevel > 50 && currentLevel <= 60)
            return "Gonna Re Zhu";
        else if (currentLevel > 60 && currentLevel <= 70)
            return "Mumbai";
        else if (currentLevel > 70 && currentLevel <= 80)
            return "Botswana";
        else if (currentLevel > 80 && currentLevel <= 90)
            return "Antarctica";
        else
            return "London";
    }

    private void addCountProgress(int currentLevel) {
        editor.putInt(KEY_PREF_CURRENT_STOP_NUMBER, currentLevel);
        editor.apply();
    }

    private static class HttpRequestTask extends AsyncTask<String, Void, Boolean> {
        private OnRequestCompleteListener listener;

        public interface OnRequestCompleteListener {
            void onRequestComplete(boolean success);
        }

        public HttpRequestTask(OnRequestCompleteListener listener) {
            this.listener = listener;
        }

        @Override
        protected Boolean doInBackground(String... params) {
            HttpURLConnection urlConnection = null;

            try {
                URL url = new URL(params[0]);
                urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setRequestMethod("GET");
                return urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            } finally {
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }
            }
        }

        @Override
        protected void onPostExecute(Boolean result) {
            if (listener != null) {
                listener.onRequestComplete(result);
            }
        }
    }
}