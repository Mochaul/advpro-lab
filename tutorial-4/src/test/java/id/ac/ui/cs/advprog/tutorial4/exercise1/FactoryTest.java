package id.ac.ui.cs.advprog.tutorial4.exercise1;

import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.*;

import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.SteamedClams;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.Clams;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.FreshClams;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.FrozenClams;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.Dough;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.MediumCrustDough;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.ThickCrustDough;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.ThinCrustDough;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.MarinaraSauce;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.PlumTomatoSauce;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.Sauce;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.SambaladoSauce;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryTest {

    private Cheese[] allCheese;
    private Clams[] allClam;
    private Dough[] allDough;
    private Sauce[] allSauce;
    private Veggies[] allVeggies;

    @Before
    public void setUp() {
        //Cheese
        allCheese = new Cheese[4];
        allCheese[0] = new MozzarellaCheese();
        allCheese[1] = new ParmesanCheese();
        allCheese[2] = new ReggianoCheese();
        allCheese[3] = new CheddarCheese();


        //Clam
        allClam = new Clams[3];
        allClam[0] = new FreshClams();
        allClam[1] = new FrozenClams();
        allClam[2] = new SteamedClams();


        //Dough
        allDough = new Dough[3];
        allDough[0] = new ThickCrustDough();
        allDough[1] = new ThinCrustDough();
        allDough[2] = new MediumCrustDough();


        //Sauce
        allSauce = new Sauce[3];
        allSauce[0] = new PlumTomatoSauce();
        allSauce[1] = new MarinaraSauce();
        allSauce[2] = new SambaladoSauce();


        //Veggies
        allVeggies = new Veggies[8];
        allVeggies[0] = new BlackOlives();
        allVeggies[1] = new Eggplant();
        allVeggies[2] = new Garlic();
        allVeggies[3] = new Mushroom();
        allVeggies[4] = new Onion();
        allVeggies[5] = new RedPepper();
        allVeggies[6] = new Spinach();
        allVeggies[7] = new Kangkung();

    }

    @Test
    public void testToString() {
        //CheeseString
        assertEquals("Shredded Mozzarella", allCheese[0].toString());
        assertEquals("Shredded Parmesan", allCheese[1].toString());
        assertEquals("Reggiano Cheese", allCheese[2].toString());
        assertEquals("Keju Cheddar", allCheese[3].toString());


        //Clam
        assertEquals("Fresh Clams from Long Island Sound", allClam[0].toString());
        assertEquals("Frozen Clams from Chesapeake Bay", allClam[1].toString());
        assertEquals("Steamed Clams from nowhere", allClam[2].toString());


        //Dough
        assertEquals("ThickCrust style extra thick crust dough", allDough[0].toString());
        assertEquals("Thin Crust Dough", allDough[1].toString());
        assertEquals("M E D dough", allDough[2].toString());


        //Sauce
        assertEquals("Tomato sauce with plum tomatoes", allSauce[0].toString());
        assertEquals("Marinara Sauce", allSauce[1].toString());
        assertEquals("Sambalado sauce", allSauce[2].toString());


        //Veggies
        assertEquals("Black Olives", allVeggies[0].toString());
        assertEquals("Eggplant", allVeggies[1].toString());
        assertEquals("Garlic", allVeggies[2].toString());
        assertEquals("Mushrooms", allVeggies[3].toString());
        assertEquals("Onion", allVeggies[4].toString());
        assertEquals("Red Pepper", allVeggies[5].toString());
        assertEquals("Spinach", allVeggies[6].toString());
        assertEquals("Kangkung-kangkung", allVeggies[7].toString());

    }


}

