import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Panjang (cm): ");
        double p = sc.nextDouble();
        System.out.print("Lebar (cm): ");
        double l = sc.nextDouble();
        System.out.print("Tinggi (cm): ");
        double t = sc.nextDouble();

        Balok balok = new Balok(p, l, t);
        System.out.println("Volume = " + balok.hitungVolume()
          + " cm3");
        sc.close();
    }
}
