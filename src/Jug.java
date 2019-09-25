public class Jug {
    private  double capacity;
    private  double quantity;

    Jug(double capacity) {
        setCapacity(capacity);
        quantity=0;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setCapacity(double capacity) {
        if(3.0<=capacity && capacity<=6.0) {
            this.capacity = capacity*1000;
        }
        else
            this.capacity = 3.0*1000;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getCapacity() {
        return capacity;
    }

    void fill(double quantity) {
        this.quantity=this.quantity+quantity;
        if (this.quantity>capacity) {
            this.quantity=capacity;
        }
    }
    void pour(Glass glass,double quantity) {
        glass.fill(quantity);
        this.quantity -= quantity;
    }
    void status() {
        System.out.printf("\nCapacity of jug = %.2f ml\n",capacity);
        System.out.printf("Jug is filled  by %.2f ml\nYou can fill the jug by %.2f ml.\n",quantity,capacity-quantity);
    }
}
