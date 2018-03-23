import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {
    Movie movie;
    Rental rent;

    @Before
    public void setUp() {
        this.movie = new Movie("Who Killed Captain Alex?", Movie.REGULAR);
        this.rent = new Rental(movie, 3);
    }

    @Test
    public void getMovie() {
        assertEquals(movie, rent.getMovie());
    }

    @Test
    public void getDaysRented() {
        assertEquals(3, rent.getDaysRented());
    }
}
