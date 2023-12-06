package meridian.travel.peru.app.utils;

import android.view.View;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public interface GameProcessInterface {
    void showAllOpenCities(View viewToShow);
    void showFestivalElements(View viewToShow);
    void showMainElements(View viewToShow);
    void showPictures(View viewToShow);
    void showQuizListQuestions(View viewToShow, int currentLevel);
    void showQuizListProgress(View cl_with_progress, int currentLevel);
    void showViewForStudy(View... viewToShow);
}
