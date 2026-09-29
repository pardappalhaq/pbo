public class Kalkulator {

    // Overloading berdasarkan jumlah parameter
    int tambah(int a, int b) {
        return a + b;
    }

    // Overloading berdasarkan tipe data parameter
    double tambah(double a, double b) {
        return a + b;
    }

    // Overloading berdasarkan jumlah parameter
    int tambah(int a, int b, int c) {
        return a + b + c;
    }
}
