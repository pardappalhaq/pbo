public class Main {

    public static void main(String[] args) {

        System.out.println("===== ABSTRACT 1 =====");

        PartnerFutsal futsal = new PartnerFutsal(
            "Faris",
            20,
            "Bogor",
            4
        );

        futsal.tampilkanProfil();
        futsal.hitungKecocokan();
        futsal.tampilkanStatus();
        futsal.pilihModeFutsal();

        System.out.println();

        System.out.println("===== ABSTRACT 2 =====");

        PartnerBasket basket = new PartnerBasket(
            "Rafi",
            21,
            "Depok",
            2
        );

        basket.tampilkanProfil();
        basket.hitungKecocokan();
        basket.tampilkanStatus();
        basket.tentukanPosisiBasket();

        System.out.println();
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
