import java.math.*;
import java.util.stream.*;
import java.util.Arrays;

public class PizzaProject {
    public static void main(String[] args) {
        System.out.println("I love you, PizzaProject <3");
        
        Pizzeria myPizzeria = new Pizzeria("MyPizzeria");
        
        int[] storehouse_order = {6, -0, 3, 4, 5, 6};
        SupplyTrack FordTransit = new SupplyTrack(99);

        FordTransit.load_truck(storehouse_order);
        FordTransit.supplies_delivery(myPizzeria);
    
        FordTransit.load_truck(storehouse_order);
        FordTransit.supplies_delivery(myPizzeria);

        myPizzeria.storehouse.storage_display();
    }
}
