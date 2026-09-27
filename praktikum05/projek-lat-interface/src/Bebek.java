public class Bebek implements Berenang, Terbang {
    @Override
    public void suaraBerenang() {
        System.out.println("Suara Bebek Berenang");
    }

    @Override
    public void suaraMenyelam() {
        System.out.println("Suara Bebek Menyelam");
    }

    @Override
    public void bunyiTerbang() {
        System.out.println("Suara Bebek Terbang");
    }

    @Override
    public void bunyiMendarat() {
        System.out.println("Suara Bebek Mendarat");
    }
    
}
