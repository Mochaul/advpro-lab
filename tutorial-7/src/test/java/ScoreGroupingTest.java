import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;


public class ScoreGroupingTest {
    // TODO Implement me!
    // Increase code coverage in ScoreGrouping class
    // by creating unit test(s)!
    private static Map<String, Integer> scores;

    @Before
    public void setUp() {
        scores = new HashMap<String, Integer>();
        scores.put("A", 12);
        scores.put("B", 15);
        scores.put("C", 11);
        scores.put("D", 15);
        scores.put("E", 15);
        scores.put("F", 11);
    }

    @Test
    public void testGroupByScore() {
        assertEquals(ScoreGrouping.groupByScores(scores).toString(),
                "{11=[C, F], 12=[A], 15=[B, D, E]}");
    }

}
