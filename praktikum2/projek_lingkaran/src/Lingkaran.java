public class Lingkaran {
    //Daftar atribut
    private double jariJari;

    //Daftar method
    public Lingkaran(double r){
        this.jariJari = r;
    }

    public double keliling(){
        return 2 * Math.PI * jariJari;
    }

    public double luas(){
        return Math.PI * jariJari * jariJari;
    }
}