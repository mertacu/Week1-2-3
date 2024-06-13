import java.awt.image.BufferStrategy;
import java.util.Scanner;

public class UsluSayiProgrami {

    //kullanıcıdan aldığım üs ve taban değerlerine göre istenen sayının üssünü hesaplıyorum.
    //static metotu ile üs hesaplama formülünü yazarak sonucu diğer main metotunda yazdırıyorum.

    static int usluSayi(int a, int b) {
        int sonuc = 1;

        for (int i = 0; i < b; i++) {
            sonuc *= a;
        }
        return sonuc;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz : ");
        int a = scan.nextInt();
        System.out.print("Üs Değerini Giriniz : ");
        int b = scan.nextInt();

        System.out.println("Sonuç : " + usluSayi(a, b));

    }
}
