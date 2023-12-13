package meridian.travel.peru.app.utils;

import static android.content.ContentValues.TAG;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.Uri;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;

import meridian.travel.peru.app.R;
import meridian.travel.peru.app.utils.ajim.AjimGameUtils;
import meridian.travel.peru.app.utils.albufera.AlbuferaGameUtils;
import meridian.travel.peru.app.utils.botswana.BotswanaGameUtils;
import meridian.travel.peru.app.utils.gonna_re_zhu.GonnaReZhuGameUtils;
import meridian.travel.peru.app.utils.london.LondonGameUtils;
import meridian.travel.peru.app.utils.tamanrasset.TamanrassetGameUtils;
import meridian.travel.peru.app.utils.villajoyosa.VillajoyosaGameUtils;

public class MainGameUtils {
    private GameProcessInterface gameProcessInterface;
    private ObjectAnimator animator;
    private Runnable runnable;
    private int currentIndex = 0, batteryPercent;
    private final Handler handler = new Handler();
    private Activity activity;

    public MainGameUtils(Activity activity) {
        this.activity = activity;
        IntentFilter filter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        activity.registerReceiver(batteryReceiver, filter);
    }

    public String initGameProcessInterface(Activity activity, int currentLevel) {
        String currentCity = "";
        if (currentLevel > 0 && currentLevel <= 10) {
            gameProcessInterface = new LondonGameUtils(activity);
            currentCity = activity.getString(R.string.txt_london);
        } else if (currentLevel > 10 && currentLevel <= 20) {
            gameProcessInterface = new VillajoyosaGameUtils(activity);
            currentCity = activity.getString(R.string.txt_villajoyosa);
        } else if (currentLevel > 20 && currentLevel <= 30) {
            gameProcessInterface = new AlbuferaGameUtils(activity);
            currentCity = activity.getString(R.string.txt_albufera);
        } else if (currentLevel > 30 && currentLevel <= 40) {
            gameProcessInterface = new AjimGameUtils(activity);
            currentCity = activity.getString(R.string.txt_ajim);
        } else if (currentLevel > 40 && currentLevel <= 50) {
            gameProcessInterface = new TamanrassetGameUtils(activity);
            currentCity = activity.getString(R.string.txt_tamanrasset);
        } else if (currentLevel > 50 && currentLevel <= 60) {
            gameProcessInterface = new GonnaReZhuGameUtils(activity);
            currentCity = activity.getString(R.string.txt_gonna_re_zhu);
        } else if (currentLevel > 60 && currentLevel <= 70) {
            gameProcessInterface = new BotswanaGameUtils(activity);
            currentCity = activity.getString(R.string.txt_botswana);
        } else if (currentLevel > 70 && currentLevel <= 80) {
//            gameProcessInterface = new AntarcticaGameUtils(activity);
            currentCity = activity.getString(R.string.txt_antarctica);
        } else if (currentLevel > 80 && currentLevel <= 90) {
            //todo: find info about this place
//            gameProcessInterface = new LongaMarketGameUtils(activity);
            currentCity = activity.getString(R.string.txt_longa_market);
        } else {
            gameProcessInterface = new LondonGameUtils(activity);
            currentCity = activity.getString(R.string.txt_no_access);
        }
        return currentCity;
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

    public void showPictures(View cl_with_pictures, TextView tv_whatClick) {
        gameProcessInterface.showPictures(cl_with_pictures, tv_whatClick);
    }

    public void showViewForStudy(View cl_for_study_about_current_stop) {
        gameProcessInterface.showViewForStudy(cl_for_study_about_current_stop);
    }

    public void showQuizListQuestions(View cl_with_quiz_questions_list, int currentLevel) {
        gameProcessInterface.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
    }

    public void showInfoAboutCurrentFestival(View cl_for_sharing, int currentLevel, TextView tv_what_click) {
        gameProcessInterface.showInfoAboutCurrentFestival(cl_for_sharing, currentLevel, tv_what_click);
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

    public int[] getIdDrawables(int currentLevel) {
        int[] ids = new int[7];
        if (currentLevel > 0 && currentLevel <= 10) {
            ids = new int[]{R.drawable.img_london, R.drawable.img_london_2, R.drawable.img_london_3,
                    R.drawable.img_london_4, R.drawable.img_london_5, R.drawable.img_london_6, R.drawable.img_london_7};
        } else if (currentLevel > 20 && currentLevel <= 30) {
            ids = new int[]{R.drawable.img_valencia_3, R.drawable.img_valencia_4, R.drawable.img_valencia_5};
        } else if (currentLevel > 30 && currentLevel <= 40) {
            ids = new int[]{R.drawable.img_ajim, R.drawable.img_ajim_2, R.drawable.img_ajim_3,
                    R.drawable.img_ajim_4, R.drawable.img_ajim_5};
        } else if (currentLevel > 40 && currentLevel <= 50) {
            ids = new int[]{R.drawable.img_tamanrasset, R.drawable.img_tamanrasset_2, R.drawable.img_tamanrasset_3,
                    R.drawable.img_tamanrasset_4, R.drawable.img_tamanrasset_5};
        } else if (currentLevel > 50 && currentLevel <= 60) {
            ids = new int[]{R.drawable.img_gonarezhou, R.drawable.img_gonarezhou_2, R.drawable.img_gonarezhou_3,
                    R.drawable.img_gonarezhou_4, R.drawable.img_gonarezhou_5};
        } else if (currentLevel > 60 && currentLevel <= 70) {
            ids = new int[]{R.drawable.img_botswana, R.drawable.img_botswana_2, R.drawable.img_botswana_3,
                    R.drawable.img_botswana_4, R.drawable.img_botswana_5};
        } else if (currentLevel > 70 && currentLevel <= 80) {
            ids = new int[]{R.drawable.img_antarctica, R.drawable.img_antarctica_2, R.drawable.img_antarctica_3,
                    R.drawable.img_antarctica_4, R.drawable.img_antarctica_5};
        }
        return ids;
    }

    public int[] getIdDrawablesPlace(int currentLevel) {
        int[] ids;
        if (currentLevel > 10 && currentLevel <= 20) {
            ids = new int[]{R.drawable.img_villajoyosa, R.drawable.img_villajoyosa_2, R.drawable.img_villajoyosa_3,
                    R.drawable.img_villajoyosa_4, R.drawable.img_villajoyosa_5};
        } else if (currentLevel > 20 && currentLevel <= 30) {
            ids = new int[]{R.drawable.img_albufera_3, R.drawable.img_albufera_4};
        } else if (currentLevel > 30 && currentLevel <= 40) {
            ids = new int[]{R.drawable.img_ajim, R.drawable.img_ajim_2, R.drawable.img_ajim_3,
                    R.drawable.img_ajim_4, R.drawable.img_ajim_5};
        } else if (currentLevel > 40 && currentLevel <= 50) {
            ids = new int[]{R.drawable.img_tamanrasset, R.drawable.img_tamanrasset_2, R.drawable.img_tamanrasset_3,
                    R.drawable.img_tamanrasset_4, R.drawable.img_tamanrasset_5};
        } else if (currentLevel > 50 && currentLevel <= 60) {
            ids = new int[]{R.drawable.img_gonarezhou, R.drawable.img_gonarezhou_2, R.drawable.img_gonarezhou_3,
                    R.drawable.img_gonarezhou_4, R.drawable.img_gonarezhou_5};
        } else if (currentLevel > 60 && currentLevel <= 70) {
            ids = new int[]{R.drawable.img_botswana, R.drawable.img_botswana_2, R.drawable.img_botswana_3,
                    R.drawable.img_botswana_4, R.drawable.img_botswana_5};
        } else if (currentLevel > 70 && currentLevel <= 80) {
            ids = new int[]{R.drawable.img_antarctica, R.drawable.img_antarctica_2, R.drawable.img_antarctica_3,
                    R.drawable.img_antarctica_4, R.drawable.img_antarctica_5};
        } else {
            ids = new int[]{R.drawable.img_royal_observatory, R.drawable.img_royal_observatory_2};
        }
        return ids;
    }

    public int[] getIdDrawablesFestival(int whatPressedId) {
        int[] ids = new int[0];
        if (whatPressedId == R.id.tv_with_festival_london) {
            ids = new int[]{R.drawable.img_festival_london, R.drawable.img_festival_london_3, R.drawable.img_festival_london_4};
        } else if (whatPressedId == R.id.tv_with_festival_villajoyosa) {
            ids = new int[]{R.drawable.img_festival_villajoyosa, R.drawable.img_festival_villajoyosa_2, R.drawable.img_festival_villajoyosa_3,
                    R.drawable.img_festival_villajoyosa_4, R.drawable.img_festival_villajoyosa_5};
        } else if (whatPressedId == R.id.tv_with_festival_albufera) {
            ids = new int[]{R.drawable.img_festival_albufera, R.drawable.img_festival_albufera_2, R.drawable.img_festival_albufera_3};
        } else if (whatPressedId == R.id.tv_with_festival_ajim) {
            ids = new int[]{R.drawable.img_festival_ajim, R.drawable.img_festival_ajim_2, R.drawable.img_festival_ajim_3,
                    R.drawable.img_festival_ajim_4};
        } else if (whatPressedId == R.id.tv_with_festival_tamanrasset) {
            ids = new int[]{R.drawable.img_festival_tamanrasset, R.drawable.img_festival_tamanrasset_2, R.drawable.img_festival_tamanrasset_3};
        } else if (whatPressedId == R.id.tv_with_festival_gonna_re_zhu) {
            ids = new int[]{R.drawable.img_festival_gonarezhou, R.drawable.img_festival_gonarezhou_2};
        } else if (whatPressedId == R.id.tv_with_festival_longa_market) {
            ids = new int[]{R.drawable.img_festival_gonarezhou, R.drawable.img_festival_gonarezhou_2};
        } else if (whatPressedId == R.id.tv_with_festival_botswana) {
            ids = new int[]{R.drawable.img_festival_botswana, R.drawable.img_festival_botswana_2,
                    R.drawable.img_festival_botswana_3};
        } else if (whatPressedId == R.id.tv_with_festival_antarctica) {
            ids = new int[]{R.drawable.img_festival_antarctica, R.drawable.img_festival_antarctica_2};
        }
        return ids;
    }


    public Uri getResourceUri(ImageView imageView) {
        int resourceId = (Integer) imageView.getTag();

        Resources res = activity.getResources();
        return Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + res.getResourcePackageName(resourceId)
                + '/' + res.getResourceTypeName(resourceId)
                + '/' + res.getResourceEntryName(resourceId));
    }

    public void startCityImageAnimation(ImageView img_to_use, int[] imageArray) {
        runnable = new Runnable() {
            @Override
            public void run() {
                img_to_use.setImageResource(imageArray[currentIndex]);
                img_to_use.setTag(imageArray[currentIndex]);
                currentIndex = (currentIndex + 1) % imageArray.length;
                handler.postDelayed(this, 2000);
            }
        };
        handler.post(runnable);
    }

    public void stopImageAnimation() {
        handler.removeCallbacks(runnable);
        currentIndex = 0;
    }

    public void stopMarkerAnimation() {
        if (animator != null) {
            animator.cancel();
        }
    }

    private final BroadcastReceiver batteryReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
            int scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
            batteryPercent = Math.round((level / (float) scale) * 100);

            Log.d(TAG, "onReceive: Battery Level: " + batteryPercent + " %");
        }
    };

    public boolean isADBEnabled() {
        int adb = Settings.Secure.getInt(
                activity.getContentResolver(),
                Settings.Global.ADB_ENABLED, 0
        );
        return adb == 1;
    }

    public boolean isDeveloperModeEnabled(Context context) {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1
                && Settings.Global.getInt(
                context.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0
        ) != 0;
    }

    public void unregisterReceiver() {
        activity.unregisterReceiver(batteryReceiver);
    }

    public int getBatteryPercent() {
        return batteryPercent;
    }
}
