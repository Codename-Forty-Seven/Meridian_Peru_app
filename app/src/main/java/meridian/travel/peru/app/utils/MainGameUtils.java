package meridian.travel.peru.app.utils;

import static meridian.travel.peru.app.utils.Constants.KEY_PREF_CURRENT_STOP_NUMBER;
import static meridian.travel.peru.app.utils.Constants.NAME_PREF;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import meridian.travel.peru.app.utils.london.LondonGameUtils;
import meridian.travel.peru.app.utils.valencia.VillajoyosaGameUtils;

public class MainGameUtils {
    private GameProcessInterface gameProcessInterface;
    public int initGameProcessInterface(Activity activity) {
        SharedPreferences pref = activity.getSharedPreferences(NAME_PREF, Context.MODE_PRIVATE);
        int currentLevel = pref.getInt(KEY_PREF_CURRENT_STOP_NUMBER, 1);
        if (currentLevel > 10 && currentLevel <= 20) {
            gameProcessInterface = new VillajoyosaGameUtils(activity);
            return currentLevel;
        } else {
            gameProcessInterface = new LondonGameUtils(activity);
            return currentLevel;
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

    public void showViewForStudy(View... cl_for_study_about_current_stop) {
        gameProcessInterface.showViewForStudy(cl_for_study_about_current_stop);
    }

    public void showQuizListQuestions(View cl_with_quiz_questions_list, int currentLevel){
        gameProcessInterface.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
    }

    public void showQuizListProgress(View cl_with_progress, int currentLevel){
        gameProcessInterface.showQuizListProgress(cl_with_progress, currentLevel);
    }

    public void showQuestionOnView(View cl_with_quiz_question, int currentLevel){
        gameProcessInterface.showQuestionOnView(cl_with_quiz_question, currentLevel);
    }

    public boolean checkAnswerClick(TextView tv_quiz_variant, int currentLevel){
        return gameProcessInterface.checkAnswerClick(tv_quiz_variant, currentLevel);
    }

    public void showInfoAboutCurrentPlace(View cl_with_info_about_current_city, int currentLevel){
        gameProcessInterface.showInfoAboutCurrentPlace(cl_with_info_about_current_city, currentLevel);
    }

    ObjectAnimator animator;
    private void startMarkerAnimation(ImageView img_map_marker){
        animator = ObjectAnimator.ofFloat(img_map_marker, "translationY", 0f, 20f);
        animator.setDuration(1000);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.setRepeatCount(ValueAnimator.INFINITE);

        animator.start();
    }

    public void stopMarkerAnimation(){
        if (animator != null) {
            animator.cancel();
        }
    }
}
