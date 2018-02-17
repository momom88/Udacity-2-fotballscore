package com.example.android.fotballscoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class fotball extends AppCompatActivity {

    int aScore;
    int bScore;
    int aFoul;
    int bFoul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotball);
    }

    public void resetbutton(View view) {
        aScore = 0;
        bScore = 0;
        aFoul = 0;
        bFoul = 0;
        displayForTeamAF(aFoul);
        displayForTeamBF(bFoul);
        displayForTeamB(aScore);
        displayForTeamA(bScore);
    }


    /**
     * Increase the foul for Team A by 1 foul.
     */

    public void Ateamfoul(View view) {
        aFoul = aFoul + 1;
        displayForTeamAF(aFoul);
    }

    /**
     * Increase the foul for Team B by 1 foul.
     */

    public void Bteamfoul(View view) {
        bFoul = bFoul + 1;
        displayForTeamBF(bFoul);
    }

    /**
     * Increase the score for Team A by 1 goal.
     */

    public void Ateamgoal(View view) {
        aScore = aScore + 1;
        displayForTeamA(aScore);
    }

    /**
     * Increase the score for Team B by 1 goal.
     */

    public void Bteamgoal(View view) {
        bScore = bScore + 1;
        displayForTeamB(bScore);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Team A.
     */
    public void displayForTeamAF(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given foul for Team B.
     */
    public void displayForTeamBF(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(foul));
    }

}
