import java.util.Scanner;

public class IslemOnceligi {

    /*Soru: Kullanıcıdan 3 tane sayı (a, b, c) alıp bu sayıları işlem sırasına göre işleyen bir program yazın.
      İşlem sırası şöyle olsun: a+b*c-b. İşlem tamamladıktan sonra sonucu ekrana yazdırın.*/


        public static void main(String[] args) {

            //Değişkenleri atıyorum ve değerleri programa girdi olarak alıyorum.
            int a, b, c, result;
            Scanner inp = new Scanner(System.in);


            System.out.print("İlk sayıyı giriniz: ");
            a = inp.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            b = inp.nextInt();
            System.out.print("Üçüncü sayıyı giriniz: ");
            c = inp.nextInt();

            //formülü tanımlıyorum.
            result = a+b*c-b;
            //ve sonucu yazdırıyorum.
            System.out.println("Total result: " + result);
        }
    }
