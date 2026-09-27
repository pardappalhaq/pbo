public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa(
                "J0403251118",
                "Salman",
                "Jakarta",
                "salman@gmail.com",
                "Informatika",
                3,
                3.75);

        Dosen dosen1 = new Dosen(
                "Dr. Budi",
                "Bandung",
                "budi@gmail.com",
                "1234567");

        System.out.println("NIM: " + mahasiswa1.getNim());
        System.out.println("Nama: " + mahasiswa1.getNama());
        System.out.println("Alamat: " + mahasiswa1.getAlamat());
        System.out.println("Email: " + mahasiswa1.getEmail());
        System.out.println("Program Studi: " + mahasiswa1.getProgramStudi());
        System.out.println("Semester: " + mahasiswa1.getSemester());
        System.out.println("IPK: " + mahasiswa1.getIpk());
        System.out.println("Predikat: " + mahasiswa1.cekPredikat());

        mahasiswa1.naikSemester();
        mahasiswa1.setIpk(3.90);

        System.out.println("--- Setelah Update ---");
        System.out.println("Semester : " + mahasiswa1.getSemester());
        System.out.println("IPK : " + mahasiswa1.getIpk());
        System.out.println("Predikat : " + mahasiswa1.cekPredikat());

        System.out.println("--- Keterangan Dosen ---");
        dosen1.mengajar();
    }
}