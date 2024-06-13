//ATM işlemlerini "Switch-Case" kullanarak yapınız.

import java.util.Scanner;

public class ATMProgrami {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;
        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanızı giriniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                do {
                    System.out.println("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Çıkış Yap\n");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                    select = input.nextInt();

                    //switch case kullanarak kullanıcı girdilerini ve verilerini çıkartıyorum
                    //ne kadar bakiyesi var veya ne kadar çekim yapmak istiyorlar vb.
                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarı: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Para Miktarı: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiyeniz Yetersiz!");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar Görüşmek Üzere!");
                            break;

                        default:
                            System.out.println("Yanlış Tuşlama Yaptınız.");

                    }

                } while (select != 4);
                break;

            } else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre. Tekrar Deneyiniz");
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur Lütfen Banka İle İletişime Geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}

