package meridian.travel.peru.app.utils;

import static android.content.ContentValues.TAG;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import meridian.travel.peru.app.R;
import meridian.travel.peru.app.utils.london.LondonGameUtils;
import meridian.travel.peru.app.utils.valencia.VillajoyosaGameUtils;

public class MainGameUtils {
    private GameProcessInterface gameProcessInterface;
    private ObjectAnimator animator;
    private Runnable runnable;
    private int currentIndex = 0;
    private final Handler handler = new Handler();
    private Activity activity;

    public void initGameProcessInterface(Activity activity, int currentLevel) {
        this.activity = activity;
        Log.d(TAG, "initGameProcessInterface: currentLevelInit: " + currentLevel);
        if (currentLevel > 10 && currentLevel <= 20) {
            gameProcessInterface = new VillajoyosaGameUtils(activity);
        } else if (currentLevel > 20 && currentLevel <= 30) {
//            gameProcessInterface = new AlbuferaGameUtils(activity);
        } else if (currentLevel > 30 && currentLevel <= 40) {
//            gameProcessInterface = new AjimGameUtils(activity);
        } else if (currentLevel > 40 && currentLevel <= 50) {
//            gameProcessInterface = new TamanrassetGameUtils(activity);
        } else if (currentLevel > 50 && currentLevel <= 60) {
//            gameProcessInterface = new GonnaReZhuGameUtils(activity);
        } else if (currentLevel > 60 && currentLevel <= 70) {
//            gameProcessInterface = new LongaMarketGameUtils(activity);
        } else if (currentLevel > 70 && currentLevel <= 80) {
//            gameProcessInterface = new BotswanaGameUtils(activity);
        } else if (currentLevel > 80 && currentLevel <= 90) {
//            gameProcessInterface = new AntarcticaGameUtils(activity);
        } else {
            gameProcessInterface = new LondonGameUtils(activity);
        }
    }

    public void showAllOpenCities(View ll_with_cities) {
        gameProcessInterface.showAllOpenCities(ll_with_cities);
    }

    public void showFestivalElements(View cl_with_festival) {
        gameProcessInterface.showFestivalElements(cl_with_festival);
    }

    public void showMainElements(View cl_main_page, ImageView img_map_marker) {
        gameProcessInterface.showMainElements(cl_main_page);
        startMarkerAnimation(img_map_marker);
    }

    public void showPictures(View cl_with_pictures) {
        gameProcessInterface.showPictures(cl_with_pictures);
    }

    public void showViewForStudy(View cl_for_study_about_current_stop) {
        gameProcessInterface.showViewForStudy(cl_for_study_about_current_stop);
    }

    public void showQuizListQuestions(View cl_with_quiz_questions_list, int currentLevel) {
        gameProcessInterface.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
    }

    public void showQuizListProgress(View cl_with_progress, int currentLevel) {
        gameProcessInterface.showQuizListProgress(cl_with_progress, currentLevel);
    }

    public void showQuestionOnView(View cl_with_quiz_question, int currentLevel) {
        gameProcessInterface.showQuestionOnView(cl_with_quiz_question, currentLevel);
    }

    public boolean checkAnswerClick(TextView tv_quiz_variant, int currentLevel) {
        return gameProcessInterface.checkAnswerClick(tv_quiz_variant, currentLevel);
    }

    public void showInfoAboutCurrentPlace(View cl_with_info_about_current_city, int currentLevel) {
        gameProcessInterface.showInfoAboutCurrentPlace(cl_with_info_about_current_city, currentLevel);
    }

    public void showSecondPlace(View cl_for_study_about_current_stop) {
        gameProcessInterface.showSecondPlace(cl_for_study_about_current_stop);
    }

    private void startMarkerAnimation(ImageView img_map_marker) {
        animator = ObjectAnimator.ofFloat(img_map_marker, "translationY", 0f, 20f);
        animator.setDuration(1000);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.setRepeatCount(ValueAnimator.INFINITE);

        animator.start();
    }

    public int[] getIdDrawable(int currentLevel) {
        int[] ids = new int[7];
        if (currentLevel > 0 && currentLevel <= 10) {

        } else {
            ids = new int[]{R.drawable.img_london, R.drawable.img_london_2, R.drawable.img_london_3,
                    R.drawable.img_london_4, R.drawable.img_london_5, R.drawable.img_london_6, R.drawable.img_london_7};
        }
        return ids;
    }

    public void startCityImageAnimation(ImageView img_to_use, int[] imageArray) {
        runnable = new Runnable() {
            @Override
            public void run() {
                // Оновлення ImageView іншим зображенням
                img_to_use.setImageResource(imageArray[currentIndex]);
//                img_to_use.setImageDrawable(activity.getResources().getDrawable(imageArray[currentIndex]));
                currentIndex = (currentIndex + 1) % imageArray.length;

                // Повторення через певний час (наприклад, кожні 2 секунди)
                handler.postDelayed(this, 2000);
            }
        };

        // Початок роботи з Runnable
        handler.post(runnable);
    }

    public void stopImageAnimation() {
        handler.removeCallbacks(runnable);
    }

    public void stopMarkerAnimation() {
        if (animator != null) {
            animator.cancel();
        }
    }
}
