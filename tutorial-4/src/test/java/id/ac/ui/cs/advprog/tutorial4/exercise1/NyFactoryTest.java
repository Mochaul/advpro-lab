package id.ac.ui.cs.advprog.tutorial4.exercise1;

import id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.Pizza;
import org.junit.Test;

import static org.junit.Assert.*;

public class NyFactoryTest {

    @Test
    public void testCanCreatePizza() {
        PizzaStore nyStore = new NewYorkPizzaStore();

        Pizza nyPizza = nyStore.orderPizza("cheese");
        assertNotNull(nyPizza);
        nyPizza = nyStore.orderPizza("clam");
        assertNotNull(nyPizza);
        nyPizza = nyStore.orderPizza("veggie");
        assertNotNull(nyPizza);


    }
}
