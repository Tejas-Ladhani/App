package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0,scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void aPlus3(View view){
        scoreA+=3;
        displayForTeamA(scoreA);
    }
    public void aPlus2(View view){
        scoreA+=2;
        displayForTeamA(scoreA);
    }
    public void aPlus1(View view){
        scoreA+=1;
        displayForTeamA(scoreA);
    }

    public void bPlus3(View view){
        scoreB+=3;
        displayForTeamB(scoreB);
    }
    public void bPlus2(View view){
        scoreB+=2;
        displayForTeamB(scoreB);
    }
    public void bPlus1(View view){
        scoreB+=1;
        displayForTeamB(scoreB);
    }
    public void resetScore(View v)
    {
        scoreA=0;
        scoreB=0;
        displayForTeamB(scoreB);
        displayForTeamA(scoreA);
    }


}