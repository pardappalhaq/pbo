public class PartnerBasket extends PartnerOlahraga {

    public PartnerBasket(String nama, int usia, String lokasi, int frekuensiOlahraga) {
        this.nama = nama;
        this.usia = usia;
        this.lokasi = lokasi;
        this.frekuensiOlahraga = frekuensiOlahraga;
    }

    @Override
    public void tampilkanProfil() {
        System.out.println("Nama       : " + nama);
        System.out.println("Usia       : " + usia);
        System.out.println("Lokasi     : " + lokasi);
        System.out.println("Olahraga   : Basket");
        System.out.println("Frekuensi  : " + frekuensiOlahraga + " kali/minggu");
    }

    @Override
    public void hitungKecocokan() {
        if (frekuensiOlahraga >= 3) {
            System.out.println("Kecocokan partner basket: Tinggi");
        } else {
            System.out.println("Kecocokan partner basket: Sedang");
        }
    }

    // Method khusus PartnerBasket
    public void tentukanPosisiBasket() {
        System.out.println("Posisi yang dicari: Guard");
    }
}