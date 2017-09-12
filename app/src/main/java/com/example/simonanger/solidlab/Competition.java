package com.example.simonanger.solidlab;

import java.util.ArrayList;

/**
 * Created by simonanger on 12/09/2017.
 */

public abstract class Competition {
    String compName;
    CompetitionType type;
    ArrayList<Athlete> runners;


    public Competition(String compName, CompetitionType type) {
        this.compName = compName;
        this.type = type;
        this.runners = new ArrayList<>();
    }

    public String getCompName() {
        return compName;
    }

    public CompetitionType getType() {
        return type;
    }

    public ArrayList<Athlete> getRunners() {
        return runners;
    }

    public abstract String winner();
}
