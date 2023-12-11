package meridian.travel.peru.app.utils.gonna_re_zhu;

import static meridian.travel.peru.app.utils.ajim.ConstantsAjim.TXT_MAIN_FESTIVAL_AJIM;
import static meridian.travel.peru.app.utils.albufera.ConstantsAlbufera.TXT_MAIN_FESTIVAL_ALBUFERA;
import static meridian.travel.peru.app.utils.gonna_re_zhu.ConstantsGonnaReZhu.EIGHTH_QUESTION_GONNA_RE_ZHU;
import static meridian.travel.peru.app.utils.gonna_re_zhu.ConstantsGonnaReZhu.FIFTH_QUESTION_GONNA_RE_ZHU;
import static meridian.travel.peru.app.utils.gonna_re_zhu.ConstantsGonnaReZhu.FIRST_QUESTION_GONNA_RE_ZHU;
import static meridian.travel.peru.app.utils.gonna_re_zhu.ConstantsGonnaReZhu.FORTH_QUESTION_GONNA_RE_ZHU;
import static meridian.travel.peru.app.utils.gonna_re_zhu.ConstantsGonnaReZhu.NINTH_QUESTION_GONNA_RE_ZHU;
import static meridian.travel.peru.app.utils.gonna_re_zhu.ConstantsGonnaReZhu.SECOND_QUESTION_GONNA_RE_ZHU;
import static meridian.travel.peru.app.utils.gonna_re_zhu.ConstantsGonnaReZhu.SEVENTH_QUESTION_GONNA_RE_ZHU;
import static meridian.travel.peru.app.utils.gonna_re_zhu.ConstantsGonnaReZhu.SIXTH_QUESTION_GONNA_RE_ZHU;
import static meridian.travel.peru.app.utils.gonna_re_zhu.ConstantsGonnaReZhu.TENTH_QUESTION_GONNA_RE_ZHU;
import static meridian.travel.peru.app.utils.gonna_re_zhu.ConstantsGonnaReZhu.THIRD_QUESTION_GONNA_RE_ZHU;
import static meridian.travel.peru.app.utils.gonna_re_zhu.ConstantsGonnaReZhu.TXT_MAIN_FESTIVAL_GONNA_RE_ZHU;
import static meridian.travel.peru.app.utils.gonna_re_zhu.ConstantsGonnaReZhu.TXT_MAIN_GONNA_RE_ZHU;
import static meridian.travel.peru.app.utils.tamanrasset.ConstantsTamanrasset.EIGHTH_QUESTION_TAMANRASSET;
import static meridian.travel.peru.app.utils.tamanrasset.ConstantsTamanrasset.FIFTH_QUESTION_TAMANRASSET;
import static meridian.travel.peru.app.utils.tamanrasset.ConstantsTamanrasset.FIRST_QUESTION_TAMANRASSET;
import static meridian.travel.peru.app.utils.tamanrasset.ConstantsTamanrasset.FORTH_QUESTION_TAMANRASSET;
import static meridian.travel.peru.app.utils.tamanrasset.ConstantsTamanrasset.NINTH_QUESTION_TAMANRASSET;
import static meridian.travel.peru.app.utils.tamanrasset.ConstantsTamanrasset.SECOND_QUESTION_TAMANRASSET;
import static meridian.travel.peru.app.utils.tamanrasset.ConstantsTamanrasset.SEVENTH_QUESTION_TAMANRASSET;
import static meridian.travel.peru.app.utils.tamanrasset.ConstantsTamanrasset.SIXTH_QUESTION_TAMANRASSET;
import static meridian.travel.peru.app.utils.tamanrasset.ConstantsTamanrasset.TENTH_QUESTION_TAMANRASSET;
import static meridian.travel.peru.app.utils.tamanrasset.ConstantsTamanrasset.THIRD_QUESTION_TAMANRASSET;
import static meridian.travel.peru.app.utils.tamanrasset.ConstantsTamanrasset.TXT_MAIN_FESTIVAL_TAMANRASSET;
import static meridian.travel.peru.app.utils.tamanrasset.ConstantsTamanrasset.TXT_MAIN_TAMANRASSET;
import static meridian.travel.peru.app.utils.villajoyosa.ConstantsVillajoyosa.TXT_MAIN_FESTIVAL_VILLAJOYOSA;

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

import de.hdodenhof.circleimageview.CircleImageView;
import meridian.travel.peru.app.R;
import meridian.travel.peru.app.utils.CircularProgressBar;
import meridian.travel.peru.app.utils.GameProcessInterface;

public class GonnaReZhuGameUtils implements GameProcessInterface {
    private final Activity activity;

