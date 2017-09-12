package com.example.simonanger.solidlab;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by simonanger on 12/09/2017.
 */

public class DistanceCompetitionTest {

    LongestDistance distanceCompetition;
    Athlete athlete1;
    Athlete athlete2;
    Run run1;
    Run run2;
    Run run3;
    Run run4;
    Run run5;
    Run run6;

    @Before
    public void before(){
        distanceCompetition = new LongestDistance();
        athlete1 = new Athlete("Bolt");
        run1 = new Run(12.0, 22.0, 3.0);
        run2 = new Run(9.0, 25.0, 4.0);
        run3 = new Run(15.0, 18.0, 2.0);
        athlete1.getRuns().add(run1);
        athlete1.getRuns().add(run2);
        athlete1.getRuns().add(run3);
        athlete2 = new Athlete("Gaitlin");
        run4 = new Run(11.0, 23.0, 2.0);
        run5 = new Run(9.0, 27.0, 3.0);
        run6 = new Run(12.0, 20.0, 5.0);
        athlete1.getRuns().add(run4);
        athlete1.getRuns().add(run5);
        athlete1.getRuns().add(run6);
        distanceCompetition.getRunners().add(athlete1);
        distanceCompetition.getRunners().add(athlete2);
    }

    @Test
    public void testWinner() {
        assertEquals("Bolt" , distanceCompetition.winner());
    }


}
