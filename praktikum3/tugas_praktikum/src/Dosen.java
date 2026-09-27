public class Dosen extends Person {
    private String nidn;

    public Dosen(String nama, String alamat, String email, String nidn) {
        super(nama, alamat, email);
        this.nidn = nidn;
    }

    public void mengajar() {
        System.out.println(getNama() + " sedang mengajar.");
    }
}