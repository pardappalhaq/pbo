public class PenggunaKlik implements MatchingService, BookingService {

    private String nama;

    public PenggunaKlik(String nama) {
        this.nama = nama;
    }

    @Override
    public void cariPartner() {
        System.out.println(nama + " sedang mencari partner olahraga.");
    }

    @Override
    public void lihatProfilPartner() {
        System.out.println(nama + " melihat profil calon partner.");
    }

    @Override
    public void cekJadwalLapangan() {
        System.out.println(nama + " mengecek jadwal lapangan.");
    }

    @Override
    public void bookingLapangan() {
        System.out.println(nama + " melakukan booking lapangan.");
    }
}