    public GonnaReZhuGameUtils(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void showAllOpenCities(View viewToShow) {
        activity.findViewById(R.id.tv_villajoyosa).setVisibility(View.VISIBLE);
        activity.findViewById(R.id.tv_albufera).setVisibility(View.VISIBLE);
        activity.findViewById(R.id.tv_ajim).setVisibility(View.VISIBLE);
        activity.findViewById(R.id.tv_tamanrasset).setVisibility(View.VISIBLE);
        activity.findViewById(R.id.tv_gonna_re_zhu).setVisibility(View.VISIBLE);
        animToShowViews(viewToShow);
    }

    @Override
    public void showFestivalElements(View viewToShow) {
        activity.findViewById(R.id.tv_with_festival_london);
        activity.findViewById(R.id.tv_with_festival_villajoyosa).setVisibility(View.VISIBLE);
        activity.findViewById(R.id.tv_with_festival_albufera).setVisibility(View.VISIBLE);
        activity.findViewById(R.id.tv_with_festival_ajim).setVisibility(View.VISIBLE);
        activity.findViewById(R.id.tv_with_festival_tamanrasset).setVisibility(View.VISIBLE);
        activity.findViewById(R.id.tv_with_festival_gonna_re_zhu).setVisibility(View.VISIBLE);
        animToShowViews(viewToShow);
    }

    @Override
    public void showMainElements(View viewToShow) {
        ImageView img_current_city = activity.findViewById(R.id.img_current_city);
        ImageView img_current_stop = activity.findViewById(R.id.img_current_stop);
        CircleImageView img_current_map_element = activity.findViewById(R.id.img_current_map_element);
        img_current_city.setImageDrawable(activity.getResources().getDrawable(R.drawable.stop_gonna_re_zhu));
        img_current_stop.setImageDrawable(activity.getResources().getDrawable(R.drawable.stop_number_6));
        img_current_map_element.setImageResource(R.drawable.img_map_gonarezhou);
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
            img_main_2.setImageResource(R.drawable.img_london_2);
            img_main_3.setImageResource(R.drawable.img_london_3);
            img_main_4.setImageResource(R.drawable.img_london_4);
            img_main_5.setImageResource(R.drawable.img_london_5);
        } else if (tv_whatClick == activity.findViewById(R.id.tv_villajoyosa)) {
            img_main_1.setImageResource(R.drawable.img_villajoyosa);
            img_main_2.setImageResource(R.drawable.img_villajoyosa_2);
            img_main_3.setImageResource(R.drawable.img_villajoyosa_3);
            img_main_4.setImageResource(R.drawable.img_villajoyosa_4);
            img_main_5.setImageResource(R.drawable.img_villajoyosa_5);
        } else if (tv_whatClick == activity.findViewById(R.id.tv_albufera)) {
            img_main_1.setImageResource(R.drawable.img_albufera_3);
            img_main_2.setImageResource(R.drawable.img_albufera_4);
            img_main_3.setImageResource(R.drawable.img_valencia_3);
            img_main_4.setImageResource(R.drawable.img_valencia_4);
            img_main_5.setImageResource(R.drawable.img_valencia_5);
        } else if (tv_whatClick == activity.findViewById(R.id.tv_ajim)) {
            img_main_1.setImageResource(R.drawable.img_ajim);
            img_main_2.setImageResource(R.drawable.img_ajim_2);
            img_main_3.setImageResource(R.drawable.img_ajim_3);
            img_main_4.setImageResource(R.drawable.img_ajim_4);
            img_main_5.setImageResource(R.drawable.img_ajim_5);
        } else if (tv_whatClick == activity.findViewById(R.id.tv_tamanrasset)) {
            img_main_1.setImageResource(R.drawable.img_tamanrasset);
            img_main_2.setImageResource(R.drawable.img_tamanrasset_2);
            img_main_3.setImageResource(R.drawable.img_tamanrasset_3);
            img_main_4.setImageResource(R.drawable.img_tamanrasset_4);
            img_main_5.setImageResource(R.drawable.img_tamanrasset_5);
        } else if (tv_whatClick == activity.findViewById(R.id.tv_gonna_re_zhu)) {
            img_main_1.setImageResource(R.drawable.img_gonarezhou);
            img_main_2.setImageResource(R.drawable.img_gonarezhou_2);
            img_main_3.setImageResource(R.drawable.img_gonarezhou_3);
            img_main_4.setImageResource(R.drawable.img_gonarezhou_4);
            img_main_5.setImageResource(R.drawable.img_gonarezhou_5);
        }
        animToShowViews(viewToShow);
    }

