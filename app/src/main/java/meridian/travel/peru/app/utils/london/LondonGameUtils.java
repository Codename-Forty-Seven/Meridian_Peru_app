package meridian.travel.peru.app.utils.london;

import static android.content.ContentValues.TAG;
import static meridian.travel.peru.app.utils.london.ConstantsLondon.TXT_MAIN_ROYAL_OBSERVATORY;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import meridian.travel.peru.app.R;
import meridian.travel.peru.app.utils.CircularProgressBar;
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
    public void showFestivalElements(View viewToShow) {
        TextView txt = activity.findViewById(R.id.tv_with_festival);
        txt.setText(activity.getResources().getString(R.string.txt_festival_london));
        animToShowViews(viewToShow);
    }

    @Override
    public void showPictures(View viewToShow) {
        Drawable img_london = activity.getDrawable(R.drawable.img_london);
        Drawable img_london_2 = activity.getDrawable(R.drawable.img_london_2);
        ImageView img_main_1 = activity.findViewById(R.id.img_main_1);
        ImageView img_main_2 = activity.findViewById(R.id.img_main_2);
        img_main_1.setImageDrawable(img_london);
        img_main_2.setImageDrawable(img_london_2);
        animToShowViews(viewToShow);
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
                ImageView img_1 = activity.findViewById(R.id.img_quiz_question_1);
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                activity.findViewById(R.id.ll_second_question).setEnabled(true);
                activity.findViewById(R.id.ll_second_question).setBackground(back);
                ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
                img_2.setVisibility(View.GONE);
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
                img_2.setVisibility(View.VISIBLE);
                activity.findViewById(R.id.ll_third_question).setEnabled(true);
                ImageView img_3 = activity.findViewById(R.id.img_quiz_question_3);
                img_3.setImageResource(R.drawable.img_unlock);
                img_3.setVisibility(View.GONE);
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
                img_3.setVisibility(View.VISIBLE);
                activity.findViewById(R.id.ll_forth_question).setEnabled(true);
                ImageView img_4 = activity.findViewById(R.id.img_quiz_question_4);
                img_4.setImageResource(R.drawable.img_unlock);
                img_4.setVisibility(View.GONE);
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
                img_4.setVisibility(View.VISIBLE);
                activity.findViewById(R.id.ll_fifth_question).setEnabled(true);
                ImageView img_5 = activity.findViewById(R.id.img_quiz_question_5);
                img_5.setImageResource(R.drawable.img_unlock);
                img_5.setVisibility(View.GONE);
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
                img_5.setVisibility(View.VISIBLE);
                activity.findViewById(R.id.ll_sixth_question).setEnabled(true);
                ImageView img_6 = activity.findViewById(R.id.img_quiz_question_6);
                img_6.setImageResource(R.drawable.img_unlock);
                img_6.setVisibility(View.GONE);
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
                img_6.setVisibility(View.VISIBLE);
                activity.findViewById(R.id.ll_seventh_question).setEnabled(true);
                ImageView img_7 = activity.findViewById(R.id.img_quiz_question_7);
                img_7.setImageResource(R.drawable.img_unlock);
                img_7.setVisibility(View.GONE);
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
                img_7.setVisibility(View.VISIBLE);
                activity.findViewById(R.id.ll_eighth_question).setEnabled(true);
                ImageView img_8 = activity.findViewById(R.id.img_quiz_question_8);
                img_8.setImageResource(R.drawable.img_unlock);
                img_8.setVisibility(View.GONE);
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
                img_8.setVisibility(View.VISIBLE);
                activity.findViewById(R.id.ll_ninth_question).setEnabled(true);
                ImageView img_9 = activity.findViewById(R.id.img_quiz_question_9);
                img_9.setImageResource(R.drawable.img_unlock);
                img_9.setVisibility(View.GONE);
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
                img_9.setVisibility(View.VISIBLE);
                activity.findViewById(R.id.ll_tenth_question).setEnabled(true);
                ImageView img_10 = activity.findViewById(R.id.img_quiz_question_10);
                img_10.setImageResource(R.drawable.img_unlock);
                img_10.setVisibility(View.GONE);
                animToShowViews(viewToShow);
                break;
            }
        }
    }

    @Override
    public void showQuizListProgress(View cl_with_progress, int currentLevel) {
        CircularProgressBar london_progress_bar = activity.findViewById(R.id.london_progress_bar);
        CircularProgressBar valencia_progress_bar = activity.findViewById(R.id.valencia_progress_bar);
        CircularProgressBar albufera_progress_bar = activity.findViewById(R.id.albufera_progress_bar);
        CircularProgressBar ajim_progress_bar = activity.findViewById(R.id.ajim_progress_bar);
        CircularProgressBar tamanrasset_progress_bar = activity.findViewById(R.id.tamanrasset_progress_bar);
        CircularProgressBar gonna_re_zhu_progress_bar = activity.findViewById(R.id.gonna_re_zhu_progress_bar);
        CircularProgressBar longa_market_progress_bar = activity.findViewById(R.id.longa_market_progress_bar);
        CircularProgressBar botswana_progress_bar = activity.findViewById(R.id.botswana_progress_bar);
        CircularProgressBar antarctica_progress_bar = activity.findViewById(R.id.antarctica_progress_bar);
        ImageView img_lock_valencia = activity.findViewById(R.id.img_lock_valencia);
        ImageView img_lock_albufera = activity.findViewById(R.id.img_lock_albufera);
        ImageView img_lock_ajim = activity.findViewById(R.id.img_lock_ajim);
        ImageView img_lock_tamanrasset = activity.findViewById(R.id.img_lock_tamanrasset);
        ImageView img_lock_gonna_re_zhu = activity.findViewById(R.id.img_lock_gonna_re_zhu);
        ImageView img_lock_longa_market = activity.findViewById(R.id.img_lock_longa_market);
        ImageView img_lock_botswana = activity.findViewById(R.id.img_lock_botswana);
        ImageView img_lock_antarctica = activity.findViewById(R.id.img_lock_antarctica);
        Drawable completeCity = activity.getDrawable(R.drawable.design_for_complete_quiz);
        if (currentLevel > 0 && currentLevel <= 10) {
            london_progress_bar.setProgressText(10);
            london_progress_bar.setProgress(currentLevel);
            activity.findViewById(R.id.ll_london_progress).setEnabled(true);
            activity.findViewById(R.id.ll_valencia_progress).setEnabled(false);
            valencia_progress_bar.setProgressText(10);
            valencia_progress_bar.setProgress(0);
            activity.findViewById(R.id.ll_albufera_progress).setEnabled(false);
            albufera_progress_bar.setProgressText(10);
            albufera_progress_bar.setProgress(0);
            activity.findViewById(R.id.ll_ajim_progress).setEnabled(false);
            ajim_progress_bar.setProgressText(10);
            ajim_progress_bar.setProgress(0);
            activity.findViewById(R.id.ll_tamanrasset_progress).setEnabled(false);
            tamanrasset_progress_bar.setProgressText(10);
            tamanrasset_progress_bar.setProgress(0);
            activity.findViewById(R.id.ll_gonna_re_zhu_progress).setEnabled(false);
            gonna_re_zhu_progress_bar.setProgressText(10);
            gonna_re_zhu_progress_bar.setProgress(0);
            activity.findViewById(R.id.ll_longa_market_progress).setEnabled(false);
            longa_market_progress_bar.setProgressText(10);
            longa_market_progress_bar.setProgress(0);
            activity.findViewById(R.id.ll_botswana_progress).setEnabled(false);
            botswana_progress_bar.setProgressText(10);
            botswana_progress_bar.setProgress(0);
            activity.findViewById(R.id.ll_antarctica_progress).setEnabled(false);
            antarctica_progress_bar.setProgressText(10);
            antarctica_progress_bar.setProgress(0);
            animToShowViews(cl_with_progress);
        } else if (currentLevel > 10 && currentLevel <= 20) {
            london_progress_bar.setProgressText(10);
            london_progress_bar.setProgress(10);
            activity.findViewById(R.id.ll_london_progress).setEnabled(false);
            activity.findViewById(R.id.ll_london_progress).setBackground(completeCity);
            activity.findViewById(R.id.ll_valencia_progress).setEnabled(true);
            valencia_progress_bar.setProgressText(10);
            valencia_progress_bar.setProgress(currentLevel - 10);
            activity.findViewById(R.id.ll_albufera_progress).setEnabled(false);
            albufera_progress_bar.setProgressText(10);
            albufera_progress_bar.setProgress(0);
            activity.findViewById(R.id.ll_ajim_progress).setEnabled(false);
            ajim_progress_bar.setProgressText(10);
            ajim_progress_bar.setProgress(0);
            activity.findViewById(R.id.ll_tamanrasset_progress).setEnabled(false);
            tamanrasset_progress_bar.setProgressText(10);
            tamanrasset_progress_bar.setProgress(0);
            activity.findViewById(R.id.ll_gonna_re_zhu_progress).setEnabled(false);
            gonna_re_zhu_progress_bar.setProgressText(10);
            gonna_re_zhu_progress_bar.setProgress(0);
            activity.findViewById(R.id.ll_longa_market_progress).setEnabled(false);
            longa_market_progress_bar.setProgressText(10);
            longa_market_progress_bar.setProgress(0);
            activity.findViewById(R.id.ll_botswana_progress).setEnabled(false);
            botswana_progress_bar.setProgressText(10);
            botswana_progress_bar.setProgress(0);
            activity.findViewById(R.id.ll_antarctica_progress).setEnabled(false);
            antarctica_progress_bar.setProgressText(10);
            antarctica_progress_bar.setProgress(0);
            animToShowViews(cl_with_progress);
        }
//        switch (currentLevel) {
//            case 1: {
//                activity.findViewById(R.id.ll_london_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_valencia_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_albufera_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_ajim_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_tamanrasset_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_gonna_re_zhu_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_longa_market_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_botswana_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_antarctica_progress).setEnabled(false);
//                animToShowViews(cl_with_progress);
//                break;
//            }
//            case 2: {
//                activity.findViewById(R.id.ll_london_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_valencia_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_albufera_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_ajim_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_tamanrasset_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_gonna_re_zhu_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_longa_market_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_botswana_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_antarctica_progress).setEnabled(false);
//                animToShowViews(cl_with_progress);
//                break;
//            }
//            case 3: {
//                activity.findViewById(R.id.ll_london_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_valencia_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_albufera_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_ajim_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_tamanrasset_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_gonna_re_zhu_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_longa_market_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_botswana_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_antarctica_progress).setEnabled(false);
//                animToShowViews(cl_with_progress);
//                break;
//            }
//            case 4: {
//                activity.findViewById(R.id.ll_london_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_valencia_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_albufera_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_ajim_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_tamanrasset_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_gonna_re_zhu_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_longa_market_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_botswana_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_antarctica_progress).setEnabled(false);
//                animToShowViews(cl_with_progress);
//                break;
//            }
//            case 5: {
//                activity.findViewById(R.id.ll_london_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_valencia_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_albufera_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_ajim_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_tamanrasset_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_gonna_re_zhu_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_longa_market_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_botswana_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_antarctica_progress).setEnabled(false);
//                animToShowViews(cl_with_progress);
//                break;
//            }
//            case 6: {
//                activity.findViewById(R.id.ll_london_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_valencia_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_albufera_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_ajim_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_tamanrasset_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_gonna_re_zhu_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_longa_market_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_botswana_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_antarctica_progress).setEnabled(false);
//                animToShowViews(cl_with_progress);
//                break;
//            }
//            case 7: {
//                activity.findViewById(R.id.ll_london_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_valencia_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_albufera_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_ajim_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_tamanrasset_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_gonna_re_zhu_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_longa_market_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_botswana_progress).setEnabled(false);
//                activity.findViewById(R.id.ll_antarctica_progress).setEnabled(false);
//                animToShowViews(cl_with_progress);
//                break;
//            }
//            case 8: {
//                activity.findViewById(R.id.ll_london_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_valencia_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_albufera_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_ajim_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_tamanrasset_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_gonna_re_zhu_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_longa_market_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_botswana_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_antarctica_progress).setEnabled(false);
//                animToShowViews(cl_with_progress);
//                break;
//            }
//            case 9: {
//                activity.findViewById(R.id.ll_london_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_valencia_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_albufera_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_ajim_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_tamanrasset_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_gonna_re_zhu_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_longa_market_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_botswana_progress).setEnabled(true);
//                activity.findViewById(R.id.ll_antarctica_progress).setEnabled(true);
//                animToShowViews(cl_with_progress);
//                break;
//            }
//        }
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
