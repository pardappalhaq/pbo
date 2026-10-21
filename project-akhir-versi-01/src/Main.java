public class Main {

    public static void main(String[] args) {

        System.out.println("======================================================");
        System.out.println("  APLIKASI KLIK - DEMONSTRASI RELASI DIAGRAM KELAS");
        System.out.println("======================================================\n");

        // 1. GENERALISASI (INHERITANCE) & POLIMORFISME
        System.out.println(">> 1. RELASI GENERALISASI (Inheritance)");
        PartnerFutsal futsal = new PartnerFutsal("Faris", 20, "Bogor", 4);
        futsal.tampilkanProfil();
        futsal.hitungKecocokan();
        futsal.tampilkanStatus();
        futsal.pilihModeFutsal();

        System.out.println();
        PartnerBasket basket = new PartnerBasket("Rafi", 21, "Depok", 2);
        basket.tampilkanProfil();
        basket.hitungKecocokan();
        basket.tampilkanStatus();
        basket.tentukanPosisiBasket();

        // 2. REALISASI (INTERFACE IMPLEMENTATION)
        System.out.println("\n>> 2. RELASI REALISASI (Interface Implementation)");
        MatchingService servicePencari = new PencariPartner();
        servicePencari.cariPartner();

        BookingService serviceMitra = new MitraLapangan("GOR Pajajaran", "Bogor Tengah");
        serviceMitra.cekJadwalLapangan();

        // 3. AGREGASI (AGGREGATION: PencariPartner o-- PartnerOlahraga)
        System.out.println("\n>> 3. RELASI AGREGASI (Aggregation: 1 PencariPartner o-- 0..* PartnerOlahraga)");
        PencariPartner aggregatorPencari = new PencariPartner();
        // Objek Partner dibuat di luar, lalu didaftarkan (weak ownership / loose coupling)
        aggregatorPencari.tambahPartner(futsal);
        aggregatorPencari.tambahPartner(basket);
        aggregatorPencari.cariPartner();
        aggregatorPencari.lihatProfilPartner();

        // 4. KOMPOSISI (COMPOSITION: MitraLapangan *-- JadwalLapangan & PenggunaKlik *-- ProfilPengguna)
        System.out.println("\n>> 4. RELASI KOMPOSISI (Composition: Strong Whole-Part)");
        MitraLapangan mitraKomp = new MitraLapangan("Champion Futsal Arena", "Bogor Barat");
        // JadwalLapangan dihidupkan dan dikelola langsung oleh mitraKomp
        mitraKomp.tambahJadwal("JDW-03", "Jumat", "19:00 - 21:00", 175000);
        mitraKomp.cekJadwalLapangan();

        PenggunaKlik pengguna = new PenggunaKlik("Faris Daffa");
        System.out.println("\n[Komposisi Profil Pengguna]");
        pengguna.getProfil().tampilkanProfil();

        // 5. ASOSIASI (ASSOCIATION: PenggunaKlik --> MitraLapangan)
        System.out.println("\n>> 5. RELASI ASOSIASI (Association: PenggunaKlik --> MitraLapangan)");
        pengguna.hubungkanMitra(mitraKomp);
        pengguna.cekJadwalLapangan();
        pengguna.bookingLapangan();

        System.out.println("\n======================================================");
        System.out.println("  DEMONSTRASI SELURUH RELASI SELESAI");
        System.out.println("======================================================");
    }
}
