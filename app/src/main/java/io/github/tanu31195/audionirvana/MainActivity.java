package io.github.tanu31195.audionirvana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroupQ1;
    private RadioGroup radioGroupQ2;
    private RadioButton radioAnsButton;
    private Button btnAnalyze;
    private List<RadioGroup> earphoneQuestions = new ArrayList<>();
    Map<String, String> answerMap = new HashMap<String, String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    public void addListenerOnButton() {

        btnAnalyze = (Button) findViewById(R.id.btnAnalyze);
//        earphoneQuestions.add((RadioGroup) findViewById(R.id.question1));
//        earphoneQuestions.add((RadioGroup) findViewById(R.id.question2));

//        int id = getResources().getIdentifier("button_"+i, "id", getPackageName());
//        button[i] = (RadioGroup) findViewById(id);
//
//        earphoneQuestions.add(AudioNirvanaUtils.getAll(getResources(), getPackageName());




        btnAnalyze.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                radioGroupQ1 = (RadioGroup) findViewById(R.id.question1);
                radioGroupQ2 = (RadioGroup) findViewById(R.id.question2);
                earphoneQuestions.add(radioGroupQ1);
                earphoneQuestions.add(radioGroupQ2);
                int questionNumber = 1;
                for ( RadioGroup earphoneQuestion : earphoneQuestions ) {


                    // get selected radio button from radioGroup
                    int selectedId = earphoneQuestion.getCheckedRadioButtonId();
                    // find the radiobutton by returned id
                    radioAnsButton = (RadioButton) findViewById(selectedId);

                    answerMap.put( String.valueOf(questionNumber) , String.valueOf(radioAnsButton.getText()));
                    questionNumber++;
                }
//                    // get selected radio button from radioGroup
//                    int selectedId = radioGroupQ1.getCheckedRadioButtonId();
//                    // find the radiobutton by returned id
//                    radioAnsButton = (RadioButton) findViewById(selectedId);
//                Toast.makeText(MainActivity.this,
//                        radioAnsButton.getText(), Toast.LENGTH_SHORT).show();
            }

        });
    }
}
