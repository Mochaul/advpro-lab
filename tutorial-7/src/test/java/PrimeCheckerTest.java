import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeCheckerTest {

    private static final List<Integer> PRIME_NUMBERS = Arrays.asList(2, 3, 5, 11);
    private static final List<Integer> NON_PRIME = Arrays.asList(4,6,8,10);

    @Test
    public void testIsPrimeTrueGivenPrimeNumbers() {
        PRIME_NUMBERS.forEach(number -> assertTrue(PrimeChecker.isPrime(number)));
    }

    @Test
    public void testIsPrimeFalseGivenNonPrimeNumbers() {
        NON_PRIME.forEach(number -> assertTrue(!PrimeChecker.isPrime(number)));
    }
}
