package applicant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.function.Predicate;

import org.junit.Before;
import org.junit.Test;

public class ApplicantTest {
    // TODO Implement me!
    // Increase code coverage in Applicant class
    // by creating unit test(s)!
    private static Applicant applicant;
    private static Predicate<Applicant> credit;
    private static Predicate<Applicant> employment;
    private static Predicate<Applicant> crime;
    private static OutputStream os;

    @Before
    public void setUp() {
        applicant = new Applicant();
        os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        credit = theAplicant -> theAplicant.getCreditScore() > 600;
        employment = theApplicant -> theApplicant.getEmploymentYears() > 0;
        crime = theApplicant -> !theApplicant.hasCriminalRecord();
    }

    @Test
    public void testCredible() {
        assertTrue(applicant.isCredible());
    }

    @Test
    public void testGetCreditScore() {
        assertEquals(applicant.getCreditScore(), 700);
    }

    @Test
    public void testGetEmploymentYears() {
        assertEquals(applicant.getEmploymentYears(), 10);
    }

    @Test
    public void testGetCriminalRecords() {
        assertTrue(applicant.hasCriminalRecord());
    }

    @Test
    public void testEvaluateSuccess() {
        Applicant.evaluate(applicant, credit);
        assertEquals("Result of evaluating applicant: accepted\n", os.toString());
    }

    @Test
    public void testEvaluateReject() {
        Applicant.evaluate(applicant, crime.and(employment));
        assertEquals("Result of evaluating applicant: rejected\n", os.toString());
    }
}
