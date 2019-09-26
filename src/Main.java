import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean exit = true;

        Scanner input = new Scanner(System.in);
        cls();
        System.out.print("Enter your name : ");
        Human human = new Human(input.nextLine());
        Jug jug = new Jug(5);
        Glass glass = new Glass(500);
        cls();
        System.out.println("Welcome "+human.getName()+" in our Drinking App !" +
                "\nEnter Your Choice from below\n");

        while (exit){
            System.out.print("Main menu:\n1. Drink Water"+"\n2. Exit"+"\nPress here : ");
            switch(input.nextInt()){
                case 1:
                    cls();
                    exit = drink(jug,glass,input,human);
                    break;
                case 2:
                    cls();
                    exit = false;
                    break;
                default:
                    cls();
                    System.out.println("Not match. Try again!");
            }
        }
        human.status();
    }

    private static boolean drink(Jug jug,Glass glass,Scanner input,Human human){
        boolean exit = true;

        while(exit){
            glass.status();
            System.out.println("\nDrink water menu:\n1. Drink\n2. Fill the glass\n3. Go to Main menu\n4. Exit");
            System.out.print("Press here : ");
            switch (input.nextInt()){
                case 1:
                    cls();
                    System.out.print("Enter amount (ml): ");
                    if(human.drink(glass,input.nextDouble())){
                        System.out.println("You have drunk successfully !\n");
                    }
                    break;
                case 2:
                    cls();
                    exit=fillglass(jug,glass,human,input);
                    break;
                case 3:
                    cls();
                    exit = false;
                    break;
                case 4:
                    cls();
                    return false;
                default:
                    cls();
                    System.out.println("Dont match. Try again!");
            }
        }
        return true;
    }

    private static boolean fillglass(Jug jug,Glass glass,Human human,Scanner input) {
        boolean exit = true;
        while (exit) {
            jug.status();
            System.out.println("Fill glass menu:\n1. Pour water to glass\n2. Fill the jug\n3. Go to previous menu" +
                    "\n4. Go to Main menu");
            System.out.print("Press here : ");
            switch (input.nextInt()) {
                case 1:
                    cls();
                    System.out.print("Enter amount (ml): ");
                    human.fillGlass(glass, jug, input.nextDouble());
                    break;
                case 2:
                    cls();
                    System.out.print("Enter amount (ml): ");
                    human.fillJug(jug,input.nextDouble());
                    break;
                case 3:
                    cls();
                    exit = false;
                    break;
                case 4:
                    cls();
                    return false;
                default:
                    cls();
                    System.out.println("Dont match. Try again!");
            }
        }
        return true;
    }

    public static void cls() {
        try {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch (Exception E)
        {
            System.out.println(E);
        }
    }

}
