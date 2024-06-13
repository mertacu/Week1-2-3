import java.util.Scanner;

public class Burclar {
    public static void main(String[] args) {

        //DEĞİŞKENLERİ YAZIYORUM
        int month, day;

        //SCANNER KOMUTU İLE KULLANICI GİRDİSİ OLUŞTURUYORUM
        Scanner inp = new Scanner(System.in);

        System.out.print("Doğduğunuz ay: ");
        month = inp.nextInt();

        System.out.print("Doğduğunuz gün: ");
        day = inp.nextInt();

        //IF VE ELSE IF KOŞUL FORMÜLÜ İLE HANGİ AYLAR VE HANGİ GÜNLER ARASINDA HANGİ BURÇLARIN OLDUĞUNU ÇIKARIP YAZDIRIYORUM
        if ((month >= 1) && (month <= 12)) {
            if (month == 1) {
                if (day <= 21 && day >= 1) {
                    System.out.println("Oğlak Burcu");
                } else if (day >= 22 && day <= 31) {
                    System.out.println("Kova Burcu");
                }
            }
            if (month == 2) {
                if (day >= 1 && day <= 19) {
                    System.out.println("Kova Burcu");
                } else if (day >= 20 && day <= 29) {
                    System.out.println("Balık Burcu");
                }
            }
            if (month == 3) {
                if (day >= 1 && day <= 20) {
                    System.out.println("Balık Burcu");
                } else if (day >= 21 && day <= 31) {
                    System.out.println("Koç Burcu");
                }
            }
            if (month == 4) {
                if (day >= 1 && day <= 20){
                    System.out.println("Koç Burcu");
                } else if (day >= 21 && day <= 30){
                    System.out.println("Boğa Burcu");
                }
            }
            if (month == 5) {
                if (day >= 1 &&  day <= 21){
                    System.out.println("Boğa Burcu");
                } else if (day >= 22 && day <= 31){
                    System.out.println("İkizler Burcu");
                }
            }
            if (month == 6){
                if (day >= 1 && day <= 22) {
                    System.out.println("İkizler Burcu");
                } else if (day >= 23 && day <= 30){
                    System.out.println("Yengeç Burcu");
                }
            }
            if (month == 7){
                if (day >= 1 && day <= 22){
                    System.out.println("Yengeç Burcu");
                } else if (day >= 23 && day <= 31){
                    System.out.println("Aslan burcu");
                }
            }
            if (month == 8){
                if (day >= 1 && day <= 22){
                    System.out.println("Aslan Burcu");
                } else if (day >= 23 && day <= 30){
                    System.out.println("Başak Burcu");
                }
            }
            if (month == 9){
                if (day >= 1 && day <= 22){
                    System.out.println("Başak Burcu");
                } else if (day >= 23 && day <= 31){
                    System.out.println("Terazi Burcu");
                }
            }
            if (month == 10){
                if (day >= 1 && day <= 22){
                    System.out.println("Terazi Burcu");
                } else if (day >= 23 && day <= 30){
                    System.out.println("Akrep Burcu");
                }
            }
            if (month == 11){
                if (day >= 1 && day <= 21){
                    System.out.println("Akrep Burcu");
                } else if (day >= 22 && day <= 31){
                    System.out.println("Yay Burcu");
                }
            }
            if (month == 12){
                if (day >= 1 && day <= 21){
                    System.out.println("Yay Burcu");
                } else if (day > 22 && day <= 30){
                    System.out.println("Oğlak Burcu");
                }
            }
            if (month == 1){
                if (day > 1 && day <= 21){
                    System.out.println("Oğlak Burcu");
                }
            }
        }
    }

}