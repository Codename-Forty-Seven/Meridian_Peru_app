package meridian.travel.peru.app.utils.london;

import static meridian.travel.peru.app.utils.london.ConstantsLondon.TXT_MAIN_ROYAL_OBSERVATORY;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import meridian.travel.peru.app.R;
import meridian.travel.peru.app.utils.GameProcessInterface;

public class LondonGameUtils implements GameProcessInterface {
    private final Activity activity;

    public LondonGameUtils(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void showMainElements(View viewToShow) {
        ImageView img_current_city = activity.findViewById(R.id.img_current_city);
        ImageView img_current_stop = activity.findViewById(R.id.img_current_stop);
        img_current_city.setImageDrawable(activity.getResources().getDrawable(R.drawable.stop_london));
        img_current_stop.setImageDrawable(activity.getResources().getDrawable(R.drawable.stop_number_1));
        animToShowViews(viewToShow);
    }

    @Override
    public void showAllOpenCities(View viewToShow) {
        animToShowViews(viewToShow);
    }

    @Override
    public void showFestivalElements(TextView viewToShow) {

    }

    @Override
    public void showPictures(View viewToShow) {

    }

    @Override
    public void showQuizListQuestions(View viewToShow, int currentLevel) {
        Drawable back = activity.getDrawable(R.drawable.anim_click_text);
        switch (currentLevel) {
            case 1: {
                activity.findViewById(R.id.ll_second_question).setEnabled(false);
                activity.findViewById(R.id.ll_third_question).setEnabled(false);
                activity.findViewById(R.id.ll_forth_question).setEnabled(false);
                activity.findViewById(R.id.ll_fifth_question).setEnabled(false);
                activity.findViewById(R.id.ll_sixth_question).setEnabled(false);
                activity.findViewById(R.id.ll_seventh_question).setEnabled(false);
                activity.findViewById(R.id.ll_eighth_question).setEnabled(false);
                activity.findViewById(R.id.ll_ninth_question).setEnabled(false);
                activity.findViewById(R.id.ll_tenth_question).setEnabled(false);
                animToShowViews(viewToShow);
                break;
            }
            case 2: {
                activity.findViewById(R.id.ll_second_question).setEnabled(true);
                activity.findViewById(R.id.ll_second_question).setBackground(back);
                ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
                img_2.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_third_question).setEnabled(false);
                activity.findViewById(R.id.ll_forth_question).setEnabled(false);
                activity.findViewById(R.id.ll_fifth_question).setEnabled(false);
                activity.findViewById(R.id.ll_sixth_question).setEnabled(false);
                activity.findViewById(R.id.ll_seventh_question).setEnabled(false);
                activity.findViewById(R.id.ll_eighth_question).setEnabled(false);
                activity.findViewById(R.id.ll_ninth_question).setEnabled(false);
                activity.findViewById(R.id.ll_tenth_question).setEnabled(false);
                animToShowViews(viewToShow);
                break;
            }
            case 3: {
                activity.findViewById(R.id.ll_second_question).setEnabled(true);
                activity.findViewById(R.id.ll_second_question).setBackground(back);
                ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
                img_2.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_third_question).setEnabled(true);
                ImageView img_3 = activity.findViewById(R.id.img_quiz_question_3);
                img_3.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_forth_question).setEnabled(false);
                activity.findViewById(R.id.ll_fifth_question).setEnabled(false);
                activity.findViewById(R.id.ll_sixth_question).setEnabled(false);
                activity.findViewById(R.id.ll_seventh_question).setEnabled(false);
                activity.findViewById(R.id.ll_eighth_question).setEnabled(false);
                activity.findViewById(R.id.ll_ninth_question).setEnabled(false);
                activity.findViewById(R.id.ll_tenth_question).setEnabled(false);
                animToShowViews(viewToShow);
                break;
            }
            case 4: {
                activity.findViewById(R.id.ll_second_question).setEnabled(true);
                activity.findViewById(R.id.ll_second_question).setBackground(back);
                ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
                img_2.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_third_question).setEnabled(true);
                ImageView img_3 = activity.findViewById(R.id.img_quiz_question_3);
                img_3.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_forth_question).setEnabled(true);
                ImageView img_4 = activity.findViewById(R.id.img_quiz_question_4);
                img_4.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_fifth_question).setEnabled(false);
                activity.findViewById(R.id.ll_sixth_question).setEnabled(false);
                activity.findViewById(R.id.ll_seventh_question).setEnabled(false);
                activity.findViewById(R.id.ll_eighth_question).setEnabled(false);
                activity.findViewById(R.id.ll_ninth_question).setEnabled(false);
                activity.findViewById(R.id.ll_tenth_question).setEnabled(false);
                animToShowViews(viewToShow);
                break;
            }
            case 5: {
                activity.findViewById(R.id.ll_second_question).setEnabled(true);
                activity.findViewById(R.id.ll_second_question).setBackground(back);
                ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
                img_2.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_third_question).setEnabled(true);
                ImageView img_3 = activity.findViewById(R.id.img_quiz_question_3);
                img_3.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_forth_question).setEnabled(true);
                ImageView img_4 = activity.findViewById(R.id.img_quiz_question_4);
                img_4.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_fifth_question).setEnabled(true);
                ImageView img_5 = activity.findViewById(R.id.img_quiz_question_5);
                img_5.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_sixth_question).setEnabled(false);
                activity.findViewById(R.id.ll_seventh_question).setEnabled(false);
                activity.findViewById(R.id.ll_eighth_question).setEnabled(false);
                activity.findViewById(R.id.ll_ninth_question).setEnabled(false);
                activity.findViewById(R.id.ll_tenth_question).setEnabled(false);
                animToShowViews(viewToShow);
                break;
            }
            case 6: {
                activity.findViewById(R.id.ll_second_question).setEnabled(true);
                activity.findViewById(R.id.ll_second_question).setBackground(back);
                ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
                img_2.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_third_question).setEnabled(true);
                ImageView img_3 = activity.findViewById(R.id.img_quiz_question_3);
                img_3.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_forth_question).setEnabled(true);
                ImageView img_4 = activity.findViewById(R.id.img_quiz_question_4);
                img_4.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_fifth_question).setEnabled(true);
                ImageView img_5 = activity.findViewById(R.id.img_quiz_question_5);
                img_5.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_sixth_question).setEnabled(true);
                ImageView img_6 = activity.findViewById(R.id.img_quiz_question_6);
                img_6.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_seventh_question).setEnabled(false);
                activity.findViewById(R.id.ll_eighth_question).setEnabled(false);
                activity.findViewById(R.id.ll_ninth_question).setEnabled(false);
                activity.findViewById(R.id.ll_tenth_question).setEnabled(false);
                animToShowViews(viewToShow);
                break;
            }
            case 7: {
                activity.findViewById(R.id.ll_second_question).setEnabled(true);
                activity.findViewById(R.id.ll_second_question).setBackground(back);
                ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
                img_2.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_third_question).setEnabled(true);
                ImageView img_3 = activity.findViewById(R.id.img_quiz_question_3);
                img_3.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_forth_question).setEnabled(true);
                ImageView img_4 = activity.findViewById(R.id.img_quiz_question_4);
                img_4.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_fifth_question).setEnabled(true);
                ImageView img_5 = activity.findViewById(R.id.img_quiz_question_5);
                img_5.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_sixth_question).setEnabled(true);
                ImageView img_6 = activity.findViewById(R.id.img_quiz_question_6);
                img_6.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_seventh_question).setEnabled(true);
                ImageView img_7 = activity.findViewById(R.id.img_quiz_question_7);
                img_7.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_eighth_question).setEnabled(false);
                activity.findViewById(R.id.ll_ninth_question).setEnabled(false);
                activity.findViewById(R.id.ll_tenth_question).setEnabled(false);
                animToShowViews(viewToShow);
                break;
            }
            case 8: {
                activity.findViewById(R.id.ll_second_question).setEnabled(true);
                activity.findViewById(R.id.ll_second_question).setBackground(back);
                ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
                img_2.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_third_question).setEnabled(true);
                ImageView img_3 = activity.findViewById(R.id.img_quiz_question_3);
                img_3.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_forth_question).setEnabled(true);
                ImageView img_4 = activity.findViewById(R.id.img_quiz_question_4);
                img_4.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_fifth_question).setEnabled(true);
                ImageView img_5 = activity.findViewById(R.id.img_quiz_question_5);
                img_5.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_sixth_question).setEnabled(true);
                ImageView img_6 = activity.findViewById(R.id.img_quiz_question_6);
                img_6.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_seventh_question).setEnabled(true);
                ImageView img_7 = activity.findViewById(R.id.img_quiz_question_7);
                img_7.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_eighth_question).setEnabled(true);
                ImageView img_8 = activity.findViewById(R.id.img_quiz_question_8);
                img_8.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_ninth_question).setEnabled(false);
                activity.findViewById(R.id.ll_tenth_question).setEnabled(false);
                animToShowViews(viewToShow);
                break;
            }
            case 9: {
                activity.findViewById(R.id.ll_second_question).setEnabled(true);
                activity.findViewById(R.id.ll_second_question).setBackground(back);
                ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
                img_2.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_third_question).setEnabled(true);
                ImageView img_3 = activity.findViewById(R.id.img_quiz_question_3);
                img_3.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_forth_question).setEnabled(true);
                ImageView img_4 = activity.findViewById(R.id.img_quiz_question_4);
                img_4.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_fifth_question).setEnabled(true);
                ImageView img_5 = activity.findViewById(R.id.img_quiz_question_5);
                img_5.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_sixth_question).setEnabled(true);
                ImageView img_6 = activity.findViewById(R.id.img_quiz_question_6);
                img_6.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_seventh_question).setEnabled(true);
                ImageView img_7 = activity.findViewById(R.id.img_quiz_question_7);
                img_7.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_eighth_question).setEnabled(true);
                ImageView img_8 = activity.findViewById(R.id.img_quiz_question_8);
                img_8.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_ninth_question).setEnabled(true);
                ImageView img_9 = activity.findViewById(R.id.img_quiz_question_9);
                img_9.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_tenth_question).setEnabled(false);
                animToShowViews(viewToShow);
                break;
            }
            case 10: {
                activity.findViewById(R.id.ll_second_question).setEnabled(true);
                activity.findViewById(R.id.ll_second_question).setBackground(back);
                ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
                img_2.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_third_question).setEnabled(true);
                ImageView img_3 = activity.findViewById(R.id.img_quiz_question_3);
                img_3.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_forth_question).setEnabled(true);
                ImageView img_4 = activity.findViewById(R.id.img_quiz_question_4);
                img_4.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_fifth_question).setEnabled(true);
                ImageView img_5 = activity.findViewById(R.id.img_quiz_question_5);
                img_5.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_sixth_question).setEnabled(true);
                ImageView img_6 = activity.findViewById(R.id.img_quiz_question_6);
                img_6.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_seventh_question).setEnabled(true);
                ImageView img_7 = activity.findViewById(R.id.img_quiz_question_7);
                img_7.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_eighth_question).setEnabled(true);
                ImageView img_8 = activity.findViewById(R.id.img_quiz_question_8);
                img_8.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_ninth_question).setEnabled(true);
                ImageView img_9 = activity.findViewById(R.id.img_quiz_question_9);
                img_9.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_tenth_question).setEnabled(true);
                ImageView img_10 = activity.findViewById(R.id.img_quiz_question_10);
                img_10.setImageResource(R.drawable.img_unlock);
                animToShowViews(viewToShow);
                break;
            }
        }
    }

    @Override
    public void showViewForStudy(View... viewToShow) {
        TextView tv_header_for_study_about_current_stop = activity.findViewById(R.id.tv_header_for_study_about_current_stop);
        TextView tv_main_txt_for_study_about_current_stop = activity.findViewById(R.id.tv_main_txt_for_study_about_current_stop);
        tv_header_for_study_about_current_stop.setText(activity.getResources().getString(R.string.txt_header_royal_observatory));
        tv_main_txt_for_study_about_current_stop.setText(TXT_MAIN_ROYAL_OBSERVATORY);
        for (View view : viewToShow)
            animToShowViews(view);
    }

    public void animToShowViews(View whatShow) {
        whatShow.setVisibility(View.VISIBLE);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenHeight = displayMetrics.heightPixels;
        TranslateAnimation slideAnimation = new TranslateAnimation(0, 0, -screenHeight, 0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0f, 1f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(slideAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(1000);
        whatShow.startAnimation(animationSet);
    }

}
