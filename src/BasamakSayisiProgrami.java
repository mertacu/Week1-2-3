/* Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
Örnek : 1643 = 1 + 6 + 4 + 3 = 14 */

import java.util.Scanner;

public class BasamakSayisiProgrami {
    public static void main(String[] args){

        int deger, a;
        int total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Sayıyı Giriniz : ");
        deger = input.nextInt();

        /*While döngüsü ile önce degeri en fazla 0'a düşecek şekilde ayarlayıp sonrasında
        a'yı deger değişkeninin 10'a bölümünden kalanı işleyecek şekilde yazıp total değişkenini
        de a ile topladım bu sayede basamaklardaki sayıların toplamını bana verdi. deger değişkenini de
        10'a böldüm ki döngüyü 0'a gelene kadar işlesin. */

        while (deger != 0) {
            a = deger % 10;
            total += a;
            deger /= 10;
        }

        System.out.println("Basamak sayılarının toplamı: " + total);

    }
}
