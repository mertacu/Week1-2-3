import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        //değerleri tanımlıyorum.

        int n1, n2, select;

        //Kullanıcı girdisi almak için Scanner kullanıyorum.

        Scanner inp = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        n1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = inp.nextInt();

        //Yazdırma işlemini yapıyorum.

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = inp.nextInt();

        //Switch case kullanarak hesap makinası işlemini yapıyorum. Ve sonucu yazdırıyorum.

        switch (select) {
            case 1:
                System.out.println("Toplama İşlemi Sonucu: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma İşlemi Sonucu: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma İşlemi Sonucu: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme İşlemi Sonucu: " + (n1 / n2));
                } else System.out.println(n1 + " 0'a bölünemez!");
                break;

            default:
                System.out.println("Yanlış Giriş Yaptınız.");
        }

    }
}
