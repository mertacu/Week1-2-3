/*N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
*/


import java.util.Scanner;

public class KombinasyonProgrami {
    public static void main(String[] args){

        //değişkenleri giriyorum sonrasında scanner sınıfı ile kullanıcı girdilerini oluşturuyorum.
        int m;
        int n;
        int comb;
        int facM = 1, facN = 1, facMN = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen kombinasyonunu almak istediğiniz sayıyı giriniz: ");
        m = scan.nextInt();
        System.out.print("Lütfen kaçlı kombinasyon almak istiyorsanız giriniz: ");
        n = scan.nextInt();

        //for döngüleri ile yukarda belirttiğim kombinasyon formülünü oluşturuyorum
        for (int i = 1; i <= m; i++){
            facM *= i;
        }

        for (int i = 1; i <= n; i++ ){

        }

        for (int i = 1; i <= (m-n); i++){
            facMN *= i;
        }

        comb = facM / (facN*facMN);

        //ve sonucu yazdırıyorum
        System.out.println("Ortaya çıkan kombinasyon: " + comb);
    }
}
