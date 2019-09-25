public abstract class Container {
    private  double quantity;
    private double capacity;

    Container(double capacity){
        setCapacity(capacity);
        setQuantity(0.0);
    }

    public double getCapacity() {
        return capacity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void fill(double quantity) {
        this.quantity= this.quantity+ quantity;
        if(this.quantity>capacity) {
            this.quantity = capacity;
        }
    }
    abstract void setCapacity(double capacity);

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    abstract void status();
}
