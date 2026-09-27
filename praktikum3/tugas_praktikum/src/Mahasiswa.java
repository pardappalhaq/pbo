public class Mahasiswa extends Person {
    private String nim;
    private String programStudi;
    private int semester;
    private double ipk;
    public Mahasiswa(String nim, String nama, String alamat, String email, String programStudi, int semester, double ipk) {
        super(nama, alamat, email);
        this.nim = nim;
        this.programStudi = programStudi;
        this.semester = semester;
        this.ipk = 0.0;
        setIpk(ipk);
    }
    public String getNim() {
        return nim;
    }
    public double getIpk() {
        return ipk;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public int getSemester() {
        return semester;
    }

    public void setIpk(double ipk) {
        if (ipk < 0.0 || ipk > 4.0) {
            System.out.println("IPK harus 0.0 sampai 4.0");
            return;
        }
        this.ipk = ipk;
    }
    public void naikSemester() {
        semester++;
    }
    public String cekPredikat() {
        if (ipk >= 3.50) return "Cumlaude";
        if (ipk >= 3.00) return "Sangat Memuaskan";
        return "Memuaskan";
    }
}