public class Storehouse {
    int stored_dough, stored_cheese, stored_sauce, stored_pepperoni, stored_sausage, stored_drink;
    Pizzeria pizzeria;

    public Storehouse(Pizzeria pizzeria) {
        this.stored_dough = 0;
        this.stored_sauce = 0;
        this.stored_cheese = 0;
        this.stored_pepperoni = 0;
        this.stored_sausage = 0;
        this.stored_drink = 0;
        this.pizzeria = pizzeria;
    }

    public void storage_display () {
        int[] storage = this.storage_return();
        String[] ingredients = {"Dough", "Sauce", "Cheese", "Pepperoni", "Sausage", "Drink"};
        System.out.println(this.pizzeria.name + " storage data:");
        for (int i = 0; i < storage.length; i++) {
            System.out.println("    " + (i + 1) + ") " + ingredients[i] + ": " + storage[i] + ".");
        }
    }

    public int[] storage_return () {
        int[] result = {stored_dough, stored_sauce, stored_cheese, stored_pepperoni, stored_sausage, stored_drink};
        return result;
    }
}