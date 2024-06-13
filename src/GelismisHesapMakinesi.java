import java.util.Scanner;

public class GelismisHesapMakinesi {

    //Static metotlar oluşturarak menüde verilen işlemlerin formüllerini yazıyorum

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.print("Çıkarma : " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.print("Çarpma : " + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("İkinci Sayı 0'dan Farklı Olmalı");
            return 0;
        }
        int result = a / b;
        System.out.print("Bölme : " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 0;
        for (int i = 1; i <= b; i++) {
            result += a;
        }
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        return result;
    }

    static void calc(int a, int b) {
        System.out.println("Çevresi : " + (2 * (a + b)));
        System.out.println("Alanı : " + (a * b));
    }

    //metot içerisinde hesap makinesi işlem menüsünü oluşturdum

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üstlü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "8- Çıkış\n";

        //while ile koşul true gelecek şekilde yazıyorum sonrasında
        //menüyü ve yapılması istenen işlemi yazdırıyorum.

        while (true) {
            System.out.println(menu);
            System.out.print("Bir İşlem Seçiniz : ");
            select = scan.nextInt();

            if (select == 8) {
                System.out.println("Çıkış Yaptınız!");
                break;
            }

            System.out.print("İlk Sayıyı Giriniz : ");
            int a = scan.nextInt();
            System.out.print("İkinci Sayıyı Giriniz : ");
            int b = scan.nextInt();

            //switch case ile menü seçeneklerini yazdırıyorum ve son olarak da default belirleyip
            //onu da yazdırıyorum

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    System.out.println("Üs Hesabı : " + power(a, b));
                    break;
                case 6:
                    System.out.println("Mod İşlemi : " + mod(a, b));
                    break;
                case 7:
                    calc(a, b);
                    break;
                default:
                    System.out.println("Geçersiz Bir İşlem Yaptınız.");
            }
        }
    }
}
