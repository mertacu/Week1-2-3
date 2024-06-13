import java.util.Arrays;
import java.util.Scanner;

public class KucuktenBuyugeSiralama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Girilecek dizinin boyutunu ve verileri kullanıcıdan alacak şekilde kodumu yazıyorum.
        System.out.print("Sıralamak İstediğiniz Dizinin Eleman Boyutunu Giriniz : ");
        int numbLenght = input.nextInt();
        int[] dizi = new int[numbLenght];

        System.out.println("Dizinin " + numbLenght + " Boyutlu Elemanlarını Giriniz : ");

        for (int i = 0; i < numbLenght; i++) {
            System.out.print("Dizinin " + (i + 1) + ". Elemanını girin : ");
            dizi[i] = input.nextInt();
        }

        //Diziyi ekrana yazdırıyorum.
        System.out.println("Girilen Dizi : ");
        for (int numbers : dizi) {
            System.out.println(numbers + " ");

        }

        //Diziyi küçükten büyüğe sıralıyorum.
        Arrays.sort(dizi);

        System.out.println("Sıralanmış Dizinin Son Hali : ");
        for (int numbers : dizi) {
            System.out.println(numbers + " ");
        }

    }
}
