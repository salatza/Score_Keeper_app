package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int sA = 0;
    int sB = 0;
    String message = " ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onePointA(View view) {

        if (scoreTeamA == 25 && sA == 3) {
            scoreTeamA = 25;
            sA = 3;
            displayForSetA(sA);
            displayForTeamA(scoreTeamA);
            String message = "Team A wins!";
            displayWin(message);

        }
        if (scoreTeamA == 25) {
            sA = sA + 1;
            scoreTeamA = 0;
            displayForTeamA(scoreTeamA);
            displayForSetA(sA);
        }

        if (scoreTeamA < 25) {
            scoreTeamA = scoreTeamA + 1;
            displayForTeamA(scoreTeamA);
        }
        if (sA > 3) {
            scoreTeamA = 25;
            sA = 3;
            displayForSetA(sA);
            displayForTeamA(scoreTeamA);
        }
    }

    public void foulA(View view) {
        if (scoreTeamB < 25) {
            scoreTeamA = scoreTeamA + 0;
            displayForTeamA(scoreTeamA);
            scoreTeamB = scoreTeamB + 1;
            displayForTeamB(scoreTeamB);
        }

    }

    public void onePointB(View view) {

        if (scoreTeamB == 25 && sB == 3) {
            scoreTeamB = 25;
            sB = 3;
            displayForSetB(sB);
            displayForTeamB(scoreTeamB);
            String message = "Team B wins!";
            displayWin(message);
        }

        if (scoreTeamB == 25) {
            sB = sB + 1;
            scoreTeamB = 0;
            displayForTeamB(scoreTeamB);
            displayForSetB(sB);
        }

        if (scoreTeamB < 25) {
            scoreTeamB = scoreTeamB + 1;
            displayForTeamB(scoreTeamB);
        }

        if (sB > 3) {

            scoreTeamB = 25;
            sB = 3;
            displayForSetB(sB);
            displayForTeamB(scoreTeamB);
        }
    }

    public void foulB(View view) {
        if (scoreTeamA < 25) {
            scoreTeamA = scoreTeamA + 1;
            displayForTeamA(scoreTeamA);
            scoreTeamB = scoreTeamB + 0;
            displayForTeamB(scoreTeamB);

        }
    }

    public void reset(View view) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        sA = 0;
        displayForSetA(sA);
        sB = 0;
        displayForSetB(sB);
        message = " ";
        displayWin(message);
    }

    public void setA(View view) {

        sA = sA + 1;
        displayForSetA(sA);

        if (sA > 3) {
            sA = 3;
            displayForSetA(sA);
        }
    }

    public void setB(View view) {

        sB = sB + 1;
        displayForSetB(sB);

        if (sB > 3) {
            sB = 3;
            displayForSetB(sB);
        }
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForSetA(int set) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_set);
        scoreView.setText(String.valueOf(set));
    }

    public void displayForSetB(int set) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_set);
        scoreView.setText(String.valueOf(set));
    }

    public void displayWin(String set) {
        TextView scoreView = (TextView) findViewById(R.id.team_win);
        scoreView.setText(String.valueOf(set));
    }

}
