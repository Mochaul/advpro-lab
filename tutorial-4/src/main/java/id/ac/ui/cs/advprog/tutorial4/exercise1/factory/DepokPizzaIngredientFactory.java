package id.ac.ui.cs.advprog.tutorial4.exercise1.factory;

import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.Cheese;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.cheese.CheddarCheese;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.Clams;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.clam.SteamedClams;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.Dough;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.dough.MediumCrustDough;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.SambaladoSauce;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.sauce.Sauce;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.BlackOlives;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Mushroom;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.RedPepper;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Kangkung;
import id.ac.ui.cs.advprog.tutorial4.exercise1.factory.veggies.Veggies;

public class DepokPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new MediumCrustDough();
    }

    public Sauce createSauce() {
        return new SambaladoSauce();
    }

    public Cheese createCheese() {
        return new CheddarCheese();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = {new BlackOlives(), new Mushroom(), new RedPepper(), new
                Kangkung()};
        return veggies;
    }

    public Clams createClam() {
        return new SteamedClams();
    }
}
