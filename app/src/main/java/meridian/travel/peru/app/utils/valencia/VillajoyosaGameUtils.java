package meridian.travel.peru.app.utils.valencia;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import meridian.travel.peru.app.utils.GameProcessInterface;

public class VillajoyosaGameUtils implements GameProcessInterface {
    private final Activity activity;

    public VillajoyosaGameUtils(Activity activity){
        this.activity = activity;
    }

    @Override
    public void showAllOpenCities(View viewToShow) {

    }

    @Override
    public void showFestivalElements(View viewToShow) {

    }

    @Override
    public void showMainElements(View viewToShow) {

    }

    @Override
    public void showPictures(View viewToShow) {

    }

    @Override
    public void showQuizListQuestions(View viewToShow, int currentLevel) {

    }

    @Override
    public void showQuizListProgress(View cl_with_progress, int currentLevel) {

    }

    @Override
    public void showViewForStudy(View... viewToShow) {

    }

    @Override
    public void showQuestionOnView(View cl_with_quiz_question, int currentLevel) {

    }

    @Override
    public boolean checkAnswerClick(TextView tv_quiz_variant, int currentLevel) {
        return false;
    }

    @Override
    public void showInfoAboutCurrentPlace(View cl_with_info_about_current_city, int currentLevel) {

    }
}
