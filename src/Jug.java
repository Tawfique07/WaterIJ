public class Jug extends Container {

    Jug(double capacity) {
        setCapacity(capacity);
    }


    public void setCapacity(double capacity) {
        if(3.0<=capacity && capacity<=6.0) {
            super.setCapacity(capacity*1000);
        }
        else
            super.setCapacity(3.0*1000);
    }


    void pour(Glass glass,double quantity) {
        glass.fill(quantity);
        setQuantity(getQuantity()-quantity);
    }
    public void status() {
        System.out.printf("\nCapacity of jug = %.2f ml\n",getCapacity());
        System.out.printf("Jug is filled  by %.2f ml\nYou can fill the jug by %.2f ml.\n",getQuantity(),getCapacity()-getQuantity());
    }
}
