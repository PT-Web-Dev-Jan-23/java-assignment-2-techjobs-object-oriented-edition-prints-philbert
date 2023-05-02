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

        assertTrue(fieldTestJob instanceof Job);
        assertEquals(fieldTestJob.getName(), "Product tester");
        assertEquals(fieldTestJob.getEmployer().getValue(), "ACME");
        assertEquals(fieldTestJob.getLocation().getValue(), "Desert");
        assertEquals(fieldTestJob.getPositionType().getValue(), "Quality control");
        assertEquals(fieldTestJob.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job equalityTestJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job equalityTestJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(equalityTestJob1.equals(equalityTestJob2));

    }


}
