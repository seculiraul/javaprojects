package com.company;

public class Client {


    public static void main(String[] args) {

        AverageScoreDisp averageScoreDisp = new AverageScoreDisp();
        CurrentScore currentScore = new CurrentScore();


        CricketData cricketData = new CricketData();


        cricketData.register(averageScoreDisp);
        cricketData.register(currentScore);


        cricketData.dataChange();

        cricketData.unregister(averageScoreDisp);

        cricketData.dataChange();


    }
}
