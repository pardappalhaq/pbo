import java.util.ArrayList;
import java.util.List;

public class PenggunaKlik implements MatchingService, BookingService {

    private String nama;

    // Hubungan KOMPOSISI: Setiap PenggunaKlik memiliki 1 objek ProfilPengguna yang dibuat bersamaan
    // dengan PenggunaKlik. Jika objek PenggunaKlik dihapus, ProfilPengguna ikut musnah.
    private ProfilPengguna profil;

    // Hubungan ASOSIASI: PenggunaKlik berasosiasi struktural dengan MitraLapangan (0..*)
    // Kedua objek berdiri sendiri dan saling berinteraksi untuk pemesanan.
    private List<MitraLapangan> mitraLangganan;

    public PenggunaKlik(String nama) {
        this(nama, "USR-" + nama.toUpperCase(), "Penyuka olahraga aktif di komunitas Klik", "0812-3456-7890");
    }

    public PenggunaKlik(String nama, String idPengguna, String bio, String noTelepon) {
        this.nama = nama;
        // Inisialisasi KOMPOSISI secara internal
        this.profil = new ProfilPengguna(idPengguna, bio, noTelepon);
        // Inisialisasi list untuk ASOSIASI
        this.mitraLangganan = new ArrayList<>();
    }

    // Metode ASOSIASI: Menghubungkan pengguna dengan mitra lapangan tertentu
    public void hubungkanMitra(MitraLapangan mitra) {
        this.mitraLangganan.add(mitra);
        System.out.println(nama + " terhubung dengan mitra: " + mitra.getNamaMitra());
    }

    public String getNama() {
        return nama;
    }

    public ProfilPengguna getProfil() {
        return profil;
    }

    public List<MitraLapangan> getMitraLangganan() {
        return mitraLangganan;
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
        if (!mitraLangganan.isEmpty()) {
            for (MitraLapangan mitra : mitraLangganan) {
                mitra.cekJadwalLapangan();
            }
        }
    }

    @Override
    public void bookingLapangan() {
        System.out.println(nama + " melakukan booking lapangan.");
        if (!mitraLangganan.isEmpty()) {
            mitraLangganan.get(0).bookingLapangan();
        }
    }
}