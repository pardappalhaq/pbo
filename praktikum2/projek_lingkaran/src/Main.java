public class Main {
    public static void main(String[] args) {
        Lingkaran obj01 = new Lingkaran(10);

        String K = String.format("%8.2f", obj01.keliling());
        String L = String.format("%8.2f", obj01.luas());
        System.out.println("Kelilingnya : " + K);
        System.out.println("Luasnya     : " + L);
    }
}
