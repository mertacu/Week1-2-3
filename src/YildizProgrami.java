/* Java'da döngüler kullanarak yıldızlar ile elmas yapınız. */

import java.util.Scanner;

public class YildizProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir değer giriniz : ");
        int deger = input.nextInt();


        for (int i = 1; i <= deger; i++) {
            for (int k = 1; k <= (deger - i); k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();


        }
        for (int i = 1; i < deger; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (2 * deger - (2 * i + 1)); j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
