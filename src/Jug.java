public class Jug extends Container {

    Jug(double capacity) {
        setCapacity(capacity);
        setQuantity(2500);
    }


    public void setCapacity(double capacity) {
        if(3.0<=capacity && capacity<=6.0) {
            super.setCapacity(capacity*1000);
        }
        else
            super.setCapacity(3.0*1000);
    }


    void pour(Glass glass,double quantity) {
        if(quantity<=getQuantity())
        {
            glass.fill(quantity);
            setQuantity(getQuantity()-quantity);
            System.out.println("Water poured successfully\n");
        }
        else
            System.out.println("Jug doesn't have enough Water pour to glass\nPlease try with Different amount! or fill the jug.!\n");
    }

    public void status() {
        System.out.printf("Capacity of jug = %.2f ml\n",getCapacity());
        System.out.printf("You can pour water to glass %.2f ml\nYou can fill the jug by %.2f ml.\n\n",getQuantity(),getCapacity()-getQuantity());
    }
}
