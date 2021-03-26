package com.company;

public interface Observer {


    void update(int runs,  int wickets, float overs);
}


class AverageScoreDisp implements Observer {


    private float runRate;
    private int predictedScore;


    @Override
    public void update(int runs, int wickets, float overs) {

        this.runRate = (float)runs/overs;
        this.predictedScore = (int)(this.runRate * 50);
        display();


    }

    public void display() {

        System.out.println("\n=========Average Score========\n"+ "Run rate: "+ runRate + "\nPredicted score: "+predictedScore);


    }
}



class CurrentScore implements Observer {

    private int runs;
    private int wickets;
    private float overs;



    @Override
    public void update(int runs, int wickets, float overs) {

      this.runs = runs;
      this.wickets = wickets;
      this.overs = overs;
      display();


    }


    public void display() {


        System.out.println("\n==========Current Score==============\n"+
                "Runs: "+runs + "\nWickets: "+wickets + "\nOvers:" + overs);

    }
}