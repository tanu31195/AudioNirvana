package io.github.tanu31195.audionirvana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroupQ1;
    private RadioButton radioAnsButton;
    private Button btnAnalyze;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    public void addListenerOnButton() {

        radioGroupQ1 = (RadioGroup) findViewById(R.id.question1);
        btnAnalyze = (Button) findViewById(R.id.btnAnalyze);

        btnAnalyze.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioGroupQ1.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioAnsButton = (RadioButton) findViewById(selectedId);

                Toast.makeText(MainActivity.this,
                        radioAnsButton.getText(), Toast.LENGTH_SHORT).show();

            }

        });
    }
}
