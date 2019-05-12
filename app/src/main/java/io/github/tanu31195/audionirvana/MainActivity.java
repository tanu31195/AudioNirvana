package io.github.tanu31195.audionirvana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnProfile = (Button) findViewById(R.id.btnProfile);
        final Button btnEarphones = (Button) findViewById(R.id.btnEarphones);
        final Button btnBTSpeakers = (Button) findViewById(R.id.btnBTSpeakers);
        final Button btnAboutUs = (Button) findViewById(R.id.btnAboutUs);

        btnProfile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent profileIntent = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(profileIntent);
            }
        });
        btnEarphones.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent earphonesIntent = new Intent(MainActivity.this,EarphoneQuestionsActivity.class);
                startActivity(earphonesIntent);
            }
        });
        btnBTSpeakers.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this,BluetoothSpeakerQuestionsActivity.class);
                startActivity(mainIntent);
            }
        });
        btnAboutUs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this,AboutUs.class);
                startActivity(mainIntent);
            }
        });
    }
}
