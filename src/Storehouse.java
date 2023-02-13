import java.util.Arrays;

public class Storehouse {
    int[] stored_ingredients = new int[6];
    Pizzeria pizzeria;

    public Storehouse(Pizzeria pizzeria) {
        Arrays.fill(this.stored_ingredients, 0);
        this.pizzeria = pizzeria;
    }

    public void storage_display () {
        String[] ingredients = {"Dough", "Sauce", "Cheese", "Pepperoni", "Sausage", "Drink"};
        System.out.println(this.pizzeria.name + " storage data:");
        for (int i = 0; i < this.stored_ingredients.length; i++) {
            System.out.println("    " + (i + 1) + ") " + ingredients[i] + ": " + this.stored_ingredients[i] + ".");
        }
    }

    public int[] storage_return () {
        return this.stored_ingredients;
    }
}