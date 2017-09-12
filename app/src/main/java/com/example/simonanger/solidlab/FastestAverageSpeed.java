package com.example.simonanger.solidlab;

/**
 * Created by simonanger on 12/09/2017.
 */

public class FastestAverageSpeed extends Competition {

    public FastestAverageSpeed() {
        super("Fastest Runner", CompetitionType.SPEED);
    }

    public String winner(){
        Athlete winner = null;
        double winningSpeed = 0.0;
        for (Athlete runner : this.runners) {
            if (runner.averageSpeed() > winningSpeed) {
                winningSpeed = runner.averageSpeed();
                winner = runner;
            }
        }
        return winner.getName();

    }
}
