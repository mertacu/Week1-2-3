import java.util.Scanner;

public class Zodyak {
    public static void main(String[] args){

        //DEĞİŞKENLERİ GİRİYORUM
        int birthDay;

        //SCANNER İLE KULLANICI GİRDİSİ OLUŞTURUYORUM
        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        birthDay = inp.nextInt();

        //IF VE IF ELSE KOŞULU İLE DE DOĞUM YILINA GÖRE HANGİ ZODYAK BURCU OLUNDUĞUNA DAİR BİLGİYİ YAZDIRIYORUM
        if(birthDay % 12 == 0){
            System.out.println("Çin Zodyağı Burcunuz: Maymun");
        }else if(birthDay % 12 == 1){
            System.out.println("Çin Zodyağı Burcunuz: Horoz");
        }else if(birthDay % 12 == 2){
            System.out.println("Çin Zodyağı Burcunuz: Köpek");
        }else if(birthDay % 12 == 3){
            System.out.println("Çin Zodyağı Burcunuz: Domuz");
        }else if(birthDay % 12 == 4){
            System.out.println("Çin Zodyağı Burcunuz: Fare");
        }else if(birthDay % 12 == 5){
            System.out.println("Çin Zodyağı Burcunuz: Öküz");
        }else if(birthDay % 12 == 6) {
            System.out.println("Çin Zodyağı Burcunuz: Kaplan");
        }else if(birthDay % 12 == 7) {
            System.out.println("Çin Zodyağı Burcunuz: Tavşan");
        }else if(birthDay % 12 == 8) {
            System.out.println("Çin Zodyağı Burcunuz: Ejderha");
        }else if(birthDay % 12 == 9) {
            System.out.println("Çin Zodyağı Burcunuz: Yılan");
        }else if(birthDay % 12 == 10) {
            System.out.println("Çin Zodyağı Burcunuz: At");
        }else if(birthDay % 12 == 11) {
            System.out.println("Çin Zodyağı Burcunuz: Koyun");
        }
    }
}
