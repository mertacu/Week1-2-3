import java.util.Scanner;

public class AsalSayiRecursive {

    //girilen sayının asal olup olmadığını bulan program yazıyorum.
    //Recursive metot oluşturarak gerekli koşulları veriyoruz ve yazdırıyoruz

    static boolean asal(int a, int b) {
        if (a < 2) {
            return false;
        }
        if (b == 1) {
            return true;
        }
        if (a % b == 0) {
            return false;


        }
        return asal(a, b - 1);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int numb = scan.nextInt();

        if (asal(numb, numb / 2)) {
            System.out.println("bir asal sayıdır.");
        } else {
            System.out.println("bir asal sayı değildir.");
        }
    }
}

