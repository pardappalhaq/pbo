public class Balok{
    private double panjang;
    private double lebar;
    private double tinggi;

    Balok(double p, double l, double t){
        this.panjang = p;
        this.lebar = l;
        this.tinggi = t;
    }

    public double hitungVolume(){
        return panjang * lebar * tinggi;
    }
}