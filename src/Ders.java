import java.util.Scanner;

public class Ders {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        int matematik, turkce, fizik, kimya, biyoloji;

        //Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik notunuz: ");
        matematik = inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Biyoloji notunuz: ");
        biyoloji = inp.nextInt();

        int toplam = (matematik + turkce + fizik + kimya + biyoloji);
        double sonuc = toplam / 5;

        String ortalama = (sonuc > 60) ? "Ortalaman : " + sonuc + " Sınıfı Geçtin" : "Ortalaman : " + sonuc + " Sınıfta Kaldın";
        System.out.println(ortalama);

    }

}

