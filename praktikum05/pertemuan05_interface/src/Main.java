public class Main {
    public static void main(String[] args) {
        Wolf myWolf = new Wolf();
        myWolf.animalSound();
        myWolf.run();
        myWolf.sleep();

        System.out.println("\n");

        Bebek myBebek = new Bebek();
        myBebek.animalSound();
        myBebek.run();
        myBebek.sleep();
    }
}
