package meridian.travel.peru.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private ConstraintLayout cl_for_sharing;
    private ImageView img_header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAllComponents();

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.menu_learn:
                    hideAllComponents();
                    showLearn();
                    return true;
                case R.id.menu_pave_way:
                    hideAllComponents();
                    showPaveWay();
                    return true;
                case R.id.menu_events:
                    hideAllComponents();
                    showEvents();
                    return true;
                case R.id.menu_healthicons_travel:
                    hideAllComponents();
                    showCurrentElements(cl_for_sharing);
                    return true;
            }
            return false;
        });
    }

    private void initAllComponents() {
        img_header = findViewById(R.id.img_header);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        cl_for_sharing = findViewById(R.id.cl_for_sharing);
    }

    private void showLearn() {

    }

    private void showPaveWay() {

    }

    private void showEvents() {

    }

    private void showCurrentElements(View whatShow){
        img_header.setVisibility(View.VISIBLE);
        whatShow.setVisibility(View.VISIBLE);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenHeight = displayMetrics.heightPixels;

        TranslateAnimation slideAnimation = new TranslateAnimation(0, 0, -screenHeight, 0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0f, 1f);

        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(slideAnimation);
        animationSet.addAnimation(alphaAnimation);

        animationSet.setDuration(1000);

        whatShow.startAnimation(animationSet);
    }

    private void hideAllComponents() {
        cl_for_sharing.setVisibility(View.GONE);
        img_header.setVisibility(View.GONE);
    }
}