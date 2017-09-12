package com.example.simonanger.solidlab;

import java.util.ArrayList;

/**
 * Created by simonanger on 12/09/2017.
 */

public class Athlete {
    String name;
    ArrayList<Run> runs;

    public Athlete(String name) {
        this.name = name;
        this.runs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList getRuns() {
        return runs;
    }

    public double totalAltitude() {
        double totalAltitude = 0;
        for(Run run : runs) {
            totalAltitude += run.getAltitude();
        }
        return totalAltitude;
    }

    public double longestDistance() {
        double length = 0;
        for(Run run : runs) {
            if (run.getDistance() > length) {
                length = run.getDistance();
            }
        }
        return length;
    }

    public double averageSpeed() {
        double totalSpeed = 0;
        for(Run run : runs) {
            totalSpeed += run.getSpeed();
        }
        double averageSpeed = totalSpeed / this.runs.size();
        return averageSpeed;
    }
}
