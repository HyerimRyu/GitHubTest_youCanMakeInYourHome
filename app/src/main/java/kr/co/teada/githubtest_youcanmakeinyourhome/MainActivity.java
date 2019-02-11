package kr.co.teada.githubtest_youcanmakeinyourhome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("I like this");
        
        //집에서 작업한거 학원와서 이어서 작업하고 싶을 
    }
}
