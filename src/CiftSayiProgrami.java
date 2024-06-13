import java.util.Scanner;

public class CiftSayiProgrami {
    public static void main(String[] args){

        //DEĞİŞKENLERİ GİRİYORUM
        //SCANNER İLE KULLANICI GİRDİSİ OLUŞTURUYORUM
        int k;
        int numbers = 0;
        int total = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir değer giriniz: ");
        k = inp.nextInt();

        //FOR FORMÜLÜ İLE GİRDİSİ ALINAN SAYININ 3'E VE 4'E TAM BÖLÜNEN SAYILARIN ORTALAMASINI ALMASINI SAĞLIYORUM
        for (int m = 0; m <= k; m++) {
           if (m % 3 == 0 && m % 4 == 0) {
               System.out.println(m);
               total += m;
               numbers++;
           }
        }
        //SONUCU YAZDIRIYORUM
        System.out.println("Ortaya çıkan sonucun ortalaması şu şekildedir: " + total / numbers);
    }
}
