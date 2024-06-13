import java.util.Scanner;

public class HarmonikSeriProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        int n = input.nextInt();

        double sonuc = 0;

        //for döngüsü ile i değerini 1'e eşitliyorum, i girilen değere kadar olacak şekilde
        // i yi 1 1 arttırıyorum. Sonucu da 1/i şeklinde yazarak harmonik sayıların toplamını elde ediyorum.
        for (double i = 1; i <= n; i++) {
            sonuc += (1/i);
        }

        System.out.println("Toplam sonuç: " + sonuc);
    }
}
