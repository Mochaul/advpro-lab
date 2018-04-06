package applicant;

import java.util.function.Predicate;

/**
 * 4th exercise.
 */
public class Applicant {

    public boolean isCredible() {
        return true;
    }

    public int getCreditScore() {
        return 700;
    }

    public int getEmploymentYears() {
        return 10;
    }

    public boolean hasCriminalRecord() {
        return true;
    }

    public static void evaluate(Applicant applicant, Predicate<Applicant> evaluator) {
        String msg = "Result of evaluating applicant: %s";
        msg = evaluator.test(applicant) ? String.format(msg, "accepted")
                : String.format(msg, "rejected");

        System.out.println(msg);
    }

    public static void main(String[] args) {
        Applicant applicant = new Applicant();

        Predicate<Applicant> credit = theAplicant -> theAplicant.getCreditScore() > 600;
        Predicate<Applicant> employment = theApplicant -> theApplicant.getEmploymentYears() > 0;
        Predicate<Applicant> crime = theApplicant -> !theApplicant.hasCriminalRecord();
        evaluate(applicant, credit);

        evaluate(applicant, credit.and(employment));

        evaluate(applicant, crime.and(employment));

        evaluate(applicant, crime.and(credit).and(employment));
    }
} 
