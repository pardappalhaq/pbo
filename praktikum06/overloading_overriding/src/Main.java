public class Main {

    public static void main(String[] args) {

        // =========================
        // 1. OVERLOADING
        // =========================
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("=== OVERLOADING ===");
        System.out.println("tambah(2, 3) = " + kalkulator.tambah(2, 3));
        System.out.println("tambah(2.5, 1.5) = " + kalkulator.tambah(2.5, 1.5));
        System.out.println("tambah(1, 2, 3) = " + kalkulator.tambah(1, 2, 3));

        // =========================
        // 2. OVERRIDING
        // =========================
        System.out.println("\n=== OVERRIDING ===");

        Kucing kucing = new Kucing();
        kucing.suara();

        // =========================
        // 3. POLIMORFISME
        // =========================
        System.out.println("\n=== POLIMORFISME ===");

        Hewan a = new Kucing();
        Hewan b = new Anjing();

        a.suara();
        b.suara();

        // =========================
        // 4. Bidang Datar
        // =========================
        System.out.println("\n=== Bidang Datar ===");
        
        BidangDatar obj01 = new Persegi(1.50);
        BidangDatar obj02 = new Lingkaran(1.50);
        BidangDatar obj03 = new PersegiPanjang(1.50, 2.50);

        System.out.println("Luas Persegi: " + obj01.luas());
        System.out.println("Luas Lingkaran: " + obj02.luas());
        System.out.println("Luas Persegi Panjang: " + obj03.luas());

    }
}
