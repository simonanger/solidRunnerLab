package com.example.simonanger.solidlab;

/**
 * Created by simonanger on 12/09/2017.
 */

public class Run {
    Double distance;
    Double speed;
    Double altitude;

    public Run (Double distance, Double speed, Double altitude) {
        this.distance = distance;
        this.speed = speed;
        this.altitude = altitude;
    }

    public Double getDistance() {
        return distance;
    }

    public Double getSpeed() {
        return speed;
    }

    public Double getAltitude() {
        return altitude;
    }

}
