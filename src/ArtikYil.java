import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        //değişkenleri yazıyorum
        int year;

        //scanner ile kullanıcı girdisi oluşturdum
        Scanner inp = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        year = inp.nextInt();

        //if ve if else formülü ile yazdırıyorum
        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " bir artık yıldır.");
        } else if (year % 400 == 0) {
            System.out.println(year + " bir artık yıldır.");
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}
