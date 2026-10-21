public abstract class PartnerOlahraga {

    protected String nama;
    protected int usia;
    protected String lokasi;
    protected int frekuensiOlahraga;

    // Abstract method 1
    public abstract void tampilkanProfil();

    // Abstract method 2
    public abstract void hitungKecocokan();

    // Method standard
    public void tampilkanStatus() {
        System.out.println(nama + " sedang mencari partner olahraga.");
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public String getLokasi() {
        return lokasi;
    }

    public int getFrekuensiOlahraga() {
        return frekuensiOlahraga;
    }
}