package io.github.tanu31195.audionirvana;

import android.content.res.Resources;
import android.widget.RadioGroup;

import java.util.List;

public final class AudioNirvanaUtils {

    public static final int EARPHONE_QUESTIONS = 10;

    public static List<RadioGroup> getAll(Resources resources, String packagename) {

        RadioGroup radioGroup;
        List<RadioGroup> earphoneQuestions = null;
//        radioGroupQ1 = (RadioGroup) findViewById(R.id.question1);

//        for (int i = 0; i < EARPHONE_QUESTIONS; i++) {
//            int id = resources.getIdentifier("question_" + i, "id", packagename);
//            earphoneQuestions.add ((RadioGroup) findViewById(id));
//        }
        return earphoneQuestions;
    }
}
