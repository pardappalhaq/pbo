public class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    Mahasiswa(String n, String id){
        nama = n;
        nim = id;
    }

    public void setIpk(double x) {
        if(x>=0 && x<=4) {
            ipk = x;
        }
    }

    void tampilkanData() {
        System.out.println(nama + " - " + ipk);
    }
}