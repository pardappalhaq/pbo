public class JadwalLapangan {

    private String idJadwal;
    private String hari;
    private String jam;
    private double harga;
    private boolean isTersedia;

    public JadwalLapangan(String idJadwal, String hari, String jam, double harga) {
        this.idJadwal = idJadwal;
        this.hari = hari;
        this.jam = jam;
        this.harga = harga;
        this.isTersedia = true;
    }

    public void tampilkanJadwal() {
        String status = isTersedia ? "Tersedia" : "Sudah Dipesan";
        System.out.println("  [" + idJadwal + "] " + hari + ", " + jam + " | Rp " + harga + " (" + status + ")");
    }

    public void setTersedia(boolean tersedia) {
        this.isTersedia = tersedia;
    }

    public boolean isTersedia() {
        return isTersedia;
    }

    public String getIdJadwal() {
        return idJadwal;
    }

    public String getHari() {
        return hari;
    }

    public String getJam() {
        return jam;
    }

    public double getHarga() {
        return harga;
    }
}
