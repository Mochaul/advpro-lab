package id.ac.ui.cs.advprog.tutorial2.exercise2;

import java.util.ArrayList;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();

        ArrayList<String> ok = new ArrayList<>();
        ok.iterator();
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
