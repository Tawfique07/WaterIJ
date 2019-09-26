public class Human {
    private String name;
    private int drink;

    Human (String name) {
        this.name=name;
        drink = 0;
    }

    public String getName() {
        return name;
    }

    void fillGlass(Glass glass, Jug jug, double quantity) {
        jug.pour(glass,quantity);
    }
    void fillJug(Jug jug,double quantity) {
        jug.fill(quantity);
    }
    void drink(Glass glass,double quantity) {
        double temp = glass.getQuantity();
        glass.setQuantity(temp-quantity);
        drink++;
    }
    void status() {
        System.out.printf("%s Drinks water %d Times\n",name,drink);
    }
}
