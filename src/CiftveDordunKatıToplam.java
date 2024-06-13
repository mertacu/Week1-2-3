/*JAVA DÖNGÜLER İLE TEK BİR SAYI GİRİLENE KADAR KULLANICIDAN GİRİŞLERİ KABUL EDEN VE GİRİLEN DEĞERLERDEN ÇİFT VE
4'ÜN KATLARI OLAN SAYILARI TOPLAYIP EKRANA BASAN PROGRAM YAZIYORUZ.*/


import java.util.Scanner;

public class CiftveDordunKatıToplam {
    public static void main(String[] args) {

        //DEĞİŞKENLERİ GİRİYORUM
        int n;
        int total = 0;

        //SCANNER İLE KULLANICI GİRDİSİ OLUŞTURUYORUM
        Scanner inp = new Scanner(System.in);


        //DO WHILE FORMÜLÜ İLE DE SON GEREKLİ KOŞULLARI SAĞLAYAN SAYILARI TOPLAYAN FORMÜLÜ YAZIYORUM
        do {
            System.out.print("Bir sayı giriniz: ");
            n = inp.nextInt();
            if (n % 2 == 0 && n % 4 == 0) {
                total += n;
            }
        } while (n % 2 == 0);

        System.out.println("Sonuç: " + total);
    }
}
