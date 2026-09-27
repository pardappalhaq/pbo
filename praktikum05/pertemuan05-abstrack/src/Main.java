public class Main {
    public static void main(String[] args) {
        Pig obj01 = new Pig();
        obj01.sleep();
        obj01.animalSound();
        obj01.ciriKhas();

        System.out.println("==================================");

        Dog obj02 = new Dog();
        obj02.sleep();
        obj02.animalSound();
        obj02.ciriKhas();

        System.out.println("==================================");
        
        Serigala obj03 = new Serigala();        
        obj03.sleep();
        obj03.animalSound();
        obj03.ciriKhas();
    }
}