public class MainInterface {

    public static void main(String[] args) {

        System.out.println("===== INTERFACE 1 =====");

        PencariPartner pencari = new PencariPartner();

        pencari.cariPartner();
        pencari.lihatProfilPartner();

        System.out.println();

        System.out.println("===== INTERFACE 2 =====");

        MitraLapangan lapangan = new MitraLapangan();

        lapangan.cekJadwalLapangan();
        lapangan.bookingLapangan();

        System.out.println();

        System.out.println("===== KEDUA INTERFACE =====");

        PenggunaKlik pengguna = new PenggunaKlik("Faris");

        pengguna.cariPartner();
        pengguna.lihatProfilPartner();
        pengguna.cekJadwalLapangan();
        pengguna.bookingLapangan();
    }
}