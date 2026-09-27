import java.util.ArrayList;
import java.util.List;

public class MataKuliah {
    private String kode;
    private String namaMatKul;
    private List<Mahasiswa> daftarMahasiswa;

    public  MataKuliah(String ko, String nm) {
        this.kode = ko;
        this.namaMatKul = nm;
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mhs) {
        if (!daftarMahasiswa.contains(mhs)) {
            daftarMahasiswa.add(mhs);
            mhs.tambahMatKul(this);
        }
    }

    public void tampilkanMahasiswa() {
        int i=1;
        System.out.println("Daftar Mahasiswa yang mengikuti mata kuliah " + namaMatKul + ":");
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println(i + ". Nama: " + mhs.getNama() + ", NIM: " + mhs.getNim());
            i++;
        }
    }

    public String getKode() {
        return kode;
    }

    public String getNamaMatKul() {
        return namaMatKul;
    }
}