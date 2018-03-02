package id.ac.ui.cs.advprog.tutorial3.decorator;

import id.ac.ui.cs.advprog.tutorial3.decorator.bread.*;
import id.ac.ui.cs.advprog.tutorial3.decorator.filling.*;

public class Main {
    public static void main(String[] args) {
        CrustySandwich crustySandwich = new CrustySandwich();
        NoCrustSandwich noCrustSandwich = new NoCrustSandwich();
        ThickBunBurger thickBunBurger = new ThickBunBurger();
        ThinBunBurger thinBunBurger = new ThinBunBurger();

        BeefMeat beefMeat = new BeefMeat(crustySandwich);
        Cheese cheese = new Cheese(noCrustSandwich);
        ChickenMeat chickenMeat = new ChickenMeat(thickBunBurger);
        ChiliSauce chiliSauce = new ChiliSauce(thinBunBurger);
        Cucumber cucumber = new Cucumber(crustySandwich);

        System.out.printf("%-40s Cost: %.1f%n", beefMeat.getDescription(), beefMeat.cost());
        System.out.printf("%-40s Cost: %.1f%n", cheese.getDescription(), cheese.cost());
        System.out.printf("%-40s Cost: %.1f%n", chickenMeat.getDescription(), chickenMeat.cost());
        System.out.printf("%-40s Cost: %.1f%n", chiliSauce.getDescription(), chiliSauce.cost());
        System.out.printf("%-40s Cost: %.1f", cucumber.getDescription(), cucumber.cost());
    }
}
