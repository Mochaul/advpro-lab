package id.ac.ui.cs.advprog.tutorial4.exercise1;

import id.ac.ui.cs.advprog.tutorial4.exercise1.pizza.Pizza;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepokFactoryTest {

    @Test
    public void testCanCreatePizza() {
        PizzaStore dpkStore = new DepokPizzaStore();

        Pizza dpPizza = dpkStore.orderPizza("meat");
        assertNotNull(dpPizza);


    }
}
