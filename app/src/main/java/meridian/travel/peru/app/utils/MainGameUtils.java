package meridian.travel.peru.app.utils;

import static meridian.travel.peru.app.utils.Constants.KEY_PREF_CURRENT_STOP_NUMBER;
import static meridian.travel.peru.app.utils.Constants.NAME_PREF;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;

import meridian.travel.peru.app.utils.london.LondonGameUtils;
import meridian.travel.peru.app.utils.valencia.ValenciaGameUtils;

public class MainGameUtils {
    private GameProcessInterface gameProcessInterface;
    public int initGameProcessInterface(Activity activity) {
        SharedPreferences pref = activity.getSharedPreferences(NAME_PREF, Context.MODE_PRIVATE);
        int currentLevel = pref.getInt(KEY_PREF_CURRENT_STOP_NUMBER, 1);
        if (currentLevel > 10 && currentLevel <= 20) {
            gameProcessInterface = new ValenciaGameUtils(activity);
            return currentLevel;
        } else {
            gameProcessInterface = new LondonGameUtils(activity);
            return currentLevel;
        }
    }

    public void showAllOpenCities(View ll_with_cities) {
        gameProcessInterface.showAllOpenCities(ll_with_cities);
    }

    public void showFestivalElements(View cl_with_festival) {
        gameProcessInterface.showFestivalElements(cl_with_festival);
    }

    public void showMainElements(View cl_main_page) {
        gameProcessInterface.showMainElements(cl_main_page);
    }

    public void showPictures(View cl_with_pictures) {
        gameProcessInterface.showPictures(cl_with_pictures);
    }

    public void showViewForStudy(View... cl_for_study_about_current_stop) {
        gameProcessInterface.showViewForStudy(cl_for_study_about_current_stop);
    }

    public void showQuizListQuestions(View cl_with_quiz_questions_list, int currentLevel){
        gameProcessInterface.showQuizListQuestions(cl_with_quiz_questions_list, currentLevel);
    }

    public void showQuizListProgress(View cl_with_progress, int currentLevel){
        gameProcessInterface.showQuizListProgress(cl_with_progress, currentLevel);
    }

    public void showFestivalDuringLevel(int currentLevel, TextView textView) {

    }
//    {
//        switch (currentLevel) {
//            case 2: {
//
//                break;
//            }
//            case 3: {
//
//                break;
//            }
//            case 4: {
//
//                break;
//            }
//            case 5: {
//
//                break;
//            }
//            case 6: {
//
//                break;
//            }
//            case 7: {
//
//                break;
//            }
//            case 8: {
//
//                break;
//            }
//            case 9: {
//
//                break;
//            }
//            default: {
//                textView.setText(R.string.txt_festival_london);
//                break;
//            }
//        }
//
//    }
}
