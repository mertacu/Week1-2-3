import java.util.Scanner;

//oluşturulan method ile n değeri 0'dan büyük ise recursive tekrarlanıyor

public class DesenRecursive {
    static void method(int n) {

        if (n > 0) {
            System.out.print(n + " ");
            method(n - 5);
            System.out.print(n + " ");
        } else {
            System.out.print(n + " ");
        }
    }

    //kullanıcıdan değer alıyorum ve bu değerden 5 çıkararak 0'a ya da negatif
    //değer alana kadar işlem devam ediyor.
    //sonrasında 5 ekleyerek ilk değere kadar tekrar çıkıyoruz

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Değer Giriniz: ");
        int numb = input.nextInt();

        method(numb);


    }
}
