import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args) {

        //Değişkenleri atıyorum.

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        double kgArmut, kgElma, kgDomates, kgMuz, kgPatlican;

        //Girdileri alıyorum.

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut : ");
        kgArmut = inp.nextDouble();

        System.out.print("Elma : ");
        kgElma = inp.nextDouble();

        System.out.print("Domates : ");
        kgDomates = inp.nextDouble();

        System.out.print("Muz : ");
        kgMuz = inp.nextDouble();

        System.out.print("Patlıcan : ");
        kgPatlican = inp.nextDouble();

        //formülü yazıyorum.
         double sonuc = (armut * kgArmut + elma * kgElma + domates * kgDomates + muz * kgMuz + patlican * kgPatlican);
        System.out.println("Toplam Ücret : " + sonuc + " TL");

    }
}
