package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job test_job1 = new Job();
        Job test_job2 = new Job();

        assertNotEquals(test_job1.getId(), test_job2.getId(), .001);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job fieldTestJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //        Your test should have 5 assert statements of each type.

        assertTrue(fieldTestJob instanceof Job);
        assertEquals(fieldTestJob.getName(), "Product tester");

        assertTrue(fieldTestJob.getEmployer() instanceof Employer);
        assertEquals(fieldTestJob.getEmployer().getValue(), "ACME");

        assertTrue(fieldTestJob.getLocation() instanceof Location);
        assertEquals(fieldTestJob.getLocation().getValue(), "Desert");

        assertTrue(fieldTestJob.getPositionType() instanceof PositionType);
        assertEquals(fieldTestJob.getPositionType().getValue(),"Quality control");

        assertTrue(fieldTestJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(fieldTestJob.getCoreCompetency().getValue(), "Persistence");

    }

    @Test
    public void testJobsForEquality() {
        Job equalityTestJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job equalityTestJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(equalityTestJob1.equals(equalityTestJob2));

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job startEndNewLineTestJob = new Job();

        assertEquals(startEndNewLineTestJob.toString().charAt(0), '\n');
        assertEquals(startEndNewLineTestJob.toString().charAt(startEndNewLineTestJob.toString().length()-1), '\n');

    }



}
