public class PizzaProject {
    public static class Pizzeria {
        String pizzeria_name = new String();
        int visitors_served;
        Storehouse storehouse;
        
        public Pizzeria(String name) {
            this.pizzeria_name = name;
            this.visitors_served = 0;
            this.storehouse = new Storehouse();
        }
    }

    public static class Storehouse {
        int stored_dough, stored_cheese, stored_sauce, stored_pepperoni, stored_sausage, stored_drink;

        public Storehouse() {
            this.stored_dough = 0;
            this.stored_sauce = 0;
            this.stored_cheese = 0;
            this.stored_pepperoni = 0;
            this.stored_sausage = 0;
            this.stored_drink = 0;
        }
    
        public void storage_display () {
            int[] storage = this.storage_return();
            String[] ingredients = {"Dough", "Sauce", "Cheese", "Pepperoni", "Sausage", "Drink"};
            System.out.println("Storage data:");
            for (int i = 0; i < storage.length; i++) {
                System.out.println("    " + (i + 1) + ") " + ingredients[i] + ": " + storage[i] + ".");
            }
        }
    
        public int[] storage_return () {
            int[] result = {stored_dough, stored_sauce, stored_cheese, stored_pepperoni, stored_sausage, stored_drink};
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println("I love you, PizzaProject <3");
        
        Pizzeria myPizzeria = new Pizzeria("MyPizzeria");
        myPizzeria.storehouse.storage_display();
    }
}
