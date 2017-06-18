package com.example.lenovo.first.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int indiaRun = 0;
    int indiaSix = 0;
    int indiaFour = 0;
    int indiaWicket = 0;
    int indiaOver = 0;
    int pakRun = 0;
    int pakSix = 0;
    int pakFour = 0;
    int pakWicket = 0;
    int pakOver = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addRunToIndia(View view){
        indiaRun = indiaRun + 1;
        displayIndiaRun(indiaRun);
    }

    public void addFourToIndia(View view){
        indiaRun = indiaRun + 4;
        displayIndiaRun(indiaRun);
        indiaFour = indiaFour + 1;
        displayIndiaFours(indiaFour);
    }

    public void addOversToIndia(View view){
        indiaOver = indiaOver + 1;
        displayIndiaOvers(indiaOver);
    }

    public void addWicketsToIndia(View view){
        indiaWicket = indiaWicket +1;
        displayIndiaWickets(indiaWicket);
    }

    public void addSixToIndia(View view){
        indiaRun = indiaRun + 6;
        displayIndiaRun(indiaRun);
        indiaSix = indiaSix + 1;
        displayIndiaSixes(indiaSix);
    }
    public void addRunToPak(View view){
        pakRun = pakRun + 1;
        displayPakRun(pakRun);
    }

    public void addFourToPak(View view){
        pakRun = pakRun + 4;
        displayPakRun(pakRun);
        pakFour = pakFour + 1;
        displayPakFours(pakFour);
    }

    public void addOversToPak(View view){
        pakOver = pakOver + 1;
        displayPakOvers(pakOver);
    }

    public void addWicketsToPak(View view){
        pakWicket = pakWicket +1;
        displayPakWickets(pakWicket);
    }

    public void addSixToPak(View view){
        pakRun = pakRun + 6;
        displayPakRun(pakRun);
        pakSix = pakSix + 1;
        displayPakSixes(pakSix);
    }

    public void resetScore(View view){
        int indiaRun = 0;
        int indiaSix = 0;
        int indiaFour = 0;
        int indiaWicket = 0;
        int indiaOver = 0;
        int pakRun = 0;
        int pakSix = 0;
        int pakFour = 0;
        int pakWicket = 0;
        int pakOver = 0;
        displayIndiaRun(indiaRun);
        displayIndiaFours(indiaFour);
        displayIndiaSixes(indiaSix);
        displayIndiaOvers(indiaOver);
        displayIndiaWickets(indiaWicket);
        displayPakRun(pakRun);
        displayPakFours(pakFour);
        displayPakOvers(pakOver);
        displayPakWickets(pakWicket);
        displayPakSixes(pakSix);
    }



    public void displayPakRun(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pakRun);
        scoreView.setText(String.valueOf(score));
    }
    public void displayPakFours(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pakFour);
        scoreView.setText(String.valueOf(score));
    }
    public void displayPakSixes(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pakSix);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPakWickets(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pakWicket);
        scoreView.setText(String.valueOf(score));
    }

    public void displayPakOvers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pakOvers);
        scoreView.setText(String.valueOf(score));
    }

    public void displayIndiaRun(int score) {
        TextView scoreView = (TextView) findViewById(R.id.indiaRun);
        scoreView.setText(String.valueOf(score));
    }


    public void displayIndiaFours(int score) {
        TextView scoreView = (TextView) findViewById(R.id.indiaFour);
        scoreView.setText(String.valueOf(score));
    }
    public void displayIndiaSixes(int score) {
        TextView scoreView = (TextView) findViewById(R.id.indiaSix);
        scoreView.setText(String.valueOf(score));
    }

    public void displayIndiaWickets(int score) {
        TextView scoreView = (TextView) findViewById(R.id.indiaWicket);
        scoreView.setText(String.valueOf(score));
    }

    public void displayIndiaOvers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.indiaOvers);
        scoreView.setText(String.valueOf(score));
    }

}
