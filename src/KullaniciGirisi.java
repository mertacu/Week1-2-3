import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        //DEĞİŞKENLERİ TANIMLIYORUM
        String username, password;

        //KULLANICI İÇİN VERİ GİRDİSİ OLUŞTURUYOUM
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        username = inp.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = inp.nextLine();

        //IF , ELSE IF FORMÜLÜ İLE KULLANICI GİRİŞİ PROGRAMINI YAZIYORUM VE YAZDIRIYORUM
        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız!");
        } else if (password != "java123") {
            System.out.println("Girdiğiniz Bilgiler Yanlış!");
            System.out.println("Şifrenizi Sıfırlamak İstiyor Musunuz? : ");
            String parola = inp.nextLine();

            if (parola.equals("Evet")) {
                System.out.println("Yeni şifrenizi eski şifrenizle aynı yazmamaya özen gösterin!");

                System.out.print("Lütfen yeni şifrenizi giriniz! : ");
                String yeniParola = inp.nextLine();

                if (yeniParola.equals("java123")) {
                    System.out.println("Lütfen eski şifrenizden farklı bir şifre giriniz!");
                } else {
                    System.out.println("Parolanız başarı ile değiştirildi.");
                }
            }
        }


    }
}
