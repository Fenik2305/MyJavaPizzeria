import java.util.Arrays;

public class SupplyTrack {
    int loading_capacity;
    int[] cargo = new int[6];

    public SupplyTrack(int loading_capacity) {
        this.loading_capacity = loading_capacity;
        Arrays.fill(this.cargo, 0);
    }

    public void load_truck(int[] storehouse_order) {
        if (Arrays.stream(storehouse_order).sum() <= this.loading_capacity && Arrays.stream(storehouse_order).filter(x -> x >= 0).count() == 6) {
            System.arraycopy(storehouse_order, 0, this.cargo, 0, 6);
        } else {
            System.out.println("Truck loading error!");
        }
    }

    public void supplies_delivery(Pizzeria orderer) {
        for (int i = 0; i < cargo.length; i++) {
            orderer.storehouse.stored_ingredients[i] += cargo[i];
        }
        Arrays.fill(this.cargo, 0);
    }

    public void display_truck() {
        for (int i = 0; i < 6; i++) {
            System.out.println(cargo[i]);
        }
    }
}
