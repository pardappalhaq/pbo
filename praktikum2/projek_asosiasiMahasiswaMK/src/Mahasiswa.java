import java.util.List;
import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String nim;
    private List<MataKuliah> daftarMataKuliah;

    public Mahasiswa(String na, String ni) {
        this.nama = na;
        this.nim = ni;
        this.daftarMataKuliah = new ArrayList<>();
    }

    public void tambahMatKul(MataKuliah mk) {
        if (!daftarMataKuliah.contains(mk)) {
            daftarMataKuliah.add(mk);
            mk.tambahMahasiswa(this);
        }
    }


    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public void tampilkanMatKul() {
        int i=1;
        System.out.println("Daftar Mata Kuliah yang diambil oleh " + nama + ":");
        for (MataKuliah mk : daftarMataKuliah) {
            System.out.println(i + ". Kode: " + mk.getKode() + ", Nama Mata Kuliah: " + mk.getNamaMatKul());
            i++;
        }
    }
}