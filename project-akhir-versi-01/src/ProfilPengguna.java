public class ProfilPengguna {

    private String idPengguna;
    private String bio;
    private String noTelepon;

    public ProfilPengguna(String idPengguna, String bio, String noTelepon) {
        this.idPengguna = idPengguna;
        this.bio = bio;
        this.noTelepon = noTelepon;
    }

    public void tampilkanProfil() {
        System.out.println("ID Pengguna : " + idPengguna);
        System.out.println("Bio         : " + bio);
        System.out.println("Kontak      : " + noTelepon);
    }

    public String getIdPengguna() {
        return idPengguna;
    }

    public String getBio() {
        return bio;
    }

    public String getNoTelepon() {
        return noTelepon;
    }
}
