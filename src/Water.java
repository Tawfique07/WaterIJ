public class Water {
    public static void main(String[] args) {
        Human mamun = new Human("mamun");
        Glass glass = new Glass(300);
        Jug jug = new Jug(5);

        mamun.fillJug(jug,5000);
        mamun.fillGlass(glass,jug,250);
        mamun.drink(glass,200);

        mamun.status();
        jug.status();
        glass.status();

    }


}
