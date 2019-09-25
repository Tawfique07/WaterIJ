public class Glass {
    private double capacity;
    private double quantity;

    Glass(double capacity) {
        setCapacity(capacity);
        quantity = 0;
    }

    public double getQuantity() {

        return quantity;
    }

    public void setCapacity(double capacity) {
        if(200<=capacity && capacity<=500) {
            this.capacity = capacity;
        }
        else
            this.capacity = 200.0;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    void fill(double quantity) {
        this.quantity= this.quantity+ quantity;
        if(this.quantity>capacity) {
            this.quantity = capacity;
        }
    }
    void status()
    {
        System.out.printf("\nCapacity of glass = %.2f ml\n",capacity);
        System.out.printf("Glass is filled  by %.2f ml\nYou can fill the glass by %.2f ml.\n",quantity,capacity-quantity);
    }
}
