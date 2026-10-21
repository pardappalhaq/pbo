import java.util.ArrayList;
import java.util.List;

public class MitraLapangan implements BookingService {

    private String namaMitra;
    private String lokasi;

    // Hubungan KOMPOSISI: MitraLapangan memiliki dan mengelola secara eksklusif daftar JadwalLapangan (1..*)
    // Objek JadwalLapangan dibuat di dalam konstruktor/metode MitraLapangan dan siklus hidupnya terikat penuh.
    private List<JadwalLapangan> daftarJadwal;

    public MitraLapangan() {
        this("Klik Sport Center", "Bogor");
    }

    public MitraLapangan(String namaMitra, String lokasi) {
        this.namaMitra = namaMitra;
        this.lokasi = lokasi;
        this.daftarJadwal = new ArrayList<>();

        // Inisialisasi komposisi secara internal (Jadwal tidak berdiri sendiri di luar Mitra)
        this.daftarJadwal.add(new JadwalLapangan("JDW-01", "Sabtu", "16:00 - 18:00", 150000));
        this.daftarJadwal.add(new JadwalLapangan("JDW-02", "Minggu", "08:00 - 10:00", 120000));
    }

    public void tambahJadwal(String idJadwal, String hari, String jam, double harga) {
        // Komposisi: pembuatan objek JadwalLapangan dilakukan oleh MitraLapangan
        this.daftarJadwal.add(new JadwalLapangan(idJadwal, hari, jam, harga));
    }

    public String getNamaMitra() {
        return namaMitra;
    }

    public String getLokasi() {
        return lokasi;
    }

    public List<JadwalLapangan> getDaftarJadwal() {
        return daftarJadwal;
    }

    @Override
    public void cekJadwalLapangan() {
        System.out.println("Mengecek jadwal lapangan yang tersedia pada " + namaMitra + " (" + lokasi + "):");
        for (JadwalLapangan jadwal : daftarJadwal) {
            jadwal.tampilkanJadwal();
        }
    }

    @Override
    public void bookingLapangan() {
        boolean berhasil = false;
        for (JadwalLapangan jadwal : daftarJadwal) {
            if (jadwal.isTersedia()) {
                jadwal.setTersedia(false);
                System.out.println("Lapangan berhasil dipesan melalui Klik untuk jadwal [" + jadwal.getIdJadwal() + " - " + jadwal.getHari() + " " + jadwal.getJam() + "].");
                berhasil = true;
                break;
            }
        }
        if (!berhasil) {
            System.out.println("Maaf, semua jadwal pada " + namaMitra + " sudah terpesan.");
        }
    }
}