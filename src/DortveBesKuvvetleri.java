import java.util.Scanner;

public class DortveBesKuvvetleri {
    public static void main(String[] args) {

        //Değişkenleri girdim
        int n;
        int i;

        //Scanner ile kullanıcı girdisini oluşturdum
        Scanner inp = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        n = inp.nextInt();

        //for döngüsünü 2 kere kullanarak hem 4'ün hem de 5'in kuvvetlerini girilen sayıya kadar ekrana yazdırdım
        for (i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }
        for (i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }

    }
}
