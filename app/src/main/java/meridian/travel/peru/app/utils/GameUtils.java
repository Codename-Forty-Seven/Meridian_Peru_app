package meridian.travel.peru.app.utils;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;

import java.util.List;

public class GameUtils {
    private final Activity activity;

    public GameUtils(Activity activity){
        this.activity = activity;
    }

    public void showCurrentElements(View whatShow){
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

    public void hideComponents(View... viewsToHide) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenHeight = displayMetrics.heightPixels;
        TranslateAnimation slideAnimation = new TranslateAnimation(0, 0, 0, screenHeight);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1f, 0f);

        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(slideAnimation);
        animationSet.addAnimation(alphaAnimation);

        animationSet.setDuration(1000);

        animationSet.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                for (View view : viewsToHide) {
                    view.setVisibility(View.GONE);
                }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });

        for (View view : viewsToHide) {
            view.startAnimation(animationSet);
        }
    }

    public void hideComponents(List<View> viewsToHide) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenHeight = displayMetrics.heightPixels;
        TranslateAnimation slideAnimation = new TranslateAnimation(0, 0, 0, screenHeight);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1f, 0f);

        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(slideAnimation);
        animationSet.addAnimation(alphaAnimation);

        animationSet.setDuration(1000);

        animationSet.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                for (View view : viewsToHide) {
                    view.setVisibility(View.GONE);
                }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });

        for (View view : viewsToHide) {
            view.startAnimation(animationSet);
        }
    }
}
