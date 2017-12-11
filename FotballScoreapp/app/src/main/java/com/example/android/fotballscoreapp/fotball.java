package com.example.android.fotballscoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class fotball extends AppCompatActivity {

    int Ascore ;
    int Bscore ;
    int Afoul ;
    int Bfoul ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotball);
    }

    public void resetbutton (View view){
        int Ascore = 0 ;
        int Bscore = 0 ;
        int Afoul = 0 ;
        int Bfoul = 0 ;
        displayForTeamAF(Afoul);
        displayForTeamBF(Bfoul);
        displayForTeamB(Ascore);
        displayForTeamA(Bscore);
    }


    /**
     * Increase the foul for Team A by 1 foul.
     */

    public void Ateamfoul (View view) {
        Afoul = Afoul + 1;
        displayForTeamAF(Afoul);
    }

    /**
     * Increase the foul for Team B by 1 foul.
     */

    public void Bteamfoul (View view) {
        Bfoul = Bfoul + 1;
        displayForTeamBF(Bfoul);
    }

    /**
     * Increase the score for Team A by 1 goal.
     */

    public void Ateamgoal (View view){
        Ascore = Ascore +1;
    displayForTeamA(Ascore);}

    /**
     * Increase the score for Team B by 1 goal.
     */

    public void Bteamgoal (View view){
    Bscore = Bscore +1;
    displayForTeamB(Bscore);}

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
