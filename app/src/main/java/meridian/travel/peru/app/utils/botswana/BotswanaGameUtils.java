package meridian.travel.peru.app.utils.botswana;

import static meridian.travel.peru.app.utils.ajim.ConstantsAjim.TXT_MAIN_FESTIVAL_AJIM;
import static meridian.travel.peru.app.utils.albufera.ConstantsAlbufera.TXT_MAIN_FESTIVAL_ALBUFERA;
import static meridian.travel.peru.app.utils.botswana.ConstantsBotswana.EIGHTH_QUESTION_BOTSWANA;
import static meridian.travel.peru.app.utils.botswana.ConstantsBotswana.FIFTH_QUESTION_BOTSWANA;
import static meridian.travel.peru.app.utils.botswana.ConstantsBotswana.FIRST_QUESTION_BOTSWANA;
import static meridian.travel.peru.app.utils.botswana.ConstantsBotswana.FORTH_QUESTION_BOTSWANA;
import static meridian.travel.peru.app.utils.botswana.ConstantsBotswana.NINTH_QUESTION_BOTSWANA;
import static meridian.travel.peru.app.utils.botswana.ConstantsBotswana.SECOND_QUESTION_BOTSWANA;
import static meridian.travel.peru.app.utils.botswana.ConstantsBotswana.SEVENTH_QUESTION_BOTSWANA;
import static meridian.travel.peru.app.utils.botswana.ConstantsBotswana.SIXTH_QUESTION_BOTSWANA;
import static meridian.travel.peru.app.utils.botswana.ConstantsBotswana.TENTH_QUESTION_BOTSWANA;
import static meridian.travel.peru.app.utils.botswana.ConstantsBotswana.THIRD_QUESTION_BOTSWANA;
import static meridian.travel.peru.app.utils.botswana.ConstantsBotswana.TXT_MAIN_BOTSWANA;
import static meridian.travel.peru.app.utils.botswana.ConstantsBotswana.TXT_MAIN_FESTIVAL_BOTSWANA;
import static meridian.travel.peru.app.utils.gonna_re_zhu.ConstantsGonnaReZhu.TXT_MAIN_FESTIVAL_GONNA_RE_ZHU;
import static meridian.travel.peru.app.utils.london.ConstantsLondon.TXT_MAIN_FESTIVAL_LONDON;
import static meridian.travel.peru.app.utils.mumbai.ConstantsMumbai.EIGHTH_QUESTION_MUMBAI;
import static meridian.travel.peru.app.utils.mumbai.ConstantsMumbai.FIFTH_QUESTION_MUMBAI;
import static meridian.travel.peru.app.utils.mumbai.ConstantsMumbai.FIRST_QUESTION_MUMBAI;
import static meridian.travel.peru.app.utils.mumbai.ConstantsMumbai.FORTH_QUESTION_MUMBAI;
import static meridian.travel.peru.app.utils.mumbai.ConstantsMumbai.NINTH_QUESTION_MUMBAI;
import static meridian.travel.peru.app.utils.mumbai.ConstantsMumbai.SECOND_QUESTION_MUMBAI;
import static meridian.travel.peru.app.utils.mumbai.ConstantsMumbai.SEVENTH_QUESTION_MUMBAI;
import static meridian.travel.peru.app.utils.mumbai.ConstantsMumbai.SIXTH_QUESTION_MUMBAI;
import static meridian.travel.peru.app.utils.mumbai.ConstantsMumbai.TENTH_QUESTION_MUMBAI;
import static meridian.travel.peru.app.utils.mumbai.ConstantsMumbai.THIRD_QUESTION_MUMBAI;
import static meridian.travel.peru.app.utils.tamanrasset.ConstantsTamanrasset.TXT_MAIN_FESTIVAL_TAMANRASSET;
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

public class BotswanaGameUtils implements GameProcessInterface {
    private final Activity activity;

