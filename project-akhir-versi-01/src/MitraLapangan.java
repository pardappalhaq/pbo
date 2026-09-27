public class MitraLapangan implements BookingService {

    @Override
    public void cekJadwalLapangan() {
        System.out.println("Mengecek jadwal lapangan yang tersedia.");
    }

    @Override
    public void bookingLapangan() {
        System.out.println("Lapangan berhasil dipesan melalui Klik.");
    }
}