package com.example.simonanger.solidlab;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by simonanger on 12/09/2017.
 */

public class AthleteTest {

    Athlete athlete;
    Run run1;
    Run run2;

    @Before
    public void before() {
        athlete = new Athlete("Bolt");
        run1 = new Run(10.0, 20.0, 5.0 );
        run2 = new Run(20.0, 10.0, 5.0);
    }

    @Test
    public void canGetAthleteName(){
        assertEquals("Bolt", athlete.getName());
    }

    @Test
    public void newAthleteStartsWithEmptyRunArray() {
        assertEquals(0, athlete.getRuns().size());
    }

    @Test
    public void canAddRunToAthlete(){
        athlete.getRuns().add(run1);
        assertEquals(1, athlete.getRuns().size());
    }

    @Test
    public void canGetTotalAltitude(){
        athlete.getRuns().add(run1);
        athlete.getRuns().add(run2);
        assertEquals(10.0, athlete.totalAltitude(), 0.1);
    }

    @Test
    public void canGetLongestDistance(){
        athlete.getRuns().add(run1);
        athlete.getRuns().add(run2);
        assertEquals(20.0, athlete.longestDistance(), 0.1);
    }

    @Test
    public void canGetAverageSpeed() {
        athlete.getRuns().add(run1);
        athlete.getRuns().add(run2);
        assertEquals(15.0, athlete.averageSpeed(), 0.1);
    }


}

