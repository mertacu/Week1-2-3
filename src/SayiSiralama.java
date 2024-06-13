import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {

        //DEĞİŞKENLERİ TANIMLIYORUM
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("1. sayı: ");
        a = input.nextInt();

        System.out.print("2. sayı: ");
        b = input.nextInt();

        System.out.print("3. sayı: ");
        c = input.nextInt();

        //GİRİLEN DEĞERLERİ KÜÇÜKTEN BÜYÜĞE SIRALAYACAK ŞEKİLDE IF FORMÜLÜ YAZIYORUM
        //VE ÇIKAN SONUÇLARI KÜÇÜKTEN BÜYÜĞE DOĞRU YAZDIRIYORUM

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }

        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        } else {
            if (a < b) {
                System.out.println("c < b < a");
            } else {
                System.out.println("c < b < a");
            }
        }
    }
}
