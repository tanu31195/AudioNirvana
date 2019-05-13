package io.github.tanu31195.audionirvana;

import android.content.res.Resources;
import android.widget.RadioGroup;

import java.util.List;
import java.util.Map;

public final class AudioNirvanaUtils {

    public static final int EARPHONE_QUESTIONS = 10;

//    public static List<RadioGroup> getAll(Resources resources, String packagename) {
//
//        RadioGroup radioGroup;
//        List<RadioGroup> earphoneQuestions = null;
////        radioGroupQ1 = (RadioGroup) findViewById(R.id.question1);
//
////        for (int i = 0; i < EARPHONE_QUESTIONS; i++) {
////            int id = resources.getIdentifier("question_" + i, "id", packagename);
////            earphoneQuestions.add ((RadioGroup) findViewById(id));
////        }
//        return earphoneQuestions;
//    }

    public static EarphoneSearchCriteria setEarphoneSearchCriteria(Map<String, String> earphoneUserSelections )
    {
        EarphoneSearchCriteria earphoneSearchCriteria = new EarphoneSearchCriteria();
        int qNum;
        String answer;
        for (Map.Entry<String, String> entry : earphoneUserSelections.entrySet())
        {
            System.out.println(entry.getKey() + "/" + entry.getValue());

            qNum = Integer.parseInt(entry.getKey());
            answer = entry.getValue();

            if ( qNum == 1 )
            {
                    earphoneSearchCriteria.setType(answer);
            }
            else if ( qNum == 2 )
            {
                earphoneSearchCriteria.setSound(answer);
            }
            else if ( qNum == 3 )
            {
                earphoneSearchCriteria.setFrequencyRange(answer);
            }
            else if ( qNum == 4 )
            {
                earphoneSearchCriteria.setNoiseCancelling(answer);
            }
            else if ( qNum == 5 )
            {
                earphoneSearchCriteria.setPortable(answer);
            }
            else if ( qNum == 6 )
            {
                earphoneSearchCriteria.setBack(answer);
            }
            else if ( qNum == 7 )
            {
                earphoneSearchCriteria.setWireless(answer);
            }
            else if ( qNum == 8 )
            {
                earphoneSearchCriteria.setComfort(answer);
            }
            else if ( qNum == 9 )
            {
                earphoneSearchCriteria.setImpedance(answer);
            }
            else if ( qNum == 10 )
            {
                earphoneSearchCriteria.setDurability(answer);
            }
            else if ( qNum == 11 )
            {
                earphoneSearchCriteria.setCost(answer);
            }
        }
        return earphoneSearchCriteria;
    }

    public static boolean isNotAny (String value)
    {

        if (!value.equalsIgnoreCase("ANY"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
