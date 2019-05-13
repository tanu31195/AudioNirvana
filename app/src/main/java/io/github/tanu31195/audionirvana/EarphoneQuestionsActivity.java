package io.github.tanu31195.audionirvana;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EarphoneQuestionsActivity extends AppCompatActivity {

    private RadioGroup radioGroupQ1;
    private RadioGroup radioGroupQ2;
    private RadioGroup radioGroupQ3;
    private RadioGroup radioGroupQ4;
    private RadioGroup radioGroupQ5;
    private RadioGroup radioGroupQ6;
    private RadioGroup radioGroupQ7;
    private RadioGroup radioGroupQ8;
    private RadioGroup radioGroupQ9;
    private RadioGroup radioGroupQ10;
    private RadioGroup radioGroupQ11;
    private RadioButton radioAnsButton;
    private Button btnAnalyze;
    private List<RadioGroup> earphoneQuestions = new ArrayList<>();

    private Map<String, String> answerMap = new HashMap<String, String>();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earphone_questions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });


        addListenerOnButton();
    }

    public void addListenerOnButton() {

        btnAnalyze = (Button) findViewById(R.id.btnAnalyze);
        btnAnalyze.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                answerMap.clear();
                earphoneQuestions.clear();
                radioGroupQ1 = (RadioGroup) findViewById(R.id.rg_ep_q1);
                radioGroupQ2 = (RadioGroup) findViewById(R.id.rg_ep_q2);
                radioGroupQ3 = (RadioGroup) findViewById(R.id.rg_ep_q3);
                radioGroupQ4 = (RadioGroup) findViewById(R.id.rg_ep_q4);
                radioGroupQ5 = (RadioGroup) findViewById(R.id.rg_ep_q5);
                radioGroupQ6 = (RadioGroup) findViewById(R.id.rg_ep_q6);
                radioGroupQ7 = (RadioGroup) findViewById(R.id.rg_ep_q7);
                radioGroupQ8 = (RadioGroup) findViewById(R.id.rg_ep_q8);
                radioGroupQ9 = (RadioGroup) findViewById(R.id.rg_ep_q9);
                radioGroupQ10 = (RadioGroup) findViewById(R.id.rg_ep_q10);
                radioGroupQ11 = (RadioGroup) findViewById(R.id.rg_ep_q11);

                earphoneQuestions.add(radioGroupQ1);
                earphoneQuestions.add(radioGroupQ2);
                earphoneQuestions.add(radioGroupQ3);
                earphoneQuestions.add(radioGroupQ4);
                earphoneQuestions.add(radioGroupQ5);
                earphoneQuestions.add(radioGroupQ6);
                earphoneQuestions.add(radioGroupQ7);
                earphoneQuestions.add(radioGroupQ8);
                earphoneQuestions.add(radioGroupQ9);
                earphoneQuestions.add(radioGroupQ10);
                earphoneQuestions.add(radioGroupQ11);

                int questionNumber = 1;
                EarphoneSearchCriteria earphoneSearchCriteria = new EarphoneSearchCriteria();

                for (RadioGroup earphoneQuestion : earphoneQuestions) {

                    // get selected radio button from radioGroup
                    int selectedId = earphoneQuestion.getCheckedRadioButtonId();
                    // find the radiobutton by returned id
                    radioAnsButton = (RadioButton) findViewById(selectedId);

                    answerMap.put(String.valueOf(questionNumber), String.valueOf(radioAnsButton.getTag()));

                    questionNumber++;
                }

                AudioNirvanaUtils.setEarphoneSearchCriteria(answerMap);
            }

        });
    }
}