    @Override
    public void showQuizListQuestions(View viewToShow, int currentLevel) {
        Drawable back = activity.getDrawable(R.drawable.anim_click_text);
        switch (currentLevel) {
            case 51: {
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
            case 52: {
                ImageView img_1 = activity.findViewById(R.id.img_quiz_question_1);
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                img_1.setEnabled(false);
                activity.findViewById(R.id.ll_first_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_1).setEnabled(false);
                activity.findViewById(R.id.ll_second_question).setEnabled(true);
                activity.findViewById(R.id.tv_quiz_question_2).setEnabled(true);
                activity.findViewById(R.id.ll_second_question).setBackground(back);
                ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
                img_2.setVisibility(View.INVISIBLE);
                animToShowViews(viewToShow);
                break;
            }
            case 53: {
                ImageView img_1 = activity.findViewById(R.id.img_quiz_question_1);
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                img_1.setEnabled(false);
                activity.findViewById(R.id.ll_first_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_1).setEnabled(false);
                activity.findViewById(R.id.ll_second_question).setEnabled(false);
                activity.findViewById(R.id.ll_second_question).setBackground(back);
                activity.findViewById(R.id.tv_quiz_question_2).setEnabled(false);
                ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
                img_2.setImageResource(R.drawable.img_unlock);
                img_2.setVisibility(View.VISIBLE);
                img_2.setEnabled(false);
                activity.findViewById(R.id.ll_third_question).setEnabled(true);
                activity.findViewById(R.id.tv_quiz_question_3).setEnabled(true);
                activity.findViewById(R.id.ll_third_question).setBackground(back);
                ImageView img_3 = activity.findViewById(R.id.img_quiz_question_3);
                img_3.setImageResource(R.drawable.img_unlock);
                img_3.setVisibility(View.INVISIBLE);
                animToShowViews(viewToShow);
                break;
            }
            case 54: {
                ImageView img_1 = activity.findViewById(R.id.img_quiz_question_1);
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                img_1.setEnabled(false);
                activity.findViewById(R.id.ll_first_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_1).setEnabled(false);
                activity.findViewById(R.id.ll_second_question).setEnabled(false);
                activity.findViewById(R.id.ll_second_question).setBackground(back);
                activity.findViewById(R.id.tv_quiz_question_2).setEnabled(false);
                ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
                img_2.setImageResource(R.drawable.img_unlock);
                img_2.setVisibility(View.VISIBLE);
                img_2.setEnabled(false);
                activity.findViewById(R.id.ll_third_question).setEnabled(false);
                activity.findViewById(R.id.ll_third_question).setBackground(back);
                activity.findViewById(R.id.tv_quiz_question_3).setEnabled(false);
                ImageView img_3 = activity.findViewById(R.id.img_quiz_question_3);
                img_3.setImageResource(R.drawable.img_unlock);
                img_3.setVisibility(View.VISIBLE);
                img_3.setEnabled(false);
                activity.findViewById(R.id.ll_forth_question).setEnabled(true);
                activity.findViewById(R.id.tv_quiz_question_4).setEnabled(true);
                activity.findViewById(R.id.ll_forth_question).setBackground(back);
                ImageView img_4 = activity.findViewById(R.id.img_quiz_question_4);
                img_4.setImageResource(R.drawable.img_unlock);
                img_4.setVisibility(View.INVISIBLE);
                img_4.setEnabled(false);
                animToShowViews(viewToShow);
                break;
            }
            case 55: {
                ImageView img_1 = activity.findViewById(R.id.img_quiz_question_1);
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                img_1.setEnabled(false);
                activity.findViewById(R.id.ll_first_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_1).setEnabled(false);
                activity.findViewById(R.id.ll_second_question).setEnabled(false);
                activity.findViewById(R.id.ll_second_question).setBackground(back);
                activity.findViewById(R.id.tv_quiz_question_2).setEnabled(false);
                ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
                img_2.setImageResource(R.drawable.img_unlock);
                img_2.setVisibility(View.VISIBLE);
                img_2.setEnabled(false);
                activity.findViewById(R.id.ll_third_question).setEnabled(false);
                activity.findViewById(R.id.ll_third_question).setBackground(back);
                activity.findViewById(R.id.tv_quiz_question_3).setEnabled(false);
                ImageView img_3 = activity.findViewById(R.id.img_quiz_question_3);
                img_3.setImageResource(R.drawable.img_unlock);
                img_3.setVisibility(View.VISIBLE);
                img_3.setEnabled(false);
                activity.findViewById(R.id.ll_forth_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_4).setEnabled(false);
                activity.findViewById(R.id.ll_forth_question).setBackground(back);
                ImageView img_4 = activity.findViewById(R.id.img_quiz_question_4);
                img_4.setImageResource(R.drawable.img_unlock);
                img_4.setVisibility(View.VISIBLE);
                img_4.setEnabled(false);
                activity.findViewById(R.id.ll_fifth_question).setEnabled(true);
                activity.findViewById(R.id.tv_quiz_question_5).setEnabled(true);
                activity.findViewById(R.id.ll_fifth_question).setBackground(back);
                ImageView img_5 = activity.findViewById(R.id.img_quiz_question_5);
                img_5.setImageResource(R.drawable.img_unlock);
                img_5.setVisibility(View.INVISIBLE);
                img_5.setEnabled(false);
                animToShowViews(viewToShow);
                break;
            }
            case 56: {
                ImageView img_1 = activity.findViewById(R.id.img_quiz_question_1);
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                img_1.setEnabled(false);
                activity.findViewById(R.id.ll_first_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_1).setEnabled(false);
                activity.findViewById(R.id.ll_second_question).setEnabled(false);
                activity.findViewById(R.id.ll_second_question).setBackground(back);
                activity.findViewById(R.id.tv_quiz_question_2).setEnabled(false);
                ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
                img_2.setImageResource(R.drawable.img_unlock);
                img_2.setVisibility(View.VISIBLE);
                img_2.setEnabled(false);
                activity.findViewById(R.id.ll_third_question).setEnabled(false);
                activity.findViewById(R.id.ll_third_question).setBackground(back);
                activity.findViewById(R.id.tv_quiz_question_3).setEnabled(false);
                ImageView img_3 = activity.findViewById(R.id.img_quiz_question_3);
                img_3.setImageResource(R.drawable.img_unlock);
                img_3.setVisibility(View.VISIBLE);
                img_3.setEnabled(false);
                activity.findViewById(R.id.ll_forth_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_4).setEnabled(false);
                activity.findViewById(R.id.ll_forth_question).setBackground(back);
                ImageView img_4 = activity.findViewById(R.id.img_quiz_question_4);
                img_4.setImageResource(R.drawable.img_unlock);
                img_4.setVisibility(View.VISIBLE);
                img_4.setEnabled(false);
                activity.findViewById(R.id.ll_fifth_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_5).setEnabled(false);
                activity.findViewById(R.id.ll_fifth_question).setBackground(back);
                ImageView img_5 = activity.findViewById(R.id.img_quiz_question_5);
                img_5.setImageResource(R.drawable.img_unlock);
                img_5.setVisibility(View.VISIBLE);
                img_5.setEnabled(false);
                activity.findViewById(R.id.ll_sixth_question).setEnabled(true);
                activity.findViewById(R.id.tv_quiz_question_6).setEnabled(true);
                activity.findViewById(R.id.ll_sixth_question).setBackground(back);
                ImageView img_6 = activity.findViewById(R.id.img_quiz_question_6);
                img_6.setImageResource(R.drawable.img_unlock);
                img_6.setVisibility(View.INVISIBLE);
                img_6.setEnabled(false);
                animToShowViews(viewToShow);
                break;
            }
            case 57: {
                ImageView img_1 = activity.findViewById(R.id.img_quiz_question_1);
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                img_1.setEnabled(false);
                activity.findViewById(R.id.ll_first_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_1).setEnabled(false);
                activity.findViewById(R.id.ll_second_question).setEnabled(false);
                activity.findViewById(R.id.ll_second_question).setBackground(back);
                activity.findViewById(R.id.tv_quiz_question_2).setEnabled(false);
                ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
                img_2.setImageResource(R.drawable.img_unlock);
                img_2.setVisibility(View.VISIBLE);
                img_2.setEnabled(false);
                activity.findViewById(R.id.ll_third_question).setEnabled(false);
                activity.findViewById(R.id.ll_third_question).setBackground(back);
                activity.findViewById(R.id.tv_quiz_question_3).setEnabled(false);
                ImageView img_3 = activity.findViewById(R.id.img_quiz_question_3);
                img_3.setImageResource(R.drawable.img_unlock);
                img_3.setVisibility(View.VISIBLE);
                img_3.setEnabled(false);
                activity.findViewById(R.id.ll_forth_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_4).setEnabled(false);
                activity.findViewById(R.id.ll_forth_question).setBackground(back);
                ImageView img_4 = activity.findViewById(R.id.img_quiz_question_4);
                img_4.setImageResource(R.drawable.img_unlock);
                img_4.setVisibility(View.VISIBLE);
                img_4.setEnabled(false);
                activity.findViewById(R.id.ll_fifth_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_5).setEnabled(false);
                activity.findViewById(R.id.ll_fifth_question).setBackground(back);
                ImageView img_5 = activity.findViewById(R.id.img_quiz_question_5);
                img_5.setImageResource(R.drawable.img_unlock);
                img_5.setVisibility(View.VISIBLE);
                img_5.setEnabled(false);
                activity.findViewById(R.id.ll_sixth_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_6).setEnabled(false);
                activity.findViewById(R.id.ll_sixth_question).setBackground(back);
                ImageView img_6 = activity.findViewById(R.id.img_quiz_question_6);
                img_6.setImageResource(R.drawable.img_unlock);
                img_6.setVisibility(View.VISIBLE);
                img_6.setEnabled(false);
                activity.findViewById(R.id.ll_seventh_question).setEnabled(true);
                activity.findViewById(R.id.tv_quiz_question_7).setEnabled(true);
                activity.findViewById(R.id.ll_seventh_question).setBackground(back);
                ImageView img_7 = activity.findViewById(R.id.img_quiz_question_7);
                img_7.setImageResource(R.drawable.img_unlock);
                img_7.setVisibility(View.INVISIBLE);
                img_7.setEnabled(false);
                animToShowViews(viewToShow);
                break;
            }
            case 58: {
                ImageView img_1 = activity.findViewById(R.id.img_quiz_question_1);
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                img_1.setEnabled(false);
                activity.findViewById(R.id.ll_first_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_1).setEnabled(false);
                activity.findViewById(R.id.ll_second_question).setEnabled(false);
                activity.findViewById(R.id.ll_second_question).setBackground(back);
                activity.findViewById(R.id.tv_quiz_question_2).setEnabled(false);
                ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
                img_2.setImageResource(R.drawable.img_unlock);
                img_2.setVisibility(View.VISIBLE);
                img_2.setEnabled(false);
                activity.findViewById(R.id.ll_third_question).setEnabled(false);
                activity.findViewById(R.id.ll_third_question).setBackground(back);
                activity.findViewById(R.id.tv_quiz_question_3).setEnabled(false);
                ImageView img_3 = activity.findViewById(R.id.img_quiz_question_3);
                img_3.setImageResource(R.drawable.img_unlock);
                img_3.setVisibility(View.VISIBLE);
                img_3.setEnabled(false);
                activity.findViewById(R.id.ll_forth_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_4).setEnabled(false);
                activity.findViewById(R.id.ll_forth_question).setBackground(back);
                ImageView img_4 = activity.findViewById(R.id.img_quiz_question_4);
                img_4.setImageResource(R.drawable.img_unlock);
                img_4.setVisibility(View.VISIBLE);
                img_4.setEnabled(false);
                activity.findViewById(R.id.ll_fifth_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_5).setEnabled(false);
                activity.findViewById(R.id.ll_fifth_question).setBackground(back);
                ImageView img_5 = activity.findViewById(R.id.img_quiz_question_5);
                img_5.setImageResource(R.drawable.img_unlock);
                img_5.setVisibility(View.VISIBLE);
                img_5.setEnabled(false);
                activity.findViewById(R.id.ll_sixth_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_6).setEnabled(false);
                activity.findViewById(R.id.ll_sixth_question).setBackground(back);
                ImageView img_6 = activity.findViewById(R.id.img_quiz_question_6);
                img_6.setImageResource(R.drawable.img_unlock);
                img_6.setVisibility(View.VISIBLE);
                img_6.setEnabled(false);
                activity.findViewById(R.id.ll_seventh_question).setEnabled(false);
                activity.findViewById(R.id.ll_seventh_question).setBackground(back);
                activity.findViewById(R.id.tv_quiz_question_7).setEnabled(false);
                ImageView img_7 = activity.findViewById(R.id.img_quiz_question_7);
                img_7.setImageResource(R.drawable.img_unlock);
                img_7.setVisibility(View.VISIBLE);
                img_7.setEnabled(false);
                activity.findViewById(R.id.ll_eighth_question).setEnabled(true);
                activity.findViewById(R.id.tv_quiz_question_8).setEnabled(true);
                activity.findViewById(R.id.ll_eighth_question).setBackground(back);
                ImageView img_8 = activity.findViewById(R.id.img_quiz_question_8);
                img_8.setImageResource(R.drawable.img_unlock);
                img_8.setVisibility(View.INVISIBLE);
                img_8.setEnabled(false);
                animToShowViews(viewToShow);
                break;
            }
            case 59: {
                ImageView img_1 = activity.findViewById(R.id.img_quiz_question_1);
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                img_1.setEnabled(false);
                activity.findViewById(R.id.ll_first_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_1).setEnabled(false);
                activity.findViewById(R.id.ll_second_question).setEnabled(false);
                activity.findViewById(R.id.ll_second_question).setBackground(back);
                activity.findViewById(R.id.tv_quiz_question_2).setEnabled(false);
                ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
                img_2.setImageResource(R.drawable.img_unlock);
                img_2.setVisibility(View.VISIBLE);
                img_2.setEnabled(false);
                activity.findViewById(R.id.ll_third_question).setEnabled(false);
                activity.findViewById(R.id.ll_third_question).setBackground(back);
                activity.findViewById(R.id.tv_quiz_question_3).setEnabled(false);
                ImageView img_3 = activity.findViewById(R.id.img_quiz_question_3);
                img_3.setImageResource(R.drawable.img_unlock);
                img_3.setVisibility(View.VISIBLE);
                img_3.setEnabled(false);
                activity.findViewById(R.id.ll_forth_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_4).setEnabled(false);
                activity.findViewById(R.id.ll_forth_question).setBackground(back);
                ImageView img_4 = activity.findViewById(R.id.img_quiz_question_4);
                img_4.setImageResource(R.drawable.img_unlock);
                img_4.setVisibility(View.VISIBLE);
                img_4.setEnabled(false);
                activity.findViewById(R.id.ll_fifth_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_5).setEnabled(false);
                activity.findViewById(R.id.ll_fifth_question).setBackground(back);
                ImageView img_5 = activity.findViewById(R.id.img_quiz_question_5);
                img_5.setImageResource(R.drawable.img_unlock);
                img_5.setVisibility(View.VISIBLE);
                img_5.setEnabled(false);
                activity.findViewById(R.id.ll_sixth_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_6).setEnabled(false);
                activity.findViewById(R.id.ll_sixth_question).setBackground(back);
                ImageView img_6 = activity.findViewById(R.id.img_quiz_question_6);
                img_6.setImageResource(R.drawable.img_unlock);
                img_6.setVisibility(View.VISIBLE);
                img_6.setEnabled(false);
                activity.findViewById(R.id.ll_seventh_question).setEnabled(false);
                activity.findViewById(R.id.ll_seventh_question).setBackground(back);
                activity.findViewById(R.id.tv_quiz_question_7).setEnabled(false);
                ImageView img_7 = activity.findViewById(R.id.img_quiz_question_7);
                img_7.setImageResource(R.drawable.img_unlock);
                img_7.setVisibility(View.VISIBLE);
                img_7.setEnabled(false);
                activity.findViewById(R.id.ll_eighth_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_8).setEnabled(false);
                activity.findViewById(R.id.ll_eighth_question).setBackground(back);
                ImageView img_8 = activity.findViewById(R.id.img_quiz_question_8);
                img_8.setImageResource(R.drawable.img_unlock);
                img_8.setVisibility(View.VISIBLE);
                img_8.setEnabled(false);
                activity.findViewById(R.id.ll_ninth_question).setEnabled(true);
                activity.findViewById(R.id.tv_quiz_question_9).setEnabled(true);
                activity.findViewById(R.id.ll_ninth_question).setBackground(back);
                ImageView img_9 = activity.findViewById(R.id.img_quiz_question_9);
                img_9.setImageResource(R.drawable.img_unlock);
                img_9.setVisibility(View.INVISIBLE);
                img_9.setEnabled(false);
                animToShowViews(viewToShow);
                break;
            }
            case 60: {
                ImageView img_1 = activity.findViewById(R.id.img_quiz_question_1);
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                img_1.setEnabled(false);
                activity.findViewById(R.id.ll_first_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_1).setEnabled(false);
                activity.findViewById(R.id.ll_second_question).setEnabled(false);
                activity.findViewById(R.id.ll_second_question).setBackground(back);
                activity.findViewById(R.id.tv_quiz_question_2).setEnabled(false);
                ImageView img_2 = activity.findViewById(R.id.img_quiz_question_2);
                img_2.setImageResource(R.drawable.img_unlock);
                img_2.setVisibility(View.VISIBLE);
                img_2.setEnabled(false);
                activity.findViewById(R.id.ll_third_question).setEnabled(false);
                activity.findViewById(R.id.ll_third_question).setBackground(back);
                activity.findViewById(R.id.tv_quiz_question_3).setEnabled(false);
                ImageView img_3 = activity.findViewById(R.id.img_quiz_question_3);
                img_3.setImageResource(R.drawable.img_unlock);
                img_3.setVisibility(View.VISIBLE);
                img_3.setEnabled(false);
                activity.findViewById(R.id.ll_forth_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_4).setEnabled(false);
                activity.findViewById(R.id.ll_forth_question).setBackground(back);
                ImageView img_4 = activity.findViewById(R.id.img_quiz_question_4);
                img_4.setImageResource(R.drawable.img_unlock);
                img_4.setVisibility(View.VISIBLE);
                img_4.setEnabled(false);
                activity.findViewById(R.id.ll_fifth_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_5).setEnabled(false);
                activity.findViewById(R.id.ll_fifth_question).setBackground(back);
                ImageView img_5 = activity.findViewById(R.id.img_quiz_question_5);
                img_5.setImageResource(R.drawable.img_unlock);
                img_5.setVisibility(View.VISIBLE);
                img_5.setEnabled(false);
                activity.findViewById(R.id.ll_sixth_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_6).setEnabled(false);
                activity.findViewById(R.id.ll_sixth_question).setBackground(back);
                ImageView img_6 = activity.findViewById(R.id.img_quiz_question_6);
                img_6.setImageResource(R.drawable.img_unlock);
                img_6.setVisibility(View.VISIBLE);
                img_6.setEnabled(false);
                activity.findViewById(R.id.ll_seventh_question).setEnabled(false);
                activity.findViewById(R.id.ll_seventh_question).setBackground(back);
                activity.findViewById(R.id.tv_quiz_question_7).setEnabled(false);
                ImageView img_7 = activity.findViewById(R.id.img_quiz_question_7);
                img_7.setImageResource(R.drawable.img_unlock);
                img_7.setVisibility(View.VISIBLE);
                img_7.setEnabled(false);
                activity.findViewById(R.id.ll_eighth_question).setEnabled(false);
                activity.findViewById(R.id.tv_quiz_question_8).setEnabled(false);
                activity.findViewById(R.id.ll_eighth_question).setBackground(back);
                ImageView img_8 = activity.findViewById(R.id.img_quiz_question_8);
                img_8.setImageResource(R.drawable.img_unlock);
                img_8.setVisibility(View.VISIBLE);
                img_8.setEnabled(false);
                activity.findViewById(R.id.ll_ninth_question).setEnabled(true);
                activity.findViewById(R.id.tv_quiz_question_9).setEnabled(false);
                activity.findViewById(R.id.ll_ninth_question).setBackground(back);
                ImageView img_9 = activity.findViewById(R.id.img_quiz_question_9);
                img_9.setImageResource(R.drawable.img_unlock);
                img_9.setVisibility(View.VISIBLE);
                img_9.setEnabled(false);
                activity.findViewById(R.id.ll_tenth_question).setEnabled(true);
                activity.findViewById(R.id.tv_quiz_question_10).setEnabled(true);
                activity.findViewById(R.id.ll_tenth_question).setBackground(back);
                ImageView img_10 = activity.findViewById(R.id.img_quiz_question_10);
                img_10.setImageResource(R.drawable.img_unlock);
                img_10.setVisibility(View.INVISIBLE);
                img_10.setEnabled(false);
                animToShowViews(viewToShow);
                break;
            }
        }
    }

    @Override
    public void showQuizListProgress(View cl_with_progress, int currentLevel) {
        activity.findViewById(R.id.london_progress_bar).setVisibility(View.GONE);
        activity.findViewById(R.id.villajoyosa_progress_bar).setVisibility(View.GONE);
        activity.findViewById(R.id.albufera_progress_bar).setVisibility(View.GONE);
        activity.findViewById(R.id.ajim_progress_bar).setVisibility(View.GONE);
        activity.findViewById(R.id.tamanrasset_progress_bar).setVisibility(View.GONE);
        CircularProgressBar gonna_re_zhu_progress_bar = activity.findViewById(R.id.gonna_re_zhu_progress_bar);
        Drawable completeLayout = activity.getDrawable(R.drawable.design_for_complete_quiz);
        Drawable currentLayout = activity.getDrawable(R.drawable.anim_click_for_progress_city);
        ImageView img_lock_london = activity.findViewById(R.id.img_lock_london);
        ImageView img_lock_villajoyosa = activity.findViewById(R.id.img_lock_villajoyosa);
        ImageView img_lock_albufera = activity.findViewById(R.id.img_lock_albufera);
        ImageView img_lock_ajim = activity.findViewById(R.id.img_lock_ajim);
        ImageView img_lock_tamanrasset = activity.findViewById(R.id.img_lock_tamanrasset);
        ImageView img_lock_gonna_re_zhu = activity.findViewById(R.id.img_lock_gonna_re_zhu);
        LinearLayout ll_london_progress = activity.findViewById(R.id.ll_london_progress);
        LinearLayout ll_villajoyosa_progress = activity.findViewById(R.id.ll_villajoyosa_progress);
        LinearLayout ll_albufera_progress = activity.findViewById(R.id.ll_albufera_progress);
        LinearLayout ll_ajim_progress = activity.findViewById(R.id.ll_ajim_progress);
        LinearLayout ll_tamanrasset_progress = activity.findViewById(R.id.ll_tamanrasset_progress);
        LinearLayout ll_gonna_re_zhu_progress = activity.findViewById(R.id.ll_gonna_re_zhu_progress);
        if (currentLevel > 50 && currentLevel <= 60) {
            ll_london_progress.setEnabled(false);
            ll_london_progress.setBackground(completeLayout);
            img_lock_london.setImageResource(R.drawable.img_unlock);
            img_lock_london.setVisibility(View.VISIBLE);

            ll_villajoyosa_progress.setEnabled(false);
            ll_villajoyosa_progress.setBackground(completeLayout);
            img_lock_villajoyosa.setImageResource(R.drawable.img_unlock);
            img_lock_villajoyosa.setVisibility(View.VISIBLE);

            ll_albufera_progress.setEnabled(false);
            ll_albufera_progress.setBackground(completeLayout);
            img_lock_albufera.setImageResource(R.drawable.img_unlock);
            img_lock_albufera.setVisibility(View.VISIBLE);

            ll_ajim_progress.setEnabled(false);
            ll_ajim_progress.setBackground(completeLayout);
            img_lock_ajim.setImageResource(R.drawable.img_unlock);
            img_lock_ajim.setVisibility(View.VISIBLE);

            ll_tamanrasset_progress.setEnabled(false);
            ll_tamanrasset_progress.setBackground(completeLayout);
            img_lock_tamanrasset.setImageResource(R.drawable.img_unlock);
            img_lock_tamanrasset.setVisibility(View.VISIBLE);

            ll_gonna_re_zhu_progress.setEnabled(true);
            ll_gonna_re_zhu_progress.setBackground(currentLayout);
            gonna_re_zhu_progress_bar.setProgressText(10);
            gonna_re_zhu_progress_bar.setProgress(currentLevel - 50);
            gonna_re_zhu_progress_bar.setVisibility(View.VISIBLE);
            img_lock_gonna_re_zhu.setVisibility(View.GONE);

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
        tv_header_for_study_about_current_stop.setText(activity.getResources().getString(R.string.txt_gonna_re_zhu));
        tv_main_txt_for_study_about_current_stop.setText(TXT_MAIN_GONNA_RE_ZHU);
        animToShowViews(viewToShow);
    }

    @Override
    public void showQuestionOnView(View cl_with_quiz_question, int currentLevel) {
        TextView tv_main_question = activity.findViewById(R.id.tv_quiz_question);
        switch (currentLevel) {
            case 51:
                tv_main_question.setText(FIRST_QUESTION_GONNA_RE_ZHU);
                animToShowViews(cl_with_quiz_question);
                break;
            case 52:
                tv_main_question.setText(SECOND_QUESTION_GONNA_RE_ZHU);
                animToShowViews(cl_with_quiz_question);
                break;
            case 53:
                tv_main_question.setText(THIRD_QUESTION_GONNA_RE_ZHU);
                animToShowViews(cl_with_quiz_question);
                break;
            case 54:
                tv_main_question.setText(FORTH_QUESTION_GONNA_RE_ZHU);
                animToShowViews(cl_with_quiz_question);
                break;
            case 55:
                tv_main_question.setText(FIFTH_QUESTION_GONNA_RE_ZHU);
                animToShowViews(cl_with_quiz_question);
                break;
            case 56:
                tv_main_question.setText(SIXTH_QUESTION_GONNA_RE_ZHU);
                animToShowViews(cl_with_quiz_question);
                break;
            case 57:
                tv_main_question.setText(SEVENTH_QUESTION_GONNA_RE_ZHU);
                animToShowViews(cl_with_quiz_question);
                break;
            case 58:
                tv_main_question.setText(EIGHTH_QUESTION_GONNA_RE_ZHU);
                animToShowViews(cl_with_quiz_question);
                break;
            case 59:
                tv_main_question.setText(NINTH_QUESTION_GONNA_RE_ZHU);
                animToShowViews(cl_with_quiz_question);
                break;
            case 60:
                tv_main_question.setText(TENTH_QUESTION_GONNA_RE_ZHU);
                animToShowViews(cl_with_quiz_question);
                break;
        }
    }

    @Override
    public boolean checkAnswerClick(TextView tv_quiz_variant, int currentLevel) {
        TextView rightAnswer;
        switch (currentLevel) {
            case 53:
            case 54:
            case 55:
            case 57:
            case 46:
            case 49:
            case 50:
                rightAnswer = activity.findViewById(R.id.tv_quiz_variant_c);
                return tv_quiz_variant.getId() == rightAnswer.getId();
            case 51:
            case 52:
            case 56:
            case 58:
            case 59:
            case 60:
                rightAnswer = activity.findViewById(R.id.tv_quiz_variant_b);
                return tv_quiz_variant.getId() == rightAnswer.getId();
            default:
                return false;
        }
    }

    @Override
    public void showInfoAboutCurrentPlace(View cl_with_info_about_current_city, int currentLevel) {
        if (currentLevel > 50 && currentLevel <= 60) {
            TextView tv_header_current_city_marker = activity.findViewById(R.id.tv_header_current_city_marker);
            TextView tv_main_text_current_city_marker = activity.findViewById(R.id.tv_main_text_current_city_marker);
            tv_header_current_city_marker.setText(R.string.txt_gonna_re_zhu);
            tv_main_text_current_city_marker.setText(TXT_MAIN_GONNA_RE_ZHU);
            animToShowViews(cl_with_info_about_current_city);
        }
    }

    @Override
    public void showSecondPlace(View cl_for_study_about_current_stop) {
        //Method only for London!!!
    }

    @Override
    public void showInfoAboutCurrentFestival(View cl_for_sharing, int currentLevel, TextView tv_what_click) {
        if (tv_what_click == activity.findViewById(R.id.tv_with_festival_london)) {
//            TextView tv_header_for_current_festival = activity.findViewById(R.id.tv_header_for_current_festival);
//            TextView tv_main_txt_about_current_festival = activity.findViewById(R.id.tv_main_txt_about_current_festival);
//            tv_header_for_current_festival.setText(activity.getResources().getString(R.string.txt_header_festival_london));
//            tv_main_txt_about_current_festival.setText(TXT_MAIN_FESTIVAL_LONDON);
            animToShowViews(cl_for_sharing);
        } else if (tv_what_click == activity.findViewById(R.id.tv_with_festival_villajoyosa)) {
            TextView tv_header_for_current_festival = activity.findViewById(R.id.tv_header_for_current_festival);
            TextView tv_main_txt_about_current_festival = activity.findViewById(R.id.tv_main_txt_about_current_festival);
            tv_header_for_current_festival.setText(activity.getResources().getString(R.string.txt_header_festival_villajoyosa));
            tv_main_txt_about_current_festival.setText(TXT_MAIN_FESTIVAL_VILLAJOYOSA);
            animToShowViews(cl_for_sharing);
        } else if (tv_what_click == activity.findViewById(R.id.tv_with_festival_albufera)) {
            TextView tv_header_for_current_festival = activity.findViewById(R.id.tv_header_for_current_festival);
            TextView tv_main_txt_about_current_festival = activity.findViewById(R.id.tv_main_txt_about_current_festival);
            tv_header_for_current_festival.setText(activity.getResources().getString(R.string.txt_header_festival_albufera));
            tv_main_txt_about_current_festival.setText(TXT_MAIN_FESTIVAL_ALBUFERA);
            animToShowViews(cl_for_sharing);
        } else if (tv_what_click == activity.findViewById(R.id.tv_with_festival_ajim)) {
            TextView tv_header_for_current_festival = activity.findViewById(R.id.tv_header_for_current_festival);
            TextView tv_main_txt_about_current_festival = activity.findViewById(R.id.tv_main_txt_about_current_festival);
            tv_header_for_current_festival.setText(activity.getResources().getString(R.string.txt_header_festival_ajim));
            tv_main_txt_about_current_festival.setText(TXT_MAIN_FESTIVAL_AJIM);
            animToShowViews(cl_for_sharing);
        } else if (tv_what_click == activity.findViewById(R.id.tv_with_festival_tamanrasset)) {
            TextView tv_header_for_current_festival = activity.findViewById(R.id.tv_header_for_current_festival);
            TextView tv_main_txt_about_current_festival = activity.findViewById(R.id.tv_main_txt_about_current_festival);
            tv_header_for_current_festival.setText(activity.getResources().getString(R.string.txt_header_festival_tamanrasset));
            tv_main_txt_about_current_festival.setText(TXT_MAIN_FESTIVAL_TAMANRASSET);
            animToShowViews(cl_for_sharing);
        } else if (tv_what_click == activity.findViewById(R.id.tv_with_festival_gonna_re_zhu)) {
            TextView tv_header_for_current_festival = activity.findViewById(R.id.tv_header_for_current_festival);
            TextView tv_main_txt_about_current_festival = activity.findViewById(R.id.tv_main_txt_about_current_festival);
            tv_header_for_current_festival.setText(activity.getResources().getString(R.string.txt_header_festival_gonna_re_zhu));
            tv_main_txt_about_current_festival.setText(TXT_MAIN_FESTIVAL_GONNA_RE_ZHU);
            animToShowViews(cl_for_sharing);
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
