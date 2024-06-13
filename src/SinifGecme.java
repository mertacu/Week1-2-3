/* DERSLER : MATEMATİK, FİZİK, TÜRKÇE, KİMYA, MÜZİK
GEÇME NOTU : 55
ÖDEV : EĞER GİRİLEN DERS NOTLARI 0 VEYA 100 ARASINDA DEĞİL İSE ORTALAMAYA KATILMASIN
 */


import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {

        //DEĞİŞKENLERİ GİRİYORUM
        int mat, fizik, turkce, kimya, muzik;

        //SCANNER İLE KULLANICI GİRDİSİ OLUŞTURUYORUM ve
        //GEREKLİ KOŞULLARI SAĞLADIĞI TAKDİRDE IF FORMÜLÜ İLE ORTALAMAYI HESAPLAYACAK ŞEKİLDE KODU YAZIYORUM
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        if (mat <= 0 || mat >= 100) {
            System.out.println("Lütfen geçerli bir not giriniz!");
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        if (fizik <= 0 || fizik >= 100) {
            System.out.println("Lütfen geçerli bir not giriniz!");
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        if (turkce <= 0 || turkce >= 100) {
            System.out.println("Lütfen geçerli bir not giriniz!");
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if (kimya <= 0 || kimya >= 100) {
            System.out.println("Lütfen geçerli bir not giriniz!");
        }

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        if (muzik <= 0 || muzik >= 100) {
            System.out.println("Lütfen geçerli bir not giriniz!");
        } else {

            double average = (mat + fizik + turkce + kimya + muzik) / 5;

            if (average >= 55) {
                System.out.println("Tebrikler sınıfı geçtiniz!");
            } else {
                System.out.println("Üzgünüm sınıfta kaldınız. Seneye görüşmek üzere!");
            }

            System.out.println("Ortalamanız: " + average);
        }


    }
}
