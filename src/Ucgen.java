import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args){

        //Değerleri tanımlayalım
        int a, b, c;
        double alan, cevre;

        //Scanner ile kullanıcıdan verileri alalım
        Scanner input = new Scanner(System.in);
        System.out.print("1. kenarı giriniz : ");
        a = input.nextInt();
        System.out.print("2. kenarı giriniz : ");
        b = input.nextInt();
        System.out.print("3. kenarı giriniz : ");
        c = input.nextInt();

        cevre = (a+b+c) / 2;
        alan  = Math.sqrt(cevre * (cevre - a) * (cevre - b) * (cevre - c));

        System.out.println("Üçgenin Alanı : " + alan);
    }
}
