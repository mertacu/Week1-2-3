import java.sql.SQLOutput;
import java.util.Scanner;

public class HavaDurumu {

    public static void main(String[] args) {

        //DEĞİŞKENİ GİRDİM
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz: ");
        heat = input.nextInt();

        //SICAKLIK ARALIKLARINDA HANGİ ETKİNLİKLERİN UYGULANMASI GEREKTİĞİNİ IF KOŞULU İLE GİRDİM VE YAZDIRDIM
        if (heat <= 5) {
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        } else if (heat >= 5 && heat <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (heat >= 15 && heat <= 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else if (heat > 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
