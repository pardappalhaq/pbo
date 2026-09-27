public class MainAbstract {

    public static void main(String[] args) {

        System.out.println("===== PARTNER FUTSAL =====");

        PartnerFutsal futsal = new PartnerFutsal(
            "Faris",
            20,
            "Bogor",
            4
        );

        futsal.tampilkanProfil();
        futsal.hitungKecocokan();
        futsal.tampilkanStatus();
        futsal.pilihModeFutsal();

        System.out.println();

        System.out.println("===== PARTNER BASKET =====");

        PartnerBasket basket = new PartnerBasket(
            "Rafi",
            21,
            "Depok",
            2
        );

        basket.tampilkanProfil();
        basket.hitungKecocokan();
        basket.tampilkanStatus();
        basket.tentukanPosisiBasket();
    }
}