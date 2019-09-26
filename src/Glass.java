public class Glass extends Container {
    Glass(double capacity) {
       setCapacity(capacity);
       setQuantity(250);
    }

    public void setCapacity(double capacity) {
        if(200<=capacity && capacity<=500) {
            super.setCapacity(capacity);
        }
        else
            super.setCapacity(200.00);
    }

    public void status()
    {
        System.out.printf("Capacity of glass = %.2f ml\n",getCapacity());
        System.out.printf("You can drink %.2f ml\nYou can fill the glass by %.2f ml.\n\n",getQuantity(),getCapacity()-getQuantity());
    }
}
