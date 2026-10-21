import java.util.ArrayList;
import java.util.List;

public class PencariPartner implements MatchingService {

    // Hubungan AGREGASI: PencariPartner menampung daftar objek PartnerOlahraga (0..*)
    // Objek PartnerOlahraga tetap eksis di luar siklus hidup PencariPartner
    private List<PartnerOlahraga> daftarPartner;

    public PencariPartner() {
        this.daftarPartner = new ArrayList<>();
    }

    public void tambahPartner(PartnerOlahraga partner) {
        this.daftarPartner.add(partner);
    }

    public List<PartnerOlahraga> getDaftarPartner() {
        return daftarPartner;
    }

    @Override
    public void cariPartner() {
        if (daftarPartner.isEmpty()) {
            System.out.println("Mencari partner berdasarkan olahraga, lokasi, dan frekuensi.");
        } else {
            System.out.println("Mencari partner... Ditemukan " + daftarPartner.size() + " calon partner yang terdaftar.");
            for (PartnerOlahraga p : daftarPartner) {
                System.out.println(" - " + p.getNama() + " (" + p.getLokasi() + ")");
            }
        }
    }

    @Override
    public void lihatProfilPartner() {
        if (daftarPartner.isEmpty()) {
            System.out.println("Menampilkan profil calon partner.");
        } else {
            System.out.println("=== Menampilkan Profil Seluruh Calon Partner Teragregasi ===");
            for (PartnerOlahraga p : daftarPartner) {
                p.tampilkanProfil();
                p.hitungKecocokan();
                System.out.println("---------------------------------");
            }
        }
    }
}