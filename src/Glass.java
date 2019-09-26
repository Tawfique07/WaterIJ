public class Glass extends Container {
    Glass(double capacity) {
       setCapacity(capacity);
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
        System.out.printf("\nCapacity of glass = %.2f ml\n",getCapacity());
        System.out.printf("Glass is filled  by %.2f ml\nYou can fill the glass by %.2f ml.\n",getQuantity(),getCapacity()-getQuantity());
    }
}