    public BotswanaGameUtils(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void showAllOpenCities(View viewToShow) {
        activity.findViewById(R.id.tv_villajoyosa).setVisibility(View.VISIBLE);
        activity.findViewById(R.id.tv_albufera).setVisibility(View.VISIBLE);
        activity.findViewById(R.id.tv_ajim).setVisibility(View.VISIBLE);
        activity.findViewById(R.id.tv_tamanrasset).setVisibility(View.VISIBLE);
        activity.findViewById(R.id.tv_gonna_re_zhu).setVisibility(View.VISIBLE);
        activity.findViewById(R.id.tv_mumbai).setVisibility(View.VISIBLE);
        activity.findViewById(R.id.tv_botswana).setVisibility(View.VISIBLE);
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
        activity.findViewById(R.id.tv_with_festival_mumbai).setVisibility(View.VISIBLE);
        activity.findViewById(R.id.tv_with_festival_botswana).setVisibility(View.VISIBLE);
        animToShowViews(viewToShow);
    }

    @Override
    public void showMainElements(View viewToShow) {
        ImageView img_current_city = activity.findViewById(R.id.img_current_city);
        ImageView img_current_stop = activity.findViewById(R.id.img_current_stop);
        CircleImageView img_current_map_element = activity.findViewById(R.id.img_current_map_element);
        img_current_city.setImageDrawable(activity.getResources().getDrawable(R.drawable.stop_botswana));
        img_current_stop.setImageDrawable(activity.getResources().getDrawable(R.drawable.stop_number_8));
        img_current_map_element.setImageResource(R.drawable.img_map_botswana);
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
        } else if (tv_whatClick == activity.findViewById(R.id.tv_villajoyosa)) {
            img_main_1.setImageResource(R.drawable.img_villajoyosa);
            img_main_1.setTag(R.drawable.img_villajoyosa);
            img_main_2.setImageResource(R.drawable.img_villajoyosa_2);
            img_main_2.setTag(R.drawable.img_villajoyosa_2);
            img_main_3.setImageResource(R.drawable.img_villajoyosa_3);
            img_main_3.setTag(R.drawable.img_villajoyosa_3);
            img_main_4.setImageResource(R.drawable.img_villajoyosa_4);
            img_main_4.setTag(R.drawable.img_villajoyosa_4);
            img_main_5.setImageResource(R.drawable.img_villajoyosa_5);
            img_main_5.setTag(R.drawable.img_villajoyosa_5);
        } else if (tv_whatClick == activity.findViewById(R.id.tv_albufera)) {
            img_main_1.setImageResource(R.drawable.img_albufera_3);
            img_main_1.setTag(R.drawable.img_albufera_3);
            img_main_2.setImageResource(R.drawable.img_albufera_4);
            img_main_2.setTag(R.drawable.img_albufera_4);
            img_main_3.setImageResource(R.drawable.img_valencia_3);
            img_main_3.setTag(R.drawable.img_valencia_3);
            img_main_4.setImageResource(R.drawable.img_valencia_4);
            img_main_4.setTag(R.drawable.img_valencia_4);
            img_main_5.setImageResource(R.drawable.img_valencia_5);
            img_main_5.setTag(R.drawable.img_valencia_5);
        } else if (tv_whatClick == activity.findViewById(R.id.tv_ajim)) {
            img_main_1.setImageResource(R.drawable.img_ajim);
            img_main_1.setTag(R.drawable.img_ajim);
            img_main_2.setImageResource(R.drawable.img_ajim_2);
            img_main_2.setTag(R.drawable.img_ajim_2);
            img_main_3.setImageResource(R.drawable.img_ajim_3);
            img_main_3.setTag(R.drawable.img_ajim_3);
            img_main_4.setImageResource(R.drawable.img_ajim_4);
            img_main_4.setTag(R.drawable.img_ajim_4);
            img_main_5.setImageResource(R.drawable.img_ajim_5);
            img_main_5.setTag(R.drawable.img_ajim_5);
        } else if (tv_whatClick == activity.findViewById(R.id.tv_tamanrasset)) {
            img_main_1.setImageResource(R.drawable.img_tamanrasset);
            img_main_1.setTag(R.drawable.img_tamanrasset);
            img_main_2.setImageResource(R.drawable.img_tamanrasset_2);
            img_main_2.setTag(R.drawable.img_tamanrasset_2);
            img_main_3.setImageResource(R.drawable.img_tamanrasset_3);
            img_main_3.setTag(R.drawable.img_tamanrasset_3);
            img_main_4.setImageResource(R.drawable.img_tamanrasset_4);
            img_main_4.setTag(R.drawable.img_tamanrasset_4);
            img_main_5.setImageResource(R.drawable.img_tamanrasset_5);
            img_main_5.setTag(R.drawable.img_tamanrasset_5);
        } else if (tv_whatClick == activity.findViewById(R.id.tv_gonna_re_zhu)) {
            img_main_1.setImageResource(R.drawable.img_gonarezhou);
            img_main_1.setTag(R.drawable.img_gonarezhou);
            img_main_2.setImageResource(R.drawable.img_gonarezhou_2);
            img_main_2.setTag(R.drawable.img_gonarezhou_2);
            img_main_3.setImageResource(R.drawable.img_gonarezhou_3);
            img_main_3.setTag(R.drawable.img_gonarezhou_3);
            img_main_4.setImageResource(R.drawable.img_gonarezhou_4);
            img_main_4.setTag(R.drawable.img_gonarezhou_4);
            img_main_5.setImageResource(R.drawable.img_gonarezhou_5);
            img_main_5.setTag(R.drawable.img_gonarezhou_5);
        } else if (tv_whatClick == activity.findViewById(R.id.tv_mumbai)) {
            img_main_1.setImageResource(R.drawable.img_mumbai);
            img_main_1.setTag(R.drawable.img_mumbai);
            img_main_2.setImageResource(R.drawable.img_mumbai_2);
            img_main_2.setTag(R.drawable.img_mumbai_2);
            img_main_3.setImageResource(R.drawable.img_mumbai_3);
            img_main_3.setTag(R.drawable.img_mumbai_3);
            img_main_4.setImageResource(R.drawable.img_mumbai_4);
            img_main_4.setTag(R.drawable.img_mumbai_4);
            img_main_5.setImageResource(R.drawable.img_mumbai_5);
            img_main_5.setTag(R.drawable.img_mumbai_5);
        } else if (tv_whatClick == activity.findViewById(R.id.tv_botswana)) {
            img_main_1.setImageResource(R.drawable.img_botswana);
            img_main_1.setTag(R.drawable.img_botswana);
            img_main_2.setImageResource(R.drawable.img_botswana_2);
            img_main_2.setTag(R.drawable.img_botswana_2);
            img_main_3.setImageResource(R.drawable.img_botswana_3);
            img_main_3.setTag(R.drawable.img_botswana_3);
            img_main_4.setImageResource(R.drawable.img_botswana_4);
            img_main_4.setTag(R.drawable.img_botswana_4);
            img_main_5.setImageResource(R.drawable.img_botswana_5);
            img_main_5.setTag(R.drawable.img_botswana_5);
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
            case 71: {
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
            case 72: {
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
            case 73: {
                ll_first_question.setEnabled(false);
                ll_first_question.setBackground(back);
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
            case 74: {
                img_1.setVisibility(View.VISIBLE);
                img_1.setImageResource(R.drawable.img_unlock);
                img_1.setEnabled(false);
                ll_first_question.setEnabled(false);
                ll_first_question.setBackground(back);
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
            case 75: {
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
            case 76: {
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
            case 77: {
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
            case 78: {
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
            case 79: {
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
            case 80: {
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

    @Override
    public void showQuizListProgress(View cl_with_progress, int currentLevel) {
        activity.findViewById(R.id.london_progress_bar).setVisibility(View.GONE);
        activity.findViewById(R.id.villajoyosa_progress_bar).setVisibility(View.GONE);
        activity.findViewById(R.id.albufera_progress_bar).setVisibility(View.GONE);
        activity.findViewById(R.id.ajim_progress_bar).setVisibility(View.GONE);
        activity.findViewById(R.id.tamanrasset_progress_bar).setVisibility(View.GONE);
        activity.findViewById(R.id.gonna_re_zhu_progress_bar).setVisibility(View.GONE);
        CircularProgressBar botswana_progress_bar = activity.findViewById(R.id.botswana_progress_bar);
        Drawable completeLayout = activity.getDrawable(R.drawable.design_for_complete_quiz);
        Drawable currentLayout = activity.getDrawable(R.drawable.anim_click_for_progress_city);
        ImageView img_lock_london = activity.findViewById(R.id.img_lock_london);
        ImageView img_lock_villajoyosa = activity.findViewById(R.id.img_lock_villajoyosa);
        ImageView img_lock_albufera = activity.findViewById(R.id.img_lock_albufera);
        ImageView img_lock_ajim = activity.findViewById(R.id.img_lock_ajim);
        ImageView img_lock_tamanrasset = activity.findViewById(R.id.img_lock_tamanrasset);
        ImageView img_lock_gonna_re_zhu = activity.findViewById(R.id.img_lock_gonna_re_zhu);
        ImageView img_lock_botswana = activity.findViewById(R.id.img_lock_botswana);
        ImageView img_lock_mumbai = activity.findViewById(R.id.img_lock_mumbai);
        LinearLayout ll_london_progress = activity.findViewById(R.id.ll_london_progress);
        LinearLayout ll_villajoyosa_progress = activity.findViewById(R.id.ll_villajoyosa_progress);
        LinearLayout ll_albufera_progress = activity.findViewById(R.id.ll_albufera_progress);
        LinearLayout ll_ajim_progress = activity.findViewById(R.id.ll_ajim_progress);
        LinearLayout ll_tamanrasset_progress = activity.findViewById(R.id.ll_tamanrasset_progress);
        LinearLayout ll_gonna_re_zhu_progress = activity.findViewById(R.id.ll_gonna_re_zhu_progress);
        LinearLayout ll_mumbai_progress = activity.findViewById(R.id.ll_mumbai_progress);
        LinearLayout ll_botswana_progress = activity.findViewById(R.id.ll_botswana_progress);
        if (currentLevel > 70 && currentLevel <= 80) {
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

            ll_gonna_re_zhu_progress.setEnabled(false);
            ll_gonna_re_zhu_progress.setBackground(completeLayout);
            img_lock_gonna_re_zhu.setImageResource(R.drawable.img_unlock);
            img_lock_gonna_re_zhu.setVisibility(View.VISIBLE);

            ll_mumbai_progress.setEnabled(false);
            ll_mumbai_progress.setBackground(completeLayout);
            img_lock_mumbai.setImageResource(R.drawable.img_unlock);
            img_lock_mumbai.setVisibility(View.VISIBLE);

            ll_botswana_progress.setEnabled(true);
            ll_botswana_progress.setBackground(currentLayout);
            botswana_progress_bar.setProgressText(10);
            botswana_progress_bar.setProgress(currentLevel - 70);
            botswana_progress_bar.setVisibility(View.VISIBLE);
            img_lock_botswana.setVisibility(View.GONE);

            activity.findViewById(R.id.ll_antarctica_progress).setEnabled(false);
            animToShowViews(cl_with_progress);
        }
    }

    @Override
    public void showViewForStudy(View viewToShow) {
        TextView tv_header_for_study_about_current_stop = activity.findViewById(R.id.tv_header_for_study_about_current_stop);
        TextView tv_main_txt_for_study_about_current_stop = activity.findViewById(R.id.tv_main_txt_for_study_about_current_stop);
        tv_header_for_study_about_current_stop.setText(activity.getResources().getString(R.string.txt_botswana));
        tv_main_txt_for_study_about_current_stop.setText(TXT_MAIN_BOTSWANA);
        animToShowViews(viewToShow);
    }

    @Override
    public void showQuestionOnView(View cl_with_quiz_question, int currentLevel) {
        TextView tv_main_question = activity.findViewById(R.id.tv_quiz_question);
        switch (currentLevel) {
            case 71:
                tv_main_question.setText(FIRST_QUESTION_BOTSWANA);
                animToShowViews(cl_with_quiz_question);
                break;
            case 72:
                tv_main_question.setText(SECOND_QUESTION_BOTSWANA);
                animToShowViews(cl_with_quiz_question);
                break;
            case 73:
                tv_main_question.setText(THIRD_QUESTION_BOTSWANA);
                animToShowViews(cl_with_quiz_question);
                break;
            case 74:
                tv_main_question.setText(FORTH_QUESTION_BOTSWANA);
                animToShowViews(cl_with_quiz_question);
                break;
            case 75:
                tv_main_question.setText(FIFTH_QUESTION_BOTSWANA);
                animToShowViews(cl_with_quiz_question);
                break;
            case 76:
                tv_main_question.setText(SIXTH_QUESTION_BOTSWANA);
                animToShowViews(cl_with_quiz_question);
                break;
            case 77:
                tv_main_question.setText(SEVENTH_QUESTION_BOTSWANA);
                animToShowViews(cl_with_quiz_question);
                break;
            case 78:
                tv_main_question.setText(EIGHTH_QUESTION_BOTSWANA);
                animToShowViews(cl_with_quiz_question);
                break;
            case 79:
                tv_main_question.setText(NINTH_QUESTION_BOTSWANA);
                animToShowViews(cl_with_quiz_question);
                break;
            case 80:
                tv_main_question.setText(TENTH_QUESTION_BOTSWANA);
                animToShowViews(cl_with_quiz_question);
                break;
        }
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
    public boolean checkAnswerClick(TextView tv_quiz_variant, int currentLevel) {
        TextView rightAnswer;
        switch (currentLevel) {
            case 62:
            case 64:
            case 66:
            case 68:
            case 69:
                rightAnswer = activity.findViewById(R.id.tv_quiz_variant_c);
                return tv_quiz_variant.getId() == rightAnswer.getId();
            case 63:
            case 67:
                rightAnswer = activity.findViewById(R.id.tv_quiz_variant_b);
                return tv_quiz_variant.getId() == rightAnswer.getId();
            case 65:
            case 70:
                rightAnswer = activity.findViewById(R.id.tv_quiz_variant_a);
                return tv_quiz_variant.getId() == rightAnswer.getId();
            case 61:
                rightAnswer = activity.findViewById(R.id.tv_quiz_variant_d);
                return tv_quiz_variant.getId() == rightAnswer.getId();
            default:
                return false;
        }
    }

    @Override
    public void showInfoAboutCurrentPlace(View cl_with_info_about_current_city, int currentLevel) {
        if (currentLevel > 60 && currentLevel <= 70) {
            TextView tv_header_current_city_marker = activity.findViewById(R.id.tv_header_current_city_marker);
            TextView tv_main_text_current_city_marker = activity.findViewById(R.id.tv_main_text_current_city_marker);
            tv_header_current_city_marker.setText(R.string.txt_botswana);
            tv_main_text_current_city_marker.setText(TXT_MAIN_BOTSWANA);
            animToShowViews(cl_with_info_about_current_city);
        }
    }

    @Override
    public void showSecondPlace(View cl_for_study_about_current_stop) {

    }

    @Override
    public void showInfoAboutCurrentFestival(View cl_for_sharing, int currentLevel, TextView tv_what_click) {
        if (tv_what_click == activity.findViewById(R.id.tv_with_festival_london)) {
            TextView tv_header_for_current_festival = activity.findViewById(R.id.tv_header_for_current_festival);
            TextView tv_main_txt_about_current_festival = activity.findViewById(R.id.tv_main_txt_about_current_festival);
            tv_header_for_current_festival.setText(activity.getResources().getString(R.string.txt_header_festival_london));
            tv_main_txt_about_current_festival.setText(TXT_MAIN_FESTIVAL_LONDON);
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
        } else if (tv_what_click == activity.findViewById(R.id.tv_with_festival_botswana)) {
            TextView tv_header_for_current_festival = activity.findViewById(R.id.tv_header_for_current_festival);
            TextView tv_main_txt_about_current_festival = activity.findViewById(R.id.tv_main_txt_about_current_festival);
            tv_header_for_current_festival.setText(activity.getResources().getString(R.string.txt_header_festival_botswana));
            tv_main_txt_about_current_festival.setText(TXT_MAIN_FESTIVAL_BOTSWANA);
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
