import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        int km, yas, yolculukTipi;
        double yas12Indirimi, yas24Indirimi, yas65Indirimi, gidisDonusIndirimi;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek Mesafe: ");
        km = input.nextInt();
        System.out.print("Yaşınız: ");
        yas = input.nextInt();
        System.out.print("Yolculuk Tipi: ");
        yolculukTipi = input.nextInt();

        if (km > 0) {
            switch (yolculukTipi) {
                case 1:
                    if (yas < 12 && yas > 0) {
                        yas12Indirimi = (km * 0.10) * 100 / 50;
                        System.out.print("Toplam Tutar: " + yas12Indirimi);
                    } else if (yas >= 12 && yas <= 24) {
                        yas24Indirimi = (km * 0.10) * 100 / 90;
                        System.out.print("Toplam Tutar: " + yas24Indirimi);
                    } else if (yas > 65) {
                        yas65Indirimi = (km * 0.10) * 100 / 70;
                        System.out.print("Toplam Tutar: " + yas65Indirimi);
                    }
                    break;
                case 2:
                    gidisDonusIndirimi = (km * 0.10) * 100 / 80;
                    System.out.print("Toplam Tutar: " + gidisDonusIndirimi + "TL");

                    break;

                default:
                    System.out.println("Bilgileri Doğru Girdiğinize Emin Olun!");
            }
        }
    }


}