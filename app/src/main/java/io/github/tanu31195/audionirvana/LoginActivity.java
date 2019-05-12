package io.github.tanu31195.audionirvana;


import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button btnLogin = (Button) findViewById(R.id.btnLogin);

        final TextView tvHello = (TextView) findViewById(R.id.tvHello);

        tvHello.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent userAreaIntent = new Intent(LoginActivity.this, MainActivity.class);
                LoginActivity.this.startActivity(userAreaIntent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                final String username = etUsername.getText().toString();
                final String password = etPassword.getText().toString();
                //Log.i("Info", "Button Clicked");
                Response.Listener<String> responseListener = new Response.Listener<String>(){
                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if (success){
                                Log.i("Info", "Success");
                                String student_id = jsonResponse.getString("student_id");
                                String fullname = jsonResponse.getString("fullname");

                                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                intent.putExtra("student_id", student_id);
                                intent.putExtra("fullname", fullname);
                                intent.putExtra("username", username);

                                LoginActivity.this.startActivity(intent);

                            }else {
                                Log.i("Info", "Failed");
                                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                                builder.setMessage("Login failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();

                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                };

                LoginRequest loginRequest = new LoginRequest(username, password, responseListener);
                RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
                queue.add(loginRequest);
            }
        });

    }
}
