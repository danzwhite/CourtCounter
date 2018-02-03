package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
    }
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int runsTeamA = 0;
    int runsTeamB = 0;
    int outTeamA = 0;
    int outTeamB = 0;
    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        runsTeamA = runsTeamA + 1;
        displayForTeamA(scoreTeamA);
        displayRunsTeamA(runsTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        runsTeamA = runsTeamA + 1;
        displayForTeamA(scoreTeamA);
        displayRunsTeamA(runsTeamA);
    }
    public void addOutForTeamA(View v) {
        outTeamA = outTeamA + 1;
        displayOutTeamA(outTeamA);
    }
    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        runsTeamB = runsTeamB + 1;
        displayForTeamB(scoreTeamB);
        displayRunsTeamB(runsTeamB);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        runsTeamB = runsTeamB + 1;
        displayForTeamB(scoreTeamB);
        displayRunsTeamB(runsTeamB);
    }
    public void addOutForTeamB(View v) {
        outTeamB = outTeamB + 1;
        displayOutTeamA(outTeamB);
    }
    /**
     * Increase the score for Team B by 3 points.
     */
    public void resetView(View v) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        runsTeamA = 0;
        runsTeamB = 0;
        outTeamA = 0;
        outTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayOutTeamA(outTeamA);
        displayOutTeamB(outTeamB);
        displayRunsTeamA(runsTeamA);
        displayRunsTeamB(runsTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }
    public void displayForTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }
    public void displayRunsTeamA(int runsTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_runs);
        scoreView.setText(String.valueOf(runsTeamA));
    }
    public void displayRunsTeamB(int runsTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_runs);
        scoreView.setText(String.valueOf(runsTeamB));
    }
    public void displayOutTeamA(int outTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_out);
        scoreView.setText(String.valueOf(outTeamA));
    }
    public void displayOutTeamB(int outTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_out);
        scoreView.setText(String.valueOf(outTeamB));
    }
}
