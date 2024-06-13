import java.util.Scanner;

public class CastingPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir tam sayı (int) giriniz: ");
        int tamSayi = input.nextInt();

        System.out.print("Bir ondalıklı sayı (double) giriniz: ");
        double ondalikliSayi = input.nextDouble();

        double a = tamSayi;
        int b = (int) ondalikliSayi;


        System.out.println("Tam sayının ondalıklı sayı değeri: " + a);
        System.out.println("Ondalıklı sayının tam sayı değeri: " + b);

    }
}
