public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Daffa", "J1042");
        Mahasiswa mhs2 = new Mahasiswa("Bob", "J1037");
        Mahasiswa mhs3 = new Mahasiswa("Salman", "J1150");

        MataKuliah mk1 = new MataKuliah("TPL001", "PBO");
        MataKuliah mk2 = new MataKuliah("TPL002", "Basis Data");
        MataKuliah mk3 = new MataKuliah("TPL003", "RKPL");

        mhs1.tambahMatKul(mk1);
        mhs1.tambahMatKul(mk2);
        mhs1.tambahMatKul(mk3);
        mhs1.tampilkanMatKul();
        mk1.tampilkanMahasiswa();
        mk2.tampilkanMahasiswa();
        mk3.tampilkanMahasiswa();
    }
}