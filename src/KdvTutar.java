import java.util.Scanner;

public class KdvTutar {

    public static void main(String[] args) {

        double fiyat, kdvOran = 0.18,kdvOran2 = 0.08;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");

        fiyat = input.nextDouble();
        System.out.println("Kdv'siz fiyat : " + fiyat);
        double kdvFiyati = ((fiyat >= 0) && (fiyat <= 1000)) ? fiyat * kdvOran : fiyat * kdvOran2;
        System.out.println("kdvFiyatı : " + kdvFiyati);
        double sonuc = fiyat + kdvFiyati;
        System.out.println("Kdv'li fiyat: " + sonuc);



        }
    }
