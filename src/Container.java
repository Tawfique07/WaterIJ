public abstract class Container {
    private double quantity;
    private double capacity;


    double getCapacity() {
        return capacity;
    }

     double getQuantity() {
        return quantity;
    }

    void fill(double quantity) {
        this.quantity= this.quantity + quantity;
        if(this.quantity>capacity) {
            this.quantity = capacity;
        }
    }
    protected void setCapacity(double capacity){
        this.capacity = capacity;
    };

     void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public abstract void status();
}
