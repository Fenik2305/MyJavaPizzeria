public class Pizzeria {
    String name = new String();
    int visitors_served;
    Storehouse storehouse;
    
    public Pizzeria(String name) {
        this.name = name;
        this.visitors_served = 0;
        this.storehouse = new Storehouse(this);
    }
}