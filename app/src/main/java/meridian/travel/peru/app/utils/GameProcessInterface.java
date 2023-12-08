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
    void showViewForStudy(View viewToShow);
   void showQuestionOnView(View cl_with_quiz_question, int currentLevel);
    boolean checkAnswerClick(TextView tv_quiz_variant, int currentLevel);
    void showInfoAboutCurrentPlace(View cl_with_info_about_current_city, int currentLevel);
    void showSecondPlace(View cl_for_study_about_current_stop);
}
