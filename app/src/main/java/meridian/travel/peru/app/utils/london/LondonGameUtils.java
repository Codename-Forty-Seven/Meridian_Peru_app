package meridian.travel.peru.app.utils.london;

import static meridian.travel.peru.app.utils.london.ConstantsLondon.EIGHTH_QUESTION_LONDON;
import static meridian.travel.peru.app.utils.london.ConstantsLondon.FIFTH_QUESTION_LONDON;
import static meridian.travel.peru.app.utils.london.ConstantsLondon.FIRST_QUESTION_LONDON;
import static meridian.travel.peru.app.utils.london.ConstantsLondon.FORTH_QUESTION_LONDON;
import static meridian.travel.peru.app.utils.london.ConstantsLondon.NINTH_QUESTION_LONDON;
import static meridian.travel.peru.app.utils.london.ConstantsLondon.SECOND_QUESTION_LONDON;
import static meridian.travel.peru.app.utils.london.ConstantsLondon.SEVENTH_QUESTION_LONDON;
import static meridian.travel.peru.app.utils.london.ConstantsLondon.SIXTH_QUESTION_LONDON;
import static meridian.travel.peru.app.utils.london.ConstantsLondon.TENTH_QUESTION_LONDON;
import static meridian.travel.peru.app.utils.london.ConstantsLondon.THIRD_QUESTION_LONDON;
import static meridian.travel.peru.app.utils.london.ConstantsLondon.TXT_MAIN_FESTIVAL_LONDON;
import static meridian.travel.peru.app.utils.london.ConstantsLondon.TXT_MAIN_GREENWICH;
import static meridian.travel.peru.app.utils.london.ConstantsLondon.TXT_MAIN_LONDON;
import static meridian.travel.peru.app.utils.london.ConstantsLondon.TXT_MAIN_ROYAL_OBSERVATORY;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

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
        TextView txt = activity.findViewById(R.id.tv_with_festival_london);
        txt.setText(activity.getResources().getString(R.string.txt_festival_london));
        animToShowViews(viewToShow);
    }

    @Override
    public void showPictures(View viewToShow, TextView tv_whatClick) {
        ImageView img_main_1 = activity.findViewById(R.id.img_main_1);
        ImageView img_main_2 = activity.findViewById(R.id.img_main_2);
        ImageView img_main_3 = activity.findViewById(R.id.img_main_3);
        ImageView img_main_4 = activity.findViewById(R.id.img_main_4);
        ImageView img_main_5 = activity.findViewById(R.id.img_main_5);
        if (tv_whatClick == activity.findViewById(R.id.tv_london)) {
            img_main_1.setImageResource(R.drawable.img_london);
            img_main_1.setTag(R.drawable.img_london);
            img_main_2.setImageResource(R.drawable.img_london_2);
            img_main_2.setTag(R.drawable.img_london_2);
            img_main_3.setImageResource(R.drawable.img_london_3);
            img_main_3.setTag(R.drawable.img_london_3);
            img_main_4.setImageResource(R.drawable.img_london_4);
            img_main_4.setTag(R.drawable.img_london_4);
            img_main_5.setImageResource(R.drawable.img_london_5);
            img_main_5.setTag(R.drawable.img_london_5);
        }
        animToShowViews(viewToShow);
    }

    @Override
    public void showQuizListQuestions(View viewToShow, int currentLevel) {
        Drawable back = activity.getDrawable(R.drawable.anim_click_text);
        LinearLayout ll_first_question = activity.findViewById(R.id.ll_first_question);
        ImageView img_1 = activity.findViewById(R.id.img_quiz_question_1);
        TextView tv_quiz_question_1 = activity.findViewById(R.id.tv_quiz_question_1);
        LinearLayout ll_second_question = activity.findViewById(R.id.ll_second_question);
        ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
        TextView tv_quiz_question_2 = activity.findViewById(R.id.tv_quiz_question_2);
        LinearLayout ll_third_question = activity.findViewById(R.id.ll_third_question);
        ImageView img_3 = activity.findViewById(R.id.img_quiz_question_3);
        TextView tv_quiz_question_3 = activity.findViewById(R.id.tv_quiz_question_3);
        LinearLayout ll_forth_question = activity.findViewById(R.id.ll_forth_question);
        ImageView img_4 = activity.findViewById(R.id.img_quiz_question_4);
        TextView tv_quiz_question_4 = activity.findViewById(R.id.tv_quiz_question_4);
        LinearLayout ll_fifth_question = activity.findViewById(R.id.ll_fifth_question);
        ImageView img_5 = activity.findViewById(R.id.img_quiz_question_5);
        TextView tv_quiz_question_5 = activity.findViewById(R.id.tv_quiz_question_5);
        LinearLayout ll_sixth_question = activity.findViewById(R.id.ll_sixth_question);
        ImageView img_6 = activity.findViewById(R.id.img_quiz_question_6);
        TextView tv_quiz_question_6 = activity.findViewById(R.id.tv_quiz_question_6);
        LinearLayout ll_seventh_question = activity.findViewById(R.id.ll_seventh_question);
        ImageView img_7 = activity.findViewById(R.id.img_quiz_question_7);
        TextView tv_quiz_question_7 = activity.findViewById(R.id.tv_quiz_question_7);
        LinearLayout ll_eighth_question = activity.findViewById(R.id.ll_eighth_question);
        ImageView img_8 = activity.findViewById(R.id.img_quiz_question_8);
        TextView tv_quiz_question_8 = activity.findViewById(R.id.tv_quiz_question_8);
        LinearLayout ll_ninth_question = activity.findViewById(R.id.ll_ninth_question);
        ImageView img_9 = activity.findViewById(R.id.img_quiz_question_9);
        TextView tv_quiz_question_9 = activity.findViewById(R.id.tv_quiz_question_9);
        LinearLayout ll_tenth_question = activity.findViewById(R.id.ll_tenth_question);
        ImageView img_10 = activity.findViewById(R.id.img_quiz_question_10);
        TextView tv_quiz_question_10 = activity.findViewById(R.id.tv_quiz_question_10);
        setInStartView(ll_first_question, ll_second_question, ll_third_question, ll_forth_question, ll_fifth_question,
                ll_sixth_question, ll_seventh_question, ll_eighth_question, ll_ninth_question, ll_tenth_question);
        setInStartTextView(tv_quiz_question_2, tv_quiz_question_3, tv_quiz_question_4, tv_quiz_question_5, tv_quiz_question_6,
                tv_quiz_question_7, tv_quiz_question_8, tv_quiz_question_9, tv_quiz_question_10);
        setInStartImageView(img_2, img_3, img_4, img_5, img_6, img_7, img_8, img_9, img_10);
        switch (currentLevel) {
            case 1: {
                ll_first_question.setEnabled(true);
                tv_quiz_question_1.setEnabled(true);
                ll_first_question.setBackground(back);
                img_1.setVisibility(View.INVISIBLE);
                ll_second_question.setEnabled(false);
                ll_third_question.setEnabled(false);
                ll_forth_question.setEnabled(false);
                ll_fifth_question.setEnabled(false);
                ll_sixth_question.setEnabled(false);
                ll_seventh_question.setEnabled(false);
                ll_eighth_question.setEnabled(false);
                ll_ninth_question.setEnabled(false);
                ll_tenth_question.setEnabled(false);
                break;
            }
            case 2: {
                ll_first_question.setEnabled(false);
                ll_first_question.setBackground(back);
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                img_1.setEnabled(false);
                tv_quiz_question_1.setEnabled(false);
                ll_second_question.setEnabled(true);
                tv_quiz_question_2.setEnabled(true);
                ll_second_question.setBackground(back);
                img_2.setVisibility(View.INVISIBLE);
                break;
            }
            case 3: {
                ll_first_question.setBackground(back);
                ll_first_question.setEnabled(false);
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                img_1.setEnabled(false);
                tv_quiz_question_1.setEnabled(false);
                ll_second_question.setEnabled(false);
                ll_second_question.setBackground(back);
                tv_quiz_question_2.setEnabled(false);
                img_2.setImageResource(R.drawable.img_unlock);
                img_2.setVisibility(View.VISIBLE);
                img_2.setEnabled(false);
                ll_third_question.setEnabled(true);
                tv_quiz_question_3.setEnabled(true);
                ll_third_question.setBackground(back);
                img_3.setImageResource(R.drawable.img_unlock);
                img_3.setVisibility(View.INVISIBLE);
                break;
            }
            case 4: {
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                img_1.setEnabled(false);
                ll_first_question.setBackground(back);
                ll_first_question.setEnabled(false);
                tv_quiz_question_1.setEnabled(false);
                ll_second_question.setEnabled(false);
                ll_second_question.setBackground(back);
                tv_quiz_question_2.setEnabled(false);
                img_2.setImageResource(R.drawable.img_unlock);
                img_2.setVisibility(View.VISIBLE);
                img_2.setEnabled(false);
                ll_third_question.setEnabled(false);
                ll_third_question.setBackground(back);
                tv_quiz_question_3.setEnabled(false);
                img_3.setImageResource(R.drawable.img_unlock);
                img_3.setVisibility(View.VISIBLE);
                img_3.setEnabled(false);
                ll_forth_question.setEnabled(true);
                tv_quiz_question_4.setEnabled(true);
                ll_forth_question.setBackground(back);
                img_4.setImageResource(R.drawable.img_unlock);
                img_4.setVisibility(View.INVISIBLE);
                img_4.setEnabled(false);
                break;
            }
            case 5: {
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                img_1.setEnabled(false);
                ll_first_question.setBackground(back);
                ll_first_question.setEnabled(false);
                tv_quiz_question_1.setEnabled(false);
                ll_second_question.setEnabled(false);
                ll_second_question.setBackground(back);
                tv_quiz_question_2.setEnabled(false);
                img_2.setImageResource(R.drawable.img_unlock);
                img_2.setVisibility(View.VISIBLE);
                img_2.setEnabled(false);
                ll_third_question.setEnabled(false);
                ll_third_question.setBackground(back);
                tv_quiz_question_3.setEnabled(false);
                img_3.setImageResource(R.drawable.img_unlock);
                img_3.setVisibility(View.VISIBLE);
                img_3.setEnabled(false);
                ll_forth_question.setEnabled(false);
                tv_quiz_question_4.setEnabled(false);
                ll_forth_question.setBackground(back);
                img_4.setImageResource(R.drawable.img_unlock);
                img_4.setVisibility(View.VISIBLE);
                img_4.setEnabled(false);
                ll_fifth_question.setEnabled(true);
                tv_quiz_question_5.setEnabled(true);
                ll_fifth_question.setBackground(back);
                img_5.setImageResource(R.drawable.img_unlock);
                img_5.setVisibility(View.INVISIBLE);
                img_5.setEnabled(false);
                break;
            }
            case 6: {
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                img_1.setEnabled(false);
                ll_first_question.setBackground(back);
                ll_first_question.setEnabled(false);
                tv_quiz_question_1.setEnabled(false);
                ll_second_question.setEnabled(false);
                ll_second_question.setBackground(back);
                tv_quiz_question_2.setEnabled(false);
                img_2.setImageResource(R.drawable.img_unlock);
                img_2.setVisibility(View.VISIBLE);
                img_2.setEnabled(false);
                ll_third_question.setEnabled(false);
                ll_third_question.setBackground(back);
                tv_quiz_question_3.setEnabled(false);
                img_3.setImageResource(R.drawable.img_unlock);
                img_3.setVisibility(View.VISIBLE);
                img_3.setEnabled(false);
                ll_forth_question.setEnabled(false);
                tv_quiz_question_4.setEnabled(false);
                ll_forth_question.setBackground(back);
                img_4.setImageResource(R.drawable.img_unlock);
                img_4.setVisibility(View.VISIBLE);
                img_4.setEnabled(false);
                ll_fifth_question.setEnabled(false);
                tv_quiz_question_5.setEnabled(false);
                ll_fifth_question.setBackground(back);
                img_5.setImageResource(R.drawable.img_unlock);
                img_5.setVisibility(View.VISIBLE);
                img_5.setEnabled(false);
                ll_sixth_question.setEnabled(true);
                tv_quiz_question_6.setEnabled(true);
                ll_sixth_question.setBackground(back);
                img_6.setImageResource(R.drawable.img_unlock);
                img_6.setVisibility(View.INVISIBLE);
                img_6.setEnabled(false);
                break;
            }
            case 7: {
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                img_1.setEnabled(false);
                ll_first_question.setBackground(back);
                ll_first_question.setEnabled(false);
                tv_quiz_question_1.setEnabled(false);
                ll_second_question.setEnabled(false);
                ll_second_question.setBackground(back);
                tv_quiz_question_2.setEnabled(false);
                img_2.setImageResource(R.drawable.img_unlock);
                img_2.setVisibility(View.VISIBLE);
                img_2.setEnabled(false);
                ll_third_question.setEnabled(false);
                ll_third_question.setBackground(back);
                tv_quiz_question_3.setEnabled(false);
                img_3.setImageResource(R.drawable.img_unlock);
                img_3.setVisibility(View.VISIBLE);
                img_3.setEnabled(false);
                ll_forth_question.setEnabled(false);
                tv_quiz_question_4.setEnabled(false);
                ll_forth_question.setBackground(back);
                img_4.setImageResource(R.drawable.img_unlock);
                img_4.setVisibility(View.VISIBLE);
                img_4.setEnabled(false);
                ll_fifth_question.setEnabled(false);
                tv_quiz_question_5.setEnabled(false);
                ll_fifth_question.setBackground(back);
                img_5.setImageResource(R.drawable.img_unlock);
                img_5.setVisibility(View.VISIBLE);
                img_5.setEnabled(false);
                ll_sixth_question.setEnabled(false);
                tv_quiz_question_6.setEnabled(false);
                ll_sixth_question.setBackground(back);
                img_6.setImageResource(R.drawable.img_unlock);
                img_6.setVisibility(View.VISIBLE);
                img_6.setEnabled(false);
                ll_seventh_question.setEnabled(true);
                tv_quiz_question_7.setEnabled(true);
                ll_seventh_question.setBackground(back);
                img_7.setImageResource(R.drawable.img_unlock);
                img_7.setVisibility(View.INVISIBLE);
                img_7.setEnabled(false);
                break;
            }
            case 8: {
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                img_1.setEnabled(false);
                ll_first_question.setBackground(back);
                ll_first_question.setEnabled(false);
                tv_quiz_question_1.setEnabled(false);
                ll_second_question.setEnabled(false);
                ll_second_question.setBackground(back);
                tv_quiz_question_2.setEnabled(false);
                img_2.setImageResource(R.drawable.img_unlock);
                img_2.setVisibility(View.VISIBLE);
                img_2.setEnabled(false);
                ll_third_question.setEnabled(false);
                ll_third_question.setBackground(back);
                tv_quiz_question_3.setEnabled(false);
                img_3.setImageResource(R.drawable.img_unlock);
                img_3.setVisibility(View.VISIBLE);
                img_3.setEnabled(false);
                ll_forth_question.setEnabled(false);
                tv_quiz_question_4.setEnabled(false);
                ll_forth_question.setBackground(back);
                img_4.setImageResource(R.drawable.img_unlock);
                img_4.setVisibility(View.VISIBLE);
                img_4.setEnabled(false);
                ll_fifth_question.setEnabled(false);
                tv_quiz_question_5.setEnabled(false);
                ll_fifth_question.setBackground(back);
                img_5.setImageResource(R.drawable.img_unlock);
                img_5.setVisibility(View.VISIBLE);
                img_5.setEnabled(false);
                ll_sixth_question.setEnabled(false);
                tv_quiz_question_6.setEnabled(false);
                ll_sixth_question.setBackground(back);
                img_6.setImageResource(R.drawable.img_unlock);
                img_6.setVisibility(View.VISIBLE);
                img_6.setEnabled(false);
                ll_seventh_question.setEnabled(false);
                tv_quiz_question_7.setEnabled(false);
                ll_seventh_question.setBackground(back);
                img_7.setImageResource(R.drawable.img_unlock);
                img_7.setVisibility(View.VISIBLE);
                img_7.setEnabled(false);
                ll_eighth_question.setEnabled(true);
                tv_quiz_question_8.setEnabled(true);
                ll_eighth_question.setBackground(back);
                img_8.setImageResource(R.drawable.img_unlock);
                img_8.setVisibility(View.INVISIBLE);
                img_8.setEnabled(false);
                break;
            }
            case 9: {
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                img_1.setEnabled(false);
                ll_first_question.setBackground(back);
                ll_first_question.setEnabled(false);
                tv_quiz_question_1.setEnabled(false);
                ll_second_question.setEnabled(false);
                ll_second_question.setBackground(back);
                tv_quiz_question_2.setEnabled(false);
                img_2.setImageResource(R.drawable.img_unlock);
                img_2.setVisibility(View.VISIBLE);
                img_2.setEnabled(false);
                ll_third_question.setEnabled(false);
                ll_third_question.setBackground(back);
                tv_quiz_question_3.setEnabled(false);
                img_3.setImageResource(R.drawable.img_unlock);
                img_3.setVisibility(View.VISIBLE);
                img_3.setEnabled(false);
                ll_forth_question.setEnabled(false);
                tv_quiz_question_4.setEnabled(false);
                ll_forth_question.setBackground(back);
                img_4.setImageResource(R.drawable.img_unlock);
                img_4.setVisibility(View.VISIBLE);
                img_4.setEnabled(false);
                ll_fifth_question.setEnabled(false);
                tv_quiz_question_5.setEnabled(false);
                ll_fifth_question.setBackground(back);
                img_5.setImageResource(R.drawable.img_unlock);
                img_5.setVisibility(View.VISIBLE);
                img_5.setEnabled(false);
                ll_sixth_question.setEnabled(false);
                tv_quiz_question_6.setEnabled(false);
                ll_sixth_question.setBackground(back);
                img_6.setImageResource(R.drawable.img_unlock);
                img_6.setVisibility(View.VISIBLE);
                img_6.setEnabled(false);
                ll_seventh_question.setEnabled(false);
                tv_quiz_question_7.setEnabled(false);
                ll_seventh_question.setBackground(back);
                img_7.setImageResource(R.drawable.img_unlock);
                img_7.setVisibility(View.VISIBLE);
                img_7.setEnabled(false);
                ll_eighth_question.setEnabled(false);
                tv_quiz_question_8.setEnabled(false);
                ll_eighth_question.setBackground(back);
                img_8.setImageResource(R.drawable.img_unlock);
                img_8.setVisibility(View.VISIBLE);
                img_8.setEnabled(false);
                ll_ninth_question.setEnabled(true);
                tv_quiz_question_9.setEnabled(true);
                ll_ninth_question.setBackground(back);
                img_9.setImageResource(R.drawable.img_unlock);
                img_9.setVisibility(View.INVISIBLE);
                img_9.setEnabled(false);
                break;
            }
            case 10: {
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                img_1.setEnabled(false);
                ll_first_question.setBackground(back);
                ll_first_question.setEnabled(false);
                tv_quiz_question_1.setEnabled(false);
                ll_second_question.setEnabled(false);
                ll_second_question.setBackground(back);
                tv_quiz_question_2.setEnabled(false);
                img_2.setImageResource(R.drawable.img_unlock);
                img_2.setVisibility(View.VISIBLE);
                img_2.setEnabled(false);
                ll_third_question.setEnabled(false);
                ll_third_question.setBackground(back);
                tv_quiz_question_3.setEnabled(false);
                img_3.setImageResource(R.drawable.img_unlock);
                img_3.setVisibility(View.VISIBLE);
                img_3.setEnabled(false);
                ll_forth_question.setEnabled(false);
                tv_quiz_question_4.setEnabled(false);
                ll_forth_question.setBackground(back);
                img_4.setImageResource(R.drawable.img_unlock);
                img_4.setVisibility(View.VISIBLE);
                img_4.setEnabled(false);
                ll_fifth_question.setEnabled(false);
                tv_quiz_question_5.setEnabled(false);
                ll_fifth_question.setBackground(back);
                img_5.setImageResource(R.drawable.img_unlock);
                img_5.setVisibility(View.VISIBLE);
                img_5.setEnabled(false);
                ll_sixth_question.setEnabled(false);
                tv_quiz_question_6.setEnabled(false);
                ll_sixth_question.setBackground(back);
                img_6.setImageResource(R.drawable.img_unlock);
                img_6.setVisibility(View.VISIBLE);
                img_6.setEnabled(false);
                ll_seventh_question.setEnabled(false);
                tv_quiz_question_7.setEnabled(false);
                ll_seventh_question.setBackground(back);
                img_7.setImageResource(R.drawable.img_unlock);
                img_7.setVisibility(View.VISIBLE);
                img_7.setEnabled(false);
                ll_eighth_question.setEnabled(false);
                tv_quiz_question_8.setEnabled(false);
                ll_eighth_question.setBackground(back);
                img_8.setImageResource(R.drawable.img_unlock);
                img_8.setVisibility(View.VISIBLE);
                img_8.setEnabled(false);
                ll_ninth_question.setEnabled(false);
                tv_quiz_question_9.setEnabled(false);
                ll_ninth_question.setBackground(back);
                img_9.setImageResource(R.drawable.img_unlock);
                img_9.setVisibility(View.VISIBLE);
                img_9.setEnabled(false);
                ll_tenth_question.setEnabled(true);
                tv_quiz_question_10.setEnabled(true);
                ll_tenth_question.setBackground(back);
                img_10.setImageResource(R.drawable.img_unlock);
                img_10.setVisibility(View.INVISIBLE);
                img_10.setEnabled(false);
                break;
            }
        }
        animToShowViews(viewToShow);
    }

    private void setInStartView(View... ll_for_start) {
        for (View ll : ll_for_start) {
            ll.setEnabled(false);
            Drawable back = activity.getDrawable(R.drawable.design_for_question_list);
            ll.setBackground(back);
        }
    }

    private void setInStartImageView(ImageView... img_for_start) {
        for (ImageView img : img_for_start) {
            img.setEnabled(false);
            img.setImageResource(R.drawable.img_lock);
            img.setVisibility(View.VISIBLE);
        }
    }

    private void setInStartTextView(TextView... tv_for_start) {
        for (TextView tv : tv_for_start)
            tv.setEnabled(false);
    }

    @Override
    public void showQuizListProgress(View cl_with_progress, int currentLevel) {
        CircularProgressBar london_progress_bar = activity.findViewById(R.id.london_progress_bar);
        if (currentLevel > 0 && currentLevel <= 10) {
            london_progress_bar.setProgressText(10);
            london_progress_bar.setProgress(currentLevel);
            activity.findViewById(R.id.ll_london_progress).setEnabled(true);
            activity.findViewById(R.id.ll_villajoyosa_progress).setEnabled(false);
            activity.findViewById(R.id.ll_albufera_progress).setEnabled(false);
            activity.findViewById(R.id.ll_ajim_progress).setEnabled(false);
            activity.findViewById(R.id.ll_tamanrasset_progress).setEnabled(false);
            activity.findViewById(R.id.ll_gonna_re_zhu_progress).setEnabled(false);
            activity.findViewById(R.id.ll_longa_market_progress).setEnabled(false);
            activity.findViewById(R.id.ll_botswana_progress).setEnabled(false);
            activity.findViewById(R.id.ll_antarctica_progress).setEnabled(false);
            animToShowViews(cl_with_progress);
        }
    }

    @Override
    public void showViewForStudy(View viewToShow) {
        TextView tv_header_for_study_about_current_stop = activity.findViewById(R.id.tv_header_for_study_about_current_stop);
        TextView tv_main_txt_for_study_about_current_stop = activity.findViewById(R.id.tv_main_txt_for_study_about_current_stop);
        TextView tv_next_place_for_study_about_current_stop = activity.findViewById(R.id.tv_next_place_for_study_about_current_stop);
        tv_next_place_for_study_about_current_stop.setVisibility(View.VISIBLE);
        tv_header_for_study_about_current_stop.setText(activity.getResources().getString(R.string.txt_header_royal_observatory));
        tv_main_txt_for_study_about_current_stop.setText(TXT_MAIN_ROYAL_OBSERVATORY);
        animToShowViews(viewToShow);
    }

    @Override
    public void showSecondPlace(View cl_for_study_about_current_stop) {
        ImageView img_current_place = activity.findViewById(R.id.img_current_place);
        TextView tv_header_for_study_about_current_stop = activity.findViewById(R.id.tv_header_for_study_about_current_stop);
        TextView tv_main_txt_for_study_about_current_stop = activity.findViewById(R.id.tv_main_txt_for_study_about_current_stop);
        TextView tv_next_place_for_study_about_current_stop = activity.findViewById(R.id.tv_next_place_for_study_about_current_stop);
        img_current_place.setImageResource(R.drawable.img_greenwich);
        tv_next_place_for_study_about_current_stop.setVisibility(View.VISIBLE);
        tv_next_place_for_study_about_current_stop.setText(R.string.txt_previous_place);
        tv_header_for_study_about_current_stop.setText(activity.getResources().getString(R.string.txt_header_greenwich));
        tv_main_txt_for_study_about_current_stop.setText(TXT_MAIN_GREENWICH);
        animToShowViews(cl_for_study_about_current_stop);

    }

    @Override
    public void showInfoAboutCurrentFestival(View cl_for_sharing, int currentLevel, TextView tv_what_click) {
        if (tv_what_click == activity.findViewById(R.id.tv_with_festival_london)) {
            TextView tv_header_for_current_festival = activity.findViewById(R.id.tv_header_for_current_festival);
            TextView tv_main_txt_about_current_festival = activity.findViewById(R.id.tv_main_txt_about_current_festival);
            tv_header_for_current_festival.setText(activity.getResources().getString(R.string.txt_header_festival_london));
            tv_main_txt_about_current_festival.setText(TXT_MAIN_FESTIVAL_LONDON);
            animToShowViews(cl_for_sharing);
        }
        animToShowViews(cl_for_sharing);
    }

    @Override
    public void showQuestionOnView(View cl_with_quiz_question, int currentLevel) {
        TextView tv_main_question = activity.findViewById(R.id.tv_quiz_question);
        switch (currentLevel) {
            case 1:
                tv_main_question.setText(FIRST_QUESTION_LONDON);
                animToShowViews(cl_with_quiz_question);
                break;
            case 2:
                tv_main_question.setText(SECOND_QUESTION_LONDON);
                animToShowViews(cl_with_quiz_question);
                break;
            case 3:
                tv_main_question.setText(THIRD_QUESTION_LONDON);
                animToShowViews(cl_with_quiz_question);
                break;
            case 4:
                tv_main_question.setText(FORTH_QUESTION_LONDON);
                animToShowViews(cl_with_quiz_question);
                break;
            case 5:
                tv_main_question.setText(FIFTH_QUESTION_LONDON);
                animToShowViews(cl_with_quiz_question);
                break;
            case 6:
                tv_main_question.setText(SIXTH_QUESTION_LONDON);
                animToShowViews(cl_with_quiz_question);
                break;
            case 7:
                tv_main_question.setText(SEVENTH_QUESTION_LONDON);
                animToShowViews(cl_with_quiz_question);
                break;
            case 8:
                tv_main_question.setText(EIGHTH_QUESTION_LONDON);
                animToShowViews(cl_with_quiz_question);
                break;
            case 9:
                tv_main_question.setText(NINTH_QUESTION_LONDON);
                animToShowViews(cl_with_quiz_question);
                break;
            case 10:
                tv_main_question.setText(TENTH_QUESTION_LONDON);
                animToShowViews(cl_with_quiz_question);
                break;
        }
    }

    @Override
    public boolean checkAnswerClick(TextView tv_quiz_variant, int currentLevel) {
        TextView rightAnswer;
        switch (currentLevel) {
            case 1:
            case 4:
            case 9:
                rightAnswer = activity.findViewById(R.id.tv_quiz_variant_a);
                return tv_quiz_variant.getId() == rightAnswer.getId();
            case 2:
            case 10:
                rightAnswer = activity.findViewById(R.id.tv_quiz_variant_d);
                return tv_quiz_variant.getId() == rightAnswer.getId();
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
                rightAnswer = activity.findViewById(R.id.tv_quiz_variant_b);
                return tv_quiz_variant.getId() == rightAnswer.getId();
            default:
                return false;
        }
    }

    @Override
    public void showInfoAboutCurrentPlace(View cl_with_info_about_current_city, int currentLevel) {
        if (currentLevel > 0 && currentLevel <= 10) {
            ImageView img_current_city_marker = activity.findViewById(R.id.img_current_city_marker);
            TextView tv_header_current_city_marker = activity.findViewById(R.id.tv_header_current_city_marker);
            TextView tv_main_text_current_city_marker = activity.findViewById(R.id.tv_main_text_current_city_marker);
            img_current_city_marker.setImageResource(R.drawable.img_london_7);
            tv_header_current_city_marker.setText(R.string.txt_london);
            tv_main_text_current_city_marker.setText(TXT_MAIN_LONDON);
            animToShowViews(cl_with_info_about_current_city);
        }
    }

    private void animToShowViews(View whatShow) {
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
