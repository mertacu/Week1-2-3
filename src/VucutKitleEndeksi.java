import java.sql.SQLOutput;
import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

        //Değerleri atıyorum
        double boy, kilo;

        //Kullanıcının veri girebilmesi için Scanner ile girdi olarak verileri alıyorum.
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextDouble();

        System.out.print("Lütfen boyunuzu(metre cinsinden) giriniz : ");
        boy = inp.nextDouble();

        /* boyu metre türünden hesaplayan formülü yazıyorum ve istenen vücut kitle endeksi için gerekli
        de formül olarak yazıyorum */
        double vucutEndeksi = kilo / (boy * boy);

        //Sonucu yazdırıyorum.
        System.out.println("Vücut Kitle Endeksiniz : " + vucutEndeksi);

    }
}
