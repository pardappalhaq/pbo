public class BidangDatar {
    public String nama;

    public double luas() {
        System.out.println("Menghitung luas Bidang Datar");
        return 0;
    }
}

class Persegi extends BidangDatar {
    public double sisi;

    Persegi(double x) {
        sisi = x;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }
}

class Lingkaran extends BidangDatar {
    public double radius;

    Lingkaran(double x) {
        radius = x;  
    }

    @Override
    public double luas() {
        return Math.PI * radius * radius;
    }
}

class PersegiPanjang extends BidangDatar {
    public double panjang;
    public double lebar;

    PersegiPanjang(double x, double y) {
        panjang = x;
        lebar = y;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }
}