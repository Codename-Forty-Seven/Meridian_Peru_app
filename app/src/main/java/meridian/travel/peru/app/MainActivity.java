package meridian.travel.peru.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import meridian.travel.peru.app.utils.GameUtils;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private ConstraintLayout cl_for_sharing;
    private LinearLayout ll_with_cities;
    private ImageView img_header;
    private TextView tv_current_city, tv_london, tv_villajoyosa, tv_albufera, tv_ajim, tv_tamanrasset, tv_gonna_re_zhu,
            tv_longa_market, tv_botswana, tv_antarctica;
    private GameUtils gameUtils;
    private List<View> viewsToHide = new ArrayList<>();
    private final int menu_learn = R.id.menu_learn,
            menu_pave_way = R.id.menu_pave_way,
            menu_events = R.id.menu_events,
            menu_healthicons_travel = R.id.menu_healthicons_travel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAllComponents();
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case menu_learn:
                    hideAllComponents();
                    showLearn();
                    return true;
                case menu_pave_way:
                    hideAllComponents();
                    showPaveWay();
                    return true;
                case menu_events:
                    hideAllComponents();
                    showEvents();
                    return true;
                case menu_healthicons_travel:
                    gameUtils.hideComponents(viewsToHide);
                    gameUtils.showCurrentElements(ll_with_cities);
                    return true;
            }
            return false;
        });
    }

    private void initAllComponents() {
        gameUtils = new GameUtils(this);
        img_header = findViewById(R.id.img_header);
        tv_current_city = findViewById(R.id.tv_current_city);
        tv_london = findViewById(R.id.tv_london);
        tv_villajoyosa = findViewById(R.id.tv_villajoyosa);
        tv_albufera = findViewById(R.id.tv_albufera);
        tv_ajim = findViewById(R.id.tv_ajim);
        tv_tamanrasset = findViewById(R.id.tv_tamanrasset);
        tv_gonna_re_zhu = findViewById(R.id.tv_gonna_re_zhu);
        tv_longa_market = findViewById(R.id.tv_longa_market);
        tv_botswana = findViewById(R.id.tv_botswana);
        tv_antarctica = findViewById(R.id.tv_antarctica);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        cl_for_sharing = findViewById(R.id.cl_for_sharing);
        ll_with_cities = findViewById(R.id.ll_with_cities);
        fillTheList();
    }

    private void fillTheList(){
        viewsToHide.add(ll_with_cities);
        viewsToHide.add(cl_for_sharing);
    }

    private void showLearn() {

    }

    private void showPaveWay() {

    }

    private void showEvents() {

    }

    private void hideAllComponents() {
        cl_for_sharing.setVisibility(View.GONE);
    }

    private void hideComponents() {
        View component1 = findViewById(R.id.img_header);
//        View component2 = findViewById(R.id.component2);
        // Додайте посилання на інші компоненти, які вам потрібно

        // Знаходження висоти екрану
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenHeight = displayMetrics.heightPixels;

        // Анімація для зсуву вниз і плавного зникнення
        TranslateAnimation slideAnimation = new TranslateAnimation(0, 0, 0, screenHeight);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1f, 0f);

        // Комбінація анімацій
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(slideAnimation);
        animationSet.addAnimation(alphaAnimation);

        // Встановлення тривалості анімації
        animationSet.setDuration(1000);

        // Слухач події завершення анімації
        animationSet.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Викликається при початку анімації
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Викликається при завершенні анімації
                // Приховуємо компоненти, коли анімація завершилася
//                component1.setVisibility(View.GONE);
//                component1.setVisibility(View.VISIBLE);
//                component2.setVisibility(View.GONE);
                // Приховайте інші компоненти, якщо потрібно
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // Викликається при повторенні анімації (якщо вона повторюється)

            }
        });

        // Запуск анімації для кожного компонента
        component1.startAnimation(animationSet);
//        component2.startAnimation(animationSet);
        // Запустіть анімацію для інших компонентів, які вам потрібно
    }
}