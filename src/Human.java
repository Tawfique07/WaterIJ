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
        System.out.println("Jug filled Successfully!\n");
    }
    boolean drink(Glass glass,double quantity) {
        if(glass.getQuantity()>=quantity){
            double temp = glass.getQuantity();
            glass.setQuantity(temp-quantity);
            drink++;
            return true;
        }
       else {
           System.out.println("Glass doesn't have enough Water You have required\n"+
                   "Please try with different amount! or fill the glass!\n");
           return false;
        }
    }
    void status() {
        System.out.printf("%s, You have Drunk water %d Times\nHave a Good day!\n",name,drink);
    }
}